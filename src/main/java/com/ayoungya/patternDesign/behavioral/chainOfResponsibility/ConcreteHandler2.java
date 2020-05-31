package com.ayoungya.patternDesign.behavioral.chainOfResponsibility;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/24.</p>
 */
public class ConcreteHandler2 extends Handler {
	@Override
	protected Level getHandlerLevel() {
		return new Level(2);
	}
	
	@Override
	protected Response echo(Request request) {
		return new Response("ConcreteHandler2 echoed the problem");
	}
}
