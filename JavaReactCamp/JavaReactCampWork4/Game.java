package JavaReactCampWork4;

public class Game  extends Base{
	
	private int price;
	
	public Game() {}

	public Game(int id, String name, int price) {
		super(id, name);
		this.price = price;
	}

	public int getAmount() {
		return price;
	}

	public void setAmount(int price) {
		this.price = price;
	}

	

	

	
	
	
}
