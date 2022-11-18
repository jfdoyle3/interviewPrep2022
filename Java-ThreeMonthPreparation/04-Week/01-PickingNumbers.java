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


    public static int pickingNumbers(List<Integer> a) {
      Collections.sort(a);
      List<Integer> results=new ArrayList<>();
      int counter=0;
      
      for(int idx=0; idx<a.size()-1; idx++){
        for(int idx2=1; idx<a.size()-2; idx2++){
          System.out.println(a.get(idx2)-a.get(idx));
          if(a.get(idx)-a.get(idx2)<=1){
            results.add(a.get(idx));
            results.add(a.get(idx+1));
            idx++;
          }
          else
            break;
        }
      }
        System.out.println(results);
        return results.size();
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

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
