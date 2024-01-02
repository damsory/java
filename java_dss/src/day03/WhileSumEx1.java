package day03;

public class WhileSumEx1 {

	public static void main(String[] args) {
		/* 1부터 5까지의 합을 구하는 코드를 작성하세요.
		 * 
		 */
		
		int sum =0;
		int i=1;
		int num =5;
		while(i <=num) {
			sum =sum+i; //sum + = i;
			++i;
		}
		System.out.println(sum);
	}

}
