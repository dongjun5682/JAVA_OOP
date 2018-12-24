package bank31;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		MemberBean member = null;
		AccountBean account = null;
		AccountService accountService = new AccountServiceImpl();
		MemberService  memberService = new MemberServiceImpl(); //����迭�� ��������� ���� 
		while (true) {
			switch (JOptionPane.showInputDialog("[�޴�]\n"
					+ "0.����\n"
					+ "1.ȸ������\n"
					+ "2.ȸ������\n"
					+ "3.���°���\n"
					+ "4.��������\n"
					+ "5.�Ա�\n"
					+ "6.���\n"
					+ "7.��й�ȣ����\n"
					+ "8.ȸ�� ��� ���� \n"
					+ "9.�α���\n"
					+ "10.��й�ȣ ����\n"
					+ "11.ȸ�� Ż��")) {
					case "0":
						JOptionPane.showMessageDialog(null,"����Ǿ����ϴ�.");
						return;
					case "1":
						memberService.join(
								JOptionPane.showInputDialog("ID �Է�"),
								JOptionPane.showInputDialog("�̸� �Է�"),
								JOptionPane.showInputDialog("�ֹι�ȣ �Է�"),
								JOptionPane.showInputDialog("��й�ȣ �Է�"));
						break;
					case "2":
						 member = memberService.find(JOptionPane.showInputDialog("���̵� �Է��ϼ���."));
						 JOptionPane.showMessageDialog(null,member);
						 break;
					case "3":
						account =new AccountBean();
						String accountNum = accountService.generatorAccountNum();
						account.setAccountNum(accountNum);
						String today = accountService.today();
						account.setToday(today);
						String sMoney = JOptionPane.showInputDialog("�Ա��ϼ���.");
						int iMoney = Integer.parseInt(sMoney);
						account.setMoney(iMoney);
						break;
					case "4":
						String info = accountService.info(account.getAccountNum(),member.getName(),account.getToday(),account.getMoney());
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
					case "8":
						JOptionPane.showMessageDialog(null, memberService.list());
						break;
					case "9":
						boolean ok = memberService.login(
								JOptionPane.showInputDialog("���̵� �Է��ϼ���."),
								JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���."));
					
						JOptionPane.showMessageDialog(null,(ok) ? "���ӵǾ����ϴ�" : "���̵� ��й�ȣ Ʋ���̽��ϴ�.");
						/*
						if(ok){
							JOptionPane.showMessageDialog(null,"���ӵǾ����ϴ�.");
						}else{
							JOptionPane.showMessageDialog(null,"���̵� ��й�ȣ Ʋ���̽��ϴ�.");
						}
						 * */
						break;
					case "10":
					boolean chagePass = memberService.update(
								JOptionPane.showInputDialog("���̵� �Է��ϼ���."),
								JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���."),
								JOptionPane.showInputDialog("�����Ͻ� ��й�ȣ�� �Է��ϼ���.")
								);
					JOptionPane.showMessageDialog(null,(chagePass) ? "����Ǿ����ϴ�." : "���̵� ��й�ȣ Ʋ���̽��ϴ�.");
						break;
					case "11":
					boolean withdraw = memberService.delet(
								JOptionPane.showInputDialog("���̵� �Է��ϼ���."),
								JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���.")					
								);
					JOptionPane.showMessageDialog(null, (withdraw) ? "Ż��Ǿ����ϴ�." : "���̵� ��й�ȣ Ʋ���̽��ϴ�.");
						break;
			}
		}
	}
}
