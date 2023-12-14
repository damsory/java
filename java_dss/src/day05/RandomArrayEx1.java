package day05;

import java.util.Scanner;

public class RandomArrayEx1 {

	public static void main(String[] args) {
		/* 1~9사이의 랜덤한 수를 3개 생성해서 배열에 저장하는 코드 작성
		 * 3개짜리 배열을 생성하여 랜덤한 수를 저장
		 */
		

		int [] arr1=new int [3];
		int min=1,max=9;
		int r = (int)(Math.random()*(max-min)+min);
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=(int)(Math.random()*(max-min)+min);
			
		}
		for( int i =0;1<arr1.length;i++)
		System.out.println(arr1[i]+" ");
	}

}
