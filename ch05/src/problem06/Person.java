package problem06;

public class Person {

	/*
	 * public class Person {
	 * String name;
	 * int age;
	 * 
	 * 가능한 모든 생성자 구현, 가능한 모든 getter, setter 의 구현, 생성자 구현에서 this(...)를 사용
	 */
	
	public String name;
	public int age;
	
	public Person() {	
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(int age) {
		this.age = age;
	}
	
	public Person(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
