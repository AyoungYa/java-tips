package thinkInJava.ch17;

import java.util.*;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2016/10/14.</p>
 */
public class Synchronization {
	public static void main(String[] args){
		Collection<String> c = Collections.synchronizedCollection(new ArrayList<String>());
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		Set<String> set = Collections.synchronizedSet(new HashSet<String>());
		Set<String> sortedSet = Collections.synchronizedSortedSet(new TreeSet<String>());
		Map<String, String> m = Collections.synchronizedMap(new HashMap<String, String>());
		Map<String, String> sortedMap = Collections.synchronizedSortedMap(new TreeMap<String, String>());
	}
}
