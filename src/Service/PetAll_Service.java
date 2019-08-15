package Service;

import java.sql.SQLException;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Iterator;
=======
import java.util.TreeSet;
>>>>>>> 9744c489c1102f1370a61f14616b3471bc70de14

import Dao.PetAll_Dao;
import Object_Project.PetAll;

/**
 * zbs 商城宠物信息 连接PetAll表
 */
public class PetAll_Service {
	PetAll_Dao shopdao = new PetAll_Dao();

	/**
	 * zjx
	 * 
	 * @throws SQLException
	 *             购宠商城 查询宠物信息 查询PetAll表
	 */
	public ArrayList<PetAll> petAllService() throws SQLException {
		ArrayList<PetAll> list = shopdao.petAllDao();
		return list;

	}

	public ArrayList<PetAll> seek(String hunt) throws SQLException {
		shopdao.seek(hunt);
		ArrayList<PetAll> list = shopdao.seek(hunt);
		if (list.isEmpty()) {
			throw new RuntimeException("本店没有这个动物！！");
		}
		return list;
	}

	public ArrayList<PetAll> addcar(String petnm) throws SQLException {
		ArrayList<PetAll> list = shopdao.addcar(petnm);
		return list;
	}

	public ArrayList<PetAll> addpetcar() throws SQLException {// 将购物车数据库返回
		ArrayList<PetAll> list = shopdao.addpetcar();
		return list;
	}

	public void delete(String petname) {
		shopdao.delete(petname);

	}
	/**
	 * 热门推荐
	 * 查询petall表，获得点赞最高
	 * @return 
	 * @throws SQLException 
	 */
	public TreeSet<PetAll> found() throws SQLException {
		TreeSet<PetAll> ts=shopdao.found();
		return ts;
	}
	public double sumprice() throws SQLException{
		double price = 0;
		ArrayList<Double> list =shopdao.sumprice();
		Iterator<Double> it = list.iterator();
		while(it.hasNext()){
			Double x = it.next();
			price+=x;
		}
		
		return price;
		
	}
}
