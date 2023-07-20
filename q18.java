package cyc4;
import java.util.*;
public class q18 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Map<String,String>map=new HashMap<>();
	System.out.println("Enter the limit");
	int n=sc.nextInt();
	System.out.println("Enter the id and Name:");
	while(n!=0) {
		String e=sc.next();
		String s=sc.next();
		map.put(e,s);
		n--;
		System.out.println("HashMap:"+map);
		Map<String,String>treeMap=new TreeMap<>();
		treeMap.putAll(map);;
		System.out.println("TreeMap;"+treeMap);
	}
}
}
