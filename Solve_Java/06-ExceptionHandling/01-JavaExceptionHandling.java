import java.util.Scanner;
class MyCalculator {
    public int power(int n, int p) throws Exception
    {
        if(n == 0 && p == 0) 
        {
            throw new Exception("n and p should not be zero.");
        }
        else if(n < 0 || p < 0)
        {
            throw new Exception("n or p should not be negative.");
        }
        else
        {
            int result = 1;
            for(int i = 1; i <= p; i++)
            {
                result = result * n;
            }
            
            return result; 
        }    
        
    }
   
}

public class Solution {