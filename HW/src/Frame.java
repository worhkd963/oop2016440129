import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame extends JFrame implements ActionListener {

	JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;
	JTextField tf;
	Frame(){
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator");
		
		this.setLayout(new FlowLayout());
		this.btn0 = new JButton("0");
		this.btn1 = new JButton("1");
		this.btn2 = new JButton("2");
		this.btn3 = new JButton("3");
		this.btn4 = new JButton("4");
		this.btn5 = new JButton("5");
		this.btn6 = new JButton("6");
		this.btn7 = new JButton("7");
		this.btn8 = new JButton("8");
		this.btn9 = new JButton("9");
		this.btn10 = new JButton("C");
		this.btn11 = new JButton("+");
		this.btn12 = new JButton("=");
		
		tf = new JTextField(20);
		this.add(tf);
		
//		this.add(btn0);
//		this.add(btn1);
//		this.add(btn2);
//		this.add(btn3);
//		this.add(btn4);
//		this.add(btn5);
//		this.add(btn6);
//		this.add(btn7);
//		this.add(btn8);
//		this.add(btn9);
//		this.add(btn10);
//		this.add(btn11);
//		this.add(btn12);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(3, 4, 2, 2));
		panel1.add(btn7); panel1.add(btn8); panel1.add(btn9); panel1.add(btn10);
		panel1.add(btn4); panel1.add(btn5); panel1.add(btn6); panel1.add(btn11);
		panel1.add(btn1); panel1.add(btn2); panel1.add(btn3); panel1.add(btn12);
		
		this.add(panel1);
		this.add(btn0);
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
