package car;

import javax.swing.JOptionPane;
public class CarController {
	public static void main(String[] args) {
		CarBean car =null;
		CarService carService = new CarServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료\n"
					+ "1.차량입고 \n"
					+ "2.차량 목록\n"
					+ "3.차량검색 \n"
					+ "4.차량판매")) {
					case "0":
						JOptionPane.showMessageDialog(null,"종료되었습니다.");
						return;
					case "1":
						 carService.add(JOptionPane.showInputDialog("브랜드를 입력하세요."),
								 JOptionPane.showInputDialog("색깔를 입력하세요."),
								 JOptionPane.showInputDialog("기어 갯수를 입력하세요."),
								 JOptionPane.showInputDialog("문의 갯수를 입력하세요.")
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