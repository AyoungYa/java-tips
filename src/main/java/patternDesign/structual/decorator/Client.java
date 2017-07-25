package patternDesign.structual.decorator;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/25.</p>
 */
public class Client {
	public static void main(String[] args){
		Component component = new ConcreteComponent();
		
		Decorator decorator = new ConcreteDecorator1(component);
		
		decorator.operate();
	}
}
