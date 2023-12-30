package day02;
import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
		/* 월을 입력받아 입력받은 월의 계절을 출력하세요.
		 * 3,4,5:봄
		 * 6,7,8:여름
		 * 9,10,11:가을
		 * 12,1,2 :겨울
		 * 그 외 :잘못된 월 		 
		 */
		
		Scanner scan =new Scanner(System.in);
		System.out.print("몇월인지 입력하시오 :");
		int mth =scan.nextInt();
		
		if( mth >=3 && mth <6 ) {
			System.out.println(mth+"월은 봄 입니다");
		}else if(mth>=6 && mth <9) {
			System.out.println(mth+ "월은 여름 입니다");
		}else if(mth>=9 && mth<12) {
			System.out.println(mth+"월은 가을 입니다");
		}else if(mth <=2 || mth ==12) {
			System.out.println(mth+"월은 겨울 입니다");
		}else {
			System.out.println(mth+"월은 잘못됨");
		}
		
		if(mth <=2 || mth ==12) {
			System.out.println(mth+"월은 겨울 입니다");
			
		}else if(mth <=5) {
			System.out.println(mth+"월은 봄 입니다");
		}else if (mth <=8) {
			System.out.println(mth+"월은 여름 입니다");
		}else {
			System.out.println(mth+"월은 가을 입니다");
		}
			
		
		scan.close();
	} 

}
