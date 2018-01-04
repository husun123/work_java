package com.koitt.java.class03;

/*
 * Owner(주인)은 Neko(고양이)를 한마리씩 가질 수 있다.
 */
public class Owner {
	
	private String name;			// 주인 이름
	private String address;		// 주인 주소
	private Neko[] cat;				// 주인이 소유한 고양이
	
	public  Owner(String name, String address, Neko[] cat) {
		this.name = name;
		this.address = address;
		this.cat = cat;
	}
	 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Neko[] getCat() {
		return cat;
	}

	public void setCat(Neko[] cat) {
		this.cat = cat;
	}

	// 주인이 소유한 고양이 소개하는 메소드 구현
	public void introNeko() {
		System.out.print(this.name + "의 고양이는 ");
			for(int i = 0; i < cat.length; i++) {
					System.out.print(cat[i].getName() + "이고, 나이는 ");
					System.out.println(cat[i].getAge() + "살 입니다.");
			}
			System.out.println("그래서 총 " + cat.length + "마리 입니다.");
	}
	
}
