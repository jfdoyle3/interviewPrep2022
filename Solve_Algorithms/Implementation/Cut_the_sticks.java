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



    public static List<Integer> cutTheSticks(List<Integer> arr) {
    
    Integer[] falseArr={6,4,2,1};
    List<Integer> falseResults=Arrays.asList(falseArr);
    
    List<Integer> copySticks=new ArrayList<>(arr);

    List<Integer> results=new ArrayList<>();
    

    int sum=0;
    int minNumber=0;
    int arrLen=arr.size();
    int copySticksLen=copySticks.size();
   // results.add(arrLen);
   
    
   do{
        int counter=0;
        minNumber=Collections.min(copySticks);
        for(int idx=0; idx<copySticks.size(); idx++){             
            if(copySticks.get(idx)!=0){
                int cutToLength=copySticks.get(idx)-minNumber;
                copySticks.set(idx, cutToLength);
                counter++; 
            }
        }
        results.add(counter);  
        System.out.println("c: "+counter);
        System.out.println("copyStick: "+copySticks.toString());
        sum = copySticks.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum: "+sum);
    }while(sum!=0);
        
    return results;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.cutTheSticks(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
