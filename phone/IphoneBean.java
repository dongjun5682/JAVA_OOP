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
//		return String.format("종류 : %s\n"
//				+ "제조회사 : %s\n"
//				+ "이동가능성 : %s\n"
//				+ "검색 : %s",super.getKind(),super.getCompany(),super.getMove(),data);
//	}
}

