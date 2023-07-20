package cyc4;
import java.util.*;
public class q12 {
	public static void main(String[] args) {
		Stack <String> stack=new Stack<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
int n = sc.nextInt();
System.out.println("Enter the elements to push:");
for (int i = 0; i < n; i++) {
String element = sc.next();
stack.push(element);
}
System.out.println("Pushed :" + stack);
System.out.println("\nPosition to remove: ");
int p=sc.nextInt();
stack.remove(p);
System.out.println("After remove :" + stack);
sc.close();
	}
}

