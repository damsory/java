package home;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		/* 다음 기능을 가진 가위, 바위, 보 게임 프로그램을 작성하세요.
		 * 1. 새게임
		 * 2. 기록
		 * 3. 프로그램 종료
		 * 
		 * - 새게임
		 *   - 컴퓨터가 랜덤으로 내는 가위,바위, 보와 내가 입력한 가위,바위,보를
		 *     비교하여 이기면 승, 지면 패, 비기면 무로 기록함
		 *   - 바위 : R, 보 : P, 가위 : S
		 * - 기록
		 *   - 승 무 패를 순서대로 출력
		 * */
		Scanner scan=new Scanner(System.in);
		
		
		int num;
		int random;
		char com,user;
		int win=0,lose=0,draw=0;
		do {
			System.out.println("메뉴");
			System.out.println("1.새게임");
			System.out.println("2.기록");
			System.out.println("3.프로그램 종료");
			System.out.println("정수 :");
			num=scan.nextInt();
		
			//번호를 선택했을때 
			switch(num) {
			
			
			case 1:
			//컴퓨터가 랜덤으로 가위바위보를 냈을때
			 random=(int)(Math.random()*3+1);
			 //만약  user가 가위를 냈을때 com이 보를 내거나 주먹을 냈을때 가위를 내거나 보를 냈을때 주먹을내면 이김
				//1이면 R, 2이면 P, 3이면 S로
			 com=random==1 ?'R':(random==2?'P':'S'); 
			//사용자가 R,P,S중 하나를 입력
				System.out.print("가위(S),바위(R),보(P) 입력 : ");
				user = scan.next().charAt(0);
				if(user==com) {
					System.out.println("유저:"+user+"vs 컴퓨터:"+com);
					System.out.println("무승부");
					draw++;
				}else if(user== 'R' && com=='S'
						||( user== 'S' && com=='P')
						||(user== 'P' && com=='R')){
					System.out.println("유저:"+user+"vs 컴퓨터:"+com);
					System.out.println("유저 승");
					win++;
				}else {
					System.out.println("유저:"+user+"vs 컴퓨터:"+com);
					System.out.println("유저 패!");
					lose++;
				}
				break;
				//
			case 2:
				System.out.println("승 :"+win+"패 :"+lose+"무승부 :"+draw);	
				break;
			case 3:
				System.out.println("프로그램 종료");
				break;
				default:
					System.out.println("잘못됨");
			}	
			}while(num !=3);
		
		
		
		
		
		
		
		
		
	}
	
	

}
