package Pet_JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Object_Project.User_YouLeyuan;
import Service.Bill_Service;

public class Park_JFrame extends JFrame {
<<<<<<< HEAD
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	User_YouLeyuan user = new User_YouLeyuan();
	String sum=null;//文本框显示金额总和
	double num=0;//总金额
	private JTextField tf_money;
	
=======

	User_YouLeyuan user = new User_YouLeyuan();

	String sum = null;// 文本框显示金额总和
	double num = 0;// 总金额
	private JTextField tf_money;

>>>>>>> 80a007944e0b6b51e889fc2c724f7e1c9d9d10a4
	public Park_JFrame() {
		super();
		
		setSize(800, 474);
		setVisible(true);
		getContentPane().setLayout(null);

		final JCheckBox ckBox_yy = new JCheckBox();
		ckBox_yy.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
<<<<<<< HEAD
				
				
				user.setMoney(user.getMoney()+user.getSwimming());
				if(ckBox_yy.isSelected()==true){//显示价格
					num=num+user.getSwimming();
					sum=String.valueOf(num);
=======

				user.setMoney(user.getMoney() + user.getSwimming());
				if (ckBox_yy.isSelected() == true) {
					num = num + user.getSwimming();
					sum = String.valueOf(num);
>>>>>>> 9744c489c1102f1370a61f14616b3471bc70de14
					tf_money.setText(sum);
				} else {
					num = num - user.getSwimming();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				}
			}
		});
		ckBox_yy.setFont(new Font("", Font.BOLD, 15));
		ckBox_yy.setText("游泳  40元/小时");
		ckBox_yy.setBounds(67, 126, 152, 26);
		getContentPane().add(ckBox_yy);

		final JCheckBox ckBox_ht = new JCheckBox();
		ckBox_ht.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

<<<<<<< HEAD
				user .setMoney(user.getMoney()+user.getSlide());
				if(ckBox_ht.isSelected()==true){
					num=num+user.getSlide();
					sum=String.valueOf(num);
=======
				user.setMoney(user.getMoney() + user.getSlide());
				if (ckBox_ht.isSelected() == true) {
					num = num + user.getSlide();
					sum = String.valueOf(num);
>>>>>>> 80a007944e0b6b51e889fc2c724f7e1c9d9d10a4
					tf_money.setText(sum);
				} else {
					num = num - user.getSlide();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				}

			}
		});
		ckBox_ht.setFont(new Font("", Font.BOLD, 15));
		ckBox_ht.setText("滑梯  10元/小时");
		ckBox_ht.setBounds(316, 126, 141, 26);
		getContentPane().add(ckBox_ht);

		final JCheckBox ckBox_qq = new JCheckBox();
		ckBox_qq.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
<<<<<<< HEAD
		
				user.setMoney(user.getMoney()+user.getSwing());
				if(ckBox_qq.isSelected()==true){
					num=num+user.getSwing();
					sum=String.valueOf(num);
=======

				user.setMoney(user.getMoney() + user.getSwing());
				if (ckBox_qq.isSelected() == true) {
					num = num + user.getSwing();
					sum = String.valueOf(num);
>>>>>>> 80a007944e0b6b51e889fc2c724f7e1c9d9d10a4
					tf_money.setText(sum);
				} else {
					num = num - user.getSwing();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				}

			}
		});
		ckBox_qq.setFont(new Font("", Font.BOLD, 15));
		ckBox_qq.setText("秋千  10元/小时");
		ckBox_qq.setBounds(560, 126, 152, 26);
		getContentPane().add(ckBox_qq);

		final JCheckBox ckBox_dmq = new JCheckBox();
		ckBox_dmq.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				user.setMoney(user.getMoney() + user.getBrige());
				if (ckBox_dmq.isSelected() == true) {
					num = num + user.getBrige();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				} else {
					num = num - user.getBrige();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				}

			}
		});
		ckBox_dmq.setFont(new Font("", Font.BOLD, 15));
		ckBox_dmq.setText("独木桥  10元/小时");
		ckBox_dmq.setBounds(67, 246, 165, 26);
		getContentPane().add(ckBox_dmq);

		final JCheckBox ckBox_tq = new JCheckBox();
		ckBox_tq.setFont(new Font("", Font.BOLD, 15));
		ckBox_tq.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				user.setMoney(user.getMoney() + user.getCircle());
				if (ckBox_tq.isSelected() == true) {
					num = num + user.getCircle();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				} else {
					num = num - user.getCircle();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				}

			}
		});
		ckBox_tq.setText("跳圈  15元/小时");
		ckBox_tq.setBounds(316, 246, 141, 26);
		getContentPane().add(ckBox_tq);

		final JCheckBox ckBox_xxs = new JCheckBox();
		ckBox_xxs.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		ckBox_xxs.setFont(new Font("", Font.BOLD, 15));
		ckBox_xxs.setText("宠物休息室");
		ckBox_xxs.setBounds(568, 246, 118, 26);
		getContentPane().add(ckBox_xxs);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Bill_Service ser = new Bill_Service();
				ser.park(user);
			}
		});
		button.setFont(new Font("", Font.BOLD, 15));
		button.setText("提交");
		button.setBounds(594, 386, 106, 28);
		getContentPane().add(button);

		tf_money = new JTextField();
		tf_money.setFont(new Font("", Font.BOLD, 15));
		tf_money.setBounds(489, 386, 87, 28);
		getContentPane().add(tf_money);

		final JLabel label = new JLabel();
		label.setForeground(new Color(0, 0, 255));
		label.setFont(new Font("", Font.BOLD, 26));
		label.setText("宠物游乐园");
		label.setBounds(302, 30, 235, 53);
		getContentPane().add(label);

		final JLabel lb_show = new JLabel();
		lb_show.setFont(new Font("", Font.BOLD, 15));
		lb_show.setText("显示金额：");
		lb_show.setBounds(402, 387, 87, 26);
		getContentPane().add(lb_show);
		
	}

}
