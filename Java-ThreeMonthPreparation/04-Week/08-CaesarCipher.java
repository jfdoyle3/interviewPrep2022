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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
      char[] alphaLower=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char[] alphaUpper=new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    char[] input=s.toCharArray();
    
    String results="";
    
    for(int idx=0; idx<input.length; idx++){
     for(char letter='a'; letter<='z'; letter++){
      if((int)input[idx]>=91 && (int)input[idx]<=96 ||(int)input[idx]>=32 && (int)input[idx]<=64 ||(int)input[idx]>=123 && (int)input[idx]<=126 ){
        results+=input[idx];
        break;
        }
      int  lowerCipher=((input[idx]-97)+k)%26;
      int  upperCipher=((input[idx]-65)+k)%26;
        
      if(input[idx]==letter)
        results+=alphaLower[lowerCipher];

      if(input[idx]==Character.toUpperCase(letter))
        results+=alphaUpper[upperCipher];

  
      }
    }
    return results;
  }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
