package cyc4;
import java.util.*;
public class q17
{
public static void main(String args[])
{
	Map<Integer,String>hm=new HashMap<Integer,String>();
	hm.put(new Integer(1),"My");
	hm.put(new Integer(2),"name");
	hm.put(new Integer(3),"is");
	hm.put(new Integer(4),"Nandhana");
	System.out.println(hm);
	hm.put(new Integer(4),"Neena");
	System.out.println(hm);
	hm.remove(new Integer(1));
	System.out.println(hm);
}
}


