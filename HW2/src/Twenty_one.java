import java.util.Scanner;

public class Twenty_one {

	public static void main(String[] args) {
		// 사용자로부터 한 숫자를 입력받아, 입력받은 숫자 이하의 소수들의 합을 구하는 프로그램을 작성하시오.
		int a;
		int i, j;
		int sum=0, count=0;
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		a = input.nextInt(); //숫자 입력
		
		for(i=2; i<=a; i++) {//입력 받은 숫자 이하의 숫자들
			for(j=1; j<=i; j++) {//소수 판별
				if(i%j==0)
					count++;
			}
			if(count==2)//소수면 더한다.
				sum+=i;
			count=0;//카운트 초기화
		}
		System.out.println("입력받은 숫자 이하의 소수들의 합은 "+sum+"입니다.\n");
		System.out.println("============프로그램 종료=============");
		
	}

}
