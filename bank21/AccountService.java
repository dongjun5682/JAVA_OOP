package bank21;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class AccountService {
	//���� �������� ��������� ���� �ʴ´�.
	
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
	
		return String.format("[��������]\n"
				+ "�����: %s\n"
				+ "���¹�ȣ: %s\n"
				+ "�̸�: %s\n"
				+ "������¥: %s\n"
				+ "�ܾ�: %s ",AccountBean.BANK_NAME,accountNum,name,today,money);
	}
//	public String deposit(String deposit){
//		int depo =Integer.parseInt(deposit);
//		money += depo;
//		return String.format("%d�� �ԱݵǾ����ϴ�.\n"
//				+ "�ܾ� : %d�� ",depo,money);
//	}
//	public String withdrawal(String withdrawal){
//		int withdrawals = Integer.parseInt(withdrawal);
//		money -= withdrawals;
//		return String.format("%d�� ��ݵǾ����ϴ�.\n"
//				+ "�ܾ� : %d�� ",withdrawals,money);
//	}
}
