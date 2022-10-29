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
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
     List<Integer> listA=new ArrayList<>();
    List<Integer> listB=new ArrayList<>();
    
    /* 
     * 1571 4240 9023 4234  -  YES
     * 1928 4306 5763 4301  -  YES
     * 4523 8092 9419 8076  -  YES
     * 0 3 4 2   - yes 
     * 0 2 5 3   - no
     */
    
    int hops=0;
    int k1=0;
    int k2=0;
  
    do{
      k1=x1+v1;
      x1=k1;
      
      k2=x2+v2;
      x2=k2;
      
      
      listA.add(k1);
      listB.add(k2);
      if(k1==k2){
        return "YES";
      }
      
      hops++;
    }while(hops<20);
    // System.out.println(listA);
    // System.out.println(listB);
    return "NO";
    }
    
    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result.kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}