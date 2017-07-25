package patternDesign.structual.decorator;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/25.</p>
 */
public class ConcreteDecorator1 extends Decorator{
	public ConcreteDecorator1(Component component) {
		super(component);
	}
	
	private void method1(){
		System.out.println("ConcreteDecorator1's method");
	}
	
	@Override
	public void operate() {
		this.method1();
		super.operate();
	}
}
