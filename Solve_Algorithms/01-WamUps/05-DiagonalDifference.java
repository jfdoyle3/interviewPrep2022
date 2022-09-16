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
    public static int diagonalDifference(List<List<Integer>> arr) {         
        int row=arr.size()-1;
        int average, diagA, diagB;
         average=diagA=diagB=0;

           for(int idx1=0, idx2=0;  idx2<arr.get(row).size(); idx1++,idx2++){
              int number=arr.get(idx1).get(idx2);
              diagA+=number;
           }
            
            for(int idx1=0, idx2=row;  idx2<=arr.get(row).size(); idx1++,idx2--){
              int number=arr.get(idx1).get(idx2);
               diagB+=number;
               if (idx2==0){
                  break;
              } 
            }

            if (diagB > diagA){
              average=diagB-diagA; 
            } else {
              average=diagA-diagB;
            }

        return average;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
