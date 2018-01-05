package com.koitt.java.class06;

// 중국집
public class Chinese extends Process{

	@Override
	public void ordering() {
		System.out.println("중국집 주문을 받는다.");
	}

	@Override
	public void cooking() {
		System.out.println("중국집에서 요리를 한다.");
	}

	@Override
	public void delivering() {
		System.out.println("중국집에서 배달한다.");		
	}

	@Override
	public void billing() {
		System.out.println("중국집 배달원이 결제받는다.");		
	}
}
