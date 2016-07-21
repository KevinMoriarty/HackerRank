import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int NumberOfEntries = keyboard.nextInt();
		
		Map<String, Integer> PhoneBook = new HashMap<String, Integer>();
		
		for (int entry = 0; entry < NumberOfEntries; entry++){
			String name = keyboard.next();
			int Phone_Number = keyboard.nextInt();
			PhoneBook.put(name, Phone_Number);
		}
		
		String ValueToBeChecked = keyboard.next();
		if (PhoneBook.containsKey(ValueToBeChecked))
		{
			System.out.println(ValueToBeChecked + "=" + PhoneBook.get(ValueToBeChecked));
		}
		else{
			System.out.println("Not found");
		}
		keyboard.close();
	}
}
