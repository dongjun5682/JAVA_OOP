package real;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		while (true) {
			JOptionPane opt = new JOptionPane();
			Member m = new Member();
			Calc c = new Calc();
			String menu = JOptionPane.showInputDialog("0.���� \n 1.ȸ������ \n 2.���� \n 3.�ζ� \n 4.�޷� ");
			switch (menu) {
			case "0":
				JOptionPane.showMessageDialog(null, "�ý��� ����");
				return;
			case "1":
			
				String name = JOptionPane.showInputDialog("�̸� �Է�");
				m.name = name;
				JOptionPane.showMessageDialog(null, String.format("ȯ���մϴ�. %s��", m.name));
				String mMenu = JOptionPane.showInputDialog("[ȸ������ �޴�] \n 1.BMI(Ű,������) \n 2.����(����,����,����,����,��ȸ) \n 3.����üũ(SSN)");
				switch (mMenu) {
				case "1":
					String[] arr = opt.showInputDialog(null, "Ű,������ �Է�").split(",");
					opt.showMessageDialog(null,String.format("%s ���� %s ",m.name,m.bmi(arr)));
					break;
				case "2":
					String[] scores = opt.showInputDialog(null, "����,����,����,����,��ȸ ������ �Է��ϼ���.").split(",");
					opt.showMessageDialog(null,String.format("%s���� ���� : %s",m.name ,m.grade(scores)));
					break;
				case "3":
					String number = opt.showInputDialog(null,"�ֹι�ȣ�� �Է����ּ���");
					opt.showMessageDialog(null,String.format("%s���� ���� : %s",m.name,m.genderChecker(number)));
					break;
				}
			case "2"://����
				String cMenu = opt.showInputDialog(null,"1.����\n 2.������");
				switch (cMenu) {
				case "1":	
					//����
					String[] calc = opt.showInputDialog(null, "�����Դϴ� ex)5 + 6 ").split("");
					switch (calc[1]) {
					case "+":
						opt.showMessageDialog(null,String.format("���: %s",c.plus(calc)));
						break;
					case "-":
						opt.showMessageDialog(null,String.format("���: %s",c.minus(calc)));
						break;
					case "*":
						opt.showMessageDialog(null,String.format("���: %s",c.multi(calc)));
						break;

					case "/":
						opt.showMessageDialog(null,String.format("���: %s",c.divid(calc)));
						break;
					case "%":
						opt.showMessageDialog(null,String.format("���: %s",c.percent(calc)));
						break;
				case "2":
					//������
					String[] gugu = opt.showInputDialog(null, "�������Դϴ�.���� �ΰ� �Է����ּ���. ").split("");
					opt.showMessageDialog(null, String.format("%s", c.gugudan(gugu)));
					break;

				default:
					break;
				}
				
				}
				
				break;
			case "3"://�ζ�
				break;
			case "4"://�޷�
				break;
			default:
				break;
			}
		}

	}
}
