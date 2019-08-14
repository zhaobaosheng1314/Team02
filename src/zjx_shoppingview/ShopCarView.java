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
 * 张建祥
 */
public class ShopCarView extends JFrame{
	PetAll_Service service = new PetAll_Service();
	DefaultTableModel dtable = new DefaultTableModel();// 创建模板
	private JTable table;
	private JTextField textField;
	public ShopCarView(String petnm) {
		super();
		setSize(500, 500);
		setTitle("购物车");

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
		button_2.setText("结算");

		final JPanel panel_4 = new JPanel();
		getContentPane().add(panel_4, BorderLayout.SOUTH);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Shopping_JFrame shopjfrom = new Shopping_JFrame();
				shopjfrom.setVisible(true);        //打开商城界面
			}
		});
		panel_4.add(button);
		button.setText("返回商城");

		final JPanel panel_3 = new JPanel();
		panel_4.add(panel_3);

		final JPanel panel_2 = new JPanel();
		panel_4.add(panel_2);

		final JPanel panel_1 = new JPanel();
		panel_4.add(panel_1);

		final JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				int no = table.getSelectedRowCount();// 获取表中选中的行数
				if (no > 1) {// showMessageDialog：调出一个对话框
					JOptionPane.showMessageDialog(null, "请注意，你选的太多了");
				} else if (no == 0) {
					JOptionPane.showMessageDialog(null, "你还没选行呢！！");
				} else {// showConfirmDialog：调出一个有选项的对话框
					int confirmNo = JOptionPane.showConfirmDialog(null,
							"你...你确定...定要删除吗?");
					if (confirmNo == 0) {
						int rowNo = table.getSelectedRow();// 获取行的索引
					String	petname =  (String) table.getValueAt(rowNo, 0);//获得动物名	
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
		button_1.setText("删除");

		final JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		table = new JTable(dtable);
		scrollPane.setViewportView(table);
		table.setModel(dtable);// 模板放入表
		dtable.addColumn("宠物名");
		dtable.addColumn("宠物类型");
		dtable.addColumn("宠物性别");
		dtable.addColumn("宠物年龄");
		dtable.addColumn("宠物体重");
		dtable.addColumn("宠物价格");
		dtable.addColumn("宠物体型");
		dtable.addColumn("宠物发型");
		dtable.addColumn("宠物点赞数");
		dtable.addColumn("宠物类");
		dtable.addColumn("选中");
		Shopping_JFrame shop = new Shopping_JFrame();
		table.getColumnModel().getColumn(10).setCellRenderer(new TableCellRenderer(){
			  public Component getTableCellRendererComponent(JTable table,
	                    Object value, boolean isSelected, boolean hasFocus,
	                    int row, int column) {
				  JCheckBox ck = new JCheckBox();
				   ck.setSelected(isSelected);//选中当前的行
				   ck.setOpaque(true);//透明度
				   ck.setHorizontalAlignment((int) 0.5f);//左右对齐
	                return ck;
	            }});    //单选框
		
		
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
