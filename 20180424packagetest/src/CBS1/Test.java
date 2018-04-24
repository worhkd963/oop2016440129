package CBS1;

public class Test {

	public static void main(String[] args) {
		Dog tina = new Dog();
		tina.print();
		tina.name = "Tina";
		//tina.IDN = "1251514"; Error IDn is a private field
		tina.nickname = "sdfsd";
		tina.publicField = "U2";
		tina.packageField = "Ed";
		tina.protectedField = "Beatles";
		tina.print();
	}

}
