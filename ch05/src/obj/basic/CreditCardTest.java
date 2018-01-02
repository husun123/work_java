package obj.basic;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard yourCard = new CreditCard();
		//다음과 같이 변수 선언과 객체 생성 대입의 분리 가능
		//CreditCard yourCard;
		//youtCard = new CreditCard();
		
		yourCard.owner = new String("이민정");
		//youtCard.number = 6953_8723_8643_9836L; // 오류발생
		//System.out.print("카드번호 : " + yourCard.nember); //오류발생
		System.out.println("카드소유자 : " + yourCard.owner);
		yourCard.use(150000);
		yourCard.use(100000);
		yourCard.payBill(100000);
		
		CreditCard myCard = new CreditCard();
		myCard.owner = "이민정";
		
		//주소값 비교
		if (myCard.owner == yourCard.owner) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		//문자열 비교 : String의 equals() 메소드 이용
		if(yourCard.owner.equals(myCard.owner)) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
	}

}
