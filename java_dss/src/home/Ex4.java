package home;

public class Ex4 {

	public static void main(String[] args) {
		// 아니를 5번출력하는 예제

		int i=1;// 초기화
		int count=5;//출력 횟수
		
		// while문 i가 count랑 작거나 같으면 아니 출력 후 i를 1씩 증가
		while(i<=count) {
			System.out.println("아니");
			++i;
		}
		// do while문 아니 출력 후 i를 1씩 증가 후  i가 count랑 작거나 같다
		do {
			System.out.println("아니");
			++i;
		}
		while(i<=count);
		// for문 i가 count랑 작거나 같으면 아니 출력 후 i를 1씩 증가
		for( i=1;i<=count;++i) {
			System.out.println("아니");
		}
	
	
	
	
	}
	
	
	

}
