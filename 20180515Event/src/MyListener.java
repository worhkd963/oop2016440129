import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
//첫 번째 이벤트 리스너 구현 방법
public class MyListener implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//액션이벤트객체에서 눌려진 버튼 객체 (버튼객체의 레퍼런스값)를 가져온다
		JButton button = (JButton) e.getSource();
		button.setText("버튼이 눌러졌어요!!!");
		System.out.println("OMG 버튼 눌러졌어요!!!!!");
		
	}
}
