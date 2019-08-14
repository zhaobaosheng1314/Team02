package ImgUtil;
import java.awt.BorderLayout;


import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class ImgAdd extends JFrame{

    JDesktopPane desktopPane = null;   //�������
    String imgUrl=null;
    public ImgAdd(String imgUrl)
    {
        super();
        setBounds(new Rectangle(0, 0, 1000, 850));
        this.imgUrl=imgUrl;
        //�����������
        desktopPane = new JDesktopPane();
        desktopPane.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);  //�����ڲ������϶�ģʽ
        getContentPane().add(desktopPane,BorderLayout.CENTER);
        //������ӱ���ͼƬ
        final JLabel backLabel = new JLabel();
     
        ImageIcon icon = new ImageIcon(imgUrl);   //����ͼƬ
        backLabel.setIcon(icon);
        backLabel.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());  //���ñ߽�
        desktopPane.add(backLabel,new Integer(Integer.MIN_VALUE));   //��ӵ�ָ������λ��
      
        
    
       
    
    }
   
    /**
     * @param args
     */
    public static void main(String[] args) {
       
        ImgAdd jInternalFrameTest= new ImgAdd("Images/my.jpg");
        jInternalFrameTest.setVisible(true);
    }

}

