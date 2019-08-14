package Service;

import java.sql.SQLException;
import java.util.ArrayList;

import Dao.PetAll_Dao;
import Object_Project.PetAll;

/**
 * zbs
 * 商城宠物信息   连接PetAll表
 */
public class PetAll_Service {
	PetAll_Dao shopdao = new PetAll_Dao();
	
	/**
	 * zjx
	 * @throws SQLException
	 * 购宠商城 查询宠物信息     查询PetAll表
	 */
	public ArrayList<PetAll> petAllService() throws SQLException{
		ArrayList<PetAll> list = shopdao.petAllDao();
		return list;
		
	}
	public ArrayList<PetAll> seek(String hunt) throws SQLException  {
		shopdao.seek(hunt);
		ArrayList<PetAll> list = shopdao.seek(hunt);
			if(list.isEmpty()){
				throw new RuntimeException("本店没有这个动物！！");
			}		
		return list;		
	}
	public ArrayList<PetAll> addcar(String petnm) throws SQLException {
		ArrayList<PetAll> list = shopdao.addcar(petnm);
		return list;
		
		
	}

}
