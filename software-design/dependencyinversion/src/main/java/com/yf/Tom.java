package com.yf;

/**
 * @author yf
 */
public class Tom {

	private Behavior behavior;

	public void setBehavior(Behavior behavior){
		  this.behavior = behavior;
	}

	public void study(){
		behavior.study();
	}
}
