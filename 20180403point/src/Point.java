
public class Point {
	//�ʵ��� scope(��ȿ����)�� Ŭ���� �����̴�.
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double xx) {
		this.x = xx;
	}
	
	public void setY(double yy) {
		this.y = yy;
	}
	
	public void print() {
		System.out.println("("+this.getX() + ", " + this.getY() + ")");
	}
	
	public double distance() {
		//��ȯ�� ���� ����
		double result; // �������� scope�� �޼ҵ� �����̴�.
		
		//�Ÿ� ���
		result = Math.sqrt(x*x+y*y);
		
		//�Ÿ� ��ȯ
		return result;
	}
	
	public Point move(Point p) { // �Ű����� p�� scope�� �޼ҵ� �����̴�.
		
		//temp ���� ����
		double a;
		double b;
		
		//����Ʈ p ��ŭ �̵�
		a = this.x + p.x;
		b = this.y + p.y;
		
		//���ο� ����Ʈ ����
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		//���ο� ����Ʈ ��ȯ
		return pnt;
	}
}
