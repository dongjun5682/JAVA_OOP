package phone;

public class AndroidPhoneBean extends IphoneBean {
	private String display;
	
	public void setDisplay(String display){
		this.display = display;
	}
	public String getDisplay(){
		return display;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("���� : %s\n"
				+ "����ȸ�� : %s\n"
				+ "�̵����ɼ� : %s\n"
				+ "ūȭ�� : %s\n"
				+ "�˻� : %s",getKind(),getCompany(),getMove(),display,getData());
	}
}
