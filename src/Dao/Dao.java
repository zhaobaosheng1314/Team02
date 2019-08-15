package Dao;

import lcxHospital.Hospital;
import DButils.DButils;

/**
 * lcx ≥ËŒÔ“Ω‘∫
 * 
 * @author
 *
 */
public class Dao {
	DButils db = new DButils();

	public int hospital_dao(Hospital hos) {

		String sql = "insert into bill(name,phone,consumeType,money)values(?,?,?,?)";
		int no = db.preUpdate(sql, hos.getName(), hos.getPhone(),
				hos.getConsumeType(), hos.getMoney());
		return no;
	}
}
