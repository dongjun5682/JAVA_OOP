package phone;

public class CelPhoneBean extends PhoneBean{
	
	private String move;

	public void setMove(String move){
		this.move = move;
	}
	public String getMove(){
		return move;
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return String.format("���� : %s\n"
//				+ "����ȸ�� : %s\n"
//				+ "�̵����ɼ� : %s\n"
//				+ "��ȭ���� : %s",super.getKind(),super.getCompany(),move,super.getCall());
//	}

}
