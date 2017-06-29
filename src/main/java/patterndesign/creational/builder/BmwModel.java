package patterndesign.creational.builder;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/24.</p>
 */
public class BmwModel extends CarModel{
	@Override
	void start() {
		System.out.println("BMW start");
	}
	
	@Override
	void stop() {
		System.out.println("BMW stop");
	}
	
	@Override
	void alarm() {
		System.out.println("BMW alarm");
	}
	
	@Override
	void engineBoom() {
		System.out.println("BMW engine boom!!");
	}
}
