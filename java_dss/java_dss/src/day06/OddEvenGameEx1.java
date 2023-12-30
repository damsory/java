package day06;

import java.util.Scanner;

public class OddEvenGameEx1 {

	public static void main(String[] args) {
		// 홀짝 예제
		// 정수 num가 주어졌을 때 홀수인지 짝수인지 판별하는 예제
		// 
		
		Scanner scan=new Scanner(System.in);
		//num 선언
		int num;
		int totalMoney= 10000;// 게임 시작시 주어지는 금액
		int money;
		
		//아래 코드를 현재 금액이 0이 될때 까지 반복하도록 수정
		
		//num가 1~100사이의 랜덤한 수를 생성하는 코드를 작성
		while(totalMoney>0) {
		int min = 1, max = 100;
		num =(int)(Math.random()*(max+min+1)+min);
		
		//사용자가 게임에 투입할 금액을 입력하는 코드를 작성(1~현재 금액까지)
		System.out.print("배팅 금액 입력(1~"+totalMoney+") :");
		money=scan.nextInt();
			
		//입력받은 money가 totalMoney보다 크면 totalMoney로 수정
		money = money >totalMoney ? totalMoney :money;
			System.out.println("배팅한 금액 :"+money);
		
		
		//사용자가 0또는 1을 입력받는 코드 작성
		System.out.print("홀(1)/짝(0)? :");
		 int user=scan.nextInt();
		System.out.println("정수 :"+num);
		
		//num을 2로 나누었을 때 나머지가 0인 경우 짝 출력
		if(num%2==0) {
			System.out.println(num+"는(은) 짝수입니다.");
			//num을 2로 나누었을 때 나머지가 1이상인 경우 홀 출력
			//위 내용에 반대이면 홀수 출력
		}else {
			System.out.println(num+"는(은) 홀수입니다.");
		}
		
		//사용자가 입력한 값이 맞았는지 틀렸는지 출력하는 코드 작성
		//사용자가 입력한 값과 num의 홀짝이 맞는지를 출력하는 코드
		//승이면 배팅 금액을 주고 패이면 배팅 금액을 차감
	
		if(user== num%2) {
		totalMoney += money;
			System.out.println("맞췄습니다");
		}else {
			totalMoney -= money;
			System.out.println("틀렸습니다");
		}
		System.out.println("현재 금액 :"+totalMoney);
		}
		System.out.println("배팅금액이 없으므로 게임 종료");
		scan.close();
	}

	//사용자가 배팅한 값

}
