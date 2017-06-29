package patterndesign.creational.factory.abstractFactory;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/27.</p>
 */
public class MultiConcreteProduct1Factory extends AbstractMultiFactory{
	
	@Override
	public ConcreteProduct1 createProduct() {
		return new ConcreteProduct1();
	}
}
