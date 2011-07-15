package com.hyman.demo.javase.lang.exception.cls;

public class NoClassDefFoundErrorDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CannotInitializedClass c = new CannotInitializedClass();
	}

}
// I remove the compiled class file 'CannotFoundClass' from file system, and the result:
//Exception in thread "main" java.lang.NoClassDefFoundError: com/hyman/demo/javase/lang/exception/cls/CannotFoundClass
//at com.hyman.demo.javase.lang.exception.cls.CannotInitializedClass.<clinit>(CannotInitializedClass.java:4)
//at com.hyman.demo.javase.lang.exception.cls.NoClassDefFoundErrorDemo.main(NoClassDefFoundErrorDemo.java:8)

