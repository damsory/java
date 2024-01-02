package day04;

public class StarEx2 {

	public static void main(String[] args) {
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * 반복회수 :i가 5까지 1씩 증가
		 * 규칙성  :*을 5번 출력
		 * 		
		 */
		
		for(int i=1; i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
