package zsdp.entity;

public class User {

	private String name; // 顾客姓名
	private String phone;// 手机号
	private double money; // 消费金额
	private String consumeType; // 消费类型

	public User() {
		super();
	}

	public User(String name, String phone, double money, String consumeType) {
		super();
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.consumeType = consumeType;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", money=" + money + ", consumeType=" + consumeType + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getConsumeType() {
		return consumeType;
	}

	public void setConsumeType(String consumeType) {
		this.consumeType = consumeType;
	}

}
