package CBS2;

public class Rosemary extends CBS1.Dog {
	public Rosemary() {
		protectedField = "test";
	}
	
	public void print() {
		System.out.println(protectedField);
	}
}
