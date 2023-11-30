package TestThread;

public class DongTask implements Runnable{ //run을 재정의 하기 전까진 빨간줄 쳐지게 됨.
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
}
