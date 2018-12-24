package bank31;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		MemberBean member = null;
		AccountBean account = null;
		AccountService accountService = new AccountServiceImpl();
		MemberService  memberService = new MemberServiceImpl(); //멤버배열이 만들어지는 지점 
		while (true) {
			switch (JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료\n"
					+ "1.회원가입\n"
					+ "2.회원정보\n"
					+ "3.계좌개설\n"
					+ "4.계좌정보\n"
					+ "5.입금\n"
					+ "6.출금\n"
					+ "7.비밀번호변경\n"
					+ "8.회원 목록 보기 \n"
					+ "9.로그인\n"
					+ "10.비밀번호 변경\n"
					+ "11.회원 탈퇴")) {
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
						 member = memberService.find(JOptionPane.showInputDialog("아이디를 입력하세요."));
						 JOptionPane.showMessageDialog(null,member);
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
					case "8":
						JOptionPane.showMessageDialog(null, memberService.list());
						break;
					case "9":
						boolean ok = memberService.login(
								JOptionPane.showInputDialog("아이디를 입력하세요."),
								JOptionPane.showInputDialog("비밀번호를 입력하세요."));
					
						JOptionPane.showMessageDialog(null,(ok) ? "접속되었습니다" : "아이디 비밀번호 틀리셨습니다.");
						/*
						if(ok){
							JOptionPane.showMessageDialog(null,"접속되었습니다.");
						}else{
							JOptionPane.showMessageDialog(null,"아이디 비밀번호 틀리셨습니다.");
						}
						 * */
						break;
					case "10":
					boolean chagePass = memberService.update(
								JOptionPane.showInputDialog("아이디를 입력하세요."),
								JOptionPane.showInputDialog("비밀번호를 입력하세요."),
								JOptionPane.showInputDialog("변경하실 비밀번호를 입력하세요.")
								);
					JOptionPane.showMessageDialog(null,(chagePass) ? "변경되었습니다." : "아이디 비밀번호 틀리셨습니다.");
						break;
					case "11":
					boolean withdraw = memberService.delet(
								JOptionPane.showInputDialog("아이디를 입력하세요."),
								JOptionPane.showInputDialog("비밀번호를 입력하세요.")					
								);
					JOptionPane.showMessageDialog(null, (withdraw) ? "탈퇴되었습니다." : "아이디 비밀번호 틀리셨습니다.");
						break;
			}
		}
	}
}
