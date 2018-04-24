package CBS2;
import CBS1.*;
public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
		//aBasil.age = 2; Error age is a private field
		
		// 타 패키지의 클라스를 사용하려면 
		// 1. 패키지명.클라스명
		// CBS1.Dog aDog = new CBS1.Dog();
		// 2. import 명령어를 사용
		CBS1.Dog aDog = new CBS1.Dog();  
		aDog.name = "happy";
		//aDog.IDN = "231412"; Error
		//aDog.nickname = "tt"; Error nickname은 패키지 접근지정
		
		Animal aa = new Animal();
		//aa.protectedField = "ddd";
		
		Rosemary rr = new Rosemary();
		rr.print();
	}

}
