import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumDistances' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int minimumDistances(List<Integer> a) {
        
        HashMap<Integer, List<Integer>> arrayMap=new HashMap<>();

        for(int idx=0; idx<a.size(); idx++){
            if(arrayMap.containsKey(a.get(idx))){
                List<Integer> indexes=arrayMap.get(a.get(idx));
                indexes.add(idx);
                arrayMap.put(a.get(idx),indexes);
            }
                else {
                arrayMap.put(a.get(idx),new ArrayList<Integer>());
                List<Integer> indexes=arrayMap.get(a.get(idx));
                indexes.add(idx);
                }
                
        }

        System.out.println(arrayMap); 
            return 0;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
