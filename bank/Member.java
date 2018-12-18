package bank;

public class Member {
	String id,name,ssn,pass;

	Member(String id,
			String pass,
			String name,
			String ssn){

		this.id = id;
		this.name = name;
		this.pass = pass;
		this.ssn = ssn;
	}

	public String info(){
		String info = "";
		
		return String.format("가입성공!! \n"
				+ "[회원정보]\n"
				+ "ID: %s \n"
				+ "비밀번호: %s \n"
				+ "이름: %s \n"
				+ "주민번호: %s",id,pass,name,ssn);
	}
}
