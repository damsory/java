package day03;

public class GcdEx1 {

	public static void main(String[] args) {
		/* 정수의 약수를 출력하는 예제를 작성하세요.
		 * 약수는 나누어서 떨어지는 수
		 * 4의 약수 :1,2,4
		 */
		int num=32;
		System.out.print(num+"의 약수 :");
		int  i;
		for( i=1; i<=num ; i++) {
			if(num%i ==0) {
				System.out.print(i+" ");
			}
		}
	}

}
