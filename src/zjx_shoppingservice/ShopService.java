package zjx_shoppingservice;

import java.sql.SQLException;
import java.util.ArrayList;

import zjx_pet.PetAll;
import zjx_shoppingdao.ShopDao;

/**
 * ’≈Ω®œÈ
 */
public class ShopService {
	ShopDao shopdao = new ShopDao();
	public ArrayList<PetAll> petAllService() throws SQLException{
		ArrayList<PetAll> list = shopdao.petAllDao();
		return list;
		
	}

}
