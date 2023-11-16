package ExceptionTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivideZero d = new DivideZero();
		
//		try { //예외 발생 가능 코드가 위치함.
//			d.method();
//		}
//		catch(NullPointerException e) { //Exception 하면 모든 오류 다 잡아줌(즉 실행은 됨). NullPointerException 이나 ArithmeticException 를 쓸 경우 해당하는 오류만 캐치해준다. 모든 예외의 부모클래스가 Exception이다.
//			System.out.println(e);
//		}
//		
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
//		
//		finally { //무조건 실행할 블록
//			System.out.println("this block always run");
//		}
//		
//		System.out.println("I'm alive.");
//		//이 try-catch 문은 실제로 많이 사용한다.
		
		try {
			Class c = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //원래 오류나던 거 try-catch로 잡아줌
		//이런 식으로 예외처리하는 것들 다 알아야 함. 라이브러리 함수들이 실제로 Exception을 많이 던지기 때문에 실제로 많이 씀.
		//굳이 세세하게 처리하지 않고 그냥 Exception 하나로 catch해도 됨. 그래서 다중 catch문도 잘 안 씀. 그냥 Exception만 쓰자.
		//굳이 다른 데로 throw 해주기 보다는 예외는 다 처리해주가 가는게 좋음
		
	}
}
