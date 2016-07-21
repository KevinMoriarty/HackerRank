import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        /* Declare second integer, double, and String variables. */
        int a;
        double b;
        String c;
        String e;

        Scanner scan = new Scanner(System.in);
        
        /* Read and save an integer, double, and String to your variables.*/

        a = scan.nextInt();
        b = scan.nextDouble();
        scan.nextLine();        
        e = scan.nextLine();




        
        //scan.close();

        /* Print the sum of both integer variables on a new line. */
    	System.out.println(i + a);
        
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + b);
        
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + e);

        scan.close();

    }
}