import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// � �� �ڸ� ���� �ڸ����� ������ ���� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
		int a;
		Scanner input = new Scanner(System.in);
		System.out.print("�� �ڸ� ������ �Է��Ͻÿ� : ");
		a = input.nextInt();
		
		a=a/10+10*(a%10);
		
		System.out.println(a);
		
		
	}

}
