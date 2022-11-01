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
     * Complete the 'maximumPerimeterTriangle' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY sticks as parameter.
     */

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) { 
         
      Collections.sort(sticks);
       int[] results=new int[4];
        int stickSize=sticks.size()-2;

        for(int i=0; i<stickSize; i++){

            System.out.println(sticks.get(i)+"  "+sticks.get(i+1)+"  "+sticks.get(i+2));
            boolean triangle=isTriangle(sticks.get(i),sticks.get(i+1),sticks.get(i+2));

            if(triangle){
                System.out.println("Yes");
                results[0]=sticks.get(i);
                results[1]=sticks.get(i+1);
                results[2]=sticks.get(i+2);
               } else{
                   results[3]=-1;
               }
            }   
        List<Integer> a=new ArrayList<>();
        
        if(results[0]==0){
           a.add(results[3]);
           return a;
        }
    
        for(int idx=0; idx<3; idx++)
            a.add(results[idx]);
        
                                   
       return a;
}

    public static boolean isTriangle(int a, int b, int c){
        boolean state=false;

        if(a+b>c &&
           a+c>b &&
           b+c>a
           )
               state=true;
      return state;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> sticks = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.maximumPerimeterTriangle(sticks);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
