package Pet_JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author zsdp
 * ������Ʒ   ������
 */

public class Supplies_JFrame extends JFrame{
	public Supplies_JFrame() {
		super();
		getContentPane().setLayout(null);
		setTitle("������Ʒ");

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		button.setText("����ʳƷ");
		button.setBounds(90, 85, 106, 68);
		getContentPane().add(button);

		final JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		button_1.setText("�������");
		button_1.setBounds(273, 85, 106, 68);
		getContentPane().add(button_1);

		final JButton button_2 = new JButton();
		button_2.setText("������Ʒ");
		button_2.setBounds(90, 193, 106, 68);
		getContentPane().add(button_2);

		final JButton button_3 = new JButton();
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		button_3.setText("���ﱣ��Ʒ");
		button_3.setBounds(273, 193, 106, 68);
		getContentPane().add(button_3);

		final JButton button_4 = new JButton();
		button_4.setText("����");
		button_4.setBounds(0, 10, 71, 28);
		getContentPane().add(button_4);

		final JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		final JMenu menu = new JMenu();
		menu.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		menu.setText("��¼");
		menuBar.add(menu);

		final JMenuItem newItemMenuItem = new JMenuItem();
		newItemMenuItem.setText("New Item");
		menu.add(newItemMenuItem);
	}
	
	
	

}
