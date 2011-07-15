package com.hyman.demo.javase.lang.exception.cls;

public class ClassNotFoundExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class.forName("com.hyman.demo.javase.lang.exception.cls.A");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
