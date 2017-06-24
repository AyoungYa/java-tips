package patterndesign.creational.singleton;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/23.</p>
 */
public class SingletonDoubleCheck {
	private volatile static SingletonDoubleCheck instance;
	
	private SingletonDoubleCheck(){}
	
	public static SingletonDoubleCheck getInstance(){
		if (instance == null){
			synchronized (SingletonDoubleCheck.class){
				if (instance == null){
					instance = new SingletonDoubleCheck();
				}
			}
		}
		return instance;
	}
	
	public void otherMethod(){
		System.out.println(SingletonDoubleCheck.class.getName());
	}
}
