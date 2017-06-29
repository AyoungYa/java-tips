package patterndesign.creational.factory.abstractFactory;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/26.</p>
 */
public class Client {
	public static void main(String[] args){
		AbstractFactory factoryInstance = new ConcreteFactory();
		
		ConcreteProduct2 product2Instance = factoryInstance.createProduct(ConcreteProduct2.class);
		product2Instance.genericProductMethod();
		product2Instance.abstractProductMethod();
		
		ConcreteProduct1 product1Instance = factoryInstance.createProduct(ConcreteProduct1.class);
		product1Instance.genericProductMethod();
		product1Instance.abstractProductMethod();
		
		//simple factory
		ConcreteProduct1 simpleProduct1 = SimpleFactory.createProduct(ConcreteProduct1.class);
		simpleProduct1.abstractProductMethod();
		simpleProduct1.genericProductMethod();
		
		//Multi factory
		ConcreteProduct1 multiProduct1 = new MultiConcreteProduct1Factory().createProduct();
		multiProduct1.abstractProductMethod();
	}
}
