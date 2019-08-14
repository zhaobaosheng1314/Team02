package zjx_shoppingview;

import java.awt.BorderLayout;
import java.awt.Component;
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
import Object_Project.PetAll;
import Pet_JFrame.Shopping_JFrame;
import Service.PetAll_Service;

/**
 * �Ž���
 */
public class ShopCarView extends JFrame{
	PetAll_Service service = new PetAll_Service();
	DefaultTableModel dtable = new DefaultTableModel();// ����ģ��
	private JTable table;
	private JTextField textField;
	public ShopCarView(String petnm) {
		super();
		setSize(500, 500);
		setTitle("���ﳵ");

		final JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);

		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);

		final JButton button_2 = new JButton();
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				
			}
		});
		panel.add(button_2);
		button_2.setText("����");

		final JPanel panel_4 = new JPanel();
		getContentPane().add(panel_4, BorderLayout.SOUTH);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Shopping_JFrame shopjfrom = new Shopping_JFrame();
				shopjfrom.setVisible(true);        //���̳ǽ���
			}
		});
		panel_4.add(button);
		button.setText("�����̳�");

		final JPanel panel_3 = new JPanel();
		panel_4.add(panel_3);

		final JPanel panel_2 = new JPanel();
		panel_4.add(panel_2);

		final JPanel panel_1 = new JPanel();
		panel_4.add(panel_1);

		final JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				int no = table.getSelectedRowCount();// ��ȡ����ѡ�е�����
				if (no > 1) {// showMessageDialog������һ���Ի���
					JOptionPane.showMessageDialog(null, "��ע�⣬��ѡ��̫����");
				} else if (no == 0) {
					JOptionPane.showMessageDialog(null, "�㻹ûѡ���أ���");
				} else {// showConfirmDialog������һ����ѡ��ĶԻ���
					int confirmNo = JOptionPane.showConfirmDialog(null,
							"��...��ȷ��...��Ҫɾ����?");
					if (confirmNo == 0) {
						int rowNo = table.getSelectedRow();// ��ȡ�е�����
					String	petname =  (String) table.getValueAt(rowNo, 0);//��ö�����	
					dtable.removeRow(rowNo);
					     PetAll_Service petallservice = new PetAll_Service();	
					     try {
							petallservice.delete(petname);
						} catch (Exception e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}							
					}
				}
				
				
				
			}
		});
		panel_4.add(button_1);
		button_1.setText("ɾ��");

		final JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		table = new JTable(dtable);
		scrollPane.setViewportView(table);
		table.setModel(dtable);// ģ������
		dtable.addColumn("������");
		dtable.addColumn("��������");
		dtable.addColumn("�����Ա�");
		dtable.addColumn("��������");
		dtable.addColumn("��������");
		dtable.addColumn("����۸�");
		dtable.addColumn("��������");
		dtable.addColumn("���﷢��");
		dtable.addColumn("���������");
		dtable.addColumn("������");
		dtable.addColumn("ѡ��");
		Shopping_JFrame shop = new Shopping_JFrame();
		table.getColumnModel().getColumn(10).setCellRenderer(new TableCellRenderer(){
			  public Component getTableCellRendererComponent(JTable table,
	                    Object value, boolean isSelected, boolean hasFocus,
	                    int row, int column) {
				  JCheckBox ck = new JCheckBox();
				   ck.setSelected(isSelected);//ѡ�е�ǰ����
				   ck.setOpaque(true);//͸����
				   ck.setHorizontalAlignment((int) 0.5f);//���Ҷ���
	                return ck;
	            }});    //��ѡ��
		
		
		ArrayList<PetAll> list = null;
		try {
			list = service.addpetcar();
			for (PetAll petall : list) {
				dtable.addRow(new Object[] { petall.getPetname(),
						petall.getPettype(), petall.getPetsex(),
						petall.getPetage(), petall.getWeight(),
						petall.getPetprice(), petall.getPetshape(),
						petall.getPethair(), petall.getPetgood(),
						petall.getPet() });
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
}
