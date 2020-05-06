package com.yf;


/**
 * @author yf
 */
public class OpenCloseTest {


	public static void main(String[] args) {
		// v1
//		JavaBook javaBook = new JavaBook("java入门到放弃", 120D, "JAVA");
//		System.out.println("书籍名称：" + javaBook.getName() +
//				"\n书籍价格：" + javaBook.getPrice() +
//				"\n书籍类型：" + javaBook.getType());

		// v2
		// 业务增加 获取打折后的价格, 而这时 JavaBook 中没有打折这个属性，我们要在不修改源代码的情况下进行添加。
		// 而这时我们就需要重新创建一个类来继承JavaBook, 以前的实现方式也可实行, 不会应该增加需求而修改其他原有的代码

		JavaDiscountBook javaDiscountBook = new JavaDiscountBook("java入门到放弃", 120D, "JAVA");
		System.out.println("书籍名称：" + javaDiscountBook.getName() +
				"\n书籍价格：" + javaDiscountBook.getPrice() +
				"\n书籍折扣价：" + javaDiscountBook.getDiscountPrice() +
				"\n书籍类型：" + javaDiscountBook.getType());
	}
}
