package bank31;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		MemberBean member = null;
		AccountBean account = null;
		AccountService accountService = new AccountServiceImpl();
		MemberService  memberService = new MemberServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료\n"
					+ "1.회원가입\n"
					+ "2.회원정보\n"
					+ "3.계좌개설\n"
					+ "4.계좌정보\n"
					+ "5.입금\n"
					+ "6.출금\n"
					+ "7.비밀번호변경")) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료되었습니다.");
				return;
			case "1":
				memberService.join(
						JOptionPane.showInputDialog("ID 입력"),
						JOptionPane.showInputDialog("이름 입력"),
						JOptionPane.showInputDialog("주민번호 입력"),
						JOptionPane.showInputDialog("비밀번호 입력"));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, member.toString());
				break;
			case "3":
				account =new AccountBean();
				String accountNum = accountService.generatorAccountNum();
				account.setAccountNum(accountNum);
				String today = accountService.today();
				account.setToday(today);
				String sMoney = JOptionPane.showInputDialog("입금하세요.");
				int iMoney = Integer.parseInt(sMoney);
				account.setMoney(iMoney);
				break;
			case "4":
				String info = accountService.info(account.getAccountNum(),member.getName(),account.getToday(),account.getMoney());
				JOptionPane.showMessageDialog(null,info);
				break;
			case "5":
				String deposit = JOptionPane.showInputDialog("입금할 금액을 입력하세요.");
				//deposit = account.deposit(deposit);
				JOptionPane.showMessageDialog(null, deposit);
				break;
			case "6":
				String withdrawal = JOptionPane.showInputDialog("출금할 금액을 입력해주세요.");
				//withdrawal = account.withdrawal(withdrawal);
				JOptionPane.showMessageDialog(null, withdrawal);
				break;
			case "7":
				String PassChange = JOptionPane.showInputDialog("변경하실 비밀번호를 입력해주세요.");
				member.setPass(PassChange);
				JOptionPane.showMessageDialog(null,"변경되었습니다.");
				break;
				
				
				
			}
		}
	}
}
