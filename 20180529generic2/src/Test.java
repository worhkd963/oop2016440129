
public class Test {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		String str = new String("Hello");
		
		box.set(str);
		System.out.println("The box has " + box.get());
		
		Box<Integer> ibox = new Box<Integer>();
		Integer i = new Integer(10);
		
		Box<Double> box2 = new Box<Double>();
		box2.set(3.456);
		
		System.out.println("The box has " + box2.get());
		
		ibox.set(i);
		//error ibox.set(new String("chois"));
		System.out.println("The box has " + ibox.get());
		
	}
}

