package programming.pratice;

public class Person extends Object{

	public String name;

	public Person(String name) {
		this.name = name;
	}

	public  boolean equals(Person a) {
		if(this.name == a.name) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {

		Person p1 = new Person("홍길동");
		System.out.println(p1.equals(new Person("홍길동")));
		System.out.println(p1.equals(new Person("최영태")));
	}

}
