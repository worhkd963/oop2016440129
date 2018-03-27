import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		// 위의 문제에서 1부터 9사이 이외의 숫자를 사용자가 잘못 입력할 수도 있으니,
		// 이 경우에 잘못된 숫자라는 것을 알려주는 에러 메시지를 출력하고 다시 숫자를 입력 받도록 처리하시오.(입력의 유효성 검사)
		int a, i=1;
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		a = input.nextInt();
		
		while(a<1 || a>9) { // 1미만 9초과의 숫자를 입력 받으면 정수를 다시 입력 받는다.
			System.out.println("1부터 9사이의 숫자를 입력해주세요 ");
			System.out.print("정수를 입력하세요 : ");
			a = input.nextInt();
		}
		
		while(i<10) { // i단 출력
			System.out.println(a+ " * "+i+" = "+a*i);
			i++;
		}
	}

}
