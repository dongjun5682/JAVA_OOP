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
		
		return String.format("���Լ���!! \n"
				+ "[ȸ������]\n"
				+ "ID: %s \n"
				+ "��й�ȣ: %s \n"
				+ "�̸�: %s \n"
				+ "�ֹι�ȣ: %s",id,pass,name,ssn);
	}
}
