package DengLu;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Object_Project.User_Login;
import Pet_JFrame.Login_JFrame;
import Service.UserHave_Service;
import Service.UserNo_Service;


public class DengLu extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPasswordField password;
	private JTextField phone;
	public DengLu() {
		super();
		setTitle("会员登录");
		getContentPane().setLayout(null);
		setSize(637,539);
		final JLabel label = new JLabel();
		label.setText("~~~主人~~~");
		label.setForeground(new Color(255, 0, 255));
		label.setFont(new Font("@华文楷体", Font.BOLD, 36));
		label.setBounds(208, 10, 202, 50);
		getContentPane().add(label);

		final JLabel label_1 = new JLabel();
		label_1.setText("~~~您来啦~~~");
		label_1.setForeground(new Color(255, 0, 255));
		label_1.setFont(new Font("Dialog", Font.BOLD, 36));
		label_1.setBounds(192, 86, 240, 50);
		getContentPane().add(label_1);
		
		final JLabel label_2 = new JLabel();
		label_2.setText("用户名：");
		label_2.setFont(new Font("", Font.BOLD, 26));
		label_2.setBounds(152, 215, 108, 50);
		getContentPane().add(label_2);

		phone = new JTextField();
		phone.setFont(new Font("", Font.BOLD, 26));
		phone.setBounds(306, 219, 180, 44);
		getContentPane().add(phone);

		final JLabel label_2_1 = new JLabel();
		label_2_1.setText("密   码：");
		label_2_1.setFont(new Font("Dialog", Font.BOLD, 26));
		label_2_1.setBounds(152, 273, 108, 50);
		getContentPane().add(label_2_1);

		password = new JPasswordField();
		password.setFont(new Font("", Font.BOLD, 26));
		password.setBounds(306, 281, 177, 44);
		getContentPane().add(password);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					UserHave_Service uhs = new UserHave_Service();
					UserNo_Service uns = new UserNo_Service();
					String phone1 = phone.getText();
					@SuppressWarnings("deprecation")
					String password1 = password.getText();
					if(phone1.equals("")||phone1==null){
						throw new RuntimeException("请输入登录名(您的手机号)");
					}
					if(password1.equals("")||password1==null){
						throw new RuntimeException("请输入密码");
					}
					int no;
					no =uhs.found(phone1);
					if(no==1){
						uhs.logon(new User_Login(phone1,password1));
					}else{
						no=uns.found(phone1);
						if(no==2){
							uns.logon(new User_Login(phone1,password1));
						}else{
							throw new RuntimeException("您输入的手机号或密码错误");
						}
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					//e1.printStackTrace();
				}
			}
		});
		button.setFont(new Font("@方正粗黑宋简体", Font.BOLD, 22));
		button.setText("登录");
		button.setBounds(168, 372, 96, 41);
		getContentPane().add(button);

		final JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				setVisible(false);
				Login_JFrame l = new Login_JFrame();
				l.setVisible(true);
			}
		});
		button_1.setFont(new Font("Dialog", Font.BOLD, 22));
		button_1.setText("取消");
		button_1.setBounds(357, 372, 96, 41);
		getContentPane().add(button_1);
		setLocationRelativeTo(null);

		
	}

}
