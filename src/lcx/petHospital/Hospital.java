package lcx.petHospital;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Hospital extends JFrame {
	public Hospital() {
		super();
		setSize(new Dimension(700, 500));
		getContentPane().setLayout(null);

		final JLabel label = new JLabel();
		label.setText("宠物医院");
		label.setBounds(289, 28, 66, 18);
		getContentPane().add(label);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				
				Vaccinum vaccinum=new Vaccinum();
				vaccinum.setVisible(true);
			}
		});
		button.setText("疫苗");
		button.setBounds(268, 105, 106, 28);
		getContentPane().add(button);

		final JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Truama truama=new Truama();
				truama.setVisible(true);
			}
		});
		button_1.setText("外伤");
		button_1.setBounds(268, 157, 106, 28);
		getContentPane().add(button_1);

		final JButton button_2 = new JButton();
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Moth moth =new Moth();
				moth.setVisible(true);
			}
		});
		button_2.setText("驱虫");
		button_2.setBounds(268, 221, 106, 28);
		getContentPane().add(button_2);

		final JButton button_3 = new JButton();
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Test test=new Test();
				test.setVisible(true);
			}
		});
		button_3.setText("体检");
		button_3.setBounds(268, 286, 106, 28);
		getContentPane().add(button_3);

		final JButton button_4 = new JButton();
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				
			}
		});
		button_4.setText("显示总金额");
		button_4.setBounds(121, 348, 106, 28);
		getContentPane().add(button_4);

		final JButton button_5 = new JButton();
		button_5.setText("确认");
		button_5.setBounds(441, 348, 106, 28);
		getContentPane().add(button_5);

		final JLabel label_1 = new JLabel();
		label_1.setText("欢迎来到宠物医院");
		label_1.setBounds(268, 62, 160, 28);
		getContentPane().add(label_1);

		final JLabel label_2 = new JLabel();
		label_2.setText("收费标准");
		label_2.setBounds(269, 403, 66, 18);
		getContentPane().add(label_2);

		final JLabel label_3 = new JLabel();
		label_3.setText("项目/次");
		label_3.setBounds(341, 403, 66, 18);
		getContentPane().add(label_3);
	}

}
