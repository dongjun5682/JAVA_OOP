package car;

import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		while (true) {
			switch (JOptionPane.showInputDialog("[�޴�]\n"
					+ "0.����\n"
					+ "1.ī�弱�� \n"
					+ "2.ī�� �����ֱ�")) {
					case "0":
						JOptionPane.showMessageDialog(null,"����Ǿ����ϴ�.");
						return;
					case "1":
						//ī�� ����
						//ī���� ��ȣ
						break;
					case "2":
						//������ ī���� ����
						break;
			}
		}
	}
}