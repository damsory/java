package home;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		/* 월을 입력받아 입력받은 월의 계절을 출력하세요.
		 * 3,4,5  : 봄
		 * 6,7,8  : 여름
		 * 9,10,11: 가을
		 * 12,1,2 : 겨울
		 * 그 외 : 잘못된 월
		 * */
		
		
		//입력 받은 콘솔 생성
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력 :");
		int mth=scan.nextInt();
		
		if(mth<1 && mth>12) {
			System.out.println("잘못된 월");
		}else if(mth>=3  && mth<6) {
			System.out.println("봄");
		}else if(mth>=6 && mth<9) {
			System.out.println("여름");
		}else if(mth>=9  && mth<12) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
}
		scan.close();
}
}