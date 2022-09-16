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
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {

		// Create a HashMap
        HashMap<Integer,Integer> birdMap=new HashMap<>();
		
		// Fill HashMsp with keys 1 through 5 with 0
        for(int key=1; key<=5; key++){
            birdMap.put(key,0);
        }
		
		// Fill HashMap with array values as counts to HashMap values
        for(int birdType : arr){
            if (birdMap.containsKey(birdType))
                birdMap.put(birdType,birdMap.get(birdType)+1);
        }
        
		// Initialize maxEntry to null
        Map.Entry<Integer, Integer> maxEntry = null;

		// Loop/Iterate through HashMap
        for (Map.Entry<Integer, Integer> entry : birdMap.entrySet())
        {
			// Compare HashMap values to determine which is the highest Value and assign to maxEntry
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        // Return the HashMap key with the highest Value
    return maxEntry.getKey();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
