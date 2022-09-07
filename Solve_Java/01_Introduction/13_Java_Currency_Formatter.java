import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale usa=new Locale("en","US");
        Locale china=new Locale("zh","CN");
        Locale france=new Locale("fr","FR");
        Locale india=new Locale("en","in");
        
        
        Currency dollar=Currency.getInstance(usa);
        Currency yen=Currency.getInstance(china);
        Currency euro=Currency.getInstance(france);
        Currency rupee=Currency.getInstance(india);
        
        
        NumberFormat us= NumberFormat.getCurrencyInstance(usa);
        NumberFormat ch=NumberFormat.getCurrencyInstance(china);
        NumberFormat fr=NumberFormat.getCurrencyInstance(france);
        NumberFormat in=NumberFormat.getCurrencyInstance(india);
        
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + in.format(payment));
        System.out.println("China: " + ch.format(payment));
        System.out.println("France: " + fr.format(payment));
    }
}
