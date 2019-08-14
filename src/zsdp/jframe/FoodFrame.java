package zsdp.jframe;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * 宠物食品
 * @author admin
 *
 */

public class FoodFrame extends JFrame{
	public FoodFrame() {
		super();
		getContentPane().setLayout(null);
		setTitle("宠物食品");

		final JButton button_2 = new JButton();
		button_2.setText("返回>");
		button_2.setBounds(10, 24, 78, 34);
		getContentPane().add(button_2);

		final JCheckBox checkBox = new JCheckBox();
		checkBox.setFont(new Font("", Font.BOLD, 22));
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				
				
				
				
			}
		});
		checkBox.setText("狗粮肉粒拌饭(1kg)  ¥29.9");
		checkBox.setBounds(116, 108, 293, 34);
		getContentPane().add(checkBox);

		final JCheckBox checkBox_1 = new JCheckBox();
		checkBox_1.setFont(new Font("", Font.BOLD, 22));
		checkBox_1.setText("鱼肉味猫粮(500g)  ¥19.8");
		checkBox_1.setBounds(499, 108, 293, 34);
		getContentPane().add(checkBox_1);

		final JCheckBox checkBox_2 = new JCheckBox();
		checkBox_2.setFont(new Font("", Font.BOLD, 22));
		checkBox_2.setText("狗粮饼干(400g)  ¥13.9");
		checkBox_2.setBounds(116, 207, 293, 34);
		getContentPane().add(checkBox_2);

		final JCheckBox checkBox_3 = new JCheckBox();
		checkBox_3.setFont(new Font("", Font.BOLD, 22));
		checkBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		checkBox_3.setText("宠物火腿(450g)  ¥18");
		checkBox_3.setBounds(116, 317, 293, 34);
		getContentPane().add(checkBox_3);

		final JCheckBox checkBox_4 = new JCheckBox();
		checkBox_4.setFont(new Font("", Font.BOLD, 22));
		checkBox_4.setText("鱼肉味猫粮(2kg)   ¥68");
		checkBox_4.setBounds(499, 207, 293, 34);
		getContentPane().add(checkBox_4);

		final JCheckBox checkBox_5 = new JCheckBox();
		checkBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		checkBox_5.setFont(new Font("", Font.BOLD, 22));
		checkBox_5.setText("水晶鸡肉(420g)  ¥26.8");
		checkBox_5.setBounds(499, 317, 293, 34);
		getContentPane().add(checkBox_5);

		final JCheckBox checkBox_5_1 = new JCheckBox();
		checkBox_5_1.setFont(new Font("", Font.BOLD, 22));
		checkBox_5_1.setText("小鱼干(800g)  ¥35.9");
		checkBox_5_1.setBounds(116, 415, 293, 34);
		getContentPane().add(checkBox_5_1);

		final JCheckBox checkBox_5_2 = new JCheckBox();
		checkBox_5_2.setFont(new Font("", Font.BOLD, 22));
		checkBox_5_2.setText("狗粮牛肉干(500g)  ¥32");
		checkBox_5_2.setBounds(499, 415, 293, 34);
		getContentPane().add(checkBox_5_2);

		final JButton button = new JButton();
		button.setFont(new Font("", Font.BOLD, 22));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		button.setText("加入购物车");
		button.setBounds(347, 536, 174, 43);
		getContentPane().add(button);
	}
	
	
	
	
	
	
	

}
