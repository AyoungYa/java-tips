package patterndesign.creational.singleton;

/**
 * <p>Description: 线程安全的懒汉模式，效率低</p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/23.</p>
 */
public class SingletonSafetyIdler {
	private static SingletonSafetyIdler instance;
	
	private SingletonSafetyIdler(){}
	
	public static synchronized SingletonSafetyIdler getInstance(){
		if (instance == null){
			instance = new SingletonSafetyIdler();
		}
		return instance;
	}
}
