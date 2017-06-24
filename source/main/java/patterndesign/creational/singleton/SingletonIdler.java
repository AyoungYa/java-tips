package patterndesign.creational.singleton;

/**
 * <p>Description: 非线程安全的懒汉模式</p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/23.</p>
 */
public class SingletonIdler {
	private static SingletonIdler instance;
	
	private SingletonIdler(){}
	
	public static SingletonIdler getInstance(){
		if (instance == null){
			instance = new SingletonIdler();
		}
		return instance;
	}
}
