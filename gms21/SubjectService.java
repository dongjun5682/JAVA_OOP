package gms21;

public class SubjectService {

	public String toString(String name,String hakbun,String subjName,String profName,int score) {
		return String.format("�̸� : %s\n"
						+ "�й� : %s\n"
						+ "���� ����: %s\n"
						+ "���� �̸�: %s\n"
						+ "����: %s",name,hakbun,subjName,profName,score);
	}
}
