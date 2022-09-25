import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        List<String> testCases=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
        String input=scan.nextLine();
        testCases.add(input);
        }
        scan.close();
        for(String testCase : testCases){
          
        }
        
                
        // String[] splitTestArr = input.split(";");
        
        // String splitInput = splitTestArr[2];
        // String combineInput="";
        
        // switch(splitTestArr[0]){
          
        //   case "S":{
        //              splitMethods(splitTestArr[2]);
        //             }
        //   case "C":{
        //             combineMethods(splitTestArr[2]);
        //           }
          
          
          
        
        // boolean to trigger which methods
      //   if (splitTestArr[1].equals("M")) {
      //       splitInput = splitInput.substring(0, splitInput.length() - 2);
      //   }
      //   if (splitTestArr[0].equals("C") && splitTestArr[1].equals("M")) {
      //       combineInput = splitTestArr[2] + "()";
            
      //   }
 
      //  if(splitTestArr[0].equals("S"))
      //      splitMethods(splitInput);
       
      //  if(splitTestArr[0].equals("C"))
      //      combineMethods(combineInput);
           
           
        
        
    }
    
    public static void splitMethods(String input){
       StringBuilder builder = new StringBuilder();

        for (int letter = 0; letter < input.length(); letter++) {
            if (Character.isUpperCase(input.charAt(letter))) {
                builder.append(" ")
                       .append(Character.toLowerCase(input.charAt(letter)));
                continue;
            }
            builder.append(input.charAt(letter));
        }
        System.out.println(builder.toString().trim());
    }
    
    public static void combineMethods(String input) {

        String[] strArr = input.split(" ");
        StringBuilder builder = new StringBuilder();
        String lastElement=strArr[strArr.length - 1];
        int startIndex=0;
        
        System.out.println(Arrays.toString(strArr));
        
        
        if (lastElement.charAt(lastElement.length()-1) == ')') {
            builder.append(strArr[0].substring(0, 1).toLowerCase())
                   .append(strArr[0].substring(1));
            startIndex=1;
        }
        
        for (int word = startIndex; word < strArr.length; word++) {
           
            builder.append(strArr[word].substring(0, 1).toUpperCase())
                   .append(strArr[word].substring(1));
        }

        System.out.println(builder.toString().trim());
    }
}
