package ImgUtil;
import java.awt.BorderLayout;


import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class ImgAdd extends JFrame{

    JDesktopPane desktopPane = null;   //桌面面板
    String imgUrl=null;
    public ImgAdd(String imgUrl)
    {
        super();
        setBounds(new Rectangle(0, 0, 1000, 850));
        this.imgUrl=imgUrl;
        //创建桌面面板
        desktopPane = new JDesktopPane();
        desktopPane.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);  //设置内部窗体拖动模式
        getContentPane().add(desktopPane,BorderLayout.CENTER);
        //桌面添加背景图片
        final JLabel backLabel = new JLabel();
     
        ImageIcon icon = new ImageIcon(imgUrl);   //设置图片
        backLabel.setIcon(icon);
        backLabel.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());  //设置边界
        desktopPane.add(backLabel,new Integer(Integer.MIN_VALUE));   //添加到指定索引位置
      
        
    
       
    
    }
   
    /**
     * @param args
     */
    public static void main(String[] args) {
       
        ImgAdd jInternalFrameTest= new ImgAdd("Images/my.jpg");
        jInternalFrameTest.setVisible(true);
    }

}

