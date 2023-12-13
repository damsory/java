package day03;

public class AlphabetEx1 {

	public static void main(String[] args) {
		/* a부터 z까지 반복문을 이용하여 출력하는 코드를 작성하세요.
		 * 반복회수   :ch는 a부터 z까지 1씩 증가
		 * 규칙성    : ch를 출력
		 * 반복종료후줄력 :
		 */

		char ch;
		for( ch='A'; ch<='Z' ;++ch ) {
			System.out.print(" " +ch);
		}
	}

}
