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
		panel.add(button_2);
		button_2.setText("结算");

		final JPanel panel_4 = new JPanel();
		getContentPane().add(panel_4, BorderLayout.SOUTH);

		final JButton button = new JButton();
		panel_4.add(button);
		button.setText("返回商城");

		final JPanel panel_3 = new JPanel();
		panel_4.add(panel_3);

		final JPanel panel_2 = new JPanel();
		panel_4.add(panel_2);

		final JPanel panel_1 = new JPanel();
		panel_4.add(panel_1);

		final JButton button_1 = new JButton();
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
			list = service.addcar(petnm);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// 将service层的集合传过来
		for (PetAll petall : list) {
			dtable.addRow(new Object[] { petall.getPetname(),
					petall.getPettype(), petall.getPetsex(),
					petall.getPetage(), petall.getWeight(),
					petall.getPetprice(), petall.getPetshape(),
					petall.getPethair(), petall.getPetgood(),
					petall.getPet() });
		}
	}
	
}
