package lcx.petHospital;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Vaccinum extends JFrame {
	public Vaccinum() {
		super();
		setTitle("ÒßÃç");
		getContentPane().setLayout(null);
		setSize(new Dimension(700, 500));

		final JLabel label = new JLabel();
		label.setText("ÒßÃç¼Û¸ñ:");
		label.setBounds(74, 54, 66, 18);
		getContentPane().add(label);

		final JLabel label_1 = new JLabel();
		label_1.setText("È®ÁùÁªÒßÃç ");
		label_1.setBounds(74, 103, 291, 18);
		getContentPane().add(label_1);

		final JLabel label_2 = new JLabel();
		label_2.setText("100");
		label_2.setBounds(201, 103, 66, 18);
		getContentPane().add(label_2);

		final JLabel label_3 = new JLabel();
		label_3.setText("ÈýÁªÒßÃç");
		label_3.setBounds(74, 146, 66, 18);
		getContentPane().add(label_3);

		final JLabel label_4 = new JLabel();
		label_4.setText("50");
		label_4.setBounds(201, 146, 66, 18);
		getContentPane().add(label_4);

		final JLabel label_5 = new JLabel();
		label_5.setText("ÎåÁªÒßÃç");
		label_5.setBounds(74, 191, 66, 18);
		getContentPane().add(label_5);

		final JLabel label_6 = new JLabel();
		label_6.setText("50");
		label_6.setBounds(201, 191, 66, 18);
		getContentPane().add(label_6);

		final JLabel label_7 = new JLabel();
		label_7.setText("¿ñÈ®²¡ÒßÃç");
		label_7.setBounds(74, 238, 66, 18);
		getContentPane().add(label_7);

		final JLabel label_8 = new JLabel();
		label_8.setText("100");
		label_8.setBounds(201, 238, 66, 18);
		getContentPane().add(label_8);

		final JLabel label_9 = new JLabel();
		label_9.setText("120");
		label_9.setBounds(201, 279, 66, 18);
		getContentPane().add(label_9);

		final JLabel label_10 = new JLabel();
		label_10.setText("190");
		label_10.setBounds(201, 317, 66, 18);
		getContentPane().add(label_10);

		final JLabel label_11 = new JLabel();
		label_11.setText("Ã¨ÈýÁª");
		label_11.setBounds(74, 279, 66, 18);
		getContentPane().add(label_11);

		final JLabel label_12 = new JLabel();
		label_12.setText("ÃîÈý¶à");
		label_12.setBounds(74, 317, 66, 18);
		getContentPane().add(label_12);
		setLocationRelativeTo(null);
	}

}
