package bank31;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Random;

public interface AccountService {
	//���� �������� ��������� ���� �ʴ´�.
	
	public String today();
	/* 
	 *���� ���� ���ϱ�
	 * */
	public String generatorAccountNum();
	/* 
	 *���¹�ȣ ���ϱ�
	 * */
	public String info(String accountNum,String name ,String today, int money);
	/* 
	 *�������� �����ֱ�
	 * */
	public String deposit();
	/* 
	 *�Ա�
	 * */
	public String withdrawal();
	/* 
	 *���
	 * */
}
