import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

	private JPanel panel;
	private JTextField textField;
	private JButton[] buttons;
	private String[] labels = {"7", "8", "9", "/",
								"4", "5", "6", "*",
								"1", "2", "3", "-",
								"0", "C", "=", "+"};
	
	public Calculator() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("°è»ê±â");
		this.setSize(500, 500);
		
		panel = new JPanel();
		textField = new JTextField(12);
		textField.setText("");
		
		panel.setLayout(new GridLayout(4, 4, 4, 4));
		buttons = new JButton[16];
		
		for(int index = 0 ; index<16; index++) {
			buttons[index] = new JButton(labels[index]);
			buttons[index].setActionCommand(labels[index]);
			buttons[index].addActionListener(this);
			panel.add(buttons[index]);
		}
		
		add(textField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
		case "0" : 
			this.textField.setText(this.textField.getText() + "0");
			break;
		case "1" :
			this.textField.setText(this.textField.getText() + "1");
			break;
		case "2" : 
			this.textField.setText(this.textField.getText() + "2");
			break;
		case "3" :
			this.textField.setText(this.textField.getText() + "3");
			break;
		case "4" : 
			this.textField.setText(this.textField.getText() + "4");
			break;
		case "5" : 
			this.textField.setText(this.textField.getText() + "5");
			break;
		case "6" : 
			this.textField.setText(this.textField.getText() + "6");
			break;
		case "7" : 
			this.textField.setText(this.textField.getText() + "7");
			break;
		case "8" : 
			this.textField.setText(this.textField.getText() + "8");
			break;
		case "9" : 
			this.textField.setText(this.textField.getText() + "9");
			break;
		case "+" :
			this.textField.setText(this.textField.getText() + "+");
			break;
		case "-" : 
			this.textField.setText(this.textField.getText() + "-");
			break;
		case "*" : 
			this.textField.setText(this.textField.getText() + "*");
			break;
		case "/" : 
			this.textField.setText(this.textField.getText() + "/");
			break;
		case "C" :
			this.textField.setText("");
		case "=" :
			
		}
		
	}
	
	public static void main(String[] args) {
		 new Calculator();

	}
}
