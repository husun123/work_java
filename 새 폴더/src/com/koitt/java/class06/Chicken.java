package com.koitt.java.class06;

public class Chicken extends Process{

	@Override
	public void ordering() {
		System.out.println("치킨 주문을 받는다.");
	}

	@Override
	public void cooking() {
		System.out.println("치킨을 튀긴다.");		
	}

	@Override
	public void delivering() {
		System.out.println("치킨을 배달한다.");
	}

	@Override
	public void billing() {
		System.out.println("치킨집 배달원이 결제를 받는다.");		
	}

}
