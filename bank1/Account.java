package bank1;

import java.util.Random;

public class Account {
	//통장 개설
	final String BANK_NAME ="우리은행";
	String accountNum;
	int money;
	Account(int money){
		this.accountNum = this.generatorAccountNum();
		this.money = money;

	}
	public String open(String name,String adres){
		return String.format("[개통이 완료되었습니다.]\n"
				+ "은행: %s \n"
				+ "계좌번호: %s \n"
				+ "잔액: %s ", BANK_NAME,accountNum,money);
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
