import java.util.Scanner;

public class TestEx6 {

	public static void main(String[] args) {
		/* 산술 연산자와 두 정수를 입력받아
		 * 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하시오
		 * 예
		 * 두 정수와 연산자 입력(예: 1+2):1+2
		 * 1+2=3
		 * 예2
		 * 두 정수와 연산자 입력(예:1+2):1/2
		 * 1/2:0.5
		 * 예3 
		 * 두 정수와 연산자 입력 (예:1+2):1?2
		 * ?는 산술 연산자가 아닙니다.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print(" 두 정수와 연산자를 입력하세요 :");
		int num =scan.nextInt();
		char op =scan.next().charAt(0);
		int num1 =scan.nextInt();
		
		if (op =='+') {
			System.out.println(num+ "" +op+ "" +num1+"=" + (num+num1));	
		}else if (op =='-') {
			System.out.println(num+ "" +op+ "" +num1+"=" + (num-num1));
		}else if (op =='*') {
			System.out.println(num+ "" +op+ "" +num1+"=" + (num*num1));
		}else if (op =='%') {
			System.out.println(num+ "" +op+ "" +num1+"=" + (num%num1));
		}else if (op =='/') {
			System.out.println(num+ "" +op+ "" +num1+"=" + (num/(double)num1));
		}else  {
			System.out.println(op +"는 산술 연산자가 아닙니다");
		}
		
		scan.close();
	}

}
