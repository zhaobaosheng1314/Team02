package Pet_JFrame;

/**
 * �Ž���
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import zjx_shoppingview.ShopCarView;
import Object_Project.PetAll;
import Service.PetAll_Service;

public class Shopping_JFrame extends JFrame {
	PetAll_Service service = new PetAll_Service();
	DefaultTableModel def = new DefaultTableModel();// ����ģ��
	String petnm = null;
	boolean x = false;
	private JTextField text_seek;
	private JTable table;

	public Shopping_JFrame() {
		super();
		setSize(591, 428);
		setTitle("�����̳�");

		final JPanel panel = new JPanel();
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setHgap(0);
		panel.setLayout(flowLayout);
		getContentPane().add(panel, BorderLayout.NORTH);

		final JButton button_2 = new JButton();
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// �鿴ȫ�������ݿ�

				// ��ѡ��
				table.getColumnModel().getColumn(10).setCellRenderer(new TableCellRenderer() {
					public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
							boolean hasFocus, int row, int column) {
						JCheckBox ck = new JCheckBox();
						ck.setSelected(isSelected);// ѡ�е�ǰ����
						ck.setOpaque(true);// ͸����
						ck.setHorizontalAlignment((int) 0.5f);// ���Ҷ���
						return ck;
					}
				}); // ��ѡ��

				int count = def.getRowCount();
				for (int i = 0; i < count; i++) {
					def.removeRow(0);
				}
				try {
					ArrayList<PetAll> list = service.petAllService();// ��service��ļ��ϴ�����
					for (PetAll petall : list) {
						def.addRow(new Object[] { petall.getPetname(), petall.getPettype(), petall.getPetsex(),
								petall.getPetage(), petall.getWeight(), petall.getPetprice(), petall.getPetshape(),
								petall.getPethair(), petall.getPetgood(), petall.getPet() });
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		button_2.setText("�鿴 ȫ��");
		panel.add(button_2);

		final JPanel panel_9 = new JPanel();
		panel.add(panel_9);

		final JPanel panel_8 = new JPanel();
		panel.add(panel_8);

		final JPanel panel_6 = new JPanel();
		panel.add(panel_6);

		text_seek = new JTextField();
		text_seek.setColumns(10);
		panel.add(text_seek);

		final JPanel panel_5 = new JPanel();
		panel.add(panel_5);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// ����
				String hunt = text_seek.getText();// ��ȡ�ı������������
				int count = def.getRowCount();
				for (int i = 0; i < count; i++) {
					def.removeRow(0);
				}
				try {
					ArrayList<PetAll> list = service.seek(hunt);// ��service��ļ��ϴ�����
					for (PetAll petall : list) {
						def.addRow(new Object[] { petall.getPetname(), petall.getPettype(), petall.getPetsex(),
								petall.getPetage(), petall.getWeight(), petall.getPetprice(), petall.getPetshape(),
								petall.getPethair(), petall.getPetgood(), petall.getPet() });
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}

			}
		});
		button.setText("����");
		panel.add(button);

		final JPanel panel_3 = new JPanel();
		panel.add(panel_3);

		final JPanel panel_7 = new JPanel();
		panel.add(panel_7);

		final JPanel panel_2 = new JPanel();
		panel.add(panel_2);

		final JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// ��ӹ��ﳵ

				// ���ѡ�е���
				int no = table.getSelectedRowCount();// ��ȡ����ѡ�е�����
				if (no > 1) {// showMessageDialog������һ���Ի���
					JOptionPane.showMessageDialog(null, "�Բ�����ѡ��̫���ˣ���");
				} else if (no == 0) {
					JOptionPane.showMessageDialog(null, "�Բ����㻹ûѡ�У���");
				} else {// showConfirmDialog������һ����ѡ��ĶԻ���
					int confirmNo = JOptionPane.showConfirmDialog(null, "ȷ�ϼ��빺�ﳵ��?");
					if (confirmNo == 0) {
						int rowNo = table.getSelectedRow();// ��ȡ�е�����
						petnm = (String) table.getValueAt(rowNo, 0);// ���ĳ��ĳ�е�ֵ

						PetAll_Service petallservice = new PetAll_Service();
						try {
							petallservice.addcar(petnm);
						} catch (SQLException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
					}
				}
			}
		});
		button_1.setText("��ӹ��ﳵ");
		panel.add(button_1);

		final JPanel panel_1 = new JPanel();
		panel.add(panel_1);

		final JPanel panel_4 = new JPanel();
		getContentPane().add(panel_4, BorderLayout.SOUTH);

		final JButton button_4 = new JButton();
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
<<<<<<< HEAD
				boolean flag = false;
				Component[] com = table.getComponents();
				for (Component component : com) {
					//�����ǰ������� deptframe ���͵�
					if (component instanceof JTable ) {
						flag = true;//�Ѿ�����
						break;
					}

				}
				if (flag == false) {
					ShopCarView car = new ShopCarView(petnm);								
					car.setVisible(true);	
				}
				
							
=======

				ShopCarView car = new ShopCarView(petnm);
				car.setVisible(true);
>>>>>>> 9744c489c1102f1370a61f14616b3471bc70de14
			}
		});
		button_4.setText("�鿴���ﳵ");
		// button_4.setEnabled(false);
		panel_4.add(button_4);

		final JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(def);// ģ������
		def.addColumn("������");
		def.addColumn("��������");
		def.addColumn("�����Ա�");
		def.addColumn("��������");
		def.addColumn("��������");
		def.addColumn("����۸�");
		def.addColumn("��������");
		def.addColumn("���﷢��");
		def.addColumn("���������");
		def.addColumn("������");
		def.addColumn("ѡ��");
	}

}
