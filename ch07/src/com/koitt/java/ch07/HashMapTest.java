package com.koitt.java.ch07;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();       //-> HashMap을 이용해서 키와 값이 모두 문자열을 허용하는 Map을 만들기 위한 문장
		
		hm.put("한국", "서울");
		hm.put("일본", "도쿄");
		hm.put("중국", "베이징");
		hm.put("태국", "방콕");			hm.remove("태국");
		hm.put("중국", "베이징1");		// -> 기존 중국 키값을 가지는 값을 갱신한다.
		
		System.out.print("키 : " + hm.keySet());
		System.out.println(" 값 : " + hm.values());
		
		// 1. Iterator 사용
		Iterator<String> keys = hm.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			String value = hm.get(key);
			System.out.println(key + " : " + value);
		}
		
		// 2. for-each문
		for (String key : hm.keySet()) {
			String value = hm.get(key);
			System.out.println(key + " : " + value);
		}
			
		// 3. key값을 알고 있어서 직접 key값을 입력하여 값을 끄집어 낸다.
		String value = hm.get("한국");
		System.out.println(value);
		String value1 = hm.get("일본");
		System.out.println(value1);
	}

}
