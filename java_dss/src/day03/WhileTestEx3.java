package day03;

public class WhileTestEx3 {

	// while test 예제
	public static void main(String[] args) {
		/* 1에서 10사이의 모든 짝수를 순서대로 출력하는 코드를 작성하세요.
		 *
		 * 
		 * 방법1
		 * 반복회수 : i는 2부터 2씩 증가
		 * 규칙성	  :i를 출력
		 * 
		 * 방법2
		 * 반복회수 : i는 1부터 10까지 1씩 증가
		 * 규칙성   :i가 짝수이면 i를 출력
		 * 
		 * 방법3
		 * 반복회수  : i는 1부터 5까지 1씩 증가
		 * 규칙성   : 2*i를 출력
		 */
		//방법 1
		int i;
		int num =10;
		i=2;
		while(i<=10) {
			System.out.print(" "+i);
			i=i+2;
		}
		
		int w;
		w=1;
		while(w<=10) {
			if(w%2==0) {
				System.out.print(" " +w);
			}
			++w;
		}
		
		//방법 3
		int e=1;
		int count =5;
		while(e <=count) {
			System.out.print(" "+2*e);
			++e;
		}
		
	}

}
