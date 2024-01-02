package day04;

public class MultioleTableEx1 {

	public static void main(String[] args) {
		/* 구구단 2단부터 9단까지 출력하는 코드를 작성하세요
		  	반복회수  :num은 2부터 9까지 1씩 증가
		 *  규칙성  :num단을 출력	
		 */
		
		//2단을 출력하는 코드를 작성하세요.
		
		int num=2;
		int count=9;
		
		for(num=2;num<=count;num++) {
			System.out.println(num + "단");
		for(int i=1;num<=count;i++) {
			System.out.println(num+ "x"+i+"="+(num*i)+" ");
		}
	}
}

}
