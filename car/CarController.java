package car;

import javax.swing.JOptionPane;
public class CarController {
	public static void main(String[] args) {
		CarBean car =null;
		CarService carService = new CarServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("[�޴�]\n"
					+ "0.����\n"
					+ "1.�����԰� \n"
					+ "2.���� ���\n"
					+ "3.�����˻� \n"
					+ "4.�����Ǹ�")) {
					case "0":
						JOptionPane.showMessageDialog(null,"����Ǿ����ϴ�.");
						return;
					case "1":
						 carService.add(JOptionPane.showInputDialog("�귣�带 �Է��ϼ���."),
								 JOptionPane.showInputDialog("���� �Է��ϼ���."),
								 JOptionPane.showInputDialog("��� ������ �Է��ϼ���."),
								 JOptionPane.showInputDialog("���� ������ �Է��ϼ���.")
								 );
						break;
					case "2":
						carService.list();
						break;
					case "3":
						carService.find();
						break;
					case "4":
						carService.sell();
						break;
						
			}
		}
	}
}