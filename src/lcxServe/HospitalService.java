package lcxServe;

import lcxHospital.Hospital;
import Dao.Dao;

//ҽԺ
public class HospitalService {
	Dao dao = new Dao();

	public int ser(Hospital hos) {
		int no = dao.hospital_dao(hos);
		return no;
	}
}
