import java.util.Scanner;
import java.util.Random;

public class Fifteen {

	public static void main(String[] args) {
		// 1~100 사이의 숫자 하나를 정한 뒤(랜덤으로 생성해도 됨), 10번 이내로 그 숫자를 맞추는 게임을 작성하시오.
		
		int a;
		int b;
		int i=0;
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		a=random.nextInt(100)+1; // 1부터 100까지 변수 생성
		
		while(i<10) {
			System.out.print("숫자를 입력하세요 : ");
			b = input.nextInt();
			
			if(b>a)
				System.out.println("입력하신 숫자보다 작습니다.\n");
			else if(b<a)
				System.out.println("입력하신 숫자보다 큽니다.\n");
			else {
				System.out.println("정답입니다!\n");
				break;
			}
			i++;
		}
		if(i==10) {
			System.out.println("그것도 못 맞추다니 멍청하군요?\n");
			System.out.println("=====Game Over=====\n");
		}
		System.out.println("=========프로그램 종료==========");
		
	}

}
