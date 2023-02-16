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
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int bookPages, int turnToPage) {
        int pages=0;
        int turns=0;
        
        if(bookPages-turnToPage<=1)
            return 0;
            
        
        if (bookPages<turnToPage/2){
            System.out.println("Go Forward through the book");
            for(int i=0; i<bookPages; i++){ 
             pages=turnToPage/2;
             turns=Math.abs(pages-bookPages); 
            }
        }else {
          System.out.println("Go Backwards through the book");  
        }
        // System.out.println(pages+" | "+turns);
        return pages;
    
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}