package zsdp.jframe;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class NursingFrame extends JFrame{
	public NursingFrame() {
		super();
		getContentPane().setLayout(null);

		final JCheckBox checkBox = new JCheckBox();
		checkBox.setFont(new Font("", Font.BOLD, 22));
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		checkBox.setText("≥ËŒÔ„Â‘°¬∂");
		checkBox.setBounds(124, 113, 177, 40);
		getContentPane().add(checkBox);

		final JCheckBox checkBox_1 = new JCheckBox();
		checkBox_1.setFont(new Font("Dialog", Font.BOLD, 22));
		checkBox_1.setText("π∑π∑—¿∏‡");
		checkBox_1.setBounds(124, 195, 177, 40);
		getContentPane().add(checkBox_1);

		final JCheckBox checkBox_2 = new JCheckBox();
		checkBox_2.setFont(new Font("Dialog", Font.BOLD, 22));
		checkBox_2.setText("≥ËŒÔ„Â‘°¬∂");
		checkBox_2.setBounds(124, 283, 177, 40);
		getContentPane().add(checkBox_2);

		final JCheckBox checkBox_3 = new JCheckBox();
		checkBox_3.setFont(new Font("Dialog", Font.BOLD, 22));
		checkBox_3.setText("≥ËŒÔ„Â‘°¬∂");
		checkBox_3.setBounds(124, 376, 177, 40);
		getContentPane().add(checkBox_3);

		final JCheckBox checkBox_4 = new JCheckBox();
		checkBox_4.setFont(new Font("Dialog", Font.BOLD, 22));
		checkBox_4.setText("≥ËŒÔ„Â‘°¬∂");
		checkBox_4.setBounds(404, 117, 177, 40);
		getContentPane().add(checkBox_4);

		final JCheckBox checkBox_5 = new JCheckBox();
		checkBox_5.setFont(new Font("Dialog", Font.BOLD, 22));
		checkBox_5.setText("≥ËŒÔ„Â‘°¬∂");
		checkBox_5.setBounds(404, 199, 177, 40);
		getContentPane().add(checkBox_5);

		final JCheckBox checkBox_6 = new JCheckBox();
		checkBox_6.setFont(new Font("Dialog", Font.BOLD, 22));
		checkBox_6.setText("≥ËŒÔ„Â‘°¬∂");
		checkBox_6.setBounds(404, 287, 177, 40);
		getContentPane().add(checkBox_6);

		final JCheckBox checkBox_7 = new JCheckBox();
		checkBox_7.setFont(new Font("Dialog", Font.BOLD, 22));
		checkBox_7.setText("≥ËŒÔ„Â‘°¬∂");
		checkBox_7.setBounds(404, 380, 177, 40);
		getContentPane().add(checkBox_7);

		final JButton button = new JButton();
		button.setFont(new Font("", Font.BOLD, 22));
		button.setText("º”»Îπ∫ŒÔ≥µ");
		button.setBounds(264, 479, 165, 40);
		getContentPane().add(button);
	}
	
	
	
	

}
