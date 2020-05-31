package thinkInJava.ch17;

import java.util.AbstractList;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 16/9/19.</p>
 */
public class CountingIntegerList extends AbstractList<Integer> {
	private int size;

	public CountingIntegerList(int size){
		this.size = size < 0 ? 0 : size;
	}

	@Override
	public Integer get(int index) {
		return index;
	}

	@Override
	public int size() {
		return size;
	}

	public static void main(String [] args){
		System.out.println(new CountingIntegerList(30));
	}
}
