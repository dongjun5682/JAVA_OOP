package bank21;

public class MemberBean {
	private String id,name,ssn,pass; 
	
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
