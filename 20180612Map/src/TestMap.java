import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		//Map<String, String> map = new HashMap<>();
		//Map<String, String> map = new TreeMap<>(); // Ű�� ���ĺ� ����
		Map<String, String> map = new LinkedHashMap<>();
		// �߰� : .put(key, value)
		// valueã�� : value = .get(key)
		
		map.put("���̴�", "û�ʹ�");
		map.put("Ʈ����", "��ǰ�");
		map.put("������", "�Ǿ�");
		map.put("����", "���ʽ�Ÿ����");
		
		System.out.println(map.get("���̴�"));
		
		//�ȴ� ���1 : iterator���
		//Iterator<String> itr = map.keySet().iterator();
		Set<String> set = map.keySet();//map.keyset() : map�� ����� ��Ʈ��(Ű, ��) �� Ű�� ���� ��
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(String.format("Ű : %s, �� : %s", key, map.get(key)));
		}
		//�ȴ� ���2 : ī���� ����� for() �ݺ��� ���
		for(String key : map.keySet()){
			System.out.println(String.format("Ű : %s, �� : %s", key, map.get(key)));
		}
		
		//�ȴ� ���3 : ��Ʈ������ ����� ���
		for(Map.Entry<String, String> s : map.entrySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", s.getKey(), s.getValue()));
		}
	}

}
