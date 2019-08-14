package QOP;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ZhuCe extends JFrame{
	public ZhuCe() {
		super();
		getContentPane().setLayout(null);

		final JLabel label = new JLabel();
		label.setText("姓名：");
		label.setBounds(132, 46, 66, 18);
		getContentPane().add(label);

		final JLabel label_1 = new JLabel();
		label_1.setText("手机号：");
		label_1.setBounds(132, 96, 66, 18);
		getContentPane().add(label_1);

		final JLabel label_2 = new JLabel();
		label_2.setText("密码：");
		label_2.setBounds(132, 142, 66, 18);
		getContentPane().add(label_2);

		final JLabel label_3 = new JLabel();
		label_3.setText("地址：");
		label_3.setBounds(132, 187, 66, 18);
		getContentPane().add(label_3);

		final JLabel label_4 = new JLabel();
		label_4.setText("爱宠：");
		label_4.setBounds(132, 241, 66, 18);
		getContentPane().add(label_4);

		final JButton button = new JButton();
		button.setText("下一步");
		button.setBounds(157, 322, 106, 28);
		getContentPane().add(button);

		final JButton button_1 = new JButton();
		button_1.setText("取消");
		button_1.setBounds(444, 322, 106, 28);
		getContentPane().add(button_1);
	}

}
