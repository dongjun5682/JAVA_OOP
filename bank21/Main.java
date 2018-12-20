package bank21;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		MemberBean member = null;
		AccountBean account = null;
		AccountService service = new AccountService();
		while (true) {
			switch (JOptionPane.showInputDialog("[�޴�]\n"
					+ "0.����\n"
					+ "1.ȸ������\n"
					+ "2.ȸ������\n"
					+ "3.���°���\n"
					+ "4.��������\n"
					+ "5.�Ա�\n"
					+ "6.���\n"
					+ "7.��й�ȣ����")) {
			case "0":
				JOptionPane.showMessageDialog(null,"����Ǿ����ϴ�.");
				return;
			case "1":
				member = new MemberBean();
				String id = JOptionPane.showInputDialog("ID �Է�");
				member.setId(id);
				String name = JOptionPane.showInputDialog("�̸� �Է�");
				member.setName(name);
				String ssn = JOptionPane.showInputDialog("�ֹι�ȣ �Է�");
				member.setSsn(ssn);
				String pass = JOptionPane.showInputDialog("��й�ȣ �Է�");
				member.setPass(pass);
				JOptionPane.showMessageDialog(null,"���Լ���!!");
				break;
			case "2":
				JOptionPane.showMessageDialog(null, member.toString());
				break;
			case "3":
				account =new AccountBean();
				String accountNum = service.generatorAccountNum();
				account.setAccountNum(accountNum);
				String today = service.today();
				account.setToday(today);
				String sMoney = JOptionPane.showInputDialog("�Ա��ϼ���.");
				int iMoney = Integer.parseInt(sMoney);
				account.setMoney(iMoney);
				break;
			case "4":
				String info = service.info(account.getAccountNum(),member.getName(),account.getToday(),account.getMoney());
				JOptionPane.showMessageDialog(null,info);
				break;
			case "5":
				String deposit = JOptionPane.showInputDialog("�Ա��� �ݾ��� �Է��ϼ���.");
				//deposit = account.deposit(deposit);
				JOptionPane.showMessageDialog(null, deposit);
				break;
			case "6":
				String withdrawal = JOptionPane.showInputDialog("����� �ݾ��� �Է����ּ���.");
				//withdrawal = account.withdrawal(withdrawal);
				JOptionPane.showMessageDialog(null, withdrawal);
				break;
			case "7":
				String PassChange = JOptionPane.showInputDialog("�����Ͻ� ��й�ȣ�� �Է����ּ���.");
				member.setPass(PassChange);
				JOptionPane.showMessageDialog(null,"����Ǿ����ϴ�.");
				break;
				
				
				
			}
		}
	}
}
