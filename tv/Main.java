package tv;

import javax.swing.JOptionPane;

import bank21.AccountBean;
import bank21.AccountService;
import bank21.MemberBean;

public class Main {
	public static void main(String[] args) {
		TVBean tvBean = null;
		while (true) {
			switch (JOptionPane.showInputDialog("[�޴�]\n"
					+ "0.����\n"
					+ "1.TV���� �Է� \n"
					+ "2.TV���� ����\n"
					+ "3.ä�� ����")) {
					case "0":
						JOptionPane.showMessageDialog(null,"����Ǿ����ϴ�.");
						return;
					case "1":
						//brand,color,price �Է�
						//TV�귣��
						//TV����
						// ����
						tvBean = new TVBean();
						String brand = JOptionPane.showInputDialog("�귣�带 �Է��ϼ���.");
						tvBean.setBrand(brand);
						String color = JOptionPane.showInputDialog("�÷��� �Է��ϼ���.");
						tvBean.setColor(color);
						String price = JOptionPane.showInputDialog("������ �Է��ϼ���.");
						tvBean.setPrice(Integer.parseInt(price));
						tvBean.setPower(false);
						tvBean.setChannel(0);	
						break;
					case "2":
						//������ TV ����
						JOptionPane.showMessageDialog(null,tvBean.toString());
						break;
					case "3":
						tvBean.setPower(true);
						break;
					case "4":
						String changeChannel= JOptionPane.showInputDialog("ä�� ����");
						tvBean.setChannel(Integer.parseInt(changeChannel));
						break;
			}
		}
	}
}
