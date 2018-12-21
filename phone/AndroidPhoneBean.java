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
		return String.format("종류 : %s\n"
				+ "제조회사 : %s\n"
				+ "이동가능성 : %s\n"
				+ "큰화면 : %s\n"
				+ "검색 : %s",getKind(),getCompany(),getMove(),display,getData());
	}
}
