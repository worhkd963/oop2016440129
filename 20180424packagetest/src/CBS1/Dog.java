package CBS1;

public class Dog extends Animal {
	public String name;
	private String IDN;
	String nickname;
	void print() {
		System.out.println(publicField);
		//System.out.println(privateField);
		System.out.println(packageField);
		System.out.println(protectedField);
	}
}
