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
/*
 * my conclusion: all the logic try block is executed before finally.
 */
/*
 * if has return clause in try block, after the try block finish, the return
 * result is got, and the method is ready to return. But before method exit, the
 * finally block is executed, if the finally block modify the return value, the
 * previous value is override.
 */
