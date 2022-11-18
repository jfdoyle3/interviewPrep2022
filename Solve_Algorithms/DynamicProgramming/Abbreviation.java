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
     * Complete the 'abbreviation' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static String abbreviation(String a, String b) {
        int matches = 0;

        int upper = 0;
        int lower = 0;

        int strALen = a.length();
        int strBLen = b.length();

        for (int idxB = 0; idxB < strBLen; idxB++) {
            
            int bIntItr = b.charAt(idxB);
            char bCharItr = b.charAt(idxB);
            
            for (int idxA = 0; idxA < strALen; idxA++) {
                
                int aIntItr = a.charAt(idxA);
                char aCharItr = a.charAt(idxA);
                
                if (aIntItr >= 97 && aIntItr <= 122) {
                    lower++;
                    System.out.println("str A Char is lowercase");
                }

                if (aIntItr >= 65 && aIntItr <= 90) {
                    upper++;
                    
                    System.out.println("str A Char is Uppercase");
                }
                System.out.printf("char A: %c        char B: %c\n", aCharItr, bCharItr);
                System.out.printf("int  A: %d        int  B: %d\n", aIntItr, bIntItr);
                if (aIntItr - 32 == bIntItr || aIntItr == bIntItr)
                    matches++;
                    System.out.println("True for Int");

                if (aCharItr - 32 == bCharItr || aCharItr == bCharItr)
                    System.out.println("True for Char");
                System.out.println(idxA);

            }
        }

        System.out.printf("Upper total:  %d\n", upper);
        System.out.printf("Lower total:  %d\n", lower);
        System.out.printf("Matches:      %d\n", matches);
        if (matches == upper){
            return "YES";
           // System.out.println("YES!!!!!");
         } else{
             return "NO";
           // System.out.println("NO!!");
         }
        // System.out.println(results);
    }
    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String a = bufferedReader.readLine();

                String b = bufferedReader.readLine();

                String result = Result.abbreviation(a, b);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
