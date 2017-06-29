package patterndesign.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/24.</p>
 */
public class Main {
	public static void main(String[] args){
		BenzModel benz = new BenzModel();
		List<String> sequence = new ArrayList<String>(){{
			add("engineBoom");
			add("start");
			add("stop");
		}};
		benz.setSequence(sequence);
		benz.run();
	}
}
