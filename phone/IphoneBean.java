package phone;

public class IphoneBean extends CelPhoneBean {
	private String data;

	public void setData(String data){
		this.data = data;
	}
	public String getData(){
		return data;
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return String.format("���� : %s\n"
//				+ "����ȸ�� : %s\n"
//				+ "�̵����ɼ� : %s\n"
//				+ "�˻� : %s",super.getKind(),super.getCompany(),super.getMove(),data);
//	}
}

