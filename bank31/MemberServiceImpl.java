package bank31;

public class MemberServiceImpl implements MemberService {
	private MemberBean[] members;
	private int count;
	MemberServiceImpl() {
		members = new MemberBean[10];
		count=0;

	}
	@Override
	public void join(String name, String id, 
			String ssn, String pass) {
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setName(name);
		member.setSsn(ssn);
		member.setPass(pass);
		members[count] =member; 
		count++;
	}
	@Override
	public MemberBean[] list() {
		return members;
	}
	@Override
	public MemberBean find(String id) {
		MemberBean member = new MemberBean();
		for (int i = 0; i < count; i++) {
			if(members[i].getId().equals(id)){
				member = members[i];
				break;
			}
		}
		return member;
	}
	@Override
	public int count(){
		return count;
	}
	@Override
	public boolean login(String id,String pass) {
		boolean ok = false;
		System.out.println(count);
		for (int i= 0; i < count; i++) {
			if(members[i].getId().equals(id) && members[i].getId().equals(pass)){
				ok = true;
				break;
			}else{
				ok = false;
			}
		}
		return ok;

	}
	@Override
	public boolean update(String id ,String pass ,String newPass) {
		boolean chagePass = false;
		MemberBean member = new MemberBean();
		for (int i = 0; i < count; i++) {
			if(members[i].getId().equals(id) && members[i].getPass().equals(pass)){
				member = members[i];
				member.setPass(newPass);
				chagePass = true;
				break;
			}else{
				chagePass = false;
			}
		}
		return chagePass;
	}
	@Override
	public boolean delet(String id, String pass) {
		boolean withdraw = false;
		MemberBean member = new MemberBean();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			if (this.login(id, pass)) {
				members[i] = null;
				withdraw = true;
				break;
			}else{
				withdraw = false;
			}
		}
		return withdraw;
	}



}
