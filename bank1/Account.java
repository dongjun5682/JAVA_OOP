package bank1;

import java.util.Random;

public class Account {
	//���� ����
	final String BANK_NAME ="�츮����";
	String accountNum;
	int money;
	Account(int money){
		this.accountNum = this.generatorAccountNum();
		this.money = money;

	}
	public String open(String name,String adres){
		return String.format("[������ �Ϸ�Ǿ����ϴ�.]\n"
				+ "����: %s \n"
				+ "���¹�ȣ: %s \n"
				+ "�ܾ�: %s ", BANK_NAME,accountNum,money);
	}
	public String generatorAccountNum(){
		String number ="";
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			if(i != 3){
				number += random.nextInt(10);
			}else{
				number += random.nextInt(10)+"-";
			}	
		}
		return number;
	}
}
