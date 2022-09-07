import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean isAnagram(String a,String b){
        String lowerA=a.toLowerCase();
        String lowerB=b.toLowerCase();
        String[] splitA=lowerA.split("");
        String[] splitB=lowerB.split("");
        if(splitA.length != splitB.length)
            return false;
        
        List<String> listA=Arrays.asList(splitA);
        List<String> listB=Arrays.asList(splitB);
        
        Set<String> setA=new HashSet<>(listA);
        for(String letter : setA){
            int occuranceA=Collections.frequency(listA,letter);
            int occuranceB=Collections.frequency(listB,letter);
            if (occuranceA != occuranceB)
                return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
