import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// �� ��(������)�� �Է� �޾� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a, b, c;
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù���� ������ �Է��Ͻÿ� : ");
		a = input.nextInt();
		System.out.print("�ι�° ������ �Է��Ͻÿ� : ");
		b = input.nextInt();
		System.out.print("����° ������ �Է��Ͻÿ� : ");
		c = input.nextInt();
		
		if(a>b) {
			if(a>c)
				System.out.println("a�� ���� Ů�ϴ�.");
			else
				System.out.println("c�� ���� Ů�ϴ�.");
		}
		else {
			if(b>c)
				System.out.println("b�� ���� Ů�ϴ�.");
			else
				System.out.println("c�� ���� Ů�ϴ�.");
		}
	}

}
