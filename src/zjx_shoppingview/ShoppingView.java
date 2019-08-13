package zjx_shoppingview;

/**
 * 张建祥
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import zjx_pet.PetAll;
import zjx_shoppingservice.ShopService;

public class ShoppingView extends JFrame {
	ShopService service = new ShopService();
	DefaultTableModel def = new DefaultTableModel();// 创建模板
	private JTextField text_seek;
	private JTable table;

	public ShoppingView() {
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
				int count = def.getRowCount();
				for (int i = 0; i < count; i++) {
					def.removeRow(0);
				}
				try {
					ArrayList<PetAll> list = service.petAllService();// 将service层的集合传过来
					for (PetAll petall : list) {
						def.addRow(new Object[] { petall.getPetname(),
								petall.getPettype(), petall.getPetsex(),
								petall.getPetage(), petall.getWeight(),
								petall.getPetprice(), petall.getPetshape(),
								petall.getPethair(), petall.getPetgood(),
								petall.getPet() });
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		button_2.setText("查看 全部");
		panel.add(button_2);

		final JPanel panel_6 = new JPanel();
		panel.add(panel_6);

		final JPanel panel_7 = new JPanel();
		panel.add(panel_7);

		final JPanel panel_8 = new JPanel();
		panel.add(panel_8);

		text_seek = new JTextField();
		text_seek.setColumns(12);
		panel.add(text_seek);

		final JPanel panel_5 = new JPanel();
		panel.add(panel_5);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// 搜索
			}
		});
		button.setText("搜索");
		panel.add(button);

		final JPanel panel_4 = new JPanel();
		panel.add(panel_4);

		final JPanel panel_3 = new JPanel();
		panel.add(panel_3);

		final JPanel panel_1 = new JPanel();
		panel.add(panel_1);

		final JPanel panel_2 = new JPanel();
		panel.add(panel_2);

		final JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// 添加购物车
				ShopCarView car = new ShopCarView();

			}
		});
		button_1.setText("添加购物车");
		panel.add(button_1);

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
	}

}
