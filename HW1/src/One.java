import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// �� ��(����)�� �Է� �޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a, b;
		
		Scanner input = new Scanner(System.in);
		System.out.print("ù���� ������ �Է��Ͻÿ� : ");
		a = input.nextInt();
		System.out.print("�ι��� ������ �Է��Ͻÿ� : ");
		b = input.nextInt();

		if(a>b)
			System.out.println("a�� �� ũ��");
		else if(a<b)
			System.out.println("b�� �� ũ��");
		else
			System.out.println("�� ���� ����");
	}

}
