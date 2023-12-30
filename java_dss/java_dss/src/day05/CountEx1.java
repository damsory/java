package day05;

import java.util.Scanner;

public class CountEx1 {

	public static void main(String[] args) {
		/*1에서 9사이의 정수를 5개 입력받아 각 숫자가 몇개씩 입력됐는지 출력하는 코드
		 * 1 2 3 1 2
		 * 1:2
		 * 2:2
		 * 3:1
		 * 4:0
		 * 5:0
		 */
		//5개(입력한 수를 저장하는 배열)짜리와 10개(각 숫자가 몇개 입력됐는지 저장하는 배열)짜리 배열 선언
		int user[]=new int[5];
		int count[]=new int [10];
		Scanner scan=new Scanner(System.in);
		//반복문으로 5개의 정수를 입력 받아 user에 저장하고, count 배열에 입력 받은 정수번지에 해당하는 숫자를 1증가
		System.out.print("정수 입력(1~9) : ");
		for(int i=0;i<user.length;i++) {
			user[i]=scan.nextInt();	
			count[user[i]]++;
		}
		//count배열에 있는 값을 1번지부터 9번지까지 출력
		for(int j=1;j<count.length;j++) {
			
			System.out.println(j+":"+count[j]);
		}
		
		
		
		
	}

}
