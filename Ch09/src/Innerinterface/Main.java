package Innerinterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button();
		
		Call c = new Call();
//		b.SetOnClickListener(c);
		b.SetOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Make a call");
			}
		});//익명객체 정의하는 방식으로도 가능
		b.touch();
		
		Message m = new Message();
		b.SetOnClickListener(m);
		b.touch();
		b.touch();
		
		b.SetOnClickListener(c);
		b.touch();
	}

}//Button 과 OnClickListener가 프레임워크가 되는 것. 개발하는 사람은 얘들은 건드리지 않고 call, message와 같이 사용자가 원하는 기능 추가하면 됨.
//중첩 인터페이스 배우려고 중첩~ 배운 것. 실제로 쓰는 건 중첩 인터페이스정도만 주로 쓰고 나머진 그닥.
