package phone;
/*
 * company ������
 * call ��ȭ
 * kind ����	
 *  */
public class PhoneBean {
	private String kind,company,call;
	
	public void setKind(String kind){
		this.kind = kind;
	}
	public String getKind(){
		return kind;
	}
	public void setCompany(String company){
		this.company = company;
	}
	public String getCompany(){
		return company;
	}
	public void setCall(String call){
		this.call = call;
	}
	public String getCall(){
		return call;
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return String.format("���� : %s\n"
//				+ "����ȸ�� : %s\n"
//				+ "��ȭ���� : %s",kind,company,call);
//	}
}
