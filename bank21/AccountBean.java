package bank21;

public class AccountBean {
	public final static String BANK_NAME = "WooriBank";
	private String accountNum , today;
	private int money;

	public void setAccountNum(String accountNum){
		this.accountNum =accountNum;
	}
	public String getAccountNum(){
		return accountNum;
	}
	public void setToday(String today){
		this.today = today;
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

	public String toString(){
		return String.format("[��������]\n"
				+ "���¹�ȣ: %s\n"
				+ "������¥: %s\n"
				+ "�ܾ�: %s ",accountNum,today,money);
	}

}
