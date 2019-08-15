package Dao;

import DButils.DbUtill;
import Object_Project.User_MeiRong;
import Object_Project.User_YouLeyuan;

/**
 * 
 * @author zbs Bill表专用Dao层
 */
public class Bill_Dao {
	DbUtill db = new DbUtill();

	/**
	 * lcy
	 * 
	 * @param user
	 *            宠物美容院 更新Bill表
	 */
	public int beauty(User_MeiRong user) {

		String sql = "insert into bill(name,phone,consumeType,money)values(?,?,?,?)";
		int no = db.preUpset(sql, user.getName(), user.getPhone(), user.getConsumeType(), user.getMoney());
		return no;
	}

	/**
	 * lcy
	 * 
	 * @param user
	 *            宠物游乐园 更新Bill表
	 */
	public int park(User_YouLeyuan user) {
		String sql = "insert into bill(name,phone,consumeType,money)values(?,?,?,?)";
		int no = db.preUpset(sql, user.getName(), user.getPhone(), user.getConsumeType(), user.getMoney());
		return no;
	}

}
