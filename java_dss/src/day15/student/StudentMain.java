package day15.student;

import java.util.Scanner;

public class StudentMain {
	private Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		 Scanner scan =new Scanner(System.in);
		/*학생 국어,영어,수학 성적 관리 프로그램을 작성하세요
		 * -Program 인터페이스를 생성하여 활용
		 * 	-void run()
		 * 	-void printMenu()
		 * 	-void runMenu(int menu)
		 * -예외처리 하는것
		 * -Program 인터페이스를 구현한 구현 클래스 StudentProgram을 생성하여 활용
		 * -학생 정보를 Student 클래스를 생성해서 활용
		 * 	-학년,반,번호,이름,국어,영어,수학
		 * -리스트를 활용
		 * -기능
		 * 	-학생 관리
		 * 		-학생 추가
		 * 		-학생 수정
		 * 		-학생 삭제
		 * 	-성적 관리
		 * 		-성적 추가
		 * 		-성적 수정
		 * 		-성적 삭제
		 * 	-초회
		 * 	 -학생 조회
		 * 		-전체
		 * 		-학년
		 * 		-반
		 * 		-학생(학년,반,번호)
		 * 	 -성적 조회
		 * 		-국어
		 * 		-영어
		 * 		-수학
		 * */
		printMenu();
		int menu=scan.nextInt();
	}
	private static void printMenu() {
		System.out.println("------------");
		System.out.println("1.학생관리");
		System.out.println("2.성적관리");
		System.out.println("3.조회");
		System.out.println("------------");
		System.out.print("메뉴 선택 :");
	}

}


