import java.util.*;

public class TestQueue {

	public static void main(String[] args) throws InterruptedException {
		//Queue<String> strs = new LinkedList<>();
		Queue<String> strs = new PriorityQueue<>(); // 알파벳 순으로 저장됨
		strs.add("트럼프"); // 큐 맨 끝에 요소를 추가
		strs.add("정은");
		strs.add("재이니");
		strs.add("준표");
		
		while(!strs.isEmpty()) {//for (요소타입 참조변수 : 콜렉션변수)
			System.out.println(strs.remove());
			Thread.sleep(2000);
		}
	}

}
