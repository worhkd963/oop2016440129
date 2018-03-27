import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// 어떤 두 자리 수의 자릿수의 순서를 서로 바꾸는 프로그램을 작성하시오.
		int a;
		Scanner input = new Scanner(System.in);
		System.out.print("두 자리 정수를 입력하시오 : ");
		a = input.nextInt();
		
		a=a/10+10*(a%10);
		
		System.out.println(a);
		
		
	}

}
