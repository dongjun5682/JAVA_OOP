package bank1;

public class Member {
	String id,name,ssn,pass; 
	Member(String id,String name,String ssn, String pass){
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
		
	}
	public String info(){
		return String.format("[ȸ������]\n"
				+ "�̸�: %s\n"
				+ "�ֹι�ȣ: %s\n"
				+ "���̵�: %s\n"
				+ "��й�ȣ: %s",name,ssn,id,pass);
	}

}
