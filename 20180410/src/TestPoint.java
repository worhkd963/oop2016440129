
public class TestPoint {

	public static void main(String[] args) {
		// new Point()는  Point클래스인 새로운 객체를 하나 생성한다.
		// 객체를 생성하면 그에 대한 필드와 메타정보에 대한 공간이 메모리에 마련된다.
		// 클래스는 붕어빵기계, 객체는 붕어빵
		
		Point pnt1 = new Point();
		Point pnt2 = new Point();
		//Setter를 사용하여 x와 y를 설정.
		
		pnt1.setX(1.0); pnt1.setY(1.0);
		pnt2.setX(2.0); pnt2.setY(2.0);
		
		//System.out.println("("+pnt.getX() + ", " + pnt.getY() + ")");
		
		//pnt1.print();
		//pnt2.print();
		
		System.out.println(pnt2);
		System.out.println(pnt2.distance());
		// method overloading : 메소드 이름은 동일하지만, 매개변수로 메소드를 구분할 수 있다.
		System.out.println(pnt2.distance(pnt1));

	}

}
