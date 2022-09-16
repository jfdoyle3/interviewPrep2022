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
        
        int minDist=0;
        int min=0;
        int minDist2=0;
        List<Integer> results=new ArrayList<>();
        
        for(int fwdArr=0, revArr=a.size()-1; fwdArr<a.size(); fwdArr++,revArr--){
             System.out.printf("fwdArr:  %d ->F: %d || %d :R<- %d :revArr\n",fwdArr,a.get(fwdArr),a.get(revArr),revArr);
            if(a.get(fwdArr)==a.get(revArr))
                minDist=revArr-fwdArr;
                if(minDist>=0)
                    results.add(minDist);
        }
            
        min=Collections.min(results);
        
        if(results.get(0)==0)
            return -1;
        
        return min;
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
