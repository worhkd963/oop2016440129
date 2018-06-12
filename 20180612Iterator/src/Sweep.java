import java.util.*;

public class Sweep {
	public static void main(String args[]) {
		Set<String> set;
		//set = new HashSet<>(); // 해쉬함수 순서로... 즉 순서를 알 수 없음
		//set = new TreeSet<>(); // 알파벳순으로 정렬되어 저장
		set = new LinkedHashSet<>(); // 입력순으로...
		//기본적 메소드 add(), remove(), sweep...
		set.add("trump");
		set.add("jungeun");
		set.add("jaein");
		set.add("joonpyo");
		
		//첫 번째 훑는 방법 : iterator사용
		Iterator<String> e = set.iterator();
		while(e.hasNext()) {//끝까지 훑다.
			String str = e.next();//하나씩 빼낸다.
			System.out.println(str);
		}
		//두 번째 훑는 방법 : for() 반복문 사용
		for(String a : set) {// for (요소타입 참조변수 : 콜렉션변수)
			System.out.println(a);
		}
		
	}
}
