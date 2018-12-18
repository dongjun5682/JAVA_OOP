package bank;

import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
	final String BANK_NAME = "��������"; //��� 
	String accountNum;
	int money;
	String today;
	Account(int money){
		this.accountNum = this.generatorAccountNum();
		this.money = money;
		this.today = this.today();
	}
	public String generatorAccountNum(){
		String accountNum = "";
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			if(i == 3){
				accountNum += random.nextInt(10)+"-";
			}else{
				accountNum += random.nextInt(10)+"";
				
			}
		}
		
		return accountNum;
	}
	public String today(){
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		today = sdf.format(date);
		return today;
	}
	public String open(String name){
		return String.format("�����̸�: %s \n"
				+ "���¹�ȣ: %s \n"
				+ "�� ��: %s \n"
				+ "�� �� �� ¥: %s \n"
				+ "�ܾ�: %s ",BANK_NAME,accountNum,name,today,money);
	}
}
