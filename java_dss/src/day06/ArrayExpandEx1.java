package day06;

public class ArrayExpandEx1 {

	public static void main(String[] args) {
		// 배열이 꽉 찼을 때 배열을 확장하는 예제
		
		
		//배열 5개의 arr을 저장하는 배열
		int arr[]=new int[5];
		//count 초기화;
		int count =10;
		//i가 count보다 작으면 1증가
		for(int i=0;i<count;i++) {
			//만약 i+1이 arr보다 작으면 
			if(i+1>arr.length) {
				//tmp 배열 선언 후 arr에서 부족한 배열 확장
				int tmp[]=new int[arr.length+5];
				//arr배열에 저장된것 복사
				System.arraycopy(arr, 0, tmp, 0, arr.length);
				//arr가tmp로 이동
				arr= tmp;
			}
			//다시 배열 저장
			arr[i]=i+1;
		}
		//
		for(int tmp : arr) {
			System.out.println(tmp);
		}
	}

}
