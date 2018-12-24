package card;

public class CardServiceImpl implements CardService {

	@Override
	public void add(String kind,String numbers) {
		CardBean card = new CardBean();
		int number = Integer.parseInt(numbers);
		card.setKind(kind);
		card.setNumber(number);
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
