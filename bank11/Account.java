package bank11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Account {
	public final static String BANK_NAME = "WooriBank";
	private String accountNum , today;
	private int money;
	Account(int money){
		this.accountNum = this.generatorAccountNum();
		this.today = this.today();
		this.money = money;
	}
	public String getAccountNum(){
		return accountNum;
	}
	public String getToday( ){
		return today;
	}
	public void setMoney(int money){
		this.money = money;
	}
	public int getMoney(){
		return money;
	}
	public String today(){
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
		 today = sdf.format(date);
		return today;
	}
	public String generatorAccountNum(){
		String accountNum = "";
		Random random =new Random();

		for (int i = 0; i < 8; i++) {
			if (i != 3) {
				accountNum += random.nextInt(10);
			}else{
				accountNum += random.nextInt(10)+"-";
			}	
		}
		return accountNum;
	}
	public String deposit(String deposit){
		int depo =Integer.parseInt(deposit);
		money += depo;
		return String.format("%d�� �ԱݵǾ����ϴ�.\n"
				+ "�ܾ� : %d�� ",depo,money);
	}
	public String withdrawal(String withdrawal){
		int withdrawals = Integer.parseInt(withdrawal);
		money -= withdrawals;
		return String.format("%d�� ��ݵǾ����ϴ�.\n"
				+ "�ܾ� : %d�� ",withdrawals,money);
	}
	public String toString(){
		String info = "";
		return String.format("[��������]\n"
				+ "�����: %s\n"
				+ "���¹�ȣ: %s\n"
				+ "�̸�: %s\n"
				+ "������¥: %s\n"
				+ "�ܾ�: %s ",BANK_NAME,accountNum,today,money);
	}

}