import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		// month�� day�� �Է� �޾�, 1�� 1�Ϻ����� �� day���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (switch�� ���)
		// 1�� 20���� 20�� ���, 2�� 5���� 36�� ���. �� 2���� 28�Ϸ� ���.
		int month, day;
		Scanner input = new Scanner(System.in);
		
		System.out.print("month�� �Է��ϼ��� : ");
		month = input.nextInt();
		System.out.print("day�� �Է��ϼ��� : ");
		day = input.nextInt();
		
		System.out.println(month+"�� "+day+"��");
		
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
			
	}

}
