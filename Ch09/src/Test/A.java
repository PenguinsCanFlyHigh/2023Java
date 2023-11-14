package Test;

public class A {
	int memberA = 10;
	
	int field1 = 10;
	static int field2 = 20;
	B b = new B();
	C c = new C();//멤버 클래스 사용 가능
//	static C c1 = new C(); //얘는 안됨
	static B b1 = new B();
	
	void method1() {
		B b = new B();
		C c = new C();
	}
	static void method2() {}
	
	A(){
		System.out.println("A instance is generated.");
	}
	
	static class B {
		void method() {
//			field1 = 30;
//			method1(); //얘들은 안됨.
			field2 = 40;
			method2();
		}//static 클래스는 바깥 클래스의 static 외에는 접근 불가.
		
//		B(){
//			System.out.println("B instance is generated.");
//		}
//		int field1 = 10;
//		static int field2 = 20;
//		
//		void method1() {}
//		static void method2() {}
	}
	
	class C {
		void method() {
			field1 = 30;
			method1();
			field2 = 40;
			method2();
			//인스턴스 클래스는 바깥 클래스의 변수, 메소드, 정적 변수, 정적 메소드 모두 접근 가능
		}
		
		
	}
	
	
	
//	void method1() {
//		class D {
//			D () {
//				System.out.println("D instance is generated.");
//			}
//		}
//		D d = new D();
//	}
//	
//	void method2() {
////		 D d = new D(); // D는 로컬 클래스라서 클래스 밖에서는 사용 불가
//	}
}

//실제 바이트 코드들도 A$B, A$C,<-멤버클래스들 A$1D<-로컬클래스 로 생성됨을 확인할 수 있음.
