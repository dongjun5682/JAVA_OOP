package bank21;

public class MemberBean {
	private String id,name,ssn,pass; 
	
	public void setName(String name){// setter 세터
		this.name = name; //write
	}
	public String getName(){// getter 게터
		return name; //read
	}
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setSsn(String ssn){
		this.ssn = ssn;
	}
	public String getSsn(){
		return ssn;
	}
	public void setPass(String pass){
		this.pass = pass;
	}
	public String getPass(){
		return pass;
	}
	
	public String toString(){
		return String.format("[회원정보]\n"
				+ "이름: %s\n"
				+ "주민번호: %s\n"
				+ "아이디: %s\n"
				+ "비밀번호: %s",name,ssn,id,pass);
	}
}
