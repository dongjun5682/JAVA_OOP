package card;

import javax.swing.JOptionPane;


public class CardController {
	public static void main(String[] args) {
		CardBean card = null;
		CardService cardService = new CardServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료\n"
					+ "1.카드선택 \n"
					+ "2.카드 보여주기")) {
					case "0":
						JOptionPane.showMessageDialog(null,"종료되었습니다.");
						return;
					case "1":
						String kind = JOptionPane.showInputDialog("카드 종류 입력하세요.");
						String number = JOptionPane.showInputDialog("카드 번호를 입력하세요.");
						cardService.add(kind,number);
						break;
					case "2":
						cardService.show();
						break;
			}
		}
	}
}