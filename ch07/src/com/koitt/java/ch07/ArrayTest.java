package com.koitt.java.ch07;

public class ArrayTest {



	private Integer[] array;			// 데이터를 담는 자료 구조
	private int size;				// 배열의 크기

	public ArrayTest(int size) {
		this.size = size;
		this.array = new Integer[this.size];

	}

	// 자료 구조에 데이터를 추가 (index 번호에다가 해당 데이터를 저장)
	public void add(int index, int value) {
		if(index >=  0 && index < this.size) {
			if( this.array[index] == null ) {
				this.array[index] = value;
			}
			else if (this.array[index] != null) {
				int newSize = this.size + 1;
				if(this.array.length < newSize) {
					// 깊은 복사 (Deep copy)
					Integer[] tempArray = new Integer[this.size];
					System.arraycopy(this.array, 0, tempArray, 0, this.array.length);
					
					this.size *= 2; 
					this.array = new Integer[this.size];
					System.arraycopy(tempArray, 0, this.array, 0, tempArray.length);
				}
				
				// 집어 넣으려는 index 번호 앞쪽 데이터를 그대로 복사
				if (index == 0) {
					this.array[index] = value;				// 새로 추가하려는 값을 배열에 저장
				}
				
				// 집어 넣으려는 index 번호 뒤쪽 데이터를 한칸씩 뒤로 이동
				System.arraycopy(this.array, index, this.array, index + 1, this.array.length - index);
			}
		}
	}

	public void remove(int index) {
		if(index >=  0 && index < this.size) {

		}
	}
	public void set(int index, int value) {
	}

	public Integer[] getArray() {
		return array;
	}

	public void setArray(Integer[] array) {
		this.array = array;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public static void main(String[] args) {

	}
}
