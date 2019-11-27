package com.ayoungya.patternDesign.behavioral.strategy;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzying</p>.
 * <p>@Date: 2017/7/25.</p>
 */
public enum StrategyEnum {
	ADD("+"){
		@Override
		public int exec(int a, int b) {
			return a + b;
		}
	},
	MINUS("-"){
		@Override
		public int exec(int a, int b) {
			return a - b;
		}
	},
	;
	
	StrategyEnum(String value) {
		this.value = value;
	}
	
	private String value;
	
	public String getValue() {
		return value;
	}
	
	public abstract int exec(int a, int b);
}
