
public class Twenty_Three {

	public static void main(String[] args) {
		/* ***** *
		   *** ***
		   * ***** */
		int i,j;
		for(i=1; i<=3; i++) {
			for(j=0; j<7-i*2; j++) // 별 출력
				System.out.print("*");
			System.out.print(" "); // 공백
			j++;
			for(j=j ; j<7; j++) // 별 출력
				System.out.print("*");
			System.out.println();
		}

	}

}