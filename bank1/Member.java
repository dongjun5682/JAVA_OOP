package bank1;

public class Member {
	//회원가입
	String name,id,pass,ssn,adres;
	Member(String name,
			String id,
			String pass,
			String ssn,
			String adres) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.ssn = ssn;
		this.adres = adres;
	}
	public String info(){
		return String.format("가입성공!!\n"
				+ "[회원정보]\n"
				+ "이 름: %s \n"
				+ "ID: %s \n"
				+ "비밀번호: %s \n"
				+ "주민번호: %s \n"
				+ "주소: %s \n",name,id,pass,ssn,adres);
	}

}
