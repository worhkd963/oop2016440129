import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		// 0�� �Էµ� ������ ��� ������ �Է� �ް�, �Էµ� ��� ���ڵ��� ������ ����Ͻÿ�.
		int a;
		int sum=0;
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		a=input.nextInt();
		while(a!=0) { // 0�� �Է� ���� ������ �����Ͽ���
			sum+=a; // �Է¹��� ���� ���ϱ�
			System.out.print("������ �Է��ϼ��� : ");
			a=input.nextInt();
		}
		System.out.println(sum);
	}

}
