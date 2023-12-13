package day04;

public class StarEx5 {

	public static void main(String[] args) {
		/* *****         i=1     ' '=0     *=5
		 *  ****         i=2     ' '=1     *=4
		 *   ***         3    i-1      2     6-i
		 *    ** 		 4 			3
		 *     *		 5			4
		 *     *         i=1    ' '=4     *=1
		 *    ***        i=2    ' '=3     *=3
		 *   *****			 5-i        2*i-1 		
		 *  *******
		 * *********
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 */
	
		int rows=5;
		int row =5;
		int rowss =4;
		for(int i=1; i<=rows;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(' ');
			}
			for(int j=1; j<=6-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1 ; i <= row; i++) {
			for(int j = 1 ; j <= row - i; j++) {
				System.out.print(' '); 
			}
			for(int j=1; j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=rowss;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(' ');
			}
			for(int j=1; j<=5-i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
}
