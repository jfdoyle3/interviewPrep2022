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
     * Complete the 'absolutePermutation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     */

    public static List<Integer> absolutePermutation(int n, int k) {
        
    int countToK=1;
    int numCount=1;
    List<Integer> results=new ArrayList<>();
    
    // Return List from 1 to N if K=0;
    if(k==0){
        for(int idx=1; idx<=n; idx++)
            results.add(idx);
            
        return results;
    }
    // Return -1 if N/K is not an even number
    if ((n/k)%2!=0){
        results.add(-1);
        return results;
    }
        
    int numTimes=n/k;
    boolean flip=true;
    System.out.println("numT: "+numTimes);
    for(int idx=1; idx<=n; idx++){
      
        // flip addition to subtraction based on k
        // k=5 , flip addition to subtraction every 5 times.
        // k=25, flip addition to subtraction every 25 times.
        if(numCount>k){
            numCount=1;
            flip=!flip;
        }                    
        
        if(flip){
            results.add(idx+k);
            numCount++;
            
        }
        else {
            results.add(Math.abs(idx-k));
            numCount++;
        }
        
  
      //  System.out.printf("f: %d    s: %d\n",firstNum,secondNum);
        System.out.printf("idx: %d   mod: %d\n",idx,(k*idx)/2);  
    }
 
    System.out.println();
    return results;
    
    }


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());
            
        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int k = Integer.parseInt(firstMultipleInput[1]);

                List<Integer> result = Result.absolutePermutation(n, k);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
