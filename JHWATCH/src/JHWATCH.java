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
		this.setTitle("계산기");
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

	protected void calculateInit() { //action performed에서 사용하는 변수들 한번에 초기화하는 메소드 
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
    private String who = ""; //action performed에서 사용 할 변수들 선언 
    //내부에 선언 시 이벤트 발생 시마다 초기화되는 문제점 생김. 
 
    public void actionPerformed(ActionEvent e) { 
        try { 
            tempName = e.getActionCommand(); //버튼 이름불러오기 
            if (tempName.equals("CE")) { //사용자가 누른 버튼의 이름이 CE일 경우(CE 버튼을 눌렀을 경우) 
 
                textField.setText(""); //tField를 다 날리고 
                return; //메소드를 그대로 종료시킨다. (더이상 진행할 필요 없음.) 
                //void형일지라도 return 사용 가능!! (값이 있어선 안 되며, 메소드 종료용으로 사용) 
            } 
            tempString = textField.getText(); //여태까지 tField에 적힌 텍스트를 받아옴 
 
            if (tempString.equals("0")) 
                tempString = ""; 
            //해당 작업이 단순해 보여도 생각보다 유용함.(버튼을 눌렀을 때 텍스트필드에 0뿐이라면 그 0을 지워버림) 
            //그렇지 않으면 05+5처럼 출력될 것. 
 
            if ((tempName.equals("+") || tempName.equals("-") || tempName.equals("*") || tempName.equals("/")) && !is_ready) { 
                //사칙연산에 사용될 버튼들이면서 is_ready라는 불리언값이 false일 경우. 
                tempNum1 = Integer.parseInt(tempString); 
                //tempNum1에서는 tempString, 즉 여태까지 tField에 올라온 모든 숫자를 그대로 가져감. 
                is_ready = true; 
                //is_ready를 true로 함. 
                //is_ready의 목적은 사칙연산 중 앞의 숫자와 뒤의 숫자를 구분하기 위하여 사용 
                //예) 
                //50+30 일 경우 
                //50과 30을 구분하기 위하여 사용함. 
 
                who = tempName; 
                //who의 경우 사칙연산 중 어떤 사칙연산이 사용되었는지 저장함. 
                //예) 
                //50+30의 경우 
                //+를 저장함. 
                //tempName의 경우 누르는 버튼의 이름을 매번 저장함. 
 
                textField.setText(tempString + tempName); 
                //tField에 여태까지 적힌 내용과 방금 누른 버튼을 적음. 
            } else if (tempName.equals("=") && is_ready && !tempNum2.equals("")) { 
                // =버튼을 눌렀고 is_ready가 true이며 tempNum2가 공백이 아닐경우. 
                int temp = Integer.parseInt(tempNum2); 
                textField.setText(Integer.toString(Calculate(tempNum1, temp, who))); 
                //Calculate 메소드의 값을 tField에 넣는다. 
                calculateInit(); 
            } 
            else if(tempName.equals("=") && (!is_ready || tempNum2.equals(""))) { 
                // =버튼은 눌렀으나 
                // is_ready가 true가 아닐 경우 혹은 tempNum2 (오른쪽 피연산자)가 공백일경우 
                // 아무것도 하지 않는다! 
            } 
            else { 
                //그게 아니라면 누른 버튼을 해당에 같이 출력한다. 
                //(원래있던 내용 + 방금누른 버튼) 
                textField.setText(tempString + tempName); 
            } 
 
            if(is_ready) { 
                //is_ready가 true면서 (연산자가 준비되었으며) 
                //방금 누른 버튼이 숫자일경우 
                tempNum2 += tempName; 
 
                //String형 tempNum2에 방금 누른 버튼을 더한다. 
                //tempNum2가 int가 아닌 이유이기도 하다. 
                //int일 경우 다른 값이 대입이 된다. 
                //예) 
                //tempNum2가 1이고 tempName이 2일경우 
                //tempNum2 += tempName를 하면 
                //tempNum2는 3이 된다. (여기서 원하는건 12) 
            } 
        } 
        catch (Exception ex) { 
            textField.setText(""); //오류나면 초기화!! 
            calculateInit(); 
        } 
 
    } 
    protected int Calculate(int a, int b, String s) { //세 가지를 받고 
        switch(s) { //String s에따라 다르게 반환 
            //실질적인 계산은 여기에서 나오게 된다. 
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


