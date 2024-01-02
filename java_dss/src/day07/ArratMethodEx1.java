package day07;

import java.util.Scanner;

public class ArratMethodEx1 {

	public static void main(String[] args) {
		// 1~ 45사이의 중복되지 않은 랜덤한 수 6개를 만드는 코드를 작성하세요.(매서드를 이용)
				
			int arr[]=new int[6];
			int min=1,max=45;
			if(createRandomArray(min,max,arr)) {
				System.out.println("배열생성 성공");
				for(int tmp :arr) {
					System.out.print(tmp+" ");
				}
			}else {
				System.out.println("배열성공 실패");
			}
			//1~45사이의 중복되지 않을 수 6개를 입력하는 코드를 작성하세요.(contains 매서드 이용)
			int [] user=new int[6];
			int count =0;
			Scanner scan=new Scanner(System.in);
			
			System.out.print("\n정수 6개 입력 :");
			while(count < user.length) {
				int num =scan.nextInt();
				if(!contains(user,count,num) && (num >=min && num <=max)) {
					user[count]=num;
					count++;
				}
			}
			for(int tmp : user) {
				System.out.print(tmp+" ");
			}
			System.out.println();			
			scan.close();
	}
	
			/*기능 :  정수 min과max사이에 값이 중복되지 않는 랜덤한 수를 배열에 만들어주고 생성 여부를 알려주는 매서드
			 * 매개변수 :	최솟값,최댓값,배열 => int min,int max,int []arr
			 * 리턴타입 :배열 생성 가능한지 불가능한지=>boolean
			 * 매서드명 :createRandomArray
			 * */
	public static boolean createRandomArray(int min,int max,int []arr) {
		if(arr == null || arr.length == 0) {
			return false;
		}
		
		
		
		if(max < min) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		
		
		//배열의 크기가 min~max사이의 정수개수보다 클 때	
		if(arr.length > max-min+1) {
			return false;
		}
		
		//반복문 : 저장된 숫자의 개수가 배열의 크기보다 작을 때 반복
		int count=0;//저장된 숫자의 개수
		while(count <arr.length) {
			//랜덤수 생성
			int r=random(min,max);
			//중복 확인
			if(!contains(arr,count,r)) {
				//중복되지 않으면 배열에 저장
				arr[count]=r;
				//저장된 숫자의 개수를 1 증가
				count++;
			}
			
		}
			return true;
		}
			public static boolean contains(int [] arr,int n, int num) {
				if(arr==null || arr.length==0) {
					return false;
			}
				if(arr.length<n) {
					n=arr.length;
				}
				for(int i=0; i<n;i++) {
					//배열에 num와 값이 있으면
					if(arr[i]==num) {
						return true;
					}
				}
				//반복문이 끝날때까지 같은게 없으면
				return false;
			}
			//[1,2,0,0,0] => 배열에서 0번지부터 2개중에서 0과 일치하는것이 있나? false
			/* 기능    : 배열이 주어지고 배열의 0번지부터 n개 중에서 num와 같은 값이 있는지 없는지 알려주는 매서드  
			 * 매개변수 :	주어진 배열, 검사할 배열의 개수,비교할 정수=>int [] arr, int n, int num
			 * 리턴타입 : 같은 값이 있는지 없는자=>boolean
			 * 매서드명 :
			 * */

			/* 기능    : min~max 사이의 랜덤한 수를 생성해서 알려주는 매서드  
			 * 매개변수 :	최소값과 최대값 =>int min,int max
			 * 리턴타입 : 생성된 랜덤한 수=> 정수=>int	
			 * 매서드명 : random
		
			 * */
			//랜덤한 수 생성하는 메서드
			public static int random(int min, int max) {
				if(max<min) {
					int tmp =max;
					max=min;
					min=tmp;
				}
				return (int)(Math.random()*(max-min+1)+min);
			
			}

}


