package Pet_JFrame;

/**
 * 张建祥
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
	DefaultTableModel def = new DefaultTableModel();// 创建模板
	String petnm = null;
	boolean x = false;
	private JTextField text_seek;
	private JTable table;

	public Shopping_JFrame() {
		super();
		setSize(591, 428);
		setTitle("宠物商城");

		final JPanel panel = new JPanel();
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setHgap(0);
		panel.setLayout(flowLayout);
		getContentPane().add(panel, BorderLayout.NORTH);

		final JButton button_2 = new JButton();
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// 查看全部的数据库

				// 单选框
				table.getColumnModel().getColumn(10).setCellRenderer(new TableCellRenderer() {
					public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
							boolean hasFocus, int row, int column) {
						JCheckBox ck = new JCheckBox();
						ck.setSelected(isSelected);// 选中当前的行
						ck.setOpaque(true);// 透明度
						ck.setHorizontalAlignment((int) 0.5f);// 左右对齐
						return ck;
					}
				}); // 单选框

				int count = def.getRowCount();
				for (int i = 0; i < count; i++) {
					def.removeRow(0);
				}
				try {
					ArrayList<PetAll> list = service.petAllService();// 将service层的集合传过来
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
		button_2.setText("查看 全部");
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
				// 搜索
				String hunt = text_seek.getText();// 获取文本框中输入的字
				int count = def.getRowCount();
				for (int i = 0; i < count; i++) {
					def.removeRow(0);
				}
				try {
					ArrayList<PetAll> list = service.seek(hunt);// 将service层的集合传过来
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
		button.setText("搜索");
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
				// 添加购物车

				// 获得选中的行
				int no = table.getSelectedRowCount();// 获取表中选中的行数
				if (no > 1) {// showMessageDialog：调出一个对话框
					JOptionPane.showMessageDialog(null, "对不起，你选的太多了！！");
				} else if (no == 0) {
					JOptionPane.showMessageDialog(null, "对不起，你还没选行！！");
				} else {// showConfirmDialog：调出一个有选项的对话框
					int confirmNo = JOptionPane.showConfirmDialog(null, "确认加入购物车吗?");
					if (confirmNo == 0) {
						int rowNo = table.getSelectedRow();// 获取行的索引
						petnm = (String) table.getValueAt(rowNo, 0);// 获得某行某列的值

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
		button_1.setText("添加购物车");
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
					//如果当前的组件是 deptframe 类型的
					if (component instanceof JTable ) {
						flag = true;//已经有了
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
		button_4.setText("查看购物车");
		// button_4.setEnabled(false);
		panel_4.add(button_4);

		final JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(def);// 模板放入表
		def.addColumn("宠物名");
		def.addColumn("宠物类型");
		def.addColumn("宠物性别");
		def.addColumn("宠物年龄");
		def.addColumn("宠物体重");
		def.addColumn("宠物价格");
		def.addColumn("宠物体型");
		def.addColumn("宠物发型");
		def.addColumn("宠物点赞数");
		def.addColumn("宠物类");
		def.addColumn("选中");
	}

}
