package ObjectTest;

public class MyClass {
	public String toString() {
		return "HI";
	} //오버라이딩. 이미 Object 에 있는 메소드
	
	public int id;
	
	public MyClass(int id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof MyClass) {
			MyClass myclass = (MyClass) obj;
			if(myclass.id == id) {
				return true;
			}
		}
		return false;
	}
}
