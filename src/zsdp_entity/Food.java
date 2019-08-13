package zsdp_entity;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * 宠物食品
 * @author admin
 *
 */

public class Food extends JFrame{
	private JTextField textField;
	public Food() {
		super();
		getContentPane().setLayout(null);
		setTitle("宠物食品");

		final JButton button = new JButton();
		button.setText("狗粮");
		button.setBounds(69, 106, 138, 75);
		getContentPane().add(button);

		final JButton button_1 = new JButton();
		button_1.setText("搜索");
		button_1.setBounds(383, 10, 89, 34);
		getContentPane().add(button_1);

		textField = new JTextField();
		textField.setBounds(177, 10, 200, 34);
		getContentPane().add(textField);

		final JButton button_2 = new JButton();
		button_2.setText("返回>");
		button_2.setBounds(0, 10, 78, 34);
		getContentPane().add(button_2);

		final JButton button_3 = new JButton();
		button_3.setText("猫粮");
		button_3.setBounds(257, 106, 120, 75);
		getContentPane().add(button_3);
	}
	
	
	
	
	
	
	

}
