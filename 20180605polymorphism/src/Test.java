
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina"); // upcasting
		Animal aCat = new Cat("����"); // upcasting
		
		aDog.sing();
		// error aDog.playFetch();
		((Dog)aDog).playFetch(); // Downcasting
		((Dog)aCat).playFetch(); // runtime error
		aCat.sing();
		

	}

}
