package bank31;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Random;

public interface AccountService {
	//서비스 로직에는 멤버변수를 두지 않는다.
	
	public String today();
	/* 
	 *오늘 날자 구하기
	 * */
	public String generatorAccountNum();
	/* 
	 *계좌번호 구하기
	 * */
	public String info(String accountNum,String name ,String today, int money);
	/* 
	 *계좌정보 보여주기
	 * */
	public String deposit();
	/* 
	 *입금
	 * */
	public String withdrawal();
	/* 
	 *출금
	 * */
}
