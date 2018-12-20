package car;

public class CarBean {
	private String color, gearType;
	private int door; 
	
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
