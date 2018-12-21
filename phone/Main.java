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
			switch (JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료\n"
					+ "1.일반폰 \n"
					+ "2.휴대폰\n"
					+ "3.아이폰\n"
					+ "4.안드로이드\n"
					+ "5.\n" )) {
					case "0":
						JOptionPane.showMessageDialog(null,"종료되었습니다.");
						return;
					case "1":
						phone = new PhoneBean();
						String kind = JOptionPane.showInputDialog("전회기 종류를 입력하세요.");
						phone.setKind(kind);
						String company = JOptionPane.showInputDialog("어느회사 제품인가요?");
						phone.setCompany(company);
						String call = JOptionPane.showInputDialog("통화내용");
						phone.setCall(call);
						JOptionPane.showMessageDialog(null,phone.toString());			
						break;
					case "2":
						celphone = new CelPhoneBean();
						kind = JOptionPane.showInputDialog("전회기 종류를 입력하세요.");
						celphone.setKind(kind);
						company = JOptionPane.showInputDialog("어느회사 제품인가요?");
						celphone.setCompany(company);
						call = JOptionPane.showInputDialog("통화내용");
						celphone.setCall(call);
						String move = JOptionPane.showInputDialog("이동가능성 ");
						celphone.setMove(move);
						JOptionPane.showMessageDialog(null,celphone.toString());	
						break;
					case "3":
						iphone = new IphoneBean();
						kind = JOptionPane.showInputDialog("전회기 종류를 입력하세요.");
						iphone.setKind(kind);
						company = JOptionPane.showInputDialog("어느회사 제품인가요?");
						iphone.setCompany(company);
						move = JOptionPane.showInputDialog("이동가능성 ");
						iphone.setMove(move);
						String data = JOptionPane.showInputDialog("검색");
						iphone.setData(data);
						JOptionPane.showMessageDialog(null,iphone.toString());	
						break;
					case "4":
						aPhone = new AndroidPhoneBean();
						kind = JOptionPane.showInputDialog("전회기 종류를 입력하세요.");
						aPhone.setKind(kind);
						company = JOptionPane.showInputDialog("어느회사 제품인가요?");
						aPhone.setCompany(company);
						move = JOptionPane.showInputDialog("이동가능성 ");
						aPhone.setMove(move);
						String display = JOptionPane.showInputDialog("몇인치?");
						aPhone.setDisplay(display);
						data = JOptionPane.showInputDialog("검색");
						aPhone.setData(data);
						JOptionPane.showMessageDialog(null,aPhone.toString());	
						break;
			}
		}
	}
}