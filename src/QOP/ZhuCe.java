package QOP;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ZhuCe extends JFrame{
	public ZhuCe() {
		super();
		getContentPane().setLayout(null);

		final JLabel label = new JLabel();
		label.setText("������");
		label.setBounds(132, 46, 66, 18);
		getContentPane().add(label);

		final JLabel label_1 = new JLabel();
		label_1.setText("�ֻ��ţ�");
		label_1.setBounds(132, 96, 66, 18);
		getContentPane().add(label_1);

		final JLabel label_2 = new JLabel();
		label_2.setText("���룺");
		label_2.setBounds(132, 142, 66, 18);
		getContentPane().add(label_2);

		final JLabel label_3 = new JLabel();
		label_3.setText("��ַ��");
		label_3.setBounds(132, 187, 66, 18);
		getContentPane().add(label_3);

		final JLabel label_4 = new JLabel();
		label_4.setText("���裺");
		label_4.setBounds(132, 241, 66, 18);
		getContentPane().add(label_4);

		final JButton button = new JButton();
		button.setText("��һ��");
		button.setBounds(157, 322, 106, 28);
		getContentPane().add(button);

		final JButton button_1 = new JButton();
		button_1.setText("ȡ��");
		button_1.setBounds(444, 322, 106, 28);
		getContentPane().add(button_1);
	}

}
