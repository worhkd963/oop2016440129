import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		// �Ҽ�(prime-number) �˻�� ����ϰ� ����ڰ� �Է��� ���� �μ����� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// 0�� �Է��ϱ� �������� ��� ����(�μ� ���)�ϵ��� �Ͻÿ�.

		int a;
		int i=2;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("������ �Է��ϼ��� : ");
			a=input.nextInt();
			if(a==0)
				break;
			System.out.print(a+" => ");
			while(i<a) {
				if(a%i==0) // �μ� �Ǻ�
					System.out.print(i+" ");
				i++;
			}
			i=2;
			System.out.println();
			
		}while(a!=0);
		/*System.out.print("������ �Է��ϼ��� : ");
		a=input.nextInt();
		
		
		
		while(a!=0) {
			System.out.print(a+" => ");
			while(i<=a) {
				if(a%i==0)
					System.out.print(i+" ");
				i++;
			}
			System.out.println();
			System.out.print("������ �Է��ϼ��� : ");
			a=input.nextInt();
			i=1;
		}*/
		System.out.println("==========�ý����� ����Ǿ����ϴ�.==========");
		
		input.close();
	}
}
