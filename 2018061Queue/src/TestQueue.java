import java.util.*;

public class TestQueue {

	public static void main(String[] args) throws InterruptedException {
		//Queue<String> strs = new LinkedList<>();
		Queue<String> strs = new PriorityQueue<>(); // ���ĺ� ������ �����
		strs.add("Ʈ����"); // ť �� ���� ��Ҹ� �߰�
		strs.add("����");
		strs.add("���̴�");
		strs.add("��ǥ");
		
		while(!strs.isEmpty()) {//for (���Ÿ�� �������� : �ݷ��Ǻ���)
			System.out.println(strs.remove());
			Thread.sleep(2000);
		}
	}

}
