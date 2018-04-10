
public class Point {
	//필드의 scope(유효범위)은 클래스 내부이다.
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
		//반환할 변수 선언
		double result; // 지역변수 scope은 메소드 내부이다.
		
		//거리 계산
		result = Math.sqrt(x*x+y*y);
		
		//거리 반환
		return result;
	}
	
	public Point move(Point p) { // 매개변수 p의 scope은 메소드 내부이다.
		
		//temp 변수 선언
		double a;
		double b;
		
		//포인트 p 만큼 이동
		a = this.x + p.x;
		b = this.y + p.y;
		
		//새로운 포인트 생성
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		//새로운 포인트 반환
		return pnt;
	}
}
