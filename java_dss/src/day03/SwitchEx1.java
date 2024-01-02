package day03;

import java.util.Scanner;

import day02.scannerEx1;

public class SwitchEx1 {

	// switch 문 예졔 
	public static void main(String[] args) {
		/* 정수가 0인지 아닌지 판별하는 예제 */
		
		Scanner scan =new Scanner(System.in);
			System.out.print("정수를 입력하시오 :");
		int	i =scan.nextInt();
		switch(i) {
		case 0:
			System.out.println(i+"은 0입니다");
			break;
		default:
			System.out.println(i+"은 0이 아닙니다");
		}
	
	}

}
