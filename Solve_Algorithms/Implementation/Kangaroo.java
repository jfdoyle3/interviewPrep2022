import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {      
        int roo1Start=x1;
        int roo1HopDistance=v1;
        int roo2Start=x2;
        int roo2HopDistance=v2;
		int idx=0;
		
        if (roo2Start>roo1Start && roo2HopDistance>roo1HopDistance){
            return "NO";
        }

        do{
           int   roo1Hops=roo1Start+idx*roo1HopDistance;
           int  roo2Hops=roo2Start+idx*roo2HopDistance;
            if(roo1Hops== roo2Hops){
                return "YES";
            }
            idx++;
        }while(idx<10000);
            return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
