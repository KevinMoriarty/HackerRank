import java.util.Scanner;

//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;


public class Day10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        String number = Integer.toBinaryString(n);
        char[] values = number.toCharArray();
        
        System.out.println(values);
        
        int temp_value = 0;
        int max_value = 0;
        
        for (int i = 0; i < values.length; i++){
        	if (values[i] == '1'){
        		temp_value++;
        	}
        	else{
        		temp_value = 0;
        	}
        	
        	if (temp_value > max_value){
        		max_value = temp_value;
        	}
        }
        System.out.println(max_value);
        in.close();
      
    }
}
