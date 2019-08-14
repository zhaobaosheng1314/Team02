package DengLu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Object_Project.UserNo;
import Pet_JFrame.Login_JFrame;
import Service.UserNo_Service;

public class ZhuCe extends JFrame{
	private JPasswordField password;
	private JTextField address;
	private JTextField phone;
	private JTextField name;
	final JRadioButton radio_1 = new JRadioButton();
	final JRadioButton radio_2 = new JRadioButton();
	ButtonGroup group=new ButtonGroup();
	public ZhuCe() {
		super();
		getContentPane().setLayout(null);
		setSize(612,506);
		final JLabel label = new JLabel();
		label.setText("姓名：");
		label.setBounds(132, 46, 66, 18);
		getContentPane().add(label);

		name = new JTextField();
		name.setBounds(232, 44, 112, 22);
		getContentPane().add(name);

		final JLabel label_1 = new JLabel();
		label_1.setText("手机号：");
		label_1.setBounds(132, 96, 66, 18);
		getContentPane().add(label_1);

		phone = new JTextField();
		phone.setBounds(232, 94, 112, 22);
		getContentPane().add(phone);

		final JLabel label_2 = new JLabel();
		label_2.setText("密码：");
		label_2.setBounds(132, 142, 66, 18);
		getContentPane().add(label_2);

		password = new JPasswordField();
		password.setBounds(232, 140, 112, 22);
		getContentPane().add(password);

		final JLabel label_3 = new JLabel();
		label_3.setText("地址：");
		label_3.setBounds(132, 187, 66, 18);
		getContentPane().add(label_3);

		address = new JTextField();
		address.setBounds(232, 185, 112, 22);
		getContentPane().add(address);

		final JLabel label_4 = new JLabel();
		label_4.setText("爱宠：");
		label_4.setBounds(132, 241, 66, 18);
		getContentPane().add(label_4);

		
		radio_1.setText("已有");
		radio_1.setBounds(232, 237, 66, 26);
		getContentPane().add(radio_1);
		group.add(radio_1);
		
		radio_2.setText("没有");
		radio_2.setBounds(346, 237, 66, 26);
		getContentPane().add(radio_2);
		group.add(radio_2);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					String name1 =name.getText();
					String phone1 =phone.getText();
					String password1 =password.getText();
					String address1 =address.getText();
					if(name1.equals("")||name1==null){
						throw new RuntimeException("请输入姓名");
					}
					if(phone1.equals("")||phone1==null){
						throw new RuntimeException("请输入手机号");
					}
					if(password1.equals("")||password1==null){
						throw new RuntimeException("请输入密码");
					}
					if(address1.equals("")||address1==null){
						throw new RuntimeException("请输入地址");
					}
					if(radio_1.isSelected()==false&&radio_2.isSelected()==false){
						throw new RuntimeException("您是否有爱宠呢~~~");
					}
					UserNo un =new UserNo(name1,password1,phone1,address1);
					if(radio_1.isSelected()==true){
						ZhuCe2 zc2 = new ZhuCe2(un);
						zc2.setVisible(true);
						setVisible(false);
					}else if(radio_2.isSelected()==true){
						UserNo_Service uns = new UserNo_Service();
						uns.login(un);
						JOptionPane.showMessageDialog(null, "注册成功");
						DengLu dl = new DengLu();
						dl.setVisible(true);
						new Login_JFrame().setVisible(true);
						setVisible(false);
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					//e1.printStackTrace();
				}
			}
		});
		button.setText("下一步");
		button.setBounds(157, 322, 106, 28);
		getContentPane().add(button);

		final JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				new Login_JFrame().setVisible(true);
				setVisible(false);
			}
		});
		button_1.setText("取消");
		button_1.setBounds(343, 322, 106, 28);
		getContentPane().add(button_1);
		
		
		
		setLocationRelativeTo(null);
	}

}
