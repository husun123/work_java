package obj.constructor;

import com.koitt.java.class04.Owner;

public class Car {

	private int maxSpeed;
	private String brandName;
	private int speed;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//브랜드 이름을 지정하는 생성자
	public Car(String brandName) {
		this.brandName = brandName;
	}

	//브랜드 이름과 최고 속도를 지정하는 생성자
	public Car(String brandName, int maxSpeed) {
		this(brandName);
		this.maxSpeed = maxSpeed;
	}

	//속도 관련 메소드
	public int speedUp() {
		int tempSpeed = this.speed;
		tempSpeed += 30;

		//최대 속도보다 더 높다면 이전 속도 유지
		if (tempSpeed > this.maxSpeed) {
			return this.speed;
		}
		// 최대 속도보다 작거나 같다면 현재 속도를 갱신
		this.speed  = tempSpeed;
		
		return this.speed;
	}
	public int speedDown() {
		//현재 속도를 임시 저장
		int tempSpeed = this.speed;
		tempSpeed -= 20;
		
		// 현재 속도가 0보다 작다면
			if(tempSpeed < 0){
		return 0 ;
	}
		this.speed = tempSpeed;
		
		return this.speed;
	}
	//maxSpeed의 setter와 getter
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public static void main(String[] args) {
		Car mycar = new Car("포르쉐", 300);
		Owner jason = new Owner("jason", mycar);
		Car mayercar = new Car("현대", 250);
		Owner mayer = new Owner("mayer", mayercar);
		
		jason.intromyCar();
		mayer.intromyCar();
	}

}
