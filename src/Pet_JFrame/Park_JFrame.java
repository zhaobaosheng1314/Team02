package Pet_JFrame;

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

	User_YouLeyuan user = new User_YouLeyuan();

	String sum = null;// 文本框显示金额总和
	double num = 0;// 总金额
	private JTextField tf_money;

	public Park_JFrame() {
		super();
		setSize(600, 450);
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
		ckBox_yy.setBounds(26, 32, 152, 26);
		getContentPane().add(ckBox_yy);

		final JCheckBox ckBox_ht = new JCheckBox();
		ckBox_ht.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				user.setMoney(user.getMoney() + user.getSlide());
				if (ckBox_ht.isSelected() == true) {
					num = num + user.getSlide();
					sum = String.valueOf(num);
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
		ckBox_ht.setBounds(197, 32, 141, 26);
		getContentPane().add(ckBox_ht);

		final JCheckBox ckBox_qq = new JCheckBox();
		ckBox_qq.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				user.setMoney(user.getMoney() + user.getSwing());
				if (ckBox_qq.isSelected() == true) {
					num = num + user.getSwing();
					sum = String.valueOf(num);
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
		ckBox_qq.setBounds(366, 32, 152, 26);
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
		ckBox_dmq.setBounds(26, 181, 165, 26);
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
		ckBox_tq.setBounds(197, 182, 141, 26);
		getContentPane().add(ckBox_tq);

		final JCheckBox ckBox_xxs = new JCheckBox();
		ckBox_xxs.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		ckBox_xxs.setFont(new Font("", Font.BOLD, 15));
		ckBox_xxs.setText("宠物休息室");
		ckBox_xxs.setBounds(366, 181, 118, 26);
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
		button.setBounds(428, 347, 106, 28);
		getContentPane().add(button);

		tf_money = new JTextField();
		tf_money.setFont(new Font("", Font.BOLD, 15));
		tf_money.setBounds(279, 347, 87, 28);
		getContentPane().add(tf_money);
	}

}
