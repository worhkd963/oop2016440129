
public class Point {
	// Fields
	private double x;
	private double y;
	
	
	//Methods
	public String toString() {
		return ("("+this.x + ", " + this.y + ")");
	}
	//Methods
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
		
	
	}
	
	public double distance() {
		//��ȯ�� ���� ����
		double result; // �������� scope�� �޼ҵ� �����̴�.
		
		//�Ÿ� ���
		result = Math.sqrt(x*x+y*y);
		
		//�Ÿ� ��ȯ
		return result;
	}
	
	public double distance(Point p) { // �޼ҵ� ���� �ε�
		return Math.sqrt((this.x-p.getX())*(this.x-p.getX())+
				(this.y-p.getY())*(this.y-p.getY()));
	}
	public void print() {
		System.out.println("("+this.x + ", " + this.y + ")");
	}
}
