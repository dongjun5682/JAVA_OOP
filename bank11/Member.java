package bank11;

public class Member {
	private String id,name,ssn,pass; 
	public Member(String id,String name,String ssn, String pass){
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;

	}
	public void setName(String name){// setter ����
		this.name = name; //write
	}
	public String getName(){// getter ����
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
		return String.format("[ȸ������]\n"
				+ "�̸�: %s\n"
				+ "�ֹι�ȣ: %s\n"
				+ "���̵�: %s\n"
				+ "��й�ȣ: %s",name,ssn,id,pass);
	}
}
