package com.koitt.java.ch07;

public class WrapperInteger {
	public static void main(String[] args) {
	
	Integer age = new Integer(20);
	Integer snum = new Integer("20121105");
	
	System.out.println("나이 : " + age.intValue());
	System.out.println("학번 : " + snum.intValue());
	System.out.println(age.equals(snum));
	
	System.out.println(Integer.parseInt("234567"));					// STring타입을 Int타입으로 리턴
	System.out.println(Integer.parseInt("ff", 16));						// 16진수 ff를 10진수로 리턴
	System.out.println(Integer.toBinaryString(255));					// 255를 2진수 String타입으로 리턴
	System.out.println(Integer.toString(255, 16));						// 255를 16진수로 리턴
	}
}

