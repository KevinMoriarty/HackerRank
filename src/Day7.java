//import java.io.*;
import java.util.*;


public class Day7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        
        for (int number = arr.length - 1; number >= 0; number--){
        	
        	System.out.print(arr[number] + " ");
        }
    }
}
