package day04;

import java.util.Scanner;

public class UpDowngame {

	public static void main(String[] args) {
		/* Up Down 게임을 구현하세요
		 * - 다음과 같은 메뉴를 가져야 합니다.
		 * 1. 새게임
		 * 2. 최고기록 확인
		 * 3. 프로그램 종료
		 * 
		 * - 새게임은 업다운 게임을 시작
		 * 	 -랜덤으로 생성된 수를 맞추는 게임
		 * 	 - 맞췄을 때 맞춘 회수를 출력하고 메뉴로 돌아감
		 * - 최고기록 확인 없다운 게임을 하면서 맞춘 횟수 중 가장 적은 
		 *   횟수를 알려줌
		 * 
		 */
		
		//반복문 -
		//메뉴 출력
		
		//메뉴 선택
		
		//선택한 메뉴에 따라 기능을 실행

		//2번메뉴 선택
			//최고기록을 출력
		
		//3번 메뉴 선택 
			//프로그램 종료
		
		Scanner scan = new Scanner(System.in);
		int menu;// 메뉴
		int count,bestCount= -1;
		int random;
		int min=1,max=100;
		int num;
		do {
			System.out.println("1. 새게임");
			System.out.println("2. 최고기록 확인");
			System.out.println("3. 프로그램 종료");
			System.out.print("메뉴 선택 :");
			menu =scan.nextInt();
		
		
		switch(menu) {
			
			case 1:
			
				int r =(int)(Math.random() *(max-min+1)+min);
				System.out.println("랜덤으로 생성된 숫자 :"+r);
				count=0;
				
				do {
				
					System.out.println("입력  :");
					num =scan.nextInt();
					count++;
						if (num>r) {
						System.out.println("Down");
						} else if(num<r) {
						System.out.println("up");
						}else {
						System.out.println("정답!");
						}
					
				}while(num!=r);
				System.out.println("기록 :"+count);
				
				if(bestCount==-1 || count <bestCount) {
					bestCount =count;
				}
				
				break;
			
			case 2:
				if(bestCount == -1) {
					System.out.println("플레이 기록 없음");
					break;
				}
				System.out.println("최고기록은"+bestCount+"번 입니다.");
				break;
				
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break;
				}
		}while(menu != 3);
		
			
			//1번메뉴 선택
			//업다운 게임을 실행
			//랜덤한 수 생성
			//반복문
				//정수 입력
				//입력횟수를 1증가
				//입력한 정수와 랜덤한 수 비교후 up/down/정답 출력
			//게임이 끝났으면 현재 횟수가 최고기록 횟수보다 좋으면
			//최고 기록횟수를 현재 횟수로 수정
		
			/*int min=1,max=100;
			int r =(int)(Math.random() *(max-min+1)+min);
			System.out.println("랜덤으로 생성된 숫자 :"+r);
		 switch(menu) {
		 	}
			for(int w=0; w!=r;) {
				for(int i=1;i<=i;i++) {	
					System.out.print("정수 :");
					w=scan.nextInt();
			if ( w>r) {
				System.out.println("Down");
			}else if(w<r) {
				System.out.println("up");
			}else if(w ==r) {
				System.out.println(i +"번째로 정답을 맞추셨습니다");
				
			} else {
				break;
			}
		
			do {
				System.out.println("1. 새게임");
				System.out.println("2. 최고기록 확인");
				System.out.println("3. 프로그램 종료");
				System.out.print("메뉴 선택 :");
				menu =scan.nextInt();
			} while(menu !=2); {
				System.out.println(i+"번쨰로 정답을 맞춘것이"+"최고기록입니다");
			}
				
			}
			*/
	
	
		scan.close();
		
	}

}
