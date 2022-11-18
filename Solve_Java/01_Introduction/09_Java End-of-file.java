import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int lineNum=1;
        
        while(input.hasNext()){
          
            String data=input.nextLine();
            System.out.println(lineNum+" "+data);
            lineNum++;
            
        } 
        
    }
}
