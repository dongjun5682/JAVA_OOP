package bank31;

public interface MemberService {
	//ȸ������
	public void join(String name,String id,String ssn,String pass);
	//��Ϻ���
	public MemberBean[] list();
	//�������� �˻�
	public MemberBean find(String id);
	//�α���
	public boolean login(String id,String pass);
	//ȸ����
	public int count();
	//���� ����
	public boolean update(String id ,String pass ,String newPass);
	//ȸ��Ż��
	public boolean delet(String id, String pass);
}
