import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		// 0이 입력될 때까지 계속 정수를 입력 받고, 입력된 모든 숫자들의 총합을 출력하시오.
		int a;
		int sum=0;
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		a=input.nextInt();
		while(a!=0) { // 0을 입력 받을 때까지 실행하여라
			sum+=a; // 입력받은 숫자 더하기
			System.out.print("정수를 입력하세요 : ");
			a=input.nextInt();
		}
		System.out.println(sum);
	}

}
