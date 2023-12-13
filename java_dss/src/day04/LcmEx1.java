package day04;

public class LcmEx1 {

	public static void main(String[] args) {
		/* 두 정수의 최소 공배수를 구하는 코드를 작성하세요.
		 * 10의 배수 :10,20,30,....
		 * 15의 배수 :15,30,45,....
		 * 10과 15의 공배수 : 30,60,90,...
		 * 10과 15의 최소공배수 :30
		 * 	반복회수  :i는 1부터 num*num1까지 1씩 증가
		 *  규칙성  :i가 num과 num1의 공배수이면 i를 출력하고 반복문 종료
		 *  	->i가 num1으로 나누었을 때 나머지가 0과 같고 i를 num 2로 나누었을 때 
		 *  		나머지가 0과 같다면 i를 출력하고 반복문 종료
		 */
		
		int num=10 ,num1=15;
		for(int i=1;i<=num*num1;i++) {
			if(i%num==0 && i%num1==0) {
			System.out.println(num+"과"+num1 +"의 최소 공배수 :"+i);
			break;		
		}
	}
		//i가 num부터 num씩 증가 =>i를 num의 배수들로만 계산 (참고용)
		for(int i= num;i<=num*num1;i+=num) {
			if(i%num==0 && i%num1==0) {
				System.out.println(num+"과"+num1 +"의 최소 공배수 :"+i);
				break;
			}
		}
		
}

}
