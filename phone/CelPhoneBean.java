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
//		return String.format("종류 : %s\n"
//				+ "제조회사 : %s\n"
//				+ "이동가능성 : %s\n"
//				+ "통화내용 : %s",super.getKind(),super.getCompany(),move,super.getCall());
//	}

}
