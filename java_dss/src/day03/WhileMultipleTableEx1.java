package day03;

public class WhileMultipleTableEx1 {

	public static void main(String[] args) {
		/* 구구단 2단을 출력하는 코드를 작성하세요
		 * 2x1=2
		 * ....
		 * 2x9=18
		 * 반복회수 	: i는 1부터 9까지 1씩 
		 * 규칙성   	: 2 X i = 2*i를 출력
		 * 반복문종료후 :없음
		 */
		int num=2;
		int i=1;
		int count=9;
		while(i<=count) {
			System.out.println(" "+num+"x"+i+ "="+num*i);
			++i;
		}
		
		
	}

}
