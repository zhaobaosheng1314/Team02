package Dao;

import DButils.DbUtill;
import Object_Project.User_MeiRong;
import Object_Project.User_YouLeyuan;

/**
 * 
 * @author zbs Bill��ר��Dao��
 */
public class Bill_Dao {
	DbUtill db = new DbUtill();

	/**
	 * lcy
	 * 
	 * @param user
	 *            ��������Ժ ����Bill��
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
	 *            ��������԰ ����Bill��
	 */
	public int park(User_YouLeyuan user) {
		String sql = "insert into bill(name,phone,consumeType,money)values(?,?,?,?)";
		int no = db.preUpset(sql, user.getName(), user.getPhone(), user.getConsumeType(), user.getMoney());
		return no;
	}

}
