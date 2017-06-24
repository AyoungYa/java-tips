package patterndesign;

import patterndesign.creational.singleton.SingletonEnum;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/23.</p>
 */
public class TestMain {
	public static void main(String [] args){
		SingletonEnum enumSingleton = SingletonEnum.INSTANCE;
		
		enumSingleton.methodYouNeed();
	}
}
