	import java.util.Scanner;
	
	public class Day9 {
		
		public static int factorial(int n){
			if(n <= 1){
				return 1;
			}
			else{
				return (n*factorial(n-1));
			}
			
		}
		
		public static void main(String[] args) {
			
			Scanner keyboard = new Scanner(System.in);
			int number = keyboard.nextInt();
			System.out.println(factorial(number));
			keyboard.close();
		}
	}
