package bank1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Account a = null;
		Member m = null;
		while (true) {
			switch (JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료\n"
					+ "1.회원관리\n"
					+ "2.계좌개통\n"
					+ "3.계좌정보")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료.");
				return;
			case "1":
				String name = JOptionPane.showInputDialog("이름 입력");
				String id = JOptionPane.showInputDialog("ID 입력");
				String pass = JOptionPane.showInputDialog("비밀번호 입력");
				String ssn = JOptionPane.showInputDialog("주민번호 입력");
				String adres = JOptionPane.showInputDialog("주소 입력");	
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
