package bank31;

public interface MemberService {
	//ȸ������
	public MemberBean join(String name,String id,String ssn,String pass);
	//�α���
	public void login();
	//���� ����
	public void update();
	//ȸ��Ż��
	public void delet();
}
