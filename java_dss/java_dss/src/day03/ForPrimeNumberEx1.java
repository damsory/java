package day03;

public class ForPrimeNumberEx1 {

	public static void main(String[] args) {
		/* 소수 판별 예제
		 * 주어진 정수가 소수인지 아닌지 판별하는 코드를 작성하세요.
		 *  소수는 약수가 2개인 수
		 *  약수는 어떤 수를 나누었을 때 나머지가 0이 되게 하는 수.
		 *  4의 약수 : 1,2,4
		 *  5의 약수 : 1,5 ->소수
		 *  반복회수    : i는 1부터 정수까지 1씩증가
		 *  규칙성      : i가 num의 약수이면 약수의 개수를 1증가
		 *  			num를 i로 나누었을 때 나머지가 0과 같으면 1증가
		 *  반복문종료후 : count가 2이면 소수, 아니면 소수가 아님
		 */
		
		int num=6;
		int count , i;
		for(i=1, count=0;  i <= num ; i++ ) {
			if(num % i == 0) {
				++count;
			}	
		}	
		if(count == 2) {
			System.out.println("소수입니다");
			
		} else {
			System.out.println("소수가 아님");
		}
		
			}
		}
		
	


