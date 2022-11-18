import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int idx=0; idx<n; idx++){
              a+=(int)Math.pow(2,idx)*b;
              System.out.printf("%d ",a);
            }
            System.out.println();
        }
        in.close();
    }
}
