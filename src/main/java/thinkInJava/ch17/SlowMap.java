package thinkInJava.ch17;

import java.util.*;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 16/10/9.</p>
 */
public class SlowMap<K, V> extends AbstractMap {
	private List<K> keys = new ArrayList<>();
	private List<V> values = new ArrayList<>();

	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set = new HashSet<>();
		Iterator<K> ki = keys.iterator();
		Iterator<V> vi = values.iterator();
		while (ki.hasNext()){
			set.add(new MapEntry<K, V>(ki.next(), vi.next()));
		}
		return set;
	}


	public static int ack(int m, int n){
		if(m == 0){
			return n+ 1;
		}else if(n == 0){
			return ack(m-1, n);
		}
		else {
			return ack(m-1, ack(m, n -1));
		}
	}

	public static void main(String[] args){
		System.out.println(ack(3, 2));
	}
}
