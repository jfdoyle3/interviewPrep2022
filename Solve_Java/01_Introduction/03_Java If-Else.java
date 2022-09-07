import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    static void checkWeirdness(int number) {

        if (number % 2 != 0) {
            System.out.print("Weird");
        } else if (number % 2 == 0 && (number >= 2 && number <= 5)) {
            System.out.print("Not Weird");
        } else if (number % 2 == 0 && (number >= 6 && number <= 20)) {
            System.out.println("Weird");
        } else if (number % 2 == 0 && number >= 20) {
            System.out.println("Not Weird");
        }
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        checkWeirdness(N);
        scanner.close();
    }
}
