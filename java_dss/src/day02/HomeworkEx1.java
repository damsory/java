package day02;
import java.util.Scanner;

public class HomeworkEx1 {

	public static void main(String[] args) {
		/* 성적을 입력받아 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * 90이상~100이하:A
		 * 80이상~90미만:B
		 * 70이상~80미만:C
		 * 60이상~70미만:D
		 * 60미만:F
		 * 0보다 작거나 100보다 큰 경우 :잘못된 점수
		 */
		
		Scanner scan =new Scanner(System.in);
		//성적을 콘솔에서 입력 받음
		System.out.print("성적을 입력하세요 :");
		int sco =scan.nextInt();
		//성적을 기준으로 학점을 출력
		if(sco<0 || sco>100  ) {
			System.out.println("잘못된 점수");
		}else if(sco>=90 ) {
			System.out.println(sco+"점은 A");
		}else if(sco>=80  ) {
			System.out.println(sco+"점은 B");
		}else if(sco>=70 ) {
			System.out.println(sco+"점은 C");	
		}else if(sco>=60 && sco<70) {
			System.out.println(sco+"점은 D");
	}	else {
		System.out.println(sco+"점은 F");
	}
		
		//순서가 중요한 대신 조건식이 간결해지는 방법
		scan.close();
	}

}
