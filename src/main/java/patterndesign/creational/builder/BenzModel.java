package patterndesign.creational.builder;

import java.util.List;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/24.</p>
 */
public class BenzModel extends CarModel{
	@Override
	void start() {
		System.out.println("Benz start");
	}
	
	@Override
	void stop() {
		System.out.println("Benz stop");
	}
	
	@Override
	void alarm() {
		System.out.println("Benz alarm");
	}
	
	@Override
	void engineBoom() {
		System.out.println("Benz engine boom!!");
	}
}
