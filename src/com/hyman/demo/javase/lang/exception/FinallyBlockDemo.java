package com.hyman.demo.javase.lang.exception;

public class FinallyBlockDemo {

	public static String m1() {
		System.out.println("m1 executing");
		return "try";
	}

	public static String finallyBlock() {
		try {
			System.out.println("try executing");
			return m1();
		} catch (Exception e) {
		} finally {
			System.out.println("finally executing");
		}
		return "end";
	}

	public static String finallyBlockWithReturn() {
		try {
			System.out.println("try executing");
			return m1();
		} catch (Exception e) {
		} finally {
			System.out.println("finally executing");
			return "finally";
		}
	}

	public static void main(String[] args) {
		{
			String result = finallyBlock();
			System.out.println(result);
		}
		System.out.println("-------------------------");
		{
			String result = finallyBlockWithReturn();
			System.out.println(result);
		}
	}

}
// result log:
//try executing
//m1 executing
//finally executing
//try
//-------------------------
//try executing
//m1 executing
//finally executing
//finally

// my conclusion:
//try block is always executed before finally block. 
//We can see return clause in try as set the return value for the method and the method is ready to exit. 
//If the finally block has return clause, it will also set the return value for the method. 
//Since finally is executed after try, its return value override the try's one.
