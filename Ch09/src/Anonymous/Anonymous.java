package Anonymous;

public class Anonymous {
	int field = 1;
	
	void method(final int arg1, final int arg2) {
		final int var1 = 2;
		final int var2 = 3;//전부 final 써주지 않으면 아래 sum에서 참조할때 얘들이 없을 수도 있어서 final 있어야 함(로컬 변수는 메소드 종료시 사라지니까).익명 객체 sum은 힙 영역에 있기 때문에 메소드 종료되어도 참조하는게 있는 한 계속 존재하므로. 
		
//		arg1 = 4;
//		arg2 = 5;
		
//		var1 = 6;
//		var2 = 7;
		
		Calculatable c = new Calculatable() {
			public int sum() {
				int result = field+arg1+arg2+var1+var2;
				return result;
			}
		};
		
		System.out.println(c.sum());
	}
}
