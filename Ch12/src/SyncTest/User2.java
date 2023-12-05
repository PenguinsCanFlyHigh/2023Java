package SyncTest;

public class User2 extends Thread {
	private Calculator cal;
	
	public void setCalculator(Calculator cal) {
		this.setName("User2"); //Thread에서 온거
		this.cal = cal;
	}
	
	public void run() {
		cal.setMemory(50);
	}
}