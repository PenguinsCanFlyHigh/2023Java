package ObjectTest;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//F1 누르면 헬프창 열림
//		String obj1 = new String(); //String 위에 커서 올리고 f1 누르면 String 위한 API document 링크 주어짐
		
//		MyClass m = new MyClass();
//		System.out.println(m.toString()); //MyClass에 toString()이라는 메소드가 없어도 최상위 클래스인 Object에 이미 있어서 사용 가능. Object는 모든 클래스의 부모클래스
//
		
//		Object obj1 = new Object();
//		Object obj2 = new Object();
//		
//		System.out.println(obj1 == obj2); //서로 new 연산자로 만들었으니 주소가 다름. 값은 false가 나오게 됨.
//		System.out.println(obj1.equals(obj2)); // 바로 윗줄 코드와 같은 의미. equals()는 이렇게 사용. 값도 똑같이 false가 나오게 된다. 그럼 equals()를 왜 만들었을까?
//		
//		String str1 = new String("HI");
//		String str2 = new String("HI");
//		
//		System.out.println(str1 == str2); //여전히 주소값 비교
//		System.out.println(str1.equals(str2));//결과가 true로 달라졌다! 즉 String에서 equals()를 오버라이딩 한 것. 여기선 문자열 하나하나 비교하는 메소드로 쓰임.
//		
//		Object str3 = new String("HI");
//		Object str4 = new String("HI"); 
//		
//		System.out.println(str3 == str4);
//		System.out.println(str3.equals(str4)); //부모를 레퍼런싱 하더라도 자식이 오버라이딩한 메소드를 쓰게 됨. 다형성!
//		
//		Object obj3 = new MyClass(123);
//		Object obj4 = new MyClass(123);
//		
//		System.out.println(obj3 == obj4);
//		System.out.println(obj3.equals(obj4)); //MyClass에서 equals 오버라이딩?
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		Key k1 = new Key(1);
		Key k2 = new Key(1);
		
		System.out.println(k1.equals(k2));
		
		hashMap.put(k1, "HongBakSa");
		String value = hashMap.get(k2);
		System.out.println(value); //키가 같지만 키값 비교로 바꿔주지 않으면 k2는 null을 리턴하게 됨. 키가 같더라도 주소값이 다르니까. Key에서 새롭게 오버라이딩 필요
		//원래는 System의 인스턴스를 만들고 (ex. System s) s.out.println(); 형식으로 쓰겠지만 바로 System.out.~ 을 썼다는 건 out이 static이라서 이미 만들어져 있다는 말. 이러면 인스턴스 없이 사용 가능
		
		
		
	}

}
