package com.yf;

/**
 * @author yf
 */
public class DependencyinversionTexst {


	public static void main(String[] args) {
	 	Tom tom = new Tom();
	 	tom.setBehavior(new JavascriptStudy());
	 	tom.study();
	}
}
