package Test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a = new A();
//		A.B b = a.new B(); //인스턴스 멤버 클래스는 이런식으로 선언해야함.
//		A.memberA = 20; //그냥 이것만은 안되는 이유: 아직 memberA 라는 공간이 없음. A 클래스에서 static으로 memberA를 선언해주면 그때는 A.memberA 로 바로 사용 가능
		//a.memberA = 20; //그래서 이미 선언한 변수 a를 가지고 memberA를 사용한다.
		//System.out.println(a.memberA);
		
		//A.B b = new A.B(); //지금은 B를 static 선언해줘서 이렇게 쓸 수 있음. 인스턴스에 비해 비교적 직관적. 그래서 정적 멤버 클래스가 주로 쓰이는 것.
		
		//A.C c = a.new C();
		
		Outter o = new Outter();
		Outter.Nested n = o.new Nested();
		n.method();
		n.method2();
		
	}

}//여튼 결론은 중첩 클래스에서는 정적 멤버 클래스(static class)를 주로 사용한다는 것.
