package com.koitt.java.ch07;

import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// 제네릭 (Generic)
		List<Object> data = new Vector<Object>(3);
		//Vector data = new Vector(3); -> 경고 발생
		((Vector<Object>)data).addElement(2012);
		data.add("년도");
		((Vector<Object>)data).addElement(4.35);
		data.add(2 ,"목표 학점");
		((Vector<Object>)data).insertElementAt("자바강좌", 0);
		System.out.println("size = " + data.size());
		System.out.println("capacity" + ((Vector<Object>)data).capacity());
		System.out.println(data.toString());
	}
}
