package thinkInJava.ch17;

import javax.swing.text.Utilities;
import java.util.*;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2016/10/14.</p>
 */
public class ListSortSearch {
	static Collection<String> data = new ArrayList<>(Arrays.asList("China", "American"));

	public static void main(String[] args){
		Collection<String> c = Collections.unmodifiableCollection(data);
		System.out.println(c);
//		c.add("Asia");

		List<String> a = Collections.unmodifiableList(new ArrayList<>(data));
		ListIterator<String> lit = a.listIterator();
		System.out.println(lit.next());
		lit.add("Hee");
	}
}
