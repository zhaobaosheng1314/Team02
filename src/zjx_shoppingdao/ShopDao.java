package zjx_shoppingdao;
/**
 * 张建祥
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
			petall.setPetname(res.getString("petname"));	   //宠物名
		    petall.setPettype(res.getString("pettype"));	   //宠物类型
			petall.setPetsex(res.getString("petsex"));         //宠物性别
			petall.setPetage(res.getInt("petage"));           //宠物年龄
			petall.setWeight(res.getDouble("weight"));        //宠物体重
			petall.setPetgood(res.getInt("petgood"));         //点赞数
			petall.setPetprice(res.getDouble("petprice"));    //宠物价格
			petall.setPetshape(res.getString("petshape"));    //宠物体型（大型犬，小型犬）
			petall.setPethair(res.getString("pethair"));     //宠物毛发（短毛犬，长毛犬）
			petall.setPet(res.getString("pet"));             //宠物类别（猫，狗）
			list.add(petall);
		}
		return list;
		
	}
	

}
