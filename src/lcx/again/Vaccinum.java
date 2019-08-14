package lcx.again;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Hospital.Hospital;
import Service.HospitalService;

public class Vaccinum extends JFrame {

	Hospital hos = new Hospital();
	private JTextField text_sum;
	// �ܽ��
	double sum = 0;
	// �ı����ܽ��
	String sum1 = null;
	// Ȯ��������
	int quan = 0;
	// ��������
	int san = 0;
	// ��������
	int wu = 0;
	// ��Ȯ������
	int kuang = 0;
	// è����
	int mao = 0;
	// ����
	int zhu = 0;
	// ����
	int wai = 0;
	// ���
	int ti = 0;

	public Vaccinum() {
		super();
		getContentPane().setFont(new Font("", Font.PLAIN, 8));
		setTitle("����");
		getContentPane().setLayout(null);
		setSize(new Dimension(660, 500));

		final JLabel label = new JLabel();
		label.setText("����۸�:");
		label.setBounds(33, 59, 66, 18);
		getContentPane().add(label);

		final JLabel label_2 = new JLabel();
		label_2.setText("100Ԫ");
		label_2.setBounds(157, 103, 66, 18);
		getContentPane().add(label_2);

		final JLabel label_4 = new JLabel();
		label_4.setText("50Ԫ");
		label_4.setBounds(157, 146, 66, 18);
		getContentPane().add(label_4);

		final JLabel label_6 = new JLabel();
		label_6.setText("50Ԫ");
		label_6.setBounds(157, 191, 66, 18);
		getContentPane().add(label_6);

		final JLabel label_8 = new JLabel();
		label_8.setText("100Ԫ");
		label_8.setBounds(157, 238, 66, 18);
		getContentPane().add(label_8);

		final JLabel label_9 = new JLabel();
		label_9.setText("120Ԫ");
		label_9.setBounds(157, 279, 66, 18);
		getContentPane().add(label_9);
		setLocationRelativeTo(null);

		final JCheckBox checkBox_quan = new JCheckBox();
		checkBox_quan.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				hos.setMoney(hos.getMoney() + hos.getQuan());
				if (checkBox_quan.isSelected() == true) {

					sum = sum + hos.getQuan();
					sum1 = String.valueOf(sum);
					text_sum.setText(sum1);
				} else {
					sum = sum - hos.getQuan();

					sum1 = String.valueOf(sum);
					text_sum.setText(sum1);

				}
			}
		});
		checkBox_quan.setText("Ȯ�������� ");
		checkBox_quan.setBounds(33, 99, 118, 26);
		getContentPane().add(checkBox_quan);

		final JCheckBox checkBox_san = new JCheckBox();
		checkBox_san.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				hos.setMoney(hos.getMoney() + hos.getSan());
				if (checkBox_san.isSelected() == true) {

					sum = sum + hos.getSan();
					sum1 = String.valueOf(sum);
					text_sum.setText(sum1);
				} else {
					sum = sum - hos.getSan();
					sum1 = String.valueOf(sum);
					text_sum.setText(sum1);

				}
			}
		});
		checkBox_san.setText("��������");
		checkBox_san.setBounds(33, 142, 118, 26);
		getContentPane().add(checkBox_san);

		final JCheckBox checkBox_wu = new JCheckBox();
		checkBox_wu.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				hos.setMoney(hos.getMoney() + hos.getWu());
				if (checkBox_wu.isSelected() == true) {
					sum = sum + hos.getWu();
					sum1 = String.valueOf(sum);
					text_sum.setText(sum1);
				} else {
					sum = sum - hos.getWu();
					sum1 = String.valueOf(sum);
					text_sum.setText(sum1);

				}

			}
		});
		checkBox_wu.setText("��������");
		checkBox_wu.setBounds(33, 187, 118, 26);
		getContentPane().add(checkBox_wu);

		final JCheckBox checkBox_kuang = new JCheckBox();
		checkBox_kuang.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				hos.setMoney(hos.getMoney() + hos.getKuang());
				if (checkBox_kuang.isSelected() == true) {
					sum = sum + hos.getKuang();
					sum1 = String.valueOf(sum);
					text_sum.setText(sum1);
				} else {
					sum = sum - hos.getKuang();
					sum1 = String.valueOf(sum);
					text_sum.setText(sum1);

				}
			}
		});
		checkBox_kuang.setText("��Ȯ������");
		checkBox_kuang.setBounds(33, 234, 118, 26);
		getContentPane().add(checkBox_kuang);

		final JCheckBox checkBox_mao = new JCheckBox();
		checkBox_mao.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				hos.setMoney(hos.getMoney() + hos.getMao());
				if (checkBox_mao.isSelected() == true) {
					sum = sum + hos.getMao();
					sum1 = String.valueOf(sum);
					text_sum.setText(sum1);
				} else {
					sum = sum - hos.getMao();
					sum1 = String.valueOf(sum);
					text_sum.setText(sum1);

				}
			}
		});
		checkBox_mao.setText("è����");
		checkBox_mao.setBounds(33, 275, 118, 26);
		getContentPane().add(checkBox_mao);

		final JLabel label_1 = new JLabel();
		label_1.setText("����۸�:");
		label_1.setBounds(261, 59, 66, 18);
		getContentPane().add(label_1);

		final JLabel label_3 = new JLabel();
		label_3.setText("300Ԫ        ");
		label_3.setBounds(385, 103, 215, 18);
		getContentPane().add(label_3);

		final JCheckBox checkBox_zhu = new JCheckBox();
		checkBox_zhu.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				hos.setMoney(hos.getMoney() + hos.getZhu());
				if (checkBox_zhu.isSelected() == true) {
					sum = sum + hos.getZhu();
					sum1 = String.valueOf(sum);
					text_sum.setText(sum1);
				} else {
					sum = sum - hos.getZhu();
					sum1 = String.valueOf(sum);
					text_sum.setText(sum1);

				}

			}
		});
		checkBox_zhu.setText("����");
		checkBox_zhu.setBounds(261, 99, 118, 26);
		getContentPane().add(checkBox_zhu);

		final JLabel label_5 = new JLabel();
		label_5.setText("���˼۸�:");
		label_5.setBounds(261, 146, 66, 18);
		getContentPane().add(label_5);

		final JCheckBox checkBox_wai = new JCheckBox();
		checkBox_wai.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				hos.setMoney(hos.getMoney() + hos.getWai());
				if (checkBox_wai.isSelected() == true) {
					sum = sum + hos.getWai();
					sum1 = String.valueOf(sum);
					text_sum.setText(sum1);
				} else {
					sum = sum - hos.getWai();
					sum1 = String.valueOf(sum);
					text_sum.setText(sum1);

				}
			}
		});
		checkBox_wai.setText("����");
		checkBox_wai.setBounds(261, 187, 118, 26);
		getContentPane().add(checkBox_wai);

		final JLabel label_7 = new JLabel();
		label_7.setText("200Ԫ");
		label_7.setBounds(385, 191, 66, 18);
		getContentPane().add(label_7);

		final JLabel label_11 = new JLabel();
		label_11.setText("���۸�:");
		label_11.setBounds(261, 238, 66, 18);
		getContentPane().add(label_11);

		final JCheckBox checkBox_ti = new JCheckBox();
		checkBox_ti.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				hos.setMoney(hos.getMoney() + hos.getTi());
				if (checkBox_ti.isSelected() == true) {
					sum = sum + hos.getTi();
					sum1 = String.valueOf(sum);
					text_sum.setText(sum1);
				} else {
					sum = sum - hos.getTi();
					sum1 = String.valueOf(sum);
					text_sum.setText(sum1);

				}
			}
		});
		checkBox_ti.setText("���");
		checkBox_ti.setBounds(261, 275, 118, 26);
		getContentPane().add(checkBox_ti);

		final JLabel label_12 = new JLabel();
		label_12.setText("100Ԫ");
		label_12.setBounds(385, 279, 66, 18);
		getContentPane().add(label_12);

		final JLabel label_13 = new JLabel();
		label_13.setText("�ܽ��");
		label_13.setBounds(33, 366, 66, 18);
		getContentPane().add(label_13);

		text_sum = new JTextField();
		text_sum.setBounds(136, 364, 87, 22);
		getContentPane().add(text_sum);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "ȷ��֧����");
				// service ��
				HospitalService serv = new HospitalService();
				serv.ser(hos);
				JOptionPane.showMessageDialog(null, "����ɹ�");

			}
		});
		button.setText("ȷ��֧��");
		button.setBounds(306, 361, 106, 28);
		getContentPane().add(button);

		final JLabel label_14 = new JLabel();
		label_14.setText("�������һ��");
		label_14.setBounds(457, 279, 143, 18);
		getContentPane().add(label_14);

		final JLabel label_15 = new JLabel();
		label_15.setText("��ӭ��������ҽԺ");
		label_15.setBounds(244, 21, 356, 18);
		getContentPane().add(label_15);
	}

}
