package lcx.again;

public class Hospital {
	private String name;// 消费对象名字
	private double money;// 消费金额
	private String phone;// 电话
	private String consumeType = "医院";// 消费类型
	private final double quan = 100;// 犬六联疫苗
	private final double san = 50;// 三联疫苗
	private final double wu = 50;// 五联疫苗
	private final double kuang = 100;// 狂犬病疫苗
	private final double mao = 120;// 猫三联
	private final double zhu = 300;// 蛀虫
	private final double wai = 200;// 外伤
	private final double ti = 100;// 体检
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
	public double getQuan() {
		return quan;
	}
	public double getSan() {
		return san;
	}
	public double getWu() {
		return wu;
	}
	public double getKuang() {
		return kuang;
	}
	public double getMao() {
		return mao;
	}
	public double getZhu() {
		return zhu;
	}
	public double getWai() {
		return wai;
	}
	public double getTi() {
		return ti;
	}
	public Hospital() {
		super();
		
	}

}
