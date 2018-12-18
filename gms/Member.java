package gms;

public class Member {
	String name; //��� ����
	double a ;
	public String bmi(String[] arr){
		String bmi = "";//�������� -> ���ú���
		double h = Double.parseDouble(arr[0]);
		double w = Double.parseDouble(arr[1]);
	
		double bm = w/((h*h)/10000);
		if(bm > 40){
			bmi = "�����Դϴ�.";
		}else if(bm >= 35){
			bmi = "2�ܰ� ���Դϴ�.";
		}else if(bm >= 30){
			bmi = "1�ܰ� ���Դϴ�.";
		}else if(bm >= 25){
			bmi = "��ü�� �Դϴ�.";
		}else if(bm > 18.5){
			bmi = "���� �Դϴ�.";
		}else {
			bmi = "��ü���Դϴ�.";
		}
		return String.format("ü����  %s. ",bmi);
	} //bmi end
	public String grade(String[] scores){
		String grade = "";
		/*����,����,����,����,��ȸ ���� ������ �Է� �޾Ƽ� ����� ����
		100~90 A, B, C, D, E, F �� ���°�
		*/
		int num1 = Integer.parseInt(scores[0]);
		int num2 = Integer.parseInt(scores[1]);
		int num3 = Integer.parseInt(scores[2]);
		int num4 = Integer.parseInt(scores[3]);
		int num5 = Integer.parseInt(scores[4]);
		int avg = (num1+num2+num3+num4+num5) /5;
		if(avg > 90){
			grade = "A�����Դϴ�.";
		}else if(avg > 80){
			grade = "B�����Դϴ�.";
		}else if(avg > 70){
			grade = "C�����Դϴ�.";
		}else if(avg > 60){
			grade = "D�����Դϴ�.";
		}else if(avg > 50){
			grade = "E�����Դϴ�.";
		}else if(avg < 50){
			grade = "F�����Դϴ�.";
		}else if(avg < 0 || avg >100){
			grade = "0~100���̿� ������ �Է����ּ���.";
		}
		
		
		
		return grade;
	}
	
	public String genderChecker(String number){
		String checker = "";
		char ch =number.charAt(7);
		
		if(ch == '1' || ch == '3'){
			checker = "����";
		}else if(ch == '2' || ch == '4'){
			checker = "����";
		}else if(ch == '5' || ch == '6'){
			checker = "�ܱ���";
		}else if(ch == '0' || ch == '7' || ch == '8' || ch == '9'){
			checker = "�߸��Է��ϼ̽��ϴ�.";
		}
		return checker;
	}
	
	
}
