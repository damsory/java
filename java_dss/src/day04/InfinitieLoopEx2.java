package day04;

import java.util.Scanner;

public class InfinitieLoopEx2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num ;
		for(int i=10; i>0;) {
		System.out.print("정수 입력 : ");	
		num=scan.nextInt();
		System.out.println("정수 출력 : "+ num);
	}
	System.out.println("프로그램 종료");
	
	//위 코드와 차이는 위에는 무한루프이고, 이코드는 무수히 많이 실행
	//i가 증가를 하다가 int 양수 표현범위를 넘어가면 오버플로우가 발생해서
	//음수가 되는데 이때 반복문이 종료
	for(int i=10; i>0; i++) {
		System.out.print("정수 입력 : ");	
		num=scan.nextInt();
		System.out.println("정수 출력 : "+ num);
	}
}
}