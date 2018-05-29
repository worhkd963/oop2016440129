import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener {
	private JPanel panel;
	private JTextField textField;
	private JButton[] buttons;
	private String[] labels = {"7", "8", "9", "C", "4", "5", "6", "+", "1", "2", "3", "=", "0"};
	
	public calculator() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("°è»ê±â");
		this.setSize(300, 200);
		
		textField = new JTextField(12);
		panel = new JPanel();
		textField.setText("0");
		
		panel.setLayout(new GridLayout(0, 4, 4, 4));
		buttons = new JButton[13];
		int index = 0;
		for (index=0 ; index<12; index++) {
			buttons[index] = new JButton(labels[index]);
			buttons[index].setActionCommand(labels[index]);
			buttons[index].addActionListener(this);
			panel.add(buttons[index]);
		}
		buttons[12] = new JButton(labels[12]);
		buttons[12].setActionCommand(labels[12]);
		buttons[12].addActionListener(this);
		
		add(textField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(buttons[12], BorderLayout.SOUTH);
		setVisible(true);
		pack();
	}
	
	public static boolean isNumeric(String str) {
		try
		{
			double d = Double.parseDouble(str);
		}
		catch(NumberFormatException nfe)
		{
			return false;
		}
		return true;
	}
	
	protected void calculateInit() {
		tempName = "";
		tempString = "";
		tempNum1 = 0;
		tempNum2 = "";
		is_ready = false;
		who = "";
		
	}
	
	private String tempName; 
    private String tempString; 
    private int tempNum1 = 0; 
    private String tempNum2 = ""; 
    private boolean is_ready = false; 
    private String who = "";
	
	@Override
	public void actionPerformed(ActionEvent e) {
		tempName = e.getActionCommand();
		if((tempName.equals("C"))) {
				this.textField.setText("");
				return;
		}
		tempString = textField.getText();
		
		if(tempString.equals("0"))
			tempString = "";
		
		if(tempName.equals("+") && !is_ready) {
			tempNum1 = Integer.parseInt(tempString);
			
			is_ready = true;
			
			who = tempName;
			textField.setText(tempString + tempName);
			
		}
		else if(tempName.equals("=") && is_ready && !tempNum2.equals("")) {
			int temp = Integer.parseInt(tempNum2);
			
			textField.setText(Integer.toString(Calculate(tempNum1, temp, who)));
			
			calculateInit();
		}
		else if(tempName.equals("=") && (is_ready || !tempNum2.equals(""))) {
			
		}
		else {
			textField.setText(tempString + tempName);
		}
		
		if(is_ready && isNumeric(tempName)) {
			tempNum2 += tempName;
		}
	}
	
	protected int Calculate(int a, int b, String s) {
		return a+b;
	}

}
