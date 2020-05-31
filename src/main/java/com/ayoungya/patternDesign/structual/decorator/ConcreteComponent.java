package com.ayoungya.patternDesign.structual.decorator;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/25.</p>
 */
public class ConcreteComponent extends Component{
	@Override
	public void operate() {
		System.out.println("ConcreteComponent's operate");
	}
}
