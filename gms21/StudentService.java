package gms21;

import java.util.Random;

public class StudentService {

	public String makeHakbun(){
		String hakbun ="";
		Random random = new Random();
		for (int i = 0; i < 4; i++) {
			hakbun += random.nextInt(10);
		}
		return hakbun;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
