
public class TestPoint {

	public static void main(String[] args) {
		// new Point()��  PointŬ������ ���ο� ��ü�� �ϳ� �����Ѵ�.
		// ��ü�� �����ϸ� �׿� ���� �ʵ�� ��Ÿ������ ���� ������ �޸𸮿� ���õȴ�.
		// Ŭ������ �ؾ���, ��ü�� �ؾ
		
		Point pnt1 = new Point();
		Point pnt2 = new Point();
		//Setter�� ����Ͽ� x�� y�� ����.
		
		pnt1.setX(1.0); pnt1.setY(1.0);
		pnt2.setX(2.0); pnt2.setY(2.0);
		
		//System.out.println("("+pnt.getX() + ", " + pnt.getY() + ")");
		
		//pnt1.print();
		//pnt2.print();
		
		System.out.println(pnt2);
		System.out.println(pnt2.distance());
		// method overloading : �޼ҵ� �̸��� ����������, �Ű������� �޼ҵ带 ������ �� �ִ�.
		System.out.println(pnt2.distance(pnt1));

	}

}
