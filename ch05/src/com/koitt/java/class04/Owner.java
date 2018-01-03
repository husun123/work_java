package com.koitt.java.class04;

import obj.constructor.Car;

public class Owner {

		private String name;
		private Car car1;
		
		public Owner(String name, Car car1) {
			this.name = name;
			this.car1 = car1;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Car getCar1() {
			return car1;
		}

		public void setCar1(Car car1) {
			this.car1 = car1;
		}

		public void intromyCar() {
			System.out.println(this.name + "의 자동차의 브랜드 이름은 " + car1.getBrandName() + "이고, 최고속도는 " + car1.getMaxSpeed() + "km/h 입니다.");
		}
}
 
