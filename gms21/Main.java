package gms21;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		StudentBean student = null;
		StudentService studentService = new StudentService();
		SubjectBean subject = null;
		SubjectService subjectService =new SubjectService();
		while (true) {
			/*			
			성적표에 표시될 내용 : 
			학번(Student)
			학생이름(Student)
			과목명(Subject)
			점수(Subject)
			 */
			switch (JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료\n"
					+ "1.학생부등록\n"
					+ "2.회원정보 보기\n"
					+ "3.비밀번호변경\n"
					+ "4.수강과목등록\n"
					+ "5.교수등록\n"
					+ "6.점수등록\n"
					+ "7.성적표보기")) {
					case "0":
						JOptionPane.showMessageDialog(null,"종료되었습니다.");
						return;
					case "1":
						student =new StudentBean();
						String name = JOptionPane.showInputDialog("이름을 입력하세요.");
						student.setName(name);
						String ssn =JOptionPane.showInputDialog("주민번호를 입력하세요.");
						student.setSsn(ssn);
						String pass = JOptionPane.showInputDialog("비밀번호를 입력하세요.");
						student.setPass(pass);
						String hakbun = studentService.makeHakbun();
						student.setHakbun(hakbun);
						JOptionPane.showMessageDialog(null,"가입되었습니다.");
						break;
					case "2":
						JOptionPane.showMessageDialog(null, student.toString());
						break;
					case "3":
						String changePass = JOptionPane.showInputDialog("변경할 비밀번호를 입력하세요.");
						student.setPass(changePass);
						JOptionPane.showMessageDialog(null,"변경되었습니다.");
						break;
					case "4":
						subject = new SubjectBean();
						String subjName = JOptionPane.showInputDialog("수강 과목를 입력하세요.");
						subject.setSubjname(subjName);
						break;
					case "5":
						String profName = JOptionPane.showInputDialog("교수님 성함을 입력하세요.");
						subject.setprofName(profName);
						break;
					case "6":
						String score = JOptionPane.showInputDialog("점수를 입력하세요.");
						subject.setScore(Integer.parseInt(score));
						break;
					case "7":
						String record = subjectService.toString(
								student.getName(),
								student.getHakbun(),
								subject.getSubjname(),
								subject.getprofName(),
								subject.getScore());
						JOptionPane.showMessageDialog(null,record);
						break;

			}
		}
	}
}
