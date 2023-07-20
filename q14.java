package cyc4;
import java.util.*;
public class q14 {
	public static void main(String[] args) {
		 Deque<String> deque = new ArrayDeque<>();
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the number of elements: ");
		 int numElements = scanner.nextInt();
		 System.out.println("Enter " + numElements + " elements to add at the front:");
		 for (int i = 0; i < numElements; i++) {
		 	String element = scanner.next();
		 	deque.addFirst(element);
		 }
		 System.out.println("Enter " + numElements + " elements to add at the end:");
		 for (int i = 0; i < numElements; i++) {
		 	String element = scanner.next();
		 	deque.addLast(element);
		 }
		 System.out.println("Deque elements: " + deque);
		 System.out.print("Enter the number of elements to remove from the front: ");
		 int numRemoveFront = scanner.nextInt();
		 for (int i = 0; i < numRemoveFront; i++) {
		 	deque.removeFirst();
		 }
		 System.out.print("Enter the number of elements to remove from the end: ");
		 int numRemoveEnd = scanner.nextInt();
		 for (int i = 0; i < numRemoveEnd; i++) {
		 	deque.removeLast();
		 }
		 System.out.println("Updated deque elements: " + deque);
		 scanner.close();
	}
}
