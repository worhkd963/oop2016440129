import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		//����(����)�� �Է� �޾Ƽ� ���(A, B, C, D, E)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//(A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)
		int a;
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		a = input.nextInt();
		
		if(a<=100 && a>=80)
			System.out.println("A����Դϴ�.");
		else if(a<80 && a>=60)
			System.out.println("B����Դϴ�.");
		else if(a<60 && a>=40)
			System.out.println("C����Դϴ�.");
		else if(a<40 && a>=20)
			System.out.println("D����Դϴ�.");
		else if(a<20 && a>=0)
			System.out.println("E����Դϴ�.");
		else
			System.out.println("������ �ùٸ��� �ʽ��ϴ�.");
	}
}
