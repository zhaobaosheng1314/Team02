package lcx.petHospital;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

//���
public class Test extends JFrame {
	public Test() {
		super();
		setSize(new Dimension(700, 500));
		setTitle("���");
		getContentPane().setLayout(null);

		final JLabel label = new JLabel();
		label.setText("���۸�");
		label.setBounds(143, 202, 66, 18);
		getContentPane().add(label);

		final JLabel label_1 = new JLabel();
		label_1.setText("100");
		label_1.setBounds(296, 202, 66, 18);
		getContentPane().add(label_1);

		final JLabel label_2 = new JLabel();
		label_2.setText("�������һ��");
		label_2.setBounds(467, 202, 129, 18);
		getContentPane().add(label_2);
		setLocationRelativeTo(null);
	}

}
