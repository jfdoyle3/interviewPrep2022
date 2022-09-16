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
     * Complete the 'bonetrousle' function below.
     *
     * The function is expected to return a LONG_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. LONG_INTEGER n
     *  2. LONG_INTEGER k
     *  3. INTEGER b
     */

    public static List<Long> bonetrousle(long n, long k, int b) {
        
        // Make a list/collection with default values (1 - b)
        List<Long> results=new ArrayList<>();

        // If collection sum is greater than N return -1
        if(k<n && b<=k){
            long fail=-1;
            results.add(fail);
            return results;
        }
        
         for(long num=1; num<=b; num++){
          // Add the numbers to the collection
            results.add(num);
        }
        // If collection sum is less than  N 
        while (sum(results)<n){
       //  If collection sum is equal to N return collection
            if(sum(results)==n)
                return results;
        
            if (k>n && b>1)
                results.set(b-1,k-2);
            else
                results.set(b-1,k);
            
            
            
            
         // Calculate difference from N - sum of array    
         //   results.set(,k);
    
   
    // Add the difference to last element of collection
        
    // Check if new number is less than or equal to K
    // return new collection 
    // If not greater than K set element to K and K - 1
    // Repeat with next element
    // If I run out of elements return -1
        

    }
    // long fail=-1;
    // results.add(fail);
     return results;

    }
    // public static List<Long> cycleThruList(List<Long> list, long num, int idx){
    //    // may not need both variables.
    // //    int len=list.size();
    // //     int idx=1;  
    //    return list.set(idx,num); //num max K first
        
      //  return list;
        
 //  }
    
    public static long sum(List<Long> numbers){
        // long total=0;
        // for(Long num : numbers)
        //      total+=num;
        // long sum=results.stream().collect(Collectors.summingLong(Long::longValue));
        // long sum2=results.stream().mapToLong(Long::longValue).sum();
        return numbers.stream().mapToLong(Long::longValue).sum();
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

                long n = Long.parseLong(firstMultipleInput[0]);

                long k = Long.parseLong(firstMultipleInput[1]);

                int b = Integer.parseInt(firstMultipleInput[2]);

                List<Long> result = Result.bonetrousle(n, k, b);

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
