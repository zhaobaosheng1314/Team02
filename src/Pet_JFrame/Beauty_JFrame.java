package Pet_JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Object_Project.User_MeiRong;
import Service.Bill_Service;
import sun.java2d.pipe.DrawImage;
import sun.java2d.pipe.DrawImagePipe;

/**
 * 
 * @author lcy ��������Ժ ������
 */
public class Beauty_JFrame extends JFrame {

	private JTextField tf_money;
	User_MeiRong user = new User_MeiRong();

	String sum = null;// �ı�����ʾ����ܺ�
	double num = 0;// �ܽ��

	public Beauty_JFrame() {
		super();
		setSize(810, 480);
		setVisible(true);
		getContentPane().setLayout(null);

		final JCheckBox ckBox_xz = new JCheckBox();
		ckBox_xz.setFont(new Font("", Font.BOLD, 22));
		ckBox_xz.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				user.setMoney(user.getMoney() + user.getWashPrice());
				if (ckBox_xz.isSelected() == true) {
					num = num + user.getWashPrice();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				} else {
					num = num - user.getWashPrice();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				}

			}
		});
		ckBox_xz.setText("ϴ��   ����100Ԫ/��");
		ckBox_xz.setBounds(107, 125, 267, 26);
		getContentPane().add(ckBox_xz);

		final JCheckBox ckBox_jf = new JCheckBox();
		ckBox_jf.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				user.setMoney(user.getMoney() + user.getCutHair());
				if (ckBox_jf.isSelected() == true) {
					num = num + user.getCutHair();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				} else {
					num = num - user.getCutHair();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				}

			}
		});
		ckBox_jf.setFont(new Font("", Font.BOLD, 22));
		ckBox_jf.setText("����   ����100Ԫ/��");
		ckBox_jf.setBounds(107, 190, 223, 26);
		getContentPane().add(ckBox_jf);

		final JCheckBox ckBox_jzj = new JCheckBox();
		ckBox_jzj.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				user.setMoney(user.getMoney() + user.getTrimx());
				if (ckBox_jzj.isSelected() == true) {
					num = num + user.getTrimx();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				} else {
					num = num - user.getTrimx();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				}

			}
		});
		ckBox_jzj.setFont(new Font("", Font.BOLD, 22));
		ckBox_jzj.setText("��ָ��   ����15Ԫ/��");
		ckBox_jzj.setBounds(107, 268, 255, 26);
		getContentPane().add(ckBox_jzj);

		final JCheckBox ckBox_xlh = new JCheckBox();
		ckBox_xlh.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				user.setMoney(user.getMoney() + user.getWashEye());
				if (ckBox_xlh.isSelected() == true) {
					num = num + user.getWashEye();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				} else {
					num = num - user.getWashEye();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				}

			}
		});
		ckBox_xlh.setFont(new Font("", Font.BOLD, 22));
		ckBox_xlh.setText("ϴ���  50Ԫ/��");
		ckBox_xlh.setBounds(491, 125, 223, 26);
		getContentPane().add(ckBox_xlh);

		final JCheckBox ckBox_kmj = new JCheckBox();
		ckBox_kmj.setFont(new Font("", Font.BOLD, 22));
		ckBox_kmj.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				user.setMoney(user.getMoney() + user.getKnot());
				if (ckBox_kmj.isSelected() == true) {
					num = num + user.getKnot();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				} else {
					num = num - user.getKnot();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				}

			}
		});
		ckBox_kmj.setText("��ë��  50Ԫ/Сʱ");
		ckBox_kmj.setBounds(491, 190, 223, 26);
		getContentPane().add(ckBox_kmj);

		final JCheckBox ckBox_sy = new JCheckBox();
		ckBox_sy.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				user.setMoney(user.getMoney() + user.getBrushTeeth());
				if (ckBox_sy.isSelected() == true) {
					num = num + user.getBrushTeeth();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				} else {
					num = num - user.getBrushTeeth();
					sum = String.valueOf(num);
					tf_money.setText(sum);
				}

			}
		});
		ckBox_sy.setFont(new Font("", Font.BOLD, 22));
		ckBox_sy.setText("ˢ��  10Ԫ/��");
		ckBox_sy.setBounds(491, 268, 223, 26);
		getContentPane().add(ckBox_sy);

		final JButton button = new JButton();
		button.setFont(new Font("", Font.BOLD, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				Bill_Service ser = new Bill_Service();
				ser.beauty(user);
			}
		});
		button.setText("�ύ");
		button.setBounds(631, 357, 106, 28);
		getContentPane().add(button);

		tf_money = new JTextField();
		tf_money.setFont(new Font("", Font.BOLD, 15));
		tf_money.setBounds(508, 358, 95, 25);
		getContentPane().add(tf_money);

<<<<<<< HEAD
		final JLabel lb_titile = new JLabel();
		lb_titile.setForeground(new Color(255, 0, 255));
		lb_titile.setFont(new Font("", Font.BOLD, 26));
		lb_titile.setText("��������Ժ��ӭ���ĵ���");
		lb_titile.setBounds(234, 29, 352, 47);
		getContentPane().add(lb_titile);

		final JLabel lb_show = new JLabel();
		lb_show.setFont(new Font("", Font.BOLD, 15));
		lb_show.setText("��ʾ���:");
		lb_show.setBounds(414, 359, 88, 24);
		getContentPane().add(lb_show);
		
		
		
=======
>>>>>>> 80a007944e0b6b51e889fc2c724f7e1c9d9d10a4
	}

}
