package com.oracle.property;
/*
 * lcy
 */
public class User {
	private String name;//消费对象名字
	private double money;//消费金额
	private String phone;//电话
	private String consumeType="美容";//消费类型	
	private double washPrice=100;//洗澡价钱
	private double cutHair=100;//剪发价钱
	private double trimx=15;//剪指甲价钱
	private double washEye=50;//洗泪痕
	private double knot=50;//开毛结
	private double brushTeeth=10;//刷牙
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getConsumeType() {
		return consumeType;
	}
	public void setConsumeType(String consumeType) {
		this.consumeType = consumeType;
	}

	
	
	public double getTrimx() {
		return trimx;
	}
	public void setTrimx(double trimx) {
		this.trimx = trimx;
	}
	public double getWashEye() {
		return washEye;
	}
	public void setWashEye(double washEye) {
		this.washEye = washEye;
	}
	public double getKnot() {
		return knot;
	}
	public void setKnot(double knot) {
		this.knot = knot;
	}
	public double getBrushTeeth() {
		return brushTeeth;
	}
	public void setBrushTeeth(double brushTeeth) {
		this.brushTeeth = brushTeeth;
	}
	public double getWashPrice() {
		return washPrice;
	}
	public void setWashPrice(double washPrice) {
		this.washPrice = washPrice;
	}
	public double getCutHair() {
		return cutHair;
	}
	public void setCutHair(double cutHair) {
		this.cutHair = cutHair;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public User() {
		super();
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
	

}
