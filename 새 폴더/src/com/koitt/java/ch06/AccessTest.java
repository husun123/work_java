package com.koitt.java.ch06;

import java.util.Date;

import inheritance.access.Account;

public class AccessTest extends Account{

	public AccessTest(String name, int number) {
		super(name, number);
		Date a = this.open;
	}
	
	private String text;
	
	public static void main(String[] args) {
		Account account = new Account();
		String name = account.name;
		
		AccessTest t = new AccessTest("홍길동", 1000);
		
		// 접근 가능 (public은 어디서든 접근이 가능)
		
		String a = t.text;
		
		// protected : 접근 가능(상속받은 클래스를 이용해서 객체를 생성했기 때문에)
		
		Date b = t.open;
		
		// protected :  접근 불가능(상속받지 않은 클래스를 이용해서 객체를 생성했기 때문에)
		
		// Date a1 = account.open;
		
		// 접근 불가능(같은 패키지 이므로)
		
		// int c = t.number;
		
		// 접근 불가능(클래스 내부에서만 사용가능하므로)
		
		// long d = t.long
				

	}

}
