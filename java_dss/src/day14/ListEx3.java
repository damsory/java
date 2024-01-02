package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {

	public static void main(String[] args) {
		// 속담을 입력받아 저장하고, 출력하는 코드를 작성하세요.
		
		//속담을 저장하기 위해 ArrrayList 인스턴스를 생성
		ArrayList<String> list =new ArrayList<String>();
		//콘솔창에서 다양한 값을 입력받기 위해 Scanner 인스턴스 생성
		Scanner scan= new Scanner(System.in);
		//입력 받을 속담
		String str;
		while(true) {
			System.out.println("속담을 입력하세요.(종료는 -1) :");
			str =scan.nextLine();
			if(!str.equals("-1")) {				
				break;
			}
			list.add(str);
			
		}
		//system에 있는 out 인스턴스에서 제공하는 print매서드를 이용하여 콘솔창에 문자열 출력
	
		for(String tmp :list) {
			System.out.println(tmp);
		}
	}

}
