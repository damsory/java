package day06;

import java.util.Scanner;

public class AlphabetCountEx1 {

	public static void main(String[] args) {
		
		/* 단어를 입력받아 단어 각 알파벳이 몇번 나왔는지 출력하는 코드
		 * 입력 : apple
		 * a:1
		 * e:1
		 * l:1
		 * p:2
		 * */
		
		Scanner scan=new Scanner(System.in);
		
	
		int arr[]=new int[26];
		//단어를 입력하는 코드를 작성
		System.out.print("단어를 입력하세요 :");
		String word=scan.nextLine();
		System.out.println("입력된 단어 :"+word);
		//반복문으로 문자열에 길이만큼 반복
		 for(int i=0; i<word.length();i++) {
			 //문자열의 각 문자를 가져옴
			 char ch= word.charAt(i);
			 //가져온 문자의 배열 번지에 숫자를 증가
			 //가져온 문자가 a이면 0번지에 있는 숫자를 증가,b이면 1번지에 있는 숫자를 1증가
			 arr[ch-'a']++;
		 } 
		 
		 	//반복문으로 배열의 크기만큼(26) 반복
		 	for(int i=0;i<arr.length;i++) {
		 		//개수가 0이 아닌 알파벳들을 출력
		 		if(arr[i] !=0) {
		 			char ch =(char)('a'+i);
		 			System.out.println(ch + ":" + arr[i]);		 			
		 		}
		 	}
		 	System.out.println("==========");
		 	char ch='a';
		 	for(int count :arr) {
		 		if(count != 0) {
		 			System.out.println(ch + ":" + count);
		 		}
		 		ch++;
		 	}
			 
		 
			
	}

}
