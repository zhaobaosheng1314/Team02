package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeSet;

import DButils.DButils;
import Object_Project.PetAll;

/**
 * 
 * @author zbs PetAllר��Dao��
 */
public class PetAll_Dao {
	DButils db = new DButils();

	/**
	 * 
	 * @author zjx �����̳ǲ�ѯPetAll
	 */
	public ArrayList<PetAll> petAllDao() throws SQLException {

		ArrayList<PetAll> list = new ArrayList<PetAll>();
		String sql = "select * from pet_all";
		ResultSet res = db.preQuery(sql);
		PetAll petall = null;
		while (res.next()) {
			petall = new PetAll();
			petall.setPetname(res.getString("petname")); // ������
			petall.setPettype(res.getString("pettype")); // ��������
			petall.setPetsex(res.getString("petsex")); // �����Ա�
			petall.setPetage(res.getInt("petage")); // ��������
			petall.setWeight(res.getDouble("weight")); // ��������
			petall.setPetgood(res.getInt("petgood")); // ������
			petall.setPetprice(res.getDouble("petprice")); // ����۸�
			petall.setPetshape(res.getString("petshape")); // �������ͣ�����Ȯ��С��Ȯ��
			petall.setPethair(res.getString("pethair")); // ����ë������ëȮ����ëȮ��
			petall.setPet(res.getString("pet")); // �������è������
			list.add(petall);
		}
		return list;

	}

	public ArrayList<PetAll> seek(String hunt) throws SQLException { // ����
		ArrayList<PetAll> list = new ArrayList<PetAll>();
		String sql = "select * from pet_all where pet=?";
		ResultSet res = db.preQuery(sql, hunt);

		PetAll petall = null;
		while (res.next()) {
			petall = new PetAll();
			petall.setPetname(res.getString("petname")); // ������
			petall.setPettype(res.getString("pettype")); // ��������
			petall.setPetsex(res.getString("petsex")); // �����Ա�
			petall.setPetage(res.getInt("petage")); // ��������
			petall.setWeight(res.getDouble("weight")); // ��������
			petall.setPetgood(res.getInt("petgood")); // ������
			petall.setPetprice(res.getDouble("petprice")); // ����۸�
			petall.setPetshape(res.getString("petshape")); // �������ͣ�����Ȯ��С��Ȯ��
			petall.setPethair(res.getString("pethair")); // ����ë������ëȮ����ëȮ��
			petall.setPet(res.getString("pet")); // �������è������
			list.add(petall);
		}
		return list;

	}

	public ArrayList<PetAll> addcar(String petnm) throws SQLException { // ���ﳵ
		ArrayList<PetAll> list = new ArrayList<PetAll>();
		String sql = "select * from PET_ALL where petname =?";
		ResultSet res = db.preQuery(sql, petnm);
		PetAll petall = null;
		while (res.next()) {
			petall = new PetAll();
			petall.setPetname(res.getString("petname")); // ������
			petall.setPettype(res.getString("pettype")); // ��������
			petall.setPetsex(res.getString("petsex")); // �����Ա�
			petall.setPetage(res.getInt("petage")); // ��������
			petall.setWeight(res.getDouble("weight")); // ��������
			petall.setPetgood(res.getInt("petgood")); // ������
			petall.setPetprice(res.getDouble("petprice")); // ����۸�
			petall.setPetshape(res.getString("petshape")); // �������ͣ�����Ȯ��С��Ȯ��
			petall.setPethair(res.getString("pethair")); // ����ë������ëȮ����ëȮ��
			petall.setPet(res.getString("pet")); // �������è������
			list.add(petall);
		}
		String sql1 = "insert into SHOP_CAR(pettype,petsex,petage,weight,pet,petgood,petname,petprice,petshape,pethair) values (?,?,?,?,?,?,?,?,?,?)";
		int x = db.preUpdate(sql1, petall.getPettype(), petall.getPetsex(), petall.getPetage(), petall.getWeight(),
				petall.getPet(), petall.getPetgood(), petall.getPetname(), petall.getPetprice(), petall.getPetshape(),
				petall.getPethair());
		return list;
	}

	public ArrayList<PetAll> addpetcar() throws SQLException {// �����ﳵ���ݿⷵ��
		ArrayList<PetAll> list = new ArrayList<PetAll>();
		String sql = "select * from shop_car";
		ResultSet res = db.preQuery(sql);
		PetAll petall = null;
		while (res.next()) {
			petall = new PetAll();
			petall.setPetname(res.getString("petname")); // ������
			petall.setPettype(res.getString("pettype")); // ��������
			petall.setPetsex(res.getString("petsex")); // �����Ա�
			petall.setPetage(res.getInt("petage")); // ��������
			petall.setWeight(res.getDouble("weight")); // ��������
			petall.setPetgood(res.getInt("petgood")); // ������
			petall.setPetprice(res.getDouble("petprice")); // ����۸�
			petall.setPetshape(res.getString("petshape")); // �������ͣ�����Ȯ��С��Ȯ��
			petall.setPethair(res.getString("pethair")); // ����ë������ëȮ����ëȮ��
			petall.setPet(res.getString("pet")); // �������è������
			list.add(petall);
		}
		return list;
	}

	public void delete(String petname) {
		String sql = "delete from shop_car where petname=?";
		db.preUpdate(sql, petname);

	}
	/**
	 * �����Ƽ�
	 * ��ѯpetall ��ó�����Ϣ+������
	 * @return 
	 * @throws SQLException 
	 */
	public TreeSet<PetAll> found() throws SQLException {
		TreeSet<PetAll> ts = new TreeSet<PetAll>();
		String sql = "select * from PET_ALL";
		ResultSet rs =db.preQuery(sql);
		PetAll pet ;
		while(rs.next()){
			
			String petname = rs.getString("petname");
			String pettype = rs.getString("pettype");
			String petsex = rs.getString("petsex");
			int petage = rs.getInt("petage");
			double weight = rs.getDouble("weight");
			int petgood = rs.getInt("petgood");
			String pet1 =rs.getString("pet");
			pet =new PetAll(petname,pettype,petsex,petage,weight,petgood,pet1);
			ts.add(pet);
		}
		return ts;
	}
}
