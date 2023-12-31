package date12_nov;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class currency {
    
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Amount : ");
        double payment = scanner.nextDouble();
        scanner.close();

        // NumberFormat format = new NumberFormat();
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
