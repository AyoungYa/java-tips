package patterndesign.creational.factory.abstractfactory;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/6/29.</p>
 */
public class MainAbstractFactory {
	public static void main(String[] args){
		AbstractCreator creator1 = new Creator1();
		
		AbstractProductA a1 = creator1.createProductA();
		AbstractProductB b1 = creator1.createProductB();
		a1.specifiedMethod();
		b1.specifiedMethod();
		
		AbstractCreator creator2 = new Creator2();
		AbstractProductA a2 = creator2.createProductA();
		AbstractProductB b2 = creator2.createProductB();
		a2.specifiedMethod();
		b2.specifiedMethod();
	}
	
}
