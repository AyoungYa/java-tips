package thinkInJava.ch17;

import java.util.*;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 16/9/22.</p>
 */
class  SetType{
	int i;

	public SetType(int i) {
		this.i = i;
	}

	@Override
	public boolean equals(Object o) {
		return o instanceof SetType && (i == ((SetType)o).i);
	}

	public String toString(){
		return Integer.toString(i);
	}
}
public class HashType extends SetType {

	public HashType(int i) {
		super(i);
	}

	public int hashCode(){
		return i;
	}
}

class TreeType extends SetType implements Comparator<TreeType>{

	public TreeType(int i) {
		super(i);
	}


	@Override
	public int compare(TreeType o1, TreeType o2) {
		return 0;
	}

	public int compareTo(TreeType arg){
		return (arg.i < i ? -1 : (arg.i == i ? 0 : 1));
	}
}

class SortedDemo{
	public void sortedFunction(){
		SortedSet<String> sortedSet = new TreeSet<>();
	}
}


