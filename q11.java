package cyc4;
import java.util.LinkedList;
import java.util.Scanner;
public class q11 {
	public static void main(String[] args) {
		        LinkedList<String> linkedList = new LinkedList<>();
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of elements to add: ");
		        int count = scanner.nextInt();
		        scanner.nextLine();
		        for (int i = 0; i < count; i++) {
		            System.out.print("Enter element " + (i + 1) + ": ");
		            String element = scanner.nextLine();
		            linkedList.add(element);
		        }
		        System.out.println("Original linked list:");
		        System.out.println(linkedList);
		        linkedList.clear();
		        System.out.println("Linked list after removing all elements:");
		        System.out.println(linkedList);
		        scanner.close();
	}
}
