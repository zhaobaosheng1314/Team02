package Object_Project;
/**
 * �Ž���
 * �̳�  ������ʵ�����
 */
public class PetAll {
	private String petname;    //������
	private String pettype;    //��������
	private String petsex;     //�����Ա�
	private int petage;       //��������
	private double weight;    //��������
	private int petgood;      //������
	private double petprice;  //����۸�
    private String petshape;    //�������ͣ�����Ȯ��С��Ȯ��
    private String pethair;   //����ë������ëȮ����ëȮ��
    private String pet;       //�������è������
    public String getPetname() {
		return petname;
	}
	public void setPetname(String petname) {
		this.petname = petname;
	}
	public String getPettype() {
		return pettype;
	}
	public void setPettype(String pettype) {
		this.pettype = pettype;
	}
	public String getPetsex() {
		return petsex;
	}
	public void setPetsex(String petsex) {
		this.petsex = petsex;
	}
	public int getPetage() {
		return petage;
	}
	public void setPetage(int petage) {
		this.petage = petage;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getPetgood() {
		return petgood;
	}
	public void setPetgood(int petgood) {
		this.petgood = petgood;
	}
	public double getPetprice() {
		return petprice;
	}
	public void setPetprice(double petprice) {
		this.petprice = petprice;
	}
	public String getPetshape() {
		return petshape;
	}
	public void setPetshape(String petshape) {
		this.petshape = petshape;
	}
	public String getPethair() {
		return pethair;
	}
	public void setPethair(String pethair) {
		this.pethair = pethair;
	}
	public String getPet() {
		return pet;
	}
	public void setPet(String pet) {
		this.pet = pet;
	}
	
	public PetAll() {
		super();
	}
	public PetAll(String petname, String pettype, String petsex, int petage,
			double weight, int petgood, double petprice, String petshape,
			String pethair, String pet) {
		super();
		this.petname = petname;
		this.pettype = pettype;
		this.petsex = petsex;
		this.petage = petage;
		this.weight = weight;
		this.petgood = petgood;
		this.petprice = petprice;
		this.petshape = petshape;
		this.pethair = pethair;
		this.pet = pet;
	}
	@Override
	public String toString() {
		return "PetAll [petname=" + petname + ", pettype=" + pettype
				+ ", petsex=" + petsex + ", petage=" + petage + ", weight="
				+ weight + ", petgood=" + petgood + ", petprice=" + petprice
				+ ", petshape=" + petshape + ", pethair=" + pethair + ", pet="
				+ pet + "]";
	}
	
}
