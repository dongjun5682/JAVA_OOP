package car;

public interface CarService {
	/**
	 * 판매할 차량을 입고시킨다.
	 * */
	public void add(String brand,String color,String gearType,String door);
	public void list();
	public void find();
	public void sell();	
	
}
