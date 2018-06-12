import java.util.Iterator;
import java.util.*;

public class AnimalSing {
	List<Animal> list; //Animal�� �ڽ�Ŭ�󽺸� ���� �� �ִ�.
	AnimalSing(){
		list = new ArrayList<Animal>();
	}
	void add(Animal ele) {
		list.add(ele);
	}
	void sing() {
		Animal ele;
		Iterator<Animal> e = list.iterator();
		while(e.hasNext()) {
			ele = (Animal)e.next();
			ele.sing(); // Polymorphism
		}
	}
}
