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
 *	��ڽ��棬ע��  ��¼  �ο�
 */
public class Login extends JFrame{
	public Login() {
		super();
		getContentPane().setLayout(null);
		setTitle("��ҳ");
		setSize(858,700);
		final JLabel label =new JLabel();
		label.setText("糺�ɫ�Ļ���");
		label.setForeground(new Color(255, 0, 255));
		label.setFont(new Font("���Ĳ���", Font.BOLD, 42));
		label.setBounds(276, 33, 282, 112);
		getContentPane().add(label);

		final JButton button = new JButton();
		button.setFont(new Font("@�����ֺ��μ���", Font.BOLD, 22));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		button.setText("�ο�ģʽ");
		button.setBounds(341, 538, 126, 36);
		getContentPane().add(button);

		final JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				new DengLu().setVisible(true);
				setVisible(false);
			}
		});
		button_1.setFont(new Font("@�����ֺ��μ���", Font.BOLD, 22));
		button_1.setText("��¼");
		button_1.setBounds(341, 434, 126, 36);
		getContentPane().add(button_1);

		final JButton button_2 = new JButton();
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				new ZhuCe().setVisible(true);
				setVisible(false);
			}
		});
		button_2.setFont(new Font("@�����ֺ��μ���", Font.BOLD, 22));
		button_2.setText("ע��");
		button_2.setBounds(341, 485, 126, 36);
		getContentPane().add(button_2);
		setLocationRelativeTo(null);
	}

}
