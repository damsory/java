package day03;

import java.util.Scanner;

public class ForUpDownEx1 {

	public static void main(String[] args) {
		/* 숫자 업다운 게임을 작성하세요
		 * 랜덤으로 생성된 숫자를 맞추는 게임.
		 * 예시
		 * 랜덤으로 생성된 숫자 :30
		 * 정수 :50
		 * Down
		 * 정수 :20
		 * up
		 * 정수 :30
		 * 정답!
		 */
		
		int min=1,max=100;
		
		int r =(int)(Math.random() *(max-min+1)+min);
		//랜덤한 수를 생성
		System.out.println("랜덤으로 생성된 숫자 :"+r);
		Scanner scan=new Scanner(System.in);
		int w=0;
		//반복문 조건식만 입력
		for ( ;  w !=r  ;) {
			System.out.print("정수 :");
			 w =scan.nextInt();
			if ( w>r) {
				System.out.println("Down");
			} else if(w<r) {
			System.out.println("up");
			}else {
				System.out.println("정답!");
			
			}
		}
		scan.close();
	}

}
