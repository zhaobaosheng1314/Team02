package lcx.again;

import Dao.Dao;
import Hospital.Hospital;

//ҽԺ
public class HospitalService {
	Dao dao = new Dao();

	public int ser(Hospital hos) {
		int no = dao.hospital_dao(hos);
		return no;
	}
}
