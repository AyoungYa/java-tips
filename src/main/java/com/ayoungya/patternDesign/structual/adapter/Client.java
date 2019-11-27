package com.ayoungya.patternDesign.structual.adapter;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/27.</p>
 */
public class Client {
	public static void main(String[] args) {
		//原有的业务逻辑
		Target target = new ConcreteTarget();
		target.request();
		//现在增加了适配器角色后的业务逻辑
		Target target2 = new Adapter();
		target2.request();
	}
}
