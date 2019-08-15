package Object_Project;

/**
 * 
 * @author lcy 顾客 美容院 消费 对象
 */
public class User_MeiRong {
	private String name;// 消费对象名字
	private double money;// 消费金额
	private String phone;// 电话
	private String consumeType = "美容";// 消费类型
	private final double washPrice = 100;// 洗澡价钱
	private final double cutHair = 100;// 剪发价钱
	private final double trimx = 15;// 剪指甲价钱
	private final double washEye = 50;// 洗泪痕
	private final double knot = 50;// 开毛结
	private final double brushTeeth = 10;// 刷牙

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

	public double getWashEye() {
		return washEye;
	}

	public double getKnot() {
		return knot;
	}

	public double getBrushTeeth() {
		return brushTeeth;
	}

	public double getWashPrice() {
		return washPrice;
	}

	public double getCutHair() {
		return cutHair;
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

	public void setMoney(double money) {
		this.money = money;
	}

	public User_MeiRong() {
		super();
	}

}
