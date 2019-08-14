package ReMen;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import Object_Project.PetAll;
import Service.PetAll_Service;

public class ReMen extends JFrame{
	public ReMen() throws SQLException {
		super();
		setTitle("热门榜单");
		getContentPane().setLayout(null);
		setSize(722,597);
		PetAll_Service pas= new PetAll_Service();
		TreeSet<PetAll> ts =pas.found();
		Iterator<PetAll> it = ts.iterator();
		ArrayList<PetAll> list = new ArrayList<PetAll>();
		int num = 1;
		while(it.hasNext()){
			list.add(it.next());
			num++;
			if(num==4){
				break;
			}
		}
		
		
		final JLabel label = DefaultComponentFactory.getInstance().createTitle("欢迎来到热门推荐榜");
		label.setForeground(new Color(255, 0, 255));
		label.setFont(new Font("@华文彩云", Font.BOLD, 36));
		label.setBounds(183, 10, 342, 50);
		getContentPane().add(label);

		final JLabel no1 = DefaultComponentFactory.getInstance().createLabel("No.1");
		no1.setFont(new Font("", Font.BOLD, 26));
		no1.setBounds(61, 89, 83, 37);
		getContentPane().add(no1);
		String talk1_1 = list.get(0).getPetname()+"：一只"+list.get(0).getWeight()+
				"斤重的"+list.get(0).getPettype()+"。作为一只"+list.get(0).getPetage()+
				"岁的"+list.get(0).getPetsex()+"。";
		String talk1_2 ="荣获点赞数"+list.get(0).getPetgood()+",位居榜首";
		final JLabel label_1_1 = DefaultComponentFactory.getInstance().createLabel(talk1_1);
		label_1_1.setFont(new Font("", Font.PLAIN, 26));
		label_1_1.setBounds(61, 132, 592, 37);
		getContentPane().add(label_1_1);

		final JLabel label_1_2 = DefaultComponentFactory.getInstance().createLabel(talk1_2);
		label_1_2.setFont(new Font("Dialog", Font.PLAIN, 26));
		label_1_2.setBounds(61, 169, 592, 37);
		getContentPane().add(label_1_2);

		final JLabel no2 = DefaultComponentFactory.getInstance().createLabel("No.2");
		no2.setFont(new Font("Dialog", Font.BOLD, 26));
		no2.setBounds(61, 223, 83, 37);
		getContentPane().add(no2);

		String talk2_1 = list.get(1).getPetname()+"：一只"+list.get(1).getWeight()+
				"斤重的"+list.get(1).getPettype()+"。作为一只"+list.get(1).getPetage()+
				"岁的"+list.get(1).getPetsex()+"。";
		String talk2_2 ="荣获点赞数"+list.get(1).getPetgood()+",列于第二";
		final JLabel label_1_2_1 = DefaultComponentFactory.getInstance().createLabel(talk2_1);
		label_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 26));
		label_1_2_1.setBounds(61, 266, 592, 37);
		getContentPane().add(label_1_2_1);

		final JLabel label_1_2_2 = DefaultComponentFactory.getInstance().createLabel(talk2_2);
		label_1_2_2.setFont(new Font("Dialog", Font.PLAIN, 26));
		label_1_2_2.setBounds(61, 303, 592, 37);
		getContentPane().add(label_1_2_2);

		final JLabel no3 = DefaultComponentFactory.getInstance().createLabel("No.3");
		no3.setFont(new Font("Dialog", Font.BOLD, 26));
		no3.setBounds(61, 346, 83, 37);
		getContentPane().add(no3);

		String talk3_1 = list.get(2).getPetname()+"：一只"+list.get(2).getWeight()+
				"斤重的"+list.get(2).getPettype()+"。作为一只"+list.get(2).getPetage()+
				"岁的"+list.get(2).getPetsex()+"。";
		String talk3_2 ="获得点赞数"+list.get(2).getPetgood()+",屈居第三";
		final JLabel label_1_3_1 = DefaultComponentFactory.getInstance().createLabel(talk3_1);
		label_1_3_1.setFont(new Font("Dialog", Font.PLAIN, 26));
		label_1_3_1.setBounds(61, 389, 592, 37);
		getContentPane().add(label_1_3_1);

		final JLabel label_1_3_2 = DefaultComponentFactory.getInstance().createLabel(talk3_2);
		label_1_3_2.setFont(new Font("Dialog", Font.PLAIN, 26));
		label_1_3_2.setBounds(61, 426, 592, 37);
		getContentPane().add(label_1_3_2);

		final JLabel end = DefaultComponentFactory.getInstance().createLabel("温馨提示：如果您喜欢的宠物，还未上榜的话，就给他多多点赞吧");
		end.setForeground(new Color(255, 0, 0));
		end.setFont(new Font("", Font.BOLD, 16));
		end.setBounds(117, 490, 493, 50);
		getContentPane().add(end);
	}

}
