package card;

import javax.swing.JOptionPane;


public class CardController {
	public static void main(String[] args) {
		CardBean card = null;
		CardService cardService = new CardServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("[�޴�]\n"
					+ "0.����\n"
					+ "1.ī�弱�� \n"
					+ "2.ī�� �����ֱ�")) {
					case "0":
						JOptionPane.showMessageDialog(null,"����Ǿ����ϴ�.");
						return;
					case "1":
						String kind = JOptionPane.showInputDialog("ī�� ���� �Է��ϼ���.");
						String number = JOptionPane.showInputDialog("ī�� ��ȣ�� �Է��ϼ���.");
						cardService.add(kind,number);
						break;
					case "2":
						cardService.show();
						break;
			}
		}
	}
}