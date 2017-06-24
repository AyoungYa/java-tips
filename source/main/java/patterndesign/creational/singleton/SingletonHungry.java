package patterndesign.creational.singleton;

/**
 * <p>Description: 饿汉模式</p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/23.</p>
 */
public class SingletonHungry {
	private static SingletonHungry instance = new SingletonHungry();
	
	private SingletonHungry(){}
	
	public static SingletonHungry getInstance(){
		return instance;
	}
}
