package day05;

import java.util.Arrays;

public class LottoEx1 {

	public static void main(String[] args) {
		/* 1~45사이의 랜덤한 수 6개를 생성하여 출력하는 예제(중복되지 않은)
		 * 단 정렬이 되도록
		 */
		
	int min=1,max=45;
	int lotto[]=new int [6];
	int count=0;
	
	while(count<6) {
		//랜덤수 생성
		int r=(int)(Math.random()*(max-min+1)+min);
		
	
		//중복 확인 
		int i;
		for(i=0;i<count;i++) {
			if(lotto[i]== r) {
				break;
			}
		}
		
		if(i==count) {
			lotto[count]=r;
			count++;
		}
		
	}
	//정렬
	Arrays.sort(lotto);
	System.out.print("로또 번호 6개 :");
	
	for(int i=0; i<lotto.length;i++) {
		System.out.print(lotto[i]+" ");
	} 
	
	}

}

/*boolean duplicated =false;//중복 여부를 알려주는 변수로 ,true면 중복,false면 중복 아님
		for(int i=0;i<count;i++) {
			if(lotto[i]==r) {
				duplicated =true;
				break;
			}
		}
		//중복되지 않는다면 저장 후 count 증가
			if(!duplicated) {
				lotto[count]= r;
				count++;
			}
	
	for(int i = 0; i<lotto.length -1;i++) {
		for(int j = 0; j<lotto.length-1;j++) {
			if(lotto[j] > lotto[j+1]) {
				int tmp =lotto[j];
				lotto[j]= lotto[j+1];
				lotto[j+1]=tmp;
			}
		}
		}
 */