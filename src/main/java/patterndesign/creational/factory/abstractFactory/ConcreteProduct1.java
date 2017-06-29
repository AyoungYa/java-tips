package patterndesign.creational.factory.abstractFactory;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/26.</p>
 */
public class ConcreteProduct1 extends AbstractProduct {
	
	@Override
	void abstractProductMethod() {
		System.out.println("Product 1");
	}
}
