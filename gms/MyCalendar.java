package gms;

public class MyCalendar {
	public String leapYear(String year){
		String res = "";
		//����
		int y = Integer.parseInt(year);
		if((y%4 == 0 && y%100 != 0) || y%400 == 0) {
			res = "�����Դϴ�.";
		}else {
			res = "����Դϴ�.";
		}
		return res;
	}
}