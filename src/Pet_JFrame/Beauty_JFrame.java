package Pet_JFrame;

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
/**
 * 
 * @author lcy
 *	��������Ժ   ������
 */
public class Beauty_JFrame extends JFrame {
	
	User_MeiRong user=new User_MeiRong();
	public Beauty_JFrame() {
		super();
		setSize(600, 450);
		setVisible(true);
		getContentPane().setLayout(null);

		final JCheckBox ckBox_xz = new JCheckBox();
		ckBox_xz.setFont(new Font("", Font.BOLD, 22));
		ckBox_xz.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				
				JCheckBox checkbox=(JCheckBox)e.getSource();
				user.setMoney(user.getMoney()+user.getWashPrice());		
			}
		});
		ckBox_xz.setText("ϴ��   ����100Ԫ/��");
		ckBox_xz.setBounds(50, 61, 267, 26);
		getContentPane().add(ckBox_xz);

		final JCheckBox ckBox_jf = new JCheckBox();
		ckBox_jf.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				JCheckBox checkbox=(JCheckBox)e.getSource();
				user.setMoney(user.getMoney()+user.getCutHair());
				
			}
		});
		ckBox_jf.setFont(new Font("", Font.BOLD, 22));
		ckBox_jf.setText("����   ����100Ԫ/��");
		ckBox_jf.setBounds(50, 123, 223, 26);
		getContentPane().add(ckBox_jf);

		

		final JCheckBox ckBox_jzj = new JCheckBox();
		ckBox_jzj.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				JCheckBox checkbox=(JCheckBox)e.getSource();
				
				user.setMoney(user.getMoney()+user.getTrimx());
				
			}
		});
		ckBox_jzj.setFont(new Font("", Font.BOLD, 22));
		ckBox_jzj.setText("��ָ��   ����15Ԫ/��");
		ckBox_jzj.setBounds(50, 181, 255, 26);
		getContentPane().add(ckBox_jzj);

		final JCheckBox ckBox_xlh = new JCheckBox();
		ckBox_xlh.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				
				JCheckBox checkbox=(JCheckBox)e.getSource();
				user.setMoney(user.getMoney()+user.getWashEye());
			}
		});
		ckBox_xlh.setFont(new Font("", Font.BOLD, 22));
		ckBox_xlh.setText("ϴ���  50Ԫ/��");
		ckBox_xlh.setBounds(333, 61, 223, 26);
		getContentPane().add(ckBox_xlh);

		final JCheckBox ckBox_kmj = new JCheckBox();
		ckBox_kmj.setFont(new Font("", Font.BOLD, 22));
		ckBox_kmj.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				
				JCheckBox checkbox=(JCheckBox)e.getSource();
				user.setMoney(user.getMoney()+user.getKnot());
			}
		});
		ckBox_kmj.setText("��ë��  50Ԫ/Сʱ");
		ckBox_kmj.setBounds(333, 123, 223, 26);
		getContentPane().add(ckBox_kmj);

		final JCheckBox ckBox_sy = new JCheckBox();
		ckBox_sy.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				
				JCheckBox checkbox=(JCheckBox)e.getSource();
				user.setMoney(user.getMoney()+user.getBrushTeeth());
			}
		});
		ckBox_sy.setFont(new Font("", Font.BOLD, 22));
		ckBox_sy.setText("ˢ��  10Ԫ/��");
		ckBox_sy.setBounds(333, 185, 223, 26);
		getContentPane().add(ckBox_sy);
		
		
		
		
		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				
				Bill_Service ser=new Bill_Service();
				ser.beauty(user);
			}
		});
		button.setText("�ύ");
		button.setBounds(427, 313, 106, 28);
		getContentPane().add(button);
		
	}
	
	
	

}
