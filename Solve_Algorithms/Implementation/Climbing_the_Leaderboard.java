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

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {        
        List<Integer> results=new ArrayList<>();
        List<Integer> newBoard=new ArrayList<>();
        
        for (int score : ranked){
            if (!newBoard.contains(score))
                newBoard.add(score);
        }
                int ranking=1;
        
        HashMap<Integer,Integer> hashBoard=new HashMap<>();
        
        for(int idx=0; idx<newBoard.size(); idx++) {
            if(hashBoard.containsKey(newBoard.get(idx))){
                hashBoard.put(ranking++,newBoard.get(idx));
            } else{
                hashBoard.put(ranking++,newBoard.get(idx));
            }
        }
        for(int score : player){
            int rank=getRanking(hashBoard,score);
            results.add(rank);
        }
            
        return results;
    }
   public static int getRanking(HashMap<Integer,Integer> board, int playerScore) {
        
        int ranked=0;
        
        for (Map.Entry<Integer, Integer> data : board.entrySet()) {
            Integer position = data.getKey();
            Integer score = data.getValue();
           
            if (score<=playerScore) { 
                ranked=position;
                break;
            }
        }
        if (ranked==0) {
            ranked=board.size()+1;
        }
        return ranked;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.climbingLeaderboard(ranked, player);

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