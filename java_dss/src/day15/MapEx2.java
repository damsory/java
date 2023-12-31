package day15;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MapEx2 {
	static 	Scanner scan= new Scanner(System.in);
	static Map<String,String> map= new HashMap<String, String>();
	public static void main(String[] args) {
		/*회원을 관리하는 프로그램을 작성하세요.
		 * 메뉴
		 * 1.회원가입
		 *  -아이디와 비번만 입력
		 *  -이미 가입된 회원인지 체크(containsKey)
		 * 2.회원검색
		 * 	 -아이디를 입력해서 회원 정보를 조회
		 * 3.종료
		 * */
		//메뉴목록들을 콘솔에 출력하고 번호를 입력하여 선택
		int menu=0;
		do {
			
			//메뉴 출력		
			MenuList();
			try {
				//메뉴 선택
				menu=scan.nextInt();
			
				//메뉴 실행
				runMenu(menu);
			}catch (InputMismatchException e) {
				System.out.println("잘못된 메뉴입니다.");
				scan.nextLine();//잘못 입력된 값을 문자열로 가져와서 버림
			}
		
		}while (menu != 3);
			
		
	}
	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			membership();
			
			break;
		case 2:
			searchMeber();
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
			
		default:
			throw new InputMismatchException();//이미 구현된 예외처리를 가져옴
		}		
	}
	private static void searchMeber() {
		//아이디 입력
		System.out.print("아이디 입력:");
		String id=scan.next();
		//아이디, 비번을 출력
		//비번을 가져옴
		String pw = map.get(id);
		//가져온  비번이 null이면 없는 회원이라고 출력
		if(pw ==null) {
			System.out.println("등록되지 않은 입니다.");
			return;
		}
		//아니면 아이디, 비번을 출력
		System.out.println("아이디 :"+id+" 비밀번호 :"+pw);
		
	}
	private static void membership() {
		//아이디를 입력
		System.out.print("아이디 : ");
		String id=scan.next();		
		//map에 아이디가 있는지 확인
		//있으면 이미 있는 아이디라고 출력하고 메서드 종료
		if(map.containsKey(id)) {//if(map.get(id) !=null)
			System.out.println("이미 가입된 아이디 입니다.");
			return;
		}
		//없으면 비번 입력
		System.out.print("비밀번호 : ");
		String pw =scan.next();
		//map에 추가
		map.put(id, pw);
	}
	public static void MenuList() {
		System.out.println("------------------");
		System.out.println("1.회원가입");
		System.out.println("2.회원검색");
		System.out.println("3.종료");
		System.out.println("------------------");
		System.out.print("번호 선택 :");
	}

}
