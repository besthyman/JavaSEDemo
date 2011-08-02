package com.hyman.demo.javase.lang.operator.ternary;

public class TernaryOperator {
	private static int getInt() {
		return 1;
	}

	private static double getDouble() {
		return 1.0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(true ? 1 : 1.0);
		Object obj = true ? 1 : 2;
		System.out.println(obj.getClass().getName());
		Object obj2 = true ? 1 : 1.0;
		System.out.println(obj2.getClass().getName());
		Object obj3 = true ? 1.0 : 1;
		System.out.println(obj3.getClass().getName());
		Object obj4 = true ? getInt() : getDouble();
		System.out.println(obj4.getClass().getName());
	}

}

//1.0
//java.lang.Integer
//java.lang.Double
//java.lang.Double
//java.lang.Double

