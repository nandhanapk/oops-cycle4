package cyc4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class q10 {
	public static void main(String[] args) {
		 ArrayList<String> stringList = new ArrayList<>();
		 Scanner scanner = new Scanner(System.in);
		 while (true) {
		 	System.out.println("Enter your choice: 1. Add element 2. Remove element 3. Sort elements 4. Reverse elements 5. Display 6. Exit");
		 	int choice = scanner.nextInt();
		 	scanner.nextLine();
		 	switch (choice) {
		 	case 1:
		 		System.out.print("Enter a string to add: ");
		 		String newString = scanner.nextLine();
		 		stringList.add(newString);
		 		break;
		 	case 2:
		 		if (stringList.isEmpty()) {
		 			System.out.println("The list is empty");
		 		} else {
		 			System.out.print("Enter the index to remove: ");
		 			int index = scanner.nextInt();
		 			if (index < 0 || index >= stringList.size()) {
		 				System.out.println("Invalid index");
		 			} else {
		 				String removedString = stringList.remove(index);
		 				System.out.println("Removed: " + removedString);
		 			}
		 		}
		 		break;
		 	case 3:
		 		Collections.sort(stringList);
		 		break;
		 	case 4:
		 		Collections.reverse(stringList);
		 		break;
		 	case 5:
		 		for (String str : stringList) {
		 			System.out.println(str);
		 		}
		 		break;
		 	case 6:
		 		System.out.println("Exit");
		 		scanner.close();
		 		System.exit(0);
		 	default:
		 		System.out.println("Invalid choice!");
		 		break;
		 	}
		 	System.out.println();
		}
	}
}
