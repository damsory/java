package day18.student;

import java.util.InputMismatchException;
import java.util.Scanner;

import program.Program;

public class StudentProgram implements Program{
	private static Scanner scan = new Scanner(System.in);

	private final int EXIT = 3;
	private static StudentManager sm = new StudentManager();

	@Override
	public void run() {
		int menu = 0;
		
	
		
		do {
			
			try {
				//메뉴 출력
				printMenu();
				//메뉴 선택
				menu =scan.nextInt();
				//메뉴 실행
				runMenu(menu);
			}catch (InputMismatchException e) {
				System.out.println("잘못된 메뉴");
				scan.nextLine();//입력 버퍼에 잘못 입력된 값을 제거
			}
			
		}while (menu !=EXIT);
		
	}
	
	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertStudent();
			break;
		case 2:
			printStudent();
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default:
			throw new InputMismatchException();
		}
	}
	private static void insertStudent() {
		//추가할 학생정보입력
		System.out.print("학년 :");
		int grade =scan.nextInt();
		System.out.print("반 :");
		int classNum =scan.nextInt();
		System.out.print("번호 :");
		int num =scan.nextInt();
		System.out.print("이름 :");
		String name =scan.nextLine();
		//매니저에게 입력받은 학생 정보를 추가
		Student std =new Student(grade, classNum, num, name);
		if(sm.insertStudent(std)) {
			System.out.println("학생을 추가했습니다.");
		}else {
			System.out.println("이미 등록된 학생입니다.");
		}
	}
	private static void printStudent() {
		//매니저에게 전체 학생 정보를 출력
		sm.printStudent();
	}
	@Override
	public void printMenu() {
		System.out.println("---------------");
		System.out.println("1.학생 등록");
		System.out.println("2.학생 조회(전체)");
		System.out.println("3.종료");
		System.out.println("---------------");
		System.out.println("메뉴 선택 :");

	}

	}

	
