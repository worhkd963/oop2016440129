import javax.swing.*;

public class CarGameTest extends JFrame {
	JButton converter;
	JButton canceler;
	JTextArea textIn;
	JTextArea textOut;
	
	public CarGameTest() {
		super("�ؽ�Ʈ ��ȯ");
		
		textIn = new JTextArea(10, 14);
		textOut = new JTextArea(10, 14);
		textOut.setLineWrap(true);
	}
}
