package zsdp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import zsdp.entity.Food;
import DButils.DButils;

public class FoodDao {
	
	/**
	 * 查询所有信息
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Food> queryAll() throws SQLException{
		DButils db = new DButils();
		String sql ="select * from food";
		ResultSet rs =db.preQuery(sql);
		Food food =new Food();
		ArrayList<Food> list =new ArrayList<Food>();
		while(rs.next()){
			food.setShopName(rs.getString("shopName"));
			food.setPrice(rs.getDouble("price"));
			food.setShopType(rs.getString("shoptype"));
			food.setWeight(rs.getDouble("weight"));
			food.setAmount(rs.getInt("amount"));
			list.add(food); //用集合存放对象
			
		}
		return list;
		
	}

	
	/**
	 * 添加数据
	 * @param food
	 * @return
	 */
	public int adddate(Food food){
		DButils db = new DButils();
		String sql ="insert into food(shopName,price,shoptype,weight,amount) values(?,?,?,?,?)";
		int no =db.preUpdate(sql, food.getShopName(),food.getPrice(),food.getShopType(),food.getWeight(),food.getAmount());
		return no;
		
	}
	
	
}
