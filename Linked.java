
package collection1;
import java.util.Iterator;
import java.util.LinkedList;
public class Linked {

	public static void main(String[] args) 
	{
		LinkedList <String> l1=new LinkedList <String>();
		l1.add("aaa");
		l1.add("bbb");
		l1.add("ccc");
		l1.add("ddd");     // l1.remove();
		l1.add(2,"abc");
		Iterator itr =l1.iterator();
		System.out.print("\n\t  "+l1.clone());
		while (itr.hasNext())
			System.out.print("\n\t  "+itr.next());
			
	}

}
