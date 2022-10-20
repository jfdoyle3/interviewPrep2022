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
      
        List<Integer> results=new ArrayList<>();
        
        int stickSize=sticks.size();
          

        if(sticks.get(0)+sticks.get(1)>sticks.get(2) && 
             sticks.get(0)+sticks.get(2)>sticks.get(1) &&
             sticks.get(1)+sticks.get(2)>sticks.get(0)
             )
                System.out.println("Triangle");
          else
                System.out.println("Nope");
          
        // sides: A B C
        // to see if triangle is true
        // A+B>C, A+C>B, B+C>A
        
        
        return results;
    }
    
    public boolean isTriangle(List<Integer> input, int size){
          
      
      return true;
      
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
