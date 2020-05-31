package com.ayoungya.patternDesign.behavioral.strategy;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/25.</p>
 */
public class ConcreteStrategy implements Strategy{
	@Override
	public void doSomething() {
		System.out.println("ConcreteStrategy do something");
	}
}
