package CBS2;
import CBS1.*;
public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
		//aBasil.age = 2; Error age is a private field
		
		// Ÿ ��Ű���� Ŭ�󽺸� ����Ϸ��� 
		// 1. ��Ű����.Ŭ�󽺸�
		// CBS1.Dog aDog = new CBS1.Dog();
		// 2. import ��ɾ ���
		CBS1.Dog aDog = new CBS1.Dog();  
		aDog.name = "happy";
		//aDog.IDN = "231412"; Error
		//aDog.nickname = "tt"; Error nickname�� ��Ű�� ��������
		
		Animal aa = new Animal();
		//aa.protectedField = "ddd";
		
		Rosemary rr = new Rosemary();
		rr.print();
	}

}
