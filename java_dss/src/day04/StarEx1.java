package day04;

public class StarEx1 {

	public static void main(String[] args) {
		/*  *****
		 *  *****
		 *  *****
		 *  위와같이 출력이 되도록 작성해보세요
		 *  반복회수  :i는1부터 3까지 1씩 증가
		 *  규칙성 : *을 5 출력
		 *  		반복회수 :j는 1부터 5까지 1씩 증가
		 *  		규칙성 : *을 출력
		 */
		
	
	int count=3;
	for(int i=1;i<=count;i++) {
		for (int j=1; j<=5;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}

}
