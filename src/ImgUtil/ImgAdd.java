package ImgUtil;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class ImgAdd extends JFrame{

	
	
	 public  void addImg(String Url,int x,int y,int hight,int width,int displayGrand){
		 //�����������
	      
	        final JLabel backLabel = new JLabel();
	     
	        ImageIcon icon = new ImageIcon(Url);   //����ͼƬ
	        backLabel.setIcon(icon);
	        backLabel.setBounds(x,y,width,hight);  //���ñ߽�
	      
	        getContentPane().add(backLabel,displayGrand);
	    }

}

