package phone;

import javax.swing.JOptionPane;

import bank31.AccountServiceImpl;
public class Main {
	public static void main(String[] args) {
		PhoneBean phone = null;
		CelPhoneBean celphone = null;
		IphoneBean iphone = null;
		AndroidPhoneBean aPhone = null;
		while (true) {
			switch (JOptionPane.showInputDialog("[�޴�]\n"
					+ "0.����\n"
					+ "1.�Ϲ��� \n"
					+ "2.�޴���\n"
					+ "3.������\n"
					+ "4.�ȵ���̵�\n"
					+ "5.\n" )) {
					case "0":
						JOptionPane.showMessageDialog(null,"����Ǿ����ϴ�.");
						return;
					case "1":
						phone = new PhoneBean();
						String kind = JOptionPane.showInputDialog("��ȸ�� ������ �Է��ϼ���.");
						phone.setKind(kind);
						String company = JOptionPane.showInputDialog("���ȸ�� ��ǰ�ΰ���?");
						phone.setCompany(company);
						String call = JOptionPane.showInputDialog("��ȭ����");
						phone.setCall(call);
						JOptionPane.showMessageDialog(null,phone.toString());			
						break;
					case "2":
						celphone = new CelPhoneBean();
						kind = JOptionPane.showInputDialog("��ȸ�� ������ �Է��ϼ���.");
						celphone.setKind(kind);
						company = JOptionPane.showInputDialog("���ȸ�� ��ǰ�ΰ���?");
						celphone.setCompany(company);
						call = JOptionPane.showInputDialog("��ȭ����");
						celphone.setCall(call);
						String move = JOptionPane.showInputDialog("�̵����ɼ� ");
						celphone.setMove(move);
						JOptionPane.showMessageDialog(null,celphone.toString());	
						break;
					case "3":
						iphone = new IphoneBean();
						kind = JOptionPane.showInputDialog("��ȸ�� ������ �Է��ϼ���.");
						iphone.setKind(kind);
						company = JOptionPane.showInputDialog("���ȸ�� ��ǰ�ΰ���?");
						iphone.setCompany(company);
						move = JOptionPane.showInputDialog("�̵����ɼ� ");
						iphone.setMove(move);
						String data = JOptionPane.showInputDialog("�˻�");
						iphone.setData(data);
						JOptionPane.showMessageDialog(null,iphone.toString());	
						break;
					case "4":
						aPhone = new AndroidPhoneBean();
						kind = JOptionPane.showInputDialog("��ȸ�� ������ �Է��ϼ���.");
						aPhone.setKind(kind);
						company = JOptionPane.showInputDialog("���ȸ�� ��ǰ�ΰ���?");
						aPhone.setCompany(company);
						move = JOptionPane.showInputDialog("�̵����ɼ� ");
						aPhone.setMove(move);
						String display = JOptionPane.showInputDialog("����ġ?");
						aPhone.setDisplay(display);
						data = JOptionPane.showInputDialog("�˻�");
						aPhone.setData(data);
						JOptionPane.showMessageDialog(null,aPhone.toString());	
						break;
			}
		}
	}
}