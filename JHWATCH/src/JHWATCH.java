import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener {
	private JPanel panel;
	private JTextField textField;
	private JButton[] buttons;
	private String[] labels = {"7", "8", "9", "c", "4", "5", "6", "+", "1", "2", "3", "=", "0"};
	
	public calculator() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("����");
		this.setSize(300, 200);
		
		textField = new JTextField(12);
		panel = new JPanel();
		textField.setText("0");
		
		panel.setLayout(new GridLayout(0, 4, 4, 4));
		buttons = new JButton[13];
		int index = 0;
		for (index=0 ; index<12; index++) {
			buttons[index] = new JButton(labels[index]);
			buttons[index].addActionListener(this);
			panel.add(buttons[index]);
		}
		buttons[12] = new JButton(labels[12]);
		add(textField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(buttons[12], BorderLayout.SOUTH);
		setVisible(true);
		pack();
	}

	protected void calculateInit() { //action performed���� ����ϴ� ������ �ѹ��� �ʱ�ȭ�ϴ� �޼ҵ� 
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
    private String who = ""; //action performed���� ��� �� ������ ���� 
    //���ο� ���� �� �̺�Ʈ �߻� �ø��� �ʱ�ȭ�Ǵ� ������ ����. 
 
    public void actionPerformed(ActionEvent e) { 
        try { 
            tempName = e.getActionCommand(); //��ư �̸��ҷ����� 
            if (tempName.equals("CE")) { //����ڰ� ���� ��ư�� �̸��� CE�� ���(CE ��ư�� ������ ���) 
 
                textField.setText(""); //tField�� �� ������ 
                return; //�޼ҵ带 �״�� �����Ų��. (���̻� ������ �ʿ� ����.) 
                //void�������� return ��� ����!! (���� �־ �� �Ǹ�, �޼ҵ� ��������� ���) 
            } 
            tempString = textField.getText(); //���±��� tField�� ���� �ؽ�Ʈ�� �޾ƿ� 
 
            if (tempString.equals("0")) 
                tempString = ""; 
            //�ش� �۾��� �ܼ��� ������ �������� ������.(��ư�� ������ �� �ؽ�Ʈ�ʵ忡 0���̶�� �� 0�� ��������) 
            //�׷��� ������ 05+5ó�� ��µ� ��. 
 
            if ((tempName.equals("+") || tempName.equals("-") || tempName.equals("*") || tempName.equals("/")) && !is_ready) { 
                //��Ģ���꿡 ���� ��ư���̸鼭 is_ready��� �Ҹ����� false�� ���. 
                tempNum1 = Integer.parseInt(tempString); 
                //tempNum1������ tempString, �� ���±��� tField�� �ö�� ��� ���ڸ� �״�� ������. 
                is_ready = true; 
                //is_ready�� true�� ��. 
                //is_ready�� ������ ��Ģ���� �� ���� ���ڿ� ���� ���ڸ� �����ϱ� ���Ͽ� ��� 
                //��) 
                //50+30 �� ��� 
                //50�� 30�� �����ϱ� ���Ͽ� �����. 
 
                who = tempName; 
                //who�� ��� ��Ģ���� �� � ��Ģ������ ���Ǿ����� ������. 
                //��) 
                //50+30�� ��� 
                //+�� ������. 
                //tempName�� ��� ������ ��ư�� �̸��� �Ź� ������. 
 
                textField.setText(tempString + tempName); 
                //tField�� ���±��� ���� ����� ��� ���� ��ư�� ����. 
            } else if (tempName.equals("=") && is_ready && !tempNum2.equals("")) { 
                // =��ư�� ������ is_ready�� true�̸� tempNum2�� ������ �ƴҰ��. 
                int temp = Integer.parseInt(tempNum2); 
                textField.setText(Integer.toString(Calculate(tempNum1, temp, who))); 
                //Calculate �޼ҵ��� ���� tField�� �ִ´�. 
                calculateInit(); 
            } 
            else if(tempName.equals("=") && (!is_ready || tempNum2.equals(""))) { 
                // =��ư�� �������� 
                // is_ready�� true�� �ƴ� ��� Ȥ�� tempNum2 (������ �ǿ�����)�� �����ϰ�� 
                // �ƹ��͵� ���� �ʴ´�! 
            } 
            else { 
                //�װ� �ƴ϶�� ���� ��ư�� �ش翡 ���� ����Ѵ�. 
                //(�����ִ� ���� + ��ݴ��� ��ư) 
                textField.setText(tempString + tempName); 
            } 
 
            if(is_ready) { 
                //is_ready�� true�鼭 (�����ڰ� �غ�Ǿ�����) 
                //��� ���� ��ư�� �����ϰ�� 
                tempNum2 += tempName; 
 
                //String�� tempNum2�� ��� ���� ��ư�� ���Ѵ�. 
                //tempNum2�� int�� �ƴ� �����̱⵵ �ϴ�. 
                //int�� ��� �ٸ� ���� ������ �ȴ�. 
                //��) 
                //tempNum2�� 1�̰� tempName�� 2�ϰ�� 
                //tempNum2 += tempName�� �ϸ� 
                //tempNum2�� 3�� �ȴ�. (���⼭ ���ϴ°� 12) 
            } 
        } 
        catch (Exception ex) { 
            textField.setText(""); //�������� �ʱ�ȭ!! 
            calculateInit(); 
        } 
 
    } 
    protected int Calculate(int a, int b, String s) { //�� ������ �ް� 
        switch(s) { //String s������ �ٸ��� ��ȯ 
            //�������� ����� ���⿡�� ������ �ȴ�. 
            case "+": 
                return a+b; 
            default: 
                return -1; 
        } 
    } 
 
    public static void main(String[] args) { 
        new calculator(); 
    } 
}


