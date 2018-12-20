package bank21;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class AccountService {
	//서비스 로직에는 멤버변수를 두지 않는다.
	
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
	public String info(String accountNum,String name ,String today, int money){
	
		return String.format("[계좌정보]\n"
				+ "은행명: %s\n"
				+ "계좌번호: %s\n"
				+ "이름: %s\n"
				+ "개설날짜: %s\n"
				+ "잔액: %s ",AccountBean.BANK_NAME,accountNum,name,today,money);
	}
//	public String deposit(String deposit){
//		int depo =Integer.parseInt(deposit);
//		money += depo;
//		return String.format("%d원 입금되었습니다.\n"
//				+ "잔액 : %d원 ",depo,money);
//	}
//	public String withdrawal(String withdrawal){
//		int withdrawals = Integer.parseInt(withdrawal);
//		money -= withdrawals;
//		return String.format("%d원 출금되었습니다.\n"
//				+ "잔액 : %d원 ",withdrawals,money);
//	}
}
