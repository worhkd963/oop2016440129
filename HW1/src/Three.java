import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// 세 수(정수형)를 입력 받아 가장 큰 수를 출력하는 프로그램을 작성하시오.
		int a, b, c;
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번쨰 정수를 입력하시오 : ");
		a = input.nextInt();
		System.out.print("두번째 정수를 입력하시오 : ");
		b = input.nextInt();
		System.out.print("세번째 정수를 입력하시오 : ");
		c = input.nextInt();
		
		if(a>b) {
			if(a>c)
				System.out.println("a가 가장 큽니다.");
			else
				System.out.println("c가 가장 큽니다.");
		}
		else {
			if(b>c)
				System.out.println("b가 가장 큽니다.");
			else
				System.out.println("c가 가장 큽니다.");
		}
	}

}
