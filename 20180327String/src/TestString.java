
public class TestString {

	public static void main(String[] args) {
		int a = 10;// int형의 변수 a 생성  + 값 10을 a에 저장
		// string 객체 생성
		String str;// 클라스 스트링을 참조하는 참조 변수(레퍼런스 변수) 생성
		str = new String("Hello darkness my old friend.");// 객체생성
		
		//string 객체의 길이
		//메소드 호출 방법  : 참조변수.메소드()
		int len = str.length();
		System.out.println("string length is " + len);

		String str1;
		str1 = str.toUpperCase();
		System.out.println("str1 : " + str1);
		
	}

}
