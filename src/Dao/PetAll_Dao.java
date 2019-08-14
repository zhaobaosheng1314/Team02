package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DButils.DButils;
import Object_Project.PetAll;
/**
 * 
 * @author zbs
 *	PetAll专用Dao层
 */
public class PetAll_Dao {
	DButils db = new DButils();
	/**
	 * 
	 * @author zjx
	 *	购宠商城查询PetAll
	 */
	public ArrayList<PetAll> petAllDao() throws SQLException{
		
		ArrayList<PetAll> list = new ArrayList<PetAll>();
		String sql="select * from pet_all";
		ResultSet  res = db.preQuery(sql);
		PetAll petall = null;
		while(res.next()){
			petall = new PetAll();
			petall.setPetname(res.getString("petname"));	   //宠物名
		    petall.setPettype(res.getString("pettype"));	   //宠物类型
			petall.setPetsex(res.getString("petsex"));         //宠物性别
			petall.setPetage(res.getInt("petage"));           //宠物年龄
			petall.setWeight(res.getDouble("weight"));        //宠物体重
			petall.setPetgood(res.getInt("petgood"));         //点赞数
			petall.setPetprice(res.getDouble("petprice"));    //宠物价格
			petall.setPetshape(res.getString("petshape"));    //宠物体型（大型犬，小型犬）
			petall.setPethair(res.getString("pethair"));     //宠物毛发（短毛犬，长毛犬）
			petall.setPet(res.getString("pet"));             //宠物类别（猫，狗）
			list.add(petall);
		}
		return list;
		
	}
	public ArrayList<PetAll> seek(String hunt) throws SQLException{    //搜索
		ArrayList<PetAll> list = new ArrayList<PetAll>();
		String sql = "select * from pet_all where pet=?";
		ResultSet res = db.preQuery(sql, hunt);
		
		PetAll petall = null;
		while(res.next()){
			petall = new PetAll();
			petall.setPetname(res.getString("petname"));	   //宠物名
		    petall.setPettype(res.getString("pettype"));	   //宠物类型
			petall.setPetsex(res.getString("petsex"));         //宠物性别
			petall.setPetage(res.getInt("petage"));           //宠物年龄
			petall.setWeight(res.getDouble("weight"));        //宠物体重
			petall.setPetgood(res.getInt("petgood"));         //点赞数
			petall.setPetprice(res.getDouble("petprice"));    //宠物价格
			petall.setPetshape(res.getString("petshape"));    //宠物体型（大型犬，小型犬）
			petall.setPethair(res.getString("pethair"));     //宠物毛发（短毛犬，长毛犬）
			petall.setPet(res.getString("pet"));             //宠物类别（猫，狗）
			list.add(petall);
		}
		return list;
		
	}
	public  ArrayList<PetAll> addcar(String petnm) throws SQLException {  //购物车
		ArrayList<PetAll> list = new ArrayList<PetAll>();
		String sql="select * from PET_ALL where petname =?";
		ResultSet res = db.preQuery(sql, petnm);
		PetAll petall = null;
		while(res.next()){
			petall = new PetAll();
			petall.setPetname(res.getString("petname"));	   //宠物名
		    petall.setPettype(res.getString("pettype"));	   //宠物类型
			petall.setPetsex(res.getString("petsex"));         //宠物性别
			petall.setPetage(res.getInt("petage"));           //宠物年龄
			petall.setWeight(res.getDouble("weight"));        //宠物体重
			petall.setPetgood(res.getInt("petgood"));         //点赞数
			petall.setPetprice(res.getDouble("petprice"));    //宠物价格
			petall.setPetshape(res.getString("petshape"));    //宠物体型（大型犬，小型犬）
			petall.setPethair(res.getString("pethair"));     //宠物毛发（短毛犬，长毛犬）
			petall.setPet(res.getString("pet"));             //宠物类别（猫，狗）
			list.add(petall);
		}
		return list;
	}
	

}
