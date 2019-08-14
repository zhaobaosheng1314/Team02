package DengLu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import Object_Project.UserHave;
import Object_Project.UserNo;
import Pet_JFrame.Login_JFrame;
import Service.UserHave_Service;

public class ZhuCe2 extends JFrame {
	private JTextField petAge;
	private JTextField petType;
	private JTextField petName;
	private UserNo userNo;
	ButtonGroup group = new ButtonGroup();

	public ZhuCe2(UserNo un) {
		this.userNo = un;
		getContentPane().setLayout(null);
		setSize(612, 506);
		final JLabel label_1 = DefaultComponentFactory.getInstance().createLabel("宠物名：");
		label_1.setFont(new Font("", Font.BOLD, 22));
		label_1.setBounds(107, 76, 92, 31);
		getContentPane().add(label_1);

		final JLabel label = DefaultComponentFactory.getInstance().createLabel("宠物类型：");
		label.setFont(new Font("", Font.BOLD, 22));
		label.setBounds(107, 142, 115, 31);
		getContentPane().add(label);

		final JLabel label_2 = DefaultComponentFactory.getInstance().createLabel("宠物年龄：");
		label_2.setFont(new Font("", Font.BOLD, 22));
		label_2.setBounds(107, 206, 115, 31);
		getContentPane().add(label_2);

		final JLabel label_3 = DefaultComponentFactory.getInstance().createLabel("宠物性别：");
		label_3.setFont(new Font("", Font.BOLD, 22));
		label_3.setBounds(107, 274, 115, 31);
		getContentPane().add(label_3);

		petName = new JTextField();
		petName.setBounds(282, 76, 115, 30);
		getContentPane().add(petName);

		petType = new JTextField();
		petType.setBounds(282, 142, 115, 30);
		getContentPane().add(petType);

		petAge = new JTextField();
		petAge.setBounds(282, 206, 115, 30);
		getContentPane().add(petAge);

		final JRadioButton radio1 = new JRadioButton();
		radio1.setFont(new Font("", Font.BOLD, 22));
		radio1.setText("小王子");
		radio1.setBounds(233, 273, 115, 32);
		group.add(radio1);
		getContentPane().add(radio1);

		final JRadioButton radio2 = new JRadioButton();
		radio2.setFont(new Font("", Font.BOLD, 22));
		radio2.setText("小公举");
		radio2.setBounds(354, 274, 106, 32);
		group.add(radio2);
		getContentPane().add(radio2);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					String petName1 = petName.getText();
					String petType1 = petType.getText();
					String petAge1 = petAge.getText();
					if (petName1.equals("") || petName1 == null) {
						throw new RuntimeException("请输入宠物名");
					}
					if (petType1.equals("") || petType1 == null) {
						throw new RuntimeException("请输入宠物类型");
					}
					if (petAge1.equals("") || petAge1 == null) {
						throw new RuntimeException("请输入宠物年龄");
					}
					if (radio1.isSelected() == false && radio2.isSelected() == false) {
						throw new RuntimeException("请选择宠物性别");
					}
					UserHave uh = null;
					if (radio1.isSelected() == true) {
						uh = new UserHave(petName1, petType1, petAge1, "王子", userNo);
					} else {
						uh = new UserHave(petName1, petType1, petAge1, "公主", userNo);
					}
					UserHave_Service uhs = new UserHave_Service();
					uhs.login(uh);
					JOptionPane.showMessageDialog(null, "注册成功");
					new Login_JFrame().setVisible(true);
					setVisible(false);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					// e1.printStackTrace();
				}
			}
		});
		button.setFont(new Font("", Font.BOLD, 22));
		button.setText("提交");
		button.setBounds(161, 357, 115, 41);
		getContentPane().add(button);

		final JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				new ZhuCe().setVisible(true);
				setVisible(false);
			}
		});
		button_1.setFont(new Font("", Font.BOLD, 22));
		button_1.setText("取消");
		button_1.setBounds(377, 357, 115, 41);
		getContentPane().add(button_1);
		setLocationRelativeTo(null);
	}

}
