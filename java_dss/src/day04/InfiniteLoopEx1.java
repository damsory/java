package day04;

import java.util.Scanner;

public class InfiniteLoopEx1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			for(int i=10; i>0;) {
			System.out.print("정수 입력 :");
			int num =scan.nextInt();
			System.out.println("정수 출력 : "+ num);
		}
		System.out.println("프로그램 종료!");
	}
		/*
		for( ; ;)
		*/
	}
}

