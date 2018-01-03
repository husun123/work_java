package problem06;
/*
 * 1. 위 소스에서 문법 오류를 찾아 수정하시오.
 * 위 클래스 Rectangle의 객체를 생성하기 위해 다음 문장을 사용하면 오류가 발생한다. 문제 발생의 이유를 설명하고 이 문제를 해결하도록 클래스 Rectangle을 다시 구현하시오
 * Rectangle rc = new Rectangle();
 * 
 * public class Rectangle {
 * 		double width, height;
 * 
 * 		public Rectangle(double width){
 *				this.width = width;
 *		}
 *
 *		public Rectangle(double width, double height){
 *				this.height = height;
 *				this(width)
 *		}
 *}
 */

public class Rectangle {

		public double width, height;
		
		public Rectangle() {
		}
		
		public Rectangle(double width) {
			this.width = width;
		}
		
		public Rectangle(double width, double height) {
			this(width);
			this.height = height;
		}
		
		public static void main(String[] args) {
			Rectangle rc = new Rectangle();
		}
		
}


