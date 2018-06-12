import javax.swing.*;

public class CarGameTest extends JFrame {
	JButton converter;
	JButton canceler;
	JTextArea textIn;
	JTextArea textOut;
	
	public CarGameTest() {
		super("텍스트 변환");
		
		textIn = new JTextArea(10, 14);
		textOut = new JTextArea(10, 14);
		textOut.setLineWrap(true);
	}
}
