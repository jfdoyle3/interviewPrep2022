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
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long baseTen) {
    long results=0;
    List<Long> binaryNum = new ArrayList<>();
	
	// Convert BaseTen to Binary
    while (baseTen>0){
                long quotient = baseTen /2;
                long remainder = baseTen % 2;
                baseTen = quotient;
                binaryNum.add(remainder);
    }
   
    long binaryNumSize=binaryNum.size();
    
	
	// Fill with 0 to get a 32bit binary number
    if(binaryNumSize<=32){
        long zeroFiller=Math.abs(binaryNumSize-32);
        for(int idx=0; idx<zeroFiller; idx++){
            binaryNum.add((long)0);
        } 
    }
    
    binaryNumSize=binaryNum.size();
	
    // Flip the 1's and 0's on the binary number
    for(int idx=0; idx<binaryNumSize; idx++){
        long num=binaryNum.get(idx);
        switch((int)num){
            case 0:
                binaryNum.set(idx,(long)1);
                break;
            case 1:
                binaryNum.set(idx,(long)0);
                break;
        }    
    }
    
	// Calculate the new BaseTen number.
    for(int idx=0; idx<binaryNumSize; idx++){
        if(binaryNum.get((int)idx)==1)
            results+=(long)Math.pow(2,(int)idx);  
    }
    
    return results;
    } 
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                long result = Result.flippingBits(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
