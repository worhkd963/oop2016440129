import java.util.Iterator;
import java.util.*;

public class AnimalSing {
	List<Animal> list; //Animal의 자식클라스를 가질 수 있다.
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
			ele = e.next();
			ele.sing(); // Polymorphism
		}
	}
}
