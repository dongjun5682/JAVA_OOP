package gms1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int speed = scanner.nextInt();

		Car mcqueen = new Car(name, speed);
		mcqueen.printCarInfo();
		
	}
}
