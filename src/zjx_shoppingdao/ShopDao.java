package zjx_shoppingdao;
/**
 * �Ž���
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import zjx_pet.PetAll;

import com.dbutils.DButils;

public class ShopDao {
	public ArrayList<PetAll> petAllDao() throws SQLException{
		DButils db = new DButils();
		ArrayList<PetAll> list = new ArrayList<PetAll>();
		String sql="select * from pet_all";
		ResultSet  res = db.preQuery(sql);
		PetAll petall = null;
		while(res.next()){
			petall = new PetAll();
			petall.setPetname(res.getString("petname"));	   //������
		    petall.setPettype(res.getString("pettype"));	   //��������
			petall.setPetsex(res.getString("petsex"));         //�����Ա�
			petall.setPetage(res.getInt("petage"));           //��������
			petall.setWeight(res.getDouble("weight"));        //��������
			petall.setPetgood(res.getInt("petgood"));         //������
			petall.setPetprice(res.getDouble("petprice"));    //����۸�
			petall.setPetshape(res.getString("petshape"));    //�������ͣ�����Ȯ��С��Ȯ��
			petall.setPethair(res.getString("pethair"));     //����ë������ëȮ����ëȮ��
			petall.setPet(res.getString("pet"));             //�������è������
			list.add(petall);
		}
		return list;
		
	}
	

}
