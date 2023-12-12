package day03;

public class WhileTextEx1 {

	public static void main(String[] args) {
		/*1부터 5까지 출력되는 코드를 작성하세요
		 * 
		 */
		
		
		/*
		 * 반복회수 	 : i가 1부터 5까지 1씩 증가
		 * 규칙성   	 : i를 콘솔에 출력
		 * 반복문종료후 : 없음
		 */ 
		int i=1; //초기화
		int count =5; 
		while(i<= count) { //조건식
			System.out.print(" "+i ); //실행문
			++i; //증감문
		}
		
	}

}
