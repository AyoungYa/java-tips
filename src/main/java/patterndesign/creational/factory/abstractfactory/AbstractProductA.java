package patterndesign.creational.factory.abstractfactory;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/29.</p>
 */
public abstract class AbstractProductA {
	public void shareMethod(){
		System.out.println("Share productA method");
	}
	
	public abstract void specifiedMethod();
}
