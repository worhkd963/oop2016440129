
public class Twenty_Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j ;
		for(i=0; i<11; i++) {
			if(i<6) { // 별이 감소
				for(j=0; j<11-2*i; j++) // 별 찍기
					System.out.print("*");
				System.out.println();
			}
			else { // 별이 증가
				for(j=0; j<2*i-9; j++) // 별 찍기
					System.out.print("*");
				System.out.println();
			}
		}
		System.out.println("-------------------");

		for(i=0; i<11; i++) {
			if(i<6) {
				for(j=0; j<11-2*i; j++) { // 행의 길이 감소
					if(j<6-i) // 숫자 감소
						System.out.print(5-i-j);
					else // 숫자 증가
						System.out.print(i+j-5);
				}
				System.out.println();
			}
			else { // 행의 길이 증가
				for(j=0; j<2*i-9; j++) {
					if(j<i-4) // 숫자 감소
						System.out.print(-j-5+i);
					else // 숫자 증가
						System.out.print(j+5-i);
				}
				System.out.println();
			}
		}

	}
}
