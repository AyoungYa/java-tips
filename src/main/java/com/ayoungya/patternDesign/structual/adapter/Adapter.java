package com.ayoungya.patternDesign.structual.adapter;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/27.</p>
 */
public class Adapter extends Adaptee implements Target{
	@Override
	public void request() {
		super.doSomething();
	}
}
