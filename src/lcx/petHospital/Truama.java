package lcx.petHospital;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
//����
public class Truama extends JFrame {
	public Truama() {
		super();
		getContentPane().setLayout(null);
		setTitle("����");
		setSize(new Dimension(700, 500));

		final JLabel label = new JLabel();
		label.setText("���˼۸�");
		label.setBounds(166, 194, 66, 18);
		getContentPane().add(label);

		final JLabel label_1 = new JLabel();
		label_1.setText("300");
		label_1.setBounds(343, 194, 66, 18);
		getContentPane().add(label_1);
		setLocationRelativeTo(null);
		
	}

}
