package car;

public class CarBean {
	private String brand,color, gearType;
	private int door; //���� ����
	
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setGearType(String gearType){
		this.gearType = gearType;
	}
	public String getgearType(){
		return gearType;
	}
	public void setDoor(int door){
		this.door = door;
	}
	public int getDoor(){
		return door;
	}	
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	@Override
	public String toString() {
		return String.format("[��������]\n"
				+ "������ : %s\n"
				+ "����: %s\n"
				+ "��� : %s\n"
				+ "���� ����: %s",brand,color,gearType,door);
	}
}
