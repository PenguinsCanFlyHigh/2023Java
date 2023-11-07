package array;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3];
		for(int i=0;i<3;i++) {
			System.out.println("arr1["+i+"]: "+arr1[i]); //정수형 배열의 초기값 0
		}
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"]: " +arr1[i]);//각 인덱스에 값 추가
		}
		
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2["+i+"]: "+arr2[i]);//실수형 배열의 초기값 0.0
		}
		arr2[0]=0.1;
		arr2[1]=0.2;
		arr2[2]=0.3;		
		for(int i=0; i<3; i++) {
			System.out.println("arr2["+i+"]: "+arr2[i]);//값 추가
		}
		
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"]: "+arr3[i]);//문자열 배열의 초기값 null
		}
		arr3[0]="1월";
		arr3[1]="2월";
		arr3[2]="3월";
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"]: "+arr3[i]);//값 추가
		}
		
	}
	

}
