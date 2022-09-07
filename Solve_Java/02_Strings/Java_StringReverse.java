import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        String results="";
        
        String[] strArry=A.split("");
        
        for(int idx=0, idx2=strArry.length-1; idx<strArry.length; idx++, idx2-- ){
            if(strArry[idx].equals(strArry[idx2]))
                results="Yes";
              else
                results="No";
        }    
           
        System.out.println(results);
    }
}