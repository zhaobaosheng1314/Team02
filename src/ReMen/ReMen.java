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
		setTitle("���Ű�");
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
		
		
		final JLabel label = DefaultComponentFactory.getInstance().createTitle("��ӭ���������Ƽ���");
		label.setForeground(new Color(255, 0, 255));
		label.setFont(new Font("@���Ĳ���", Font.BOLD, 36));
		label.setBounds(183, 10, 342, 50);
		getContentPane().add(label);

		final JLabel no1 = DefaultComponentFactory.getInstance().createLabel("No.1");
		no1.setFont(new Font("", Font.BOLD, 26));
		no1.setBounds(61, 89, 83, 37);
		getContentPane().add(no1);
		String talk1_1 = list.get(0).getPetname()+"��һֻ"+list.get(0).getWeight()+
				"���ص�"+list.get(0).getPettype()+"����Ϊһֻ"+list.get(0).getPetage()+
				"���"+list.get(0).getPetsex()+"��";
		String talk1_2 ="�ٻ������"+list.get(0).getPetgood()+",λ�Ӱ���";
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

		String talk2_1 = list.get(1).getPetname()+"��һֻ"+list.get(1).getWeight()+
				"���ص�"+list.get(1).getPettype()+"����Ϊһֻ"+list.get(1).getPetage()+
				"���"+list.get(1).getPetsex()+"��";
		String talk2_2 ="�ٻ������"+list.get(1).getPetgood()+",���ڵڶ�";
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

		String talk3_1 = list.get(2).getPetname()+"��һֻ"+list.get(2).getWeight()+
				"���ص�"+list.get(2).getPettype()+"����Ϊһֻ"+list.get(2).getPetage()+
				"���"+list.get(2).getPetsex()+"��";
		String talk3_2 ="��õ�����"+list.get(2).getPetgood()+",���ӵ���";
		final JLabel label_1_3_1 = DefaultComponentFactory.getInstance().createLabel(talk3_1);
		label_1_3_1.setFont(new Font("Dialog", Font.PLAIN, 26));
		label_1_3_1.setBounds(61, 389, 592, 37);
		getContentPane().add(label_1_3_1);

		final JLabel label_1_3_2 = DefaultComponentFactory.getInstance().createLabel(talk3_2);
		label_1_3_2.setFont(new Font("Dialog", Font.PLAIN, 26));
		label_1_3_2.setBounds(61, 426, 592, 37);
		getContentPane().add(label_1_3_2);

		final JLabel end = DefaultComponentFactory.getInstance().createLabel("��ܰ��ʾ�������ϲ���ĳ����δ�ϰ�Ļ����͸��������ް�");
		end.setForeground(new Color(255, 0, 0));
		end.setFont(new Font("", Font.BOLD, 16));
		end.setBounds(117, 490, 493, 50);
		getContentPane().add(end);
	}

}
