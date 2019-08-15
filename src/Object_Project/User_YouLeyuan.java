package Object_Project;

public class User_YouLeyuan {
	private String name;//消费对象名字
	private double money;//消费金额
	private String phone;//电话
	private String consumeType="游乐场";//消费类型
	private final double swimming=40;//游泳价钱
	private final double slide=10;//滑梯价钱
	private final double swing=10;//秋千价钱
	private final double brige=10;//独木桥价钱
	private final double circle=15;//跳圈价钱
	public User_YouLeyuan() {
	
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
	public double getSwimming() {
		return swimming;
	}
	public double getSlide() {
		return slide;
	}
	public double getSwing() {
		return swing;
	}
	public double getBrige() {
		return brige;
	}
	public double getCircle() {
		return circle;
	}
	

}
