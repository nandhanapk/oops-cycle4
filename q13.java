package cyc4;
import java.util.*;
public class q13 {
	public static void main(String[] args) {
		 Queue<String> queue = new PriorityQueue<>();
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the number of elements: ");
		 int numElements = scanner.nextInt();
		 for (int i = 0; i < numElements; i++) {
		 System.out.print("Enter element " + (i + 1) + ": ");
		 String element = scanner.next();
		 queue.offer(element);
	}
	System.out.println("Queue elements: " + queue);
	
	}
}

