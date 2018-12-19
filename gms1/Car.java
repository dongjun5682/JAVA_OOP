package gms1;

public class Car {
	String name;
	int speed;
	Car(String name, int speed){
		this.name = name;
		this.speed = speed;
	}
	public void printCarInfo(){
		System.out.println("The Name is "+ name);
		System.out.print("The Name is "+ speed);
	}
}
