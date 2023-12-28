package home;

import java.util.Scanner;

public class ScoreEx1 {

	public static void main(String[] args) {
		/* 다음 기능을 가진 성적 관리 프로그램을 작성하세요.
		 * - 1반의 성적을 관리
		 * -최대 30명
		 * -성적순은 번호순으로 관리
		 * -성적은 국어,영어,수학 성적 관리
		 * 
		 * 메뉴
		 * 1.성적수정
		 * 2.성적조회
		 * 3.프로그램 종료
		 * 
		 * -성적수정-
		 * 1.국어
		 * 2.영어
		 * 3.수학
		 * 과목 선택 :1
		 * 
		 * 학생 선택 : 3 번호를선택
		 * 성적 입력 : 100
		 * 
		 * -성적조회-
		 * 1.과목별조회
		 * 2.학생별조회
		 * 선택 :1
		 * -과목별조회-
		 * 1.국어
		 * 2.영어
		 * 3.수학
		 * 과목 선택 1:
		 * 1번 :0점
		 * 2번 :0점
		 * 3번 :100점
		 * 선택 :2
		 * 학생 선택 :3
		 * 국어 :100점
		 * 영어 :0점
		 * 수학 :0점
		 *  */
		Scanner scan=new Scanner(System.in);
		
		int sco;
		int menu=1;
		int menu1=1;
		int menu2=1;
		int num;
		int maxst=30;
		int []kor=new int[maxst];
		int []eng=new int[maxst];
		int []math=new int[maxst];//국영수 저장 배열
		//메뉴 출력
		do {
			System.out.println("메뉴");
			System.out.println("1.성적수정");
			System.out.println("2.성적조회");
			System.out.println("3.프로그램 종료");
			System.out.print("메뉴 선택: ");
			menu=scan.nextInt();
			
			//1번을 입력하면 성적수정 화면 이동
			switch(menu) {
			
			case 1:
				//서브메뉴 출력
				System.out.println("-성적수정-");
				System.out.println("1.국어");
				System.out.println("2.영어");
				System.out.println("3.수학");
				System.out.print("과목 선택 :");
				menu1=scan.nextInt();
				//학생 선택
				System.out.print("학생 선택:");
				num=scan.nextInt();
				//성적입력 
				System.out.print("성적 입력 :");
				sco=scan.nextInt();
				//성적 저장
				switch(menu1) {
				case 1: kor[num-1]=sco; break;
				
				case 2: eng[num-1]=sco; break;
				
				case 3: math[num-1]=sco; break;
				}
				break;
			case 2:
				//서브 메뉴 출력
				System.out.println("성적조회");
				System.out.println("1.과목별성적조회");
				System.out.println("2.학생별성적조회");
				//서브 메뉴 선택
				System.out.print("선택 :");
				menu2=scan.nextInt();
				//서브 메뉴에 따른 기능 실행
				 switch(menu2) {
				 	case 1: 
				 		//과목선택메뉴 출력
				 		System.out.println("1.국어");
						System.out.println("2.영어");
						System.out.println("3.수학");
						//과목선택
						System.out.print("선택 :");
						menu1=scan.nextInt();
						//선택한 과목 성적을 출력
						int []sleSub=null;
						switch(menu1) {
						case 1: sleSub=kor; break;
						case 2: sleSub=eng; break;
						case 3: sleSub=math; break;
							default:
								System.out.println("잘못됨");
						}
							if(sleSub !=null) {
								for(int i =0; i<sleSub.length;i++) {
									System.out.println((i+1)+"번 :"+sleSub[i]+"점");
								}
							}
				 		break;
					
				 	case 2: 
				 		System.out.print("학생 선택 :");
				 		num=scan.nextInt();
				
				 			System.out.println("국어 :"+kor[num-1]+"점");
				 			System.out.println("영어 :"+eng[num-1]+"점");
				 			System.out.println("수학 :"+math[num-1]+"점");
				 		}
				 		
				 		break;
			case 3:
				System.out.println("프로그램 종료");
				break;
				default:
					System.out.println("잘못됨");
			}
		}while(menu !=3);
		
		
		
		
		
	}

}
