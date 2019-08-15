package Pet_JFrame;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author zsdp
 * 宠物用品   主界面
 */

public class Supplies_JFrame extends JFrame{
	public Supplies_JFrame() {
		super();
		setBounds(new Rectangle(0, 0, 800, 800));
		getContentPane().setLayout(null);
		setTitle("宠物用品");

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		button.setText("宠物食品");
		button.setBounds(90, 85, 106, 68);
		getContentPane().add(button);

		final JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		button_1.setText("宠物玩具");
		button_1.setBounds(273, 85, 106, 68);
		getContentPane().add(button_1);

		final JButton button_2 = new JButton();
		button_2.setText("护理用品");
		button_2.setBounds(90, 193, 106, 68);
		getContentPane().add(button_2);

		final JButton button_3 = new JButton();
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		button_3.setText("宠物保健品");
		button_3.setBounds(273, 193, 106, 68);
		getContentPane().add(button_3);

		final JButton button_4 = new JButton();
		button_4.setText("返回");
		button_4.setBounds(0, 10, 71, 28);
		getContentPane().add(button_4);
		
		
		final JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		final JMenu menu = new JMenu();
		menu.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		menu.setText("登录");
		menuBar.add(menu);
		
		addImg("img/1.jpg", 90, 160, 200, 200, 1);
		addImg("images/my.jpg", 0,0, 1000, 800, 3);
		final JMenuItem newItemMenuItem = new JMenuItem();
		newItemMenuItem.setText("New Item");
		menu.add(newItemMenuItem);
	}
	
	 public  void addImg(String Url,int x,int y,int hight,int width,int displayGrand){
		 //创建桌面面板
	      
	        final JLabel backLabel = new JLabel();
	     
	        ImageIcon icon = new ImageIcon(Url);   //设置图片
	        backLabel.setIcon(icon);
	        backLabel.setBounds(x,y,width,hight);  //设置边界
	      
	        getContentPane().add(backLabel,displayGrand);
	    }
	 
	   

}
