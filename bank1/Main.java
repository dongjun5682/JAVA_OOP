package bank1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Account a = null;
		Member m = null;
		while (true) {
			switch (JOptionPane.showInputDialog("[�޴�]\n"
					+ "0.����\n"
					+ "1.ȸ������\n"
					+ "2.���°���\n"
					+ "3.��������")) {
			case "0":
				JOptionPane.showMessageDialog(null, "����.");
				return;
			case "1":
				String name = JOptionPane.showInputDialog("�̸� �Է�");
				String id = JOptionPane.showInputDialog("ID �Է�");
				String pass = JOptionPane.showInputDialog("��й�ȣ �Է�");
				String ssn = JOptionPane.showInputDialog("�ֹι�ȣ �Է�");
				String adres = JOptionPane.showInputDialog("�ּ� �Է�");	
				 m = new Member(name, id, pass, ssn, adres);
				JOptionPane.showMessageDialog(null,m.info());
				break;
			case "2":
				a = new Account(0);
				JOptionPane.showMessageDialog(null,a.open(m.name,m.adres));
				break;
				
			}
		}
	}
}
