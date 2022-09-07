import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input=new Scanner(System.in);
        String firstNumber=input.next();
        String secondNumber=input.next();

        BigInteger bigFirstInt=new BigInteger(firstNumber);
        BigInteger bigSecondInt=new BigInteger(secondNumber);
        
        System.out.println(bigFirstInt.add(bigSecondInt));
        System.out.println(bigFirstInt.multiply(bigSecondInt));
		input.close();
    }
}