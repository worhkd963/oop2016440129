import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		// 소수(prime-number) 검사와 흡사하게 사용자가 입력한 수의 인수들을 모두 출력하는 프로그램을 작성하시오.
		// 0을 입력하기 전까지는 계속 수행(인수 출력)하도록 하시오.

		int a;
		int i=2;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("정수를 입력하세요 : ");
			a=input.nextInt();
			if(a==0)
				break;
			System.out.print(a+" => ");
			while(i<a) {
				if(a%i==0) // 인수 판별
					System.out.print(i+" ");
				i++;
			}
			i=2;
			System.out.println();
			
		}while(a!=0);
		/*System.out.print("정수를 입력하세요 : ");
		a=input.nextInt();
		
		
		
		while(a!=0) {
			System.out.print(a+" => ");
			while(i<=a) {
				if(a%i==0)
					System.out.print(i+" ");
				i++;
			}
			System.out.println();
			System.out.print("정수를 입력하세요 : ");
			a=input.nextInt();
			i=1;
		}*/
		System.out.println("==========시스템이 종료되었습니다.==========");
		
		input.close();
	}
}
