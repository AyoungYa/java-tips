package patternDesign.structual.adapter;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/27.</p>
 */
public class ConcreteTarget implements Target{
	@Override
	public void request() {
		System.out.println("ConcreteTarget implement's target method");
	}
}
