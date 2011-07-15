package com.hyman.demo.javase.lang.exception.cls;

public class CannotFoundClass {
	static int static_i = m1();
	public static int m1() {
		int i = 1;
		int j = 0;
		return i / j;
	}
}
