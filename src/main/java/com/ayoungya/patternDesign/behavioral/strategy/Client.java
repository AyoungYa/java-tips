package com.ayoungya.patternDesign.behavioral.strategy;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/25.</p>
 */
public class Client {
	public static void main(String[] args){
		Strategy strategy = new ConcreteStrategy();
		
		Context context = new Context(strategy);
		
		context.doAnything();
	}
}
