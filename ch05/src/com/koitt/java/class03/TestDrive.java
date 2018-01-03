package com.koitt.java.class03;

public class TestDrive {

	public static void main(String[] args) {
		
		// 케빈 생성
		Neko kevyn = new Neko("케빈", 2);
		
		// 주인 생성	- 허선 주인이 kevyn을 소유한다.
		Owner husun = new Owner("허선", "신림", kevyn);
		
		// 주인이 소유한 고양이를 소개하는 메소드를 호출
		husun.introNeko();
		
		// 다른 고양이 한마리 생성
		
		Neko root = new Neko("루트", 3);
		
		//주인생성 - 현지 주인이 root를 소유한다.
		Owner hyunji = new Owner("이현지", "독립문", root);
		
		//주인이 소유한 고양이를 소개하는 메소드를 호출
		hyunji.introNeko();
	}
	
	
	

}
