package patterndesign.creational.factory.abstractfactory;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/29.</p>
 */
public class Creator1 extends AbstractCreator{
	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}
	
	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}
}
