package com.yf;

/**
 * 用来获取打折后的商品价格
 * @author yf
 */
public class JavaDiscountBook extends JavaBook{
	public JavaDiscountBook(String name, Double price, String type) {
		super(name, price, type);
	}

	public Double getDiscountPrice(){
		return this.getPrice() * 0.8;
	}
}
