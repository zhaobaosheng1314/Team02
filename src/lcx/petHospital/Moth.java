package lcx.petHospital;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

//����
public class Moth extends JFrame {
	public Moth() {
		super();
		getContentPane().setLayout(null);
		setSize(new Dimension(700, 500));
		setTitle("����");

		final JLabel label = new JLabel();
		label.setText("����۸�");
		label.setBounds(153, 186, 66, 18);
		getContentPane().add(label);

		final JLabel label_1 = new JLabel();
		label_1.setText("500");
		label_1.setBounds(292, 186, 66, 18);
		getContentPane().add(label_1);

		final JLabel label_2 = new JLabel();
		label_2.setText("����һ����һ��");
		label_2.setBounds(417, 186, 103, 18);
		getContentPane().add(label_2);
		setLocationRelativeTo(null);
	}

}
