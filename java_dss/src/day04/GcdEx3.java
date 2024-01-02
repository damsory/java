package day04;

public class GcdEx3 {

	public static void main(String[] args) {
		/* 두 정수의 최대 공약수를 구하는 코드를 작성하세요
		 *  최대 공약수 : 공약수 중 가장 큰 공약수
		 * 공약수 : 공통으로 있는 약수
		 * 12의 약수 : 1,2,3,4,6,12
		 * 8의 약수 :1,2,4,8
		 * 8과 12의 공약수 :1,2,4
		 * 8과 12의 최대공약수 :4
		 * 반복회수   :i가 1부터 num까지 1씩 증가
		 * 규칙성    :i가 num과 num1의 약수이면 gcd에 i를 저장
		 */
		
		int num=8, num1=12;
		int gcd =1;
		/*for(int i=1;i<=num ;i++) {
			if(num%i==0 && num1%i==0) {
				gcd =i;
			}
		}
		System.out.println(num+"과"+num1+"의 최대 공약수: "+gcd);
	*/
		for(int i=1;i<=num ;i++) {
			if(num%i==0 && num1%i==0) {
				gcd =i;
			}
			
		}
		System.out.println(num+"과"+num1+"의 최대 공약수: "+gcd);
		
		//num1부터 공약수를 구해서 처음 구한 공약수가 최대 공약수가 됨
		for(int i=num;i<=1;i--) {
			if(num%i==0 && num1%i==0) {
				System.out.println(num+"과"+num1+"의 최대 공약수: "+gcd);
				break;
			}
		}
	}

}
