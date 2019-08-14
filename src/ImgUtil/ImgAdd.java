package ImgUtil;

import java.awt.BorderLayout;

import java.awt.Rectangle;

import javax.swing.ImageIcon;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImgAdd extends JFrame {

	JDesktopPane desktopPane = null; // 桌面面板

	public ImgAdd() {
		super();
		setBounds(new Rectangle(0, 0, 1000, 850));

		// 创建桌面面板
		desktopPane = new JDesktopPane();
		desktopPane.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE); // 设置内部窗体拖动模式
		getContentPane().add(desktopPane, BorderLayout.CENTER);
		addImg("images/my.jpg", 0, 0, 800, 1000);

	}

	// 桌面添加图片
	public void addImg(String Url, int x, int y, int hight, int width) {

		final JLabel backLabel = new JLabel();

		ImageIcon icon = new ImageIcon(Url); // 设置图片
		backLabel.setIcon(icon);
		backLabel.setBounds(x, y, width, hight); // 设置边界
		desktopPane.add(backLabel, new Integer(Integer.MIN_VALUE));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ImgAdd jInternalFrameTest = new ImgAdd();
		jInternalFrameTest.setVisible(true);
	}

}
