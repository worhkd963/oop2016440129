import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		// month와 day를 입력 받아, 1월 1일부터의 총 day수를 출력하는 프로그램을 작성하시오. (switch문 사용)
		// 1월 20일은 20일 출력, 2월 5일은 36일 출력. 단 2월은 28일로 계산.
		int month, day;
		Scanner input = new Scanner(System.in);
		
		System.out.print("month를 입력하세요 : ");
		month = input.nextInt();
		System.out.print("day를 입력하세요 : ");
		day = input.nextInt();
		
		System.out.println(month+"월 "+day+"일");
		
		switch(month) {
		case 1: 
			System.out.println(day);
			break;
		case 2:
			System.out.println(31+day);
			break;
		case 3:
			System.out.println(31+28+day);
			break;
		case 4:
			System.out.println(31+28+31+day);
			break;
		case 5:
			System.out.println(31+28+31+30+day);
			break;
		case 6:
			System.out.println(31+28+31+30+31+day);
			break;
		case 7:
			System.out.println(31+28+31+30+31+30+day);
			break;
		case 8:
			System.out.println(31+28+31+30+31+30+31+day);
			break;
		case 9:
			System.out.println(31+28+31+30+31+30+31+31+day);
			break;
		case 10:
			System.out.println(31+28+31+30+31+30+31+31+30+day);
			break;
		case 11:
			System.out.println(31+28+31+30+31+30+31+31+30+31+day);
			break;
		case 12:
			System.out.println(31+28+31+30+31+30+31+31+30+31+30+day);
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
			
	}

}
