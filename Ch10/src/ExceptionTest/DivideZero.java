package ExceptionTest;

public class DivideZero {
	
	void method() throws Exception { //throws 는 메소드에서 처리하지 않은 예외를 호출한 곳으로 떠넘겨줌. 그럼 호출한 쪽에서도 예외를 던져버리거나 아니면 try-catch 로 감싸주면 됨.
		int a = 1;
		int b = 1;
		int c = a/b;
	}
}
