package day03;

public class WhileMultipleTableEx1 {

	public static void main(String[] args) {
		/* 구구단 2단을 출력하는 코드를 작성하세요
		 * 2x1=2
		 * ....
		 * 2x9=18
		 * 반복회수 :
		 * 규칙성   :
		 * 반복문종료후 :없음
		 */
		int num =10;
		int i=1;
		int count=9;
		while(i <=count) {
			System.out.print(" "+num+"x"+i+ "="+(num*i));
			++i;
		}
		
		
	}

}
