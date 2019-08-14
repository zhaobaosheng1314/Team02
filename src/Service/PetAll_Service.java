package Service;

import java.sql.SQLException;
import java.util.ArrayList;

import Dao.PetAll_Dao;
import Object_Project.PetAll;

/**
 * zbs
 * �̳ǳ�����Ϣ   ����PetAll��
 */
public class PetAll_Service {
	PetAll_Dao shopdao = new PetAll_Dao();
	
	/**
	 * zjx
	 * @throws SQLException
	 * �����̳� ��ѯ������Ϣ     ��ѯPetAll��
	 */
	public ArrayList<PetAll> petAllService() throws SQLException{
		ArrayList<PetAll> list = shopdao.petAllDao();
		return list;
		
	}
	public ArrayList<PetAll> seek(String hunt) throws SQLException  {
		shopdao.seek(hunt);
		ArrayList<PetAll> list = shopdao.seek(hunt);
			if(list.isEmpty()){
				throw new RuntimeException("����û����������");
			}		
		return list;		
	}
	public ArrayList<PetAll> addcar(String petnm) throws SQLException {
		ArrayList<PetAll> list = shopdao.addcar(petnm);
		return list;
		
		
	}

}
