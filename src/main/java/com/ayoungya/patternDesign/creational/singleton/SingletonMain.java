package patterndesign.creational.singleton;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/23.</p>
 */
public class SingletonMain {
	public static void main(String [] args){
		SingletonEnum enumSingleton = SingletonEnum.INSTANCE;
		
		enumSingleton.methodYouNeed();
	}
}
