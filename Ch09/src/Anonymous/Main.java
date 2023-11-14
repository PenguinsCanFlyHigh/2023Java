package Anonymous;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent() {
			public void method() {
				System.out.println("I am a new child");
			}
		}; //이게 익명 객체를 정의한 것. child 를 따로 객체로 만들지 않고 즉석에서 정의하고 사용. 이건 호불호가 갈릴 수 있는 방식이긴 함. 현재 프론트엔드쪽에선 이렇게 함.
		
		p.method();
		
		Main m = new Main();
		
//		m.TestMethod(new Child()); 원래는 이렇게
		m.TestMethod(new Parent() {
			void method() {
				System.out.println("I am a child");
			}
		});//익명객체 정의하는 방식. 다트에서 많이 봤던 형태들. onPressed(){}안에 정의하는 식으로.
		
		RemoteControl r = new RemoteControl() {
			public void TurnOn() {
				System.out.println("전원이 켜졌습니다");
			}
		};
		r.TurnOn();
		
	}	
		
		void TestMethod(Parent p) {
			p.method();
		}
		
	

}
