import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// 두 수(정수)를 입력 받아, 그 중 큰 수를 출력하는 프로그램을 작성하시오.
		int a, b;
		
		Scanner input = new Scanner(System.in);
		System.out.print("첫번쨰 정수를 입력하시오 : ");
		a = input.nextInt();
		System.out.print("두번쨰 정수를 입력하시오 : ");
		b = input.nextInt();

		if(a>b)
			System.out.println("a가 더 크다");
		else if(a<b)
			System.out.println("b가 더 크다");
		else
			System.out.println("두 수는 같다");
	}

}
