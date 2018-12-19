package bank1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		Account account = null;
		while (true) {
			switch (JOptionPane.showInputDialog("[�޴�]\n"
					+ "0.����\n"
					+ "1.ȸ������\n"
					+ "2.ȸ������\n"
					+ "3.���°���\n"
					+ "4.��������\n"
					+ "5.�Ա�\n"
					+ "6.���")) {
			case "0":
				JOptionPane.showMessageDialog(null,"����Ǿ����ϴ�.");
				return;
			case "1":
				String id = JOptionPane.showInputDialog("ID �Է�");
				String name = JOptionPane.showInputDialog("�̸� �Է�");
				String ssn = JOptionPane.showInputDialog("�ֹι�ȣ �Է�");
				String pass = JOptionPane.showInputDialog("��й�ȣ �Է�");
				member = new Member(id, name, ssn, pass);
				JOptionPane.showMessageDialog(null,"���Լ���!!");
				break;
			case "2":
				JOptionPane.showMessageDialog(null, member.info());
				break;
			case "3":
				account =new Account(0);
				JOptionPane.showMessageDialog(null,String.format("���°� �����Ǿ����ϴ�\n"
						+ "%s",account.today()));
				break;
			case "4":
				String info = account.info(member.name);
				JOptionPane.showMessageDialog(null,info);
				break;
			case "5":
				String deposit = JOptionPane.showInputDialog("�Ա��� �ݾ��� �Է��ϼ���.");
				deposit = account.deposit(deposit);
				JOptionPane.showMessageDialog(null, deposit);
				break;
			case "6":
				String withdrawal = JOptionPane.showInputDialog("����� �ݾ��� �Է����ּ���.");
				withdrawal = account.withdrawal(withdrawal);
				JOptionPane.showMessageDialog(null, withdrawal);
				break;
			}
		}
	}
}
