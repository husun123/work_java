package progamming.practice.ch06.num01;

public abstract class Fruit {
	public abstract void print();
	
	public static void main(String[] args) {
		Fruit fAry[] = {new Grape(), new Apple(), new Pear()};
		for(Fruit f:fAry)
			f.print();
	}
}
