import java.util.Scanner;

//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner keyboard = new Scanner(System.in);
    	
    	int numberOfTestCases = keyboard.nextInt();
    	
    		String[] S = new String[numberOfTestCases];
    		for (int i = 0; i <= numberOfTestCases - 1; i++){
    		S[i] = keyboard.next();
    		}
    	keyboard.close();
    	  	
    	for (int i = 0; i <= numberOfTestCases - 1; i++){
    		char[] string = S[i].toCharArray();
    			for (int index = 0; index < string.length; index+=2)
    				{
    				System.out.print(string[index]);
    				}
    			System.out.print(" ");
    			for (int index = 1; index < string.length; index+=2){
    				System.out.print(string[index]);
    				}
    			System.out.println("");
    		}
    	}
    }