package card;

import javax.swing.JOptionPane;

import bank21.AccountBean;
import bank21.AccountService;
import bank21.MemberBean;

public class Main {
	public static void main(String[] args) {
		while (true) {
			switch (JOptionPane.showInputDialog("[�޴�]\n"
					+ "0.����\n"
					+ "1.ī�弱�� \n"
					+ "2.ī�� �����ֱ�")) {
					case "0":
						JOptionPane.showMessageDialog(null,"����Ǿ����ϴ�.");
						return;
					case "1":
						//ī�� ����
						//ī���� ��ȣ
						break;
					case "2":
						//������ ī���� ����
						break;
			}
		}
	}
}