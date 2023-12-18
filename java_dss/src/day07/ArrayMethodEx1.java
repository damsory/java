package day07;

public class ArrayMethodEx1 {

	public static void main(String[] args) {
		// 1~ 45사이의 중복되지 않은 랜덤한 수 6개를 만드는 코드를 작성하세요.(매서드를 이용)
		
		for(int i=0; i<10; i++) {
			System.out.println(random(1,9));
		}
		
	
		//1~45사이의 중복되지 않을 수 6개를 입력하는 코드를 작성하세요.
	
	/*기능 :  정수 min과max사이에 값이 중복되지 않는 랜덤한 수를 배열에 만들어주고 생성 여부를 알려주는 매서드
	 * 매개변수 :	정수 배열 =>int num[6] 
	 * 리턴타입 :중복되지않고 생성 가능한지 불가능한지=>boolean
	 * 매개변수 :
	 * */
	
	
	//[1,2,0,0,0] => 배열에서 0번지부터 2개중에서 0과 일치하는것이 있나? false
	/* 기능    : 배열이 주어지고 배열의 0번지부터 n개 중에서 num와 같은 값이 있는지 없는지 알려주는 매서드  
	 * 매개변수 :	
	 * 리턴타입 :
	 * 매개변수 :*/

	/* 기능    : min~max 사이의 랜덤한 수를 생성해서 알려주는 매서드  
	 * 매개변수 :	최소값과 최대값 =>int min,int max
	 * 리턴타입 : 생성된 랜덤한 수=> 정수=>int	
	 * 매개변수 : random
	 * */
	public static int random(int min, int max) {
		if(max<min) {
			int tmp =max;
			max=min;
			min=tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	
	}
	
}