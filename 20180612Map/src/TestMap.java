import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		//Map<String, String> map = new HashMap<>();
		//Map<String, String> map = new TreeMap<>(); // 키의 알파벳 순서
		Map<String, String> map = new LinkedHashMap<>();
		// 추가 : .put(key, value)
		// value찾기 : value = .get(key)
		
		map.put("재이니", "청와대");
		map.put("트럼프", "백악관");
		map.put("정으니", "피양");
		map.put("범성", "위례스타힐스");
		
		System.out.println(map.get("재이니"));
		
		//훑는 방법1 : iterator사용
		//Iterator<String> itr = map.keySet().iterator();
		Set<String> set = map.keySet();//map.keyset() : map에 저장된 엔트리(키, 값) 중 키만 모은 셋
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(String.format("키 : %s, 값 : %s", key, map.get(key)));
		}
		//훑는 방법2 : 카셋을 만들어 for() 반복문 사용
		for(String key : map.keySet()){
			System.out.println(String.format("키 : %s, 값 : %s", key, map.get(key)));
		}
		
		//훑는 방법3 : 엔트리셋을 만드는 방법
		for(Map.Entry<String, String> s : map.entrySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", s.getKey(), s.getValue()));
		}
	}

}
