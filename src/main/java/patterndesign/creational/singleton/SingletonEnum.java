package patterndesign.creational.singleton;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/23.</p>
 */
public enum SingletonEnum {
	INSTANCE;
	
	public void methodYouNeed(){
		System.out.println(SingletonEnum.class.getName());
	}
}
