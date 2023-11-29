
package collection1;
import java.util.*;
public class Array {

	public static void main(String[] args) 
	{
    ArrayList <Integer> a1=new ArrayList<Integer>();
		a1.add(12);
		a1.add(13);
		a1.add(124);
		a1.add(125);
		
		Iterator itr =a1.iterator();
		System.out.print("\n\t  "+a1.clone());
		while (itr.hasNext())
			System.out.print("\n\t  "+itr.next());
			
	}

}
