package patterndesign.creational.factory.abstractFactory;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/26.</p>
 */
public abstract class AbstractProduct {
	abstract void abstractProductMethod();
	
	void genericProductMethod(){
		System.out.println("Generic product method");
	}
}
