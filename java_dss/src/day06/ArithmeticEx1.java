package day06;

import java.util.Scanner;

public class ArithmeticEx1 {

	public static void main(String[] args) {
		/* 랜덤으로 산수(+,-,*) 문제를 생성하여 맞추는 게임
		 * 단 숫자 범위는 1~99,연산자는 +,-,*
		 * 1 + 2 = 3
		 * 정답입니다
		 * 
		 * 2*3=5
		 * 틀렸습니다
		 */
		
		//정수1을 랜덤으로 생성
		//정수2를 랜덤으로 생성
		//정수3(연산자)를 랜덤으로 생성
		Scanner scan=new Scanner(System.in);
		int min=1,max=99;
		int mi=1,ma=3;
		int user,answer;
		int random1=(int)(Math.random()*(max+min+1)+min);
		int random2=(int)(Math.random()*(max+min+1)+min);
		int random3=(int)(Math.random()*(ma+mi-1)+mi);
		
		System.out.println("연산자 선택 :"+random3);
		
		
		switch(random3) {
		
		case 1:
			System.out.print(random1+"+"+random2 +"=");
			user=scan.nextInt();
			answer= random1+random2;
			if(user==answer) {
				System.out.println("정답입니다");
			}else {
				System.out.println("틀렸습니다");
			}
			break;
			
		case 2: 
			System.out.print(random1+"-"+random2 +"=");
			user =scan.nextInt();
			answer= random1-random2;
			if(user==answer) {
				System.out.println("정답입니다");
			}else {
				System.out.println("틀렸습니다");
			}
			break;
			
		case 3:
			System.out.print(random1+"*"+random2 +"=");
			user=scan.nextInt();
			answer= random1*random2;
			if(user==answer) {
				System.out.println("정답입니다");
			}else {
				System.out.println("틀렸습니다");
			}
			break;
			
		default:
			System.out.println("잘못됨");
		}

		
		System.out.println("==============================");
		//연산자가 1이면
			//정수1+ 정수2 =을 콘솔에 출력
			if(random3==1) {
				System.out.print(random1+"+"+random2 +"=");
				//정답을 입력
				int num=scan.nextInt();
				//입력받은 정답고 정수1+정수2가 같으면 정답이라고 출력
				if(random1+random2==num) {
					System.out.println("정답입니다");
					//아니면 틀렸다고 출력
				}else {
					System.out.println("틀렸습니다");
				}
			}
			
			
		//연산자가 2이면
			//정수1 - 정수 =을 콘솔에 출력
			if(random3==2) {
				System.out.print(random1+"-"+random2 +"=");
			//정답을 입력
				int num=scan.nextInt();
			//입력받은 정답고 정수1-정수2가 같으면 정답이라고 출력
				if(random1-random2==num) {
					System.out.println("정답입니다");
			//아니면 틀렸다고 출력
				}else {
					System.out.println("틀렸습니다");
				}
			}
		//연산자가 3이면
			//정수1*정수 =을 콘솔에 출력
			if(random3==3) {
				System.out.print(random1+"*"+random2 +"=");
			//정답을 입력
				int num=scan.nextInt();
			//입력받은 정답고 정수1*정수2가 같으면 정답이라고 출력
				if(random1*random2==num) {
					System.out.println("정답입니다");
			//아니면 틀렸다고 출력
				}else {
					System.out.println("틀렸습니다");
				}
			}
			
			

			
	}

}
