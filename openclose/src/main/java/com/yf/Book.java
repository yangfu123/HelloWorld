package com.yf;

/**
 * 开闭原则
 * @author yf
 */
public interface Book {

	/**
	 * 获取book 名称
	 * @return 名称
	 */
 	String getName();

	/**
	 * 获取book 价格
	 * @return  价格
	 */
 	Double getPrice();

	/**
	 * 获取book 类别
	 * @return  类别
	 */
 	String getType();
}
