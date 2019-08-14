package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DButils.DButils;
import Object_Project.PetAll;
/**
 * 
 * @author zbs
 *	PetAllר��Dao��
 */
public class PetAll_Dao {
	DButils db = new DButils();
	/**
	 * 
	 * @author zjx
	 *	�����̳ǲ�ѯPetAll
	 */
	public ArrayList<PetAll> petAllDao() throws SQLException{
		
		ArrayList<PetAll> list = new ArrayList<PetAll>();
		String sql="select * from pet_all";
		ResultSet  res = db.preQuery(sql);
		PetAll petall = null;
		while(res.next()){
			petall = new PetAll();
			petall.setPetname(res.getString("petname"));	   //������
		    petall.setPettype(res.getString("pettype"));	   //��������
			petall.setPetsex(res.getString("petsex"));         //�����Ա�
			petall.setPetage(res.getInt("petage"));           //��������
			petall.setWeight(res.getDouble("weight"));        //��������
			petall.setPetgood(res.getInt("petgood"));         //������
			petall.setPetprice(res.getDouble("petprice"));    //����۸�
			petall.setPetshape(res.getString("petshape"));    //�������ͣ�����Ȯ��С��Ȯ��
			petall.setPethair(res.getString("pethair"));     //����ë������ëȮ����ëȮ��
			petall.setPet(res.getString("pet"));             //�������è������
			list.add(petall);
		}
		return list;
		
	}
	public ArrayList<PetAll> seek(String hunt) throws SQLException{    //����
		ArrayList<PetAll> list = new ArrayList<PetAll>();
		String sql = "select * from pet_all where pet=?";
		ResultSet res = db.preQuery(sql, hunt);
		
		PetAll petall = null;
		while(res.next()){
			petall = new PetAll();
			petall.setPetname(res.getString("petname"));	   //������
		    petall.setPettype(res.getString("pettype"));	   //��������
			petall.setPetsex(res.getString("petsex"));         //�����Ա�
			petall.setPetage(res.getInt("petage"));           //��������
			petall.setWeight(res.getDouble("weight"));        //��������
			petall.setPetgood(res.getInt("petgood"));         //������
			petall.setPetprice(res.getDouble("petprice"));    //����۸�
			petall.setPetshape(res.getString("petshape"));    //�������ͣ�����Ȯ��С��Ȯ��
			petall.setPethair(res.getString("pethair"));     //����ë������ëȮ����ëȮ��
			petall.setPet(res.getString("pet"));             //�������è������
			list.add(petall);
		}
		return list;
		
	}
	public  ArrayList<PetAll> addcar(String petnm) throws SQLException {  //���ﳵ
		ArrayList<PetAll> list = new ArrayList<PetAll>();
		String sql="select * from PET_ALL where petname =?";
		ResultSet res = db.preQuery(sql, petnm);
		PetAll petall = null;
		while(res.next()){
			petall = new PetAll();
			petall.setPetname(res.getString("petname"));	   //������
		    petall.setPettype(res.getString("pettype"));	   //��������
			petall.setPetsex(res.getString("petsex"));         //�����Ա�
			petall.setPetage(res.getInt("petage"));           //��������
			petall.setWeight(res.getDouble("weight"));        //��������
			petall.setPetgood(res.getInt("petgood"));         //������
			petall.setPetprice(res.getDouble("petprice"));    //����۸�
			petall.setPetshape(res.getString("petshape"));    //�������ͣ�����Ȯ��С��Ȯ��
			petall.setPethair(res.getString("pethair"));     //����ë������ëȮ����ëȮ��
			petall.setPet(res.getString("pet"));             //�������è������
			list.add(petall);
		}
		return list;
	}
	

}
