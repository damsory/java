package homework01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day16.student.Student;

public class WordMain {
	
	static Scanner scan =new Scanner(System.in);
	static List<Word> word =new ArrayList<Word>();
	public static void main(String[] args) {
		/* 영어 단어장을 관리하는 프로그램을 작성하세요.
		 * 기한은 1/5까지 github에 업로드 후 강사에게 공유(단톡방)
		 * - 한 단어에 뜻이 여러개 있을 수 있음
		 * - 단어, 품사, 뜻을 관리
		 * - 단어 추가
		 * - 단어 수정
		 * - 단어 삭제
		 * - 뜻 추가
		 * - 뜻 수정
		 * - 뜻 삭제
		 * - 단어 조회
		 * 
		 * - 기타 추가 기능을 구현해도 됨
		 * - 등록된 단어장에서 랜덤으로 문제가 나오고 맞추는 기능
		 * - 오답 노트를 관리하는 기능 
		 * - 많이 조회한 단어를 확인하는 기능
		 * */
		int menu=0;
		String fileName ="src/homework01/list.txt";
		load(fileName);
		do {
			try {
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu =scan.nextInt();
			//메뉴 실행
			runMenu(menu);
		}catch (Exception e) {
			System.out.println("예외가 발생");
		}
		
		}while(menu !=5);
		save(fileName);	
		
		
	}
	private static void save(String fileName) {
		try(FileOutputStream fos =new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(word);
			} catch (IOException e) {
				System.out.println("저장에 실패했습니다.");
			}
	}
	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertWord();
			break;
		case 2:
			correctionWord();
			break;
		case 3:
			deleteWord();
			break;
		case 4:
			printWord();
			break;
		case 5:
			System.out.println("프로그램 종료");
			break;
		default:
			throw new RuntimeException();
		}
	}
	private static void printWord() {
	  word.stream().forEach(w->System.out.println(w));
	}
	private static void deleteWord() {
		
	}
	private static void correctionWord() {
		
	}
	private static void insertWord() {
		//단어,뜻,품사 입력
		System.out.print("단어 :");
		String word =scan.next();
		System.out.print("품사 :");
		String wordClass =scan.next();
		System.out.print("뜻 :");
		String meanIng=scan.next();
		//객체 생성
		Word wod =new Word(word,wordClass,meanIng);
		
		
		System.out.println("단어를 추가했습니다.");
		return; 
		
	}
	private static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1.단어 추가");
		System.out.println("2.단어 수정");
		System.out.println("3.단어 삭제");
		System.out.println("4.단어 조회");
		System.out.println("5.종료");
		System.out.println("----------------");
		System.out.print("메뉴 선택 :");
		
	}
	private static void load(String fileName) {
		try(FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois =new ObjectInputStream(fis)){
			word = (List<Word>)ois.readObject();
			System.out.println("단어 정보를 불러왔습니다.");
		} catch (Exception e) {
			System.out.println("불러오기에 실패했습니다.");
		}
	}

}
