import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String strLen=A+B; 
        System.out.println(strLen.length());
        if(A.compareTo(B)<=0)
            System.out.println("No");
        else
            System.out.println("Yes");
        String upCaseFirstA=A.substring(0,1).toUpperCase()+A.substring(1);
        String upCaseFirstB=B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.print(upCaseFirstA+ " "+upCaseFirstB);
    }
}