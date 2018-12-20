package card;

public class CardBean {
	private String kind;
	private int number;
	
	public void setKind(String kind){
		this.kind = kind;
	}
	public String getKind(){
		return kind;
	}
	public void setNumber(int number){
		this.number = number;
	}
	public int getNumber(){
		return number;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
