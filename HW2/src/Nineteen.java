import java.util.Scanner;

public class Nineteen {

	public static void main(String[] args) {
		// 사용자로부터 한 숫자를 입력받아, 입력받은 숫자가 소수인지 아닌지를 검사하는 프로그램을 작성하시오
		int a;
		int i;
		int count=0;
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		a = input.nextInt();
		
		for(i=1; i<=a; i++) {
			if(a%i==0)
				count++;
		}
		if(count==2)
			System.out.println("소수입니다.");
		else
			System.out.println("소수가 아닙니다.");
	}

}
