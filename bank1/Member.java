package bank1;

public class Member {
	//ȸ������
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
		return String.format("���Լ���!!\n"
				+ "[ȸ������]\n"
				+ "�� ��: %s \n"
				+ "ID: %s \n"
				+ "��й�ȣ: %s \n"
				+ "�ֹι�ȣ: %s \n"
				+ "�ּ�: %s \n",name,id,pass,ssn,adres);
	}

}
