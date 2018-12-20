package gms21;

public class StudentBean {
	private String hakbun,name,ssn,pass;

	public void setHakbun(String hakbun){
		this.hakbun = hakbun;
	}
	public String getHakbun(){
		return hakbun;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
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

	@Override
	public String toString() {
		return String.format("[학생 정보 ]\n"
				+ "학번 : %s\n"
				+ "이름 : %s\n"
				+ "주민번호 : %s\n"
				+ "비밀번호 : %s\n",hakbun,name,ssn,pass);
	}
}
