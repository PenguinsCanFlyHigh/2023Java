package ch7;

public class SportsCar extends Car {
	double turbo = 1.5; //SetSpeedø° ∞ˆ«ÿ¡÷∏È µ 
//	double speed = 1;
	
	
	public SportsCar() {
		super(1, 2);
	}
	
	public void SetSpeed(double speed) {
		this.speed = speed * this.turbo;
	}
	
	void SetTurboFactor(double turbo) {
		this.turbo = turbo;
		
	}
	
}
