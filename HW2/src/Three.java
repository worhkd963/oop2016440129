
public class Three {

	public static void main(String[] args) {
		// 1���� 100������ ����(����) �߿��� 3�� �����(3,6,9,12,..)���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(while�� ���)
		int i=1 , sum=0;
		while(i<101) {
			if(i%3==0) // 3�� ��� �Ǻ�
				sum+=i; // 3�� ����� ���ϱ�
			i++; 
		}
		System.out.println(sum);
	}

}
