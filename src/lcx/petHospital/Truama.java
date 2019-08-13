package lcx.petHospital;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
//外伤
public class Truama extends JFrame {
	public Truama() {
		super();
		getContentPane().setLayout(null);
		setTitle("外伤");
		setSize(new Dimension(700, 500));

		final JLabel label = new JLabel();
		label.setText("外伤价格");
		label.setBounds(166, 194, 66, 18);
		getContentPane().add(label);

		final JLabel label_1 = new JLabel();
		label_1.setText("300");
		label_1.setBounds(343, 194, 66, 18);
		getContentPane().add(label_1);
		setLocationRelativeTo(null);
		
	}

}
