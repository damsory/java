package home;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// 성인 판별 예제
		/* 나이를 입력받아 나이가 20세 이상이면 성인으로 출력하고, 
		 * 20세 미만이면 미성년자로 출력하는 코드를 작성하세요.
		 */
		Scanner scan = new Scanner(System.in);
		

		
		System.out.print("나이를 입력하세요 :");
		int age=scan.nextInt();
		if(age>=20) {
		System.out.println(age+"살 성인입니다");
		}else {
			System.out.println(age+"살 미성년자입니다");
		}
			

	}

}
