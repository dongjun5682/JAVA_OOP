package car;

public class CarBean {
	private String brand,color, gearType;
	private int door; //문의 갯수
	
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
		return String.format("[차량정보]\n"
				+ "제조사 : %s\n"
				+ "색깔: %s\n"
				+ "기어 : %s\n"
				+ "문의 갯수: %s",brand,color,gearType,door);
	}
}
