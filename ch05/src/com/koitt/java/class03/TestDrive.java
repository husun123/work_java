package com.koitt.java.class03;

public class TestDrive {

	public static void main(String[] args) {
		
		// 케빈 생성
		Neko kevyn = new Neko("케빈", 2);
		
		// 주인 생성	- 허선 주인이 kevyn을 소유한다.
		Neko[] cats = new Neko[2];
		cats[0] = new Neko("케냐", 3);
		cats[1] = new Neko("케챱", 5);
		Owner husun = new Owner("허선", "신림", cats);
		
		// 주인이 소유한 고양이를 소개하는 메소드를 호출
		husun.introNeko();
		
		// 다른 고양이 한마리 생성
		
		Neko root = new Neko("루트", 3);
		
		// 주인생성 - 현지 주인이 root를 소유한다.
		Neko[] cats2 = new Neko[3];
		cats2[0] = new Neko("케로로", 2);
		cats2[1] = new Neko("케닙", 1);
		cats2[2] = new Neko("케겍", 1);
		Owner hyunji = new Owner("이현지", "독립문",cats2 );
		
		// 주인이 소유한 고양이를 소개하는 메소드를 호출
		hyunji.introNeko();
		
		// 분양받을 고양이를 생성한다.
		Neko kebab = new Neko("케밥", 1);
		
		// 주인이 새로 고양이를 분양받는다.
		hyunji.setCat(cats);
		
		// 주인이 새로 분양받은 고양이를 소개하는 메소드를 호출
		hyunji.introNeko();
	}
	
	
	

}
