package SyncTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(cal);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(cal);
		user2.start(); 
		//user1은 100, user2는 50을 넣었지만 나중에 50이 들어가서 덮어쓰게 됨. 결과적으로 오동작. 100은 사라져버림
		//그래서 Calculator의 setMemory에 synchronized 붙여줌
		//스레드가 메모리 공유하는건 장점. but 이런 문제들이 생길 수 있고 각 언어마다 해결 방법이 다를 것. 하지만 틀은 같다. 개념을 이해해라.
		
	}

}
