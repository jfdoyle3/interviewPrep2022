import java.util.Scanner;

public class Solution {

   public static String getSmallestAndLargest(String s, int k) {
        List<String> subStrings=new ArrayList<>();
        int truncateLength=k-1;
        String[] arr=new String[s.length()-truncateLength];
        
        int strLen=s.length()-truncateLength;
        for(int idx=0; idx<strLen; idx++){
            arr[idx]=s.substring(idx,idx+k);
            subStrings.add(arr[idx]);
        }     
        Collections.sort(subStrings);
        
        return subStrings.get(0) + "\n" + subStrings.get(subStrings.size()-1);
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}