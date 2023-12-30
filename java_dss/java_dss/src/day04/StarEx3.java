package day04;

public class StarEx3 {

	public static void main(String[] args) {
		/*     *     
		 *    **
		 *   ***
		 *  ****
		 * ***** 
		 *    반복회수 :i가 5까지 1씩증가
		 *    규칙성 :i를 출력
		 */  
		int row =5;
		for(int i=1;i<=row;++i) {
			// ' '을 5-i개 출력
			for(int j=1;j<=row-i;++j) {
				System.out.print(' ');
			}
			//*을 i개 출력
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			//엔ㅌ
			System.out.println();
		}

	}

}
