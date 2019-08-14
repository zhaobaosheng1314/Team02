package DengLu;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * 
 * zbs	
 *	入口界面，注册  登录  游客
 */
public class Login extends JFrame{
	public Login() {
		super();
		getContentPane().setLayout(null);
		setTitle("首页");
		setSize(858,700);
		final JLabel label =new JLabel();
		label.setText("绯红色的回忆");
		label.setForeground(new Color(255, 0, 255));
		label.setFont(new Font("华文彩云", Font.BOLD, 42));
		label.setBounds(276, 33, 282, 112);
		getContentPane().add(label);

		final JButton button = new JButton();
		button.setFont(new Font("@方正粗黑宋简体", Font.BOLD, 22));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		button.setText("游客模式");
		button.setBounds(341, 538, 126, 36);
		getContentPane().add(button);

		final JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				new DengLu().setVisible(true);
				setVisible(false);
			}
		});
		button_1.setFont(new Font("@方正粗黑宋简体", Font.BOLD, 22));
		button_1.setText("登录");
		button_1.setBounds(341, 434, 126, 36);
		getContentPane().add(button_1);

		final JButton button_2 = new JButton();
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				new ZhuCe().setVisible(true);
				setVisible(false);
			}
		});
		button_2.setFont(new Font("@方正粗黑宋简体", Font.BOLD, 22));
		button_2.setText("注册");
		button_2.setBounds(341, 485, 126, 36);
		getContentPane().add(button_2);
		setLocationRelativeTo(null);
	}

}
