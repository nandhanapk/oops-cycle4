package cyc4;
import java.util.Scanner;
class q9{
	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
int n = arr.length;
for (int i = 0; i < n - 1; i++) {
for (int j = 0; j < n - i - 1; j++) {
if (arr[j].compareTo(arr[j + 1]) > 0) {
T temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
}
}
public static <T> void printArray(T[] arr) {
for (T element : arr) {
System.out.print(element + " ");
}
System.out.println();
}
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the number of elements: ");
		 int n = scanner.nextInt();
		 scanner.nextLine(); 
		 Integer[] arr = new Integer[n];
		 System.out.println("Enter the elements:");
		 for (int i = 0; i < n; i++) {
		 	arr[i] = scanner.nextInt();
		 }
		 System.out.println("Original array:");
		 printArray(arr);
		 bubbleSort(arr);
		 System.out.println("Sorted array:");
		 printArray(arr);
		 scanner.close();
	}
}

   