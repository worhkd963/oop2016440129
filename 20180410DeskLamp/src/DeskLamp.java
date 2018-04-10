
public class DeskLamp {
	// 필드
	private boolean isOn;
	
	
	//메소드
	
	public void turnOn() {
		this.isOn = true;
	}
	
	public void turnOff() {
		this.isOn = false;
	}
	
	public String toString() {
		if(isOn)
			return "켜져있습니다.";
		else
			return "꺼져있습니다.";
	}
}
