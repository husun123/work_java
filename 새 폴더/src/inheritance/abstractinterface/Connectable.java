package inheritance.abstractinterface;

public interface Connectable {

	// 상수 정의												// 인터페이스에서는 public abstract를 자동으로 입력한다.
	/*public static*/ final String name = "연결 방법 : USB";
	
	//추상 메소드 선언
	/*public abstract*/ void connect();
}
