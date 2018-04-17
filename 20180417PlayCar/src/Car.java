
public class Car {
	private String color;
	private int speed;
	
	public static int numberOfCars = 0; // 정적 변수, static field
	// Constructor (생성자) : 메소드명이 클라스 이름과 같다. 반환형이 없다.
	// 만약 생성자를 정의하지 않으면 매개변수 없는 생성자를 자바에서 자동으로 생성해준다.
	// 하지만, 생성자를 하나라도 정의하면 자바는 아무 일도 안 한다.
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
		
		numberOfCars++;
	}
	
	public Car() {
		this.color = "White";
		this.speed = 60;
		numberOfCars++;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public static void print() {
		//정적 메소드는 정적 변수만 접근한 수 있다.
		// System.out.println(this.color + this.speed); error
		System.out.println(numberOfCars);
	}
	public String toString() {
		return "Color is " + this.color + ". Speed is " + this.speed;
	}
}
