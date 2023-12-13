package day04;

public class StarEx5 {

	public static void main(String[] args) {
		/* *****         i=1     ' '=0     *=5
		 *  ****         i=2     ' '=1     *=4
		 *   ***            i+1           6-i
		 *    **
		 *     *
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 */
	
		int rows=5;
		for(int i=1; i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(' ');
			}
			for(int j=1; j<=6-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1 ; i <= rows; i++) {
			for(int j = 1 ; j <= rows - i; j++) {
				System.out.print(' '); 
			}
			for(int j=1; j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
