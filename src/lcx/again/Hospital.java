package lcx.again;

public class Hospital {
	private String name;// ���Ѷ�������
	private double money;// ���ѽ��
	private String phone;// �绰
	private String consumeType = "ҽԺ";// ��������
	private final double quan = 100;// Ȯ��������
	private final double san = 50;// ��������
	private final double wu = 50;// ��������
	private final double kuang = 100;// ��Ȯ������
	private final double mao = 120;// è����
	private final double zhu = 300;// ����
	private final double wai = 200;// ����
	private final double ti = 100;// ���
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
