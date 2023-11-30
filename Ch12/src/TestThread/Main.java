package TestThread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DongTask dong = new DongTask();
		Runnable dong = new DongTask(); //위에나 아래나 동일
		Thread thread = new Thread(dong);
		thread.start(); //이렇게 스레드 만들어놓고 실행시키면 Dong과 DDing 동시에 실행시켜줌. 하지만 정확하게 dong 한 번 dding 한 번은 되진 않음. 하나가 연속 두 번 출력될 수도 있다.
		//위의 방식은 별도의 클래스 만들어서 하는 방식.
		
		//DongTask라는 클래스를 새로 만들지 않고도 똑같은 거 할 수 있음. 익명 구현 객체 사용?
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("Dong");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
			}
		}); //이렇게 한 번만 쓸 애들은 굳의 따로 정의하지 않고 익명으로 구현함.
		thread1.start();// 요렇게
		
		
		Thread thread2 = new DongThread();
		thread2.start(); //이게 Thread 하위 클래스를 직접 생성해서 가져오는 방식
		
		Thread thread3 = new Thread() {
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("DongDong");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		thread3.start(); //이건 익명 구현.
		
		
		for(int i =0; i<10; i++) {
			System.out.println("DDing");
			try { // sleep이 예외를 던지니까 try catch문으로 잡아주면 됨. 빨간 줄에 커서 올리고 보면 이클립스가 알아서 잡아준다!
				Thread.sleep(1000); //스레드를 1000ms 동안 멈춰주는 함수
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		

		
		
	}

}
