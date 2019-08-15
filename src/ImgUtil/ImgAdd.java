package ImgUtil;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class ImgAdd extends JFrame{

	
	
	 public  void addImg(String Url,int x,int y,int hight,int width,int displayGrand){
		 //创建桌面面板
	      
	        final JLabel backLabel = new JLabel();
	     
	        ImageIcon icon = new ImageIcon(Url);   //设置图片
	        backLabel.setIcon(icon);
	        backLabel.setBounds(x,y,width,hight);  //设置边界
	      
	        getContentPane().add(backLabel,displayGrand);
	    }

}

