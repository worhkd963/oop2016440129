import java.util.Scanner;

public class Twenty_one {

	public static void main(String[] args) {
		// ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���� ������ �Ҽ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a;
		int i, j;
		int sum=0, count=0;
		Scanner input = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		a = input.nextInt(); //���� �Է�
		
		for(i=2; i<=a; i++) {//�Է� ���� ���� ������ ���ڵ�
			for(j=1; j<=i; j++) {//�Ҽ� �Ǻ�
				if(i%j==0)
					count++;
			}
			if(count==2)//�Ҽ��� ���Ѵ�.
				sum+=i;
			count=0;//ī��Ʈ �ʱ�ȭ
		}
		System.out.println("�Է¹��� ���� ������ �Ҽ����� ���� "+sum+"�Դϴ�.\n");
		System.out.println("============���α׷� ����=============");
		
	}

}
