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
			����ǥ�� ǥ�õ� ���� : 
			�й�(Student)
			�л��̸�(Student)
			�����(Subject)
			����(Subject)
			 */
			switch (JOptionPane.showInputDialog("[�޴�]\n"
					+ "0.����\n"
					+ "1.�л��ε��\n"
					+ "2.ȸ������ ����\n"
					+ "3.��й�ȣ����\n"
					+ "4.����������\n"
					+ "5.�������\n"
					+ "6.�������\n"
					+ "7.����ǥ����")) {
					case "0":
						JOptionPane.showMessageDialog(null,"����Ǿ����ϴ�.");
						return;
					case "1":
						student =new StudentBean();
						String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
						student.setName(name);
						String ssn =JOptionPane.showInputDialog("�ֹι�ȣ�� �Է��ϼ���.");
						student.setSsn(ssn);
						String pass = JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���.");
						student.setPass(pass);
						String hakbun = studentService.makeHakbun();
						student.setHakbun(hakbun);
						JOptionPane.showMessageDialog(null,"���ԵǾ����ϴ�.");
						break;
					case "2":
						JOptionPane.showMessageDialog(null, student.toString());
						break;
					case "3":
						String changePass = JOptionPane.showInputDialog("������ ��й�ȣ�� �Է��ϼ���.");
						student.setPass(changePass);
						JOptionPane.showMessageDialog(null,"����Ǿ����ϴ�.");
						break;
					case "4":
						subject = new SubjectBean();
						String subjName = JOptionPane.showInputDialog("���� ���� �Է��ϼ���.");
						subject.setSubjname(subjName);
						break;
					case "5":
						String profName = JOptionPane.showInputDialog("������ ������ �Է��ϼ���.");
						subject.setprofName(profName);
						break;
					case "6":
						String score = JOptionPane.showInputDialog("������ �Է��ϼ���.");
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
