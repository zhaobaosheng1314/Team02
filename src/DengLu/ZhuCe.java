package DengLu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ZhuCe extends JFrame{
	private JPasswordField password;
	private JTextField address;
	private JTextField phone;
	private JTextField name;
	final JRadioButton radio_1 = new JRadioButton();
	final JRadioButton radio_2 = new JRadioButton();
	public ZhuCe() {
		super();
		getContentPane().setLayout(null);
		setSize(612,506);
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
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if(radio_1.isSelected()==false&&radio_2.isSelected()==false){
					throw new RuntimeException("��ѡ��");
				}
				if(radio_1.isSelected()==true){
					
				}else if(radio_2.isSelected()==true){
					
				}
			}
		});
		button.setText("��һ��");
		button.setBounds(157, 322, 106, 28);
		getContentPane().add(button);

		final JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				new Login().setVisible(true);
				setVisible(false);
			}
		});
		button_1.setText("ȡ��");
		button_1.setBounds(343, 322, 106, 28);
		getContentPane().add(button_1);

		
		radio_1.setText("����");
		radio_1.setBounds(232, 237, 66, 26);
		getContentPane().add(radio_1);
		
		radio_2.setText("û��");
		radio_2.setBounds(346, 237, 66, 26);
		getContentPane().add(radio_2);
		
		ButtonGroup group=new ButtonGroup();
		group.add(radio_1);
		group.add(radio_2);
		
		setLocationRelativeTo(null);

		name = new JTextField();
		name.setBounds(232, 44, 112, 22);
		getContentPane().add(name);

		phone = new JTextField();
		phone.setBounds(232, 94, 112, 22);
		getContentPane().add(phone);

		address = new JTextField();
		address.setBounds(232, 185, 112, 22);
		getContentPane().add(address);

		password = new JPasswordField();
		password.setBounds(232, 140, 112, 22);
		getContentPane().add(password);
	}

}
