import java.util.*;

public class Sweep {
	public static void main(String args[]) {
		Set<String> set;
		//set = new HashSet<>(); // �ؽ��Լ� ������... �� ������ �� �� ����
		//set = new TreeSet<>(); // ���ĺ������� ���ĵǾ� ����
		set = new LinkedHashSet<>(); // �Է¼�����...
		//�⺻�� �޼ҵ� add(), remove(), sweep...
		set.add("trump");
		set.add("jungeun");
		set.add("jaein");
		set.add("joonpyo");
		
		//ù ��° �ȴ� ��� : iterator���
		Iterator<String> e = set.iterator();
		while(e.hasNext()) {//������ �ȴ�.
			String str = e.next();//�ϳ��� ������.
			System.out.println(str);
		}
		//�� ��° �ȴ� ��� : for() �ݺ��� ���
		for(String a : set) {// for (���Ÿ�� �������� : �ݷ��Ǻ���)
			System.out.println(a);
		}
		
	}
}
