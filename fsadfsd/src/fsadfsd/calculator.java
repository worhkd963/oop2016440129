package fsadfsd; 
 
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
 
/** 
 * Created on 2016-05-24. 
 * ���� ����!! 
 */ 
public class calculator extends JFrame implements ActionListener{ 
    private JPanel panel; 
    private JTextField tField; 
    private JButton[] buttons; 
    private String[] labels = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", "CE", "=", "/"}; 
 
    public calculator() { 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setTitle("����"); 
        this.setSize(300,200); //?? grid layout�������� ���� ũ�� ������ �� ��. 
 
        tField = new JTextField(12); 
        panel = new JPanel(); 
        tField.setText("0"); 
        /*tField.setEnabled(false);*/ 
        panel.setLayout(new GridLayout(0, 4, 4, 4)); 
        buttons = new JButton[16]; //��ư�� �� 16��. 
        int index = 0; 
        for (int rows = 0; rows < 4; rows++) { 
            for (int cols = 0; cols < 4; cols++) { 
                buttons[index] = new JButton(labels[index]);//��ư�� ���̺��� String lables���� �޾ƿ� 
                buttons[index].addActionListener(this); //��ư���� �׼Ǹ����� 
 
                if (cols >= 3) 
                    buttons[index].setForeground(Color.red); 
                else 
                    buttons[index].setForeground(Color.blue); 
 
                buttons[index].setBackground(Color.yellow); 
                panel.add(buttons[index]); 
                index++; 
            } 
        } 
        add(tField, BorderLayout.NORTH); 
        add(panel, BorderLayout.CENTER); 
        setVisible(true); 
        pack(); 
    } 
 
    public static boolean isNumeric(String str) //�� String���� ���ڷ� �� �� �ִ��� �Ǵ��ϴ� �޼ҵ� 
    { 
        try 
        { 
            double d = Double.parseDouble(str); //String�� double������ ������ �õ� 
        } 
        catch(NumberFormatException nfe) 
        { 
            return false; //���� �߻��� ���ڰ� �ƴ� 
        } 
        return true; 
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
 
                tField.setText(""); //tField�� �� ������ 
                return; //�޼ҵ带 �״�� �����Ų��. (���̻� ������ �ʿ� ����.) 
                //void�������� return ��� ����!! (���� �־ �� �Ǹ�, �޼ҵ� ��������� ���) 
            } 
            tempString = tField.getText(); //���±��� tField�� ���� �ؽ�Ʈ�� �޾ƿ� 
 
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
 
                tField.setText(tempString + tempName); 
                //tField�� ���±��� ���� ����� ��� ���� ��ư�� ����. 
            } else if (tempName.equals("=") && is_ready && !tempNum2.equals("")) { 
                // =��ư�� ������ is_ready�� true�̸� tempNum2�� ������ �ƴҰ��. 
                int temp = Integer.parseInt(tempNum2); 
                tField.setText(Integer.toString(Calculate(tempNum1, temp, who))); 
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
                tField.setText(tempString + tempName); 
            } 
 
            if(is_ready && isNumeric(tempName)) { 
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
            tField.setText(""); //�������� �ʱ�ȭ!! 
            calculateInit(); 
        } 
 
    } 
    protected int Calculate(int a, int b, String s) { //�� ������ �ް� 
        switch(s) { //String s������ �ٸ��� ��ȯ 
            //�������� ����� ���⿡�� ������ �ȴ�. 
            case "+": 
                return a+b; 
            case "-": 
                return a-b; 
            case "*": 
                return a*b; 
            case "/": 
                return a/b; 
            default: 
                return -1; 
        } 
    } 
 
    public static void main(String[] args) { 
        new calculator(); 
    } 
}
