package JavaReactCampWork4;

public class Campaign extends Base {
	
	
	private int discountAmount;
	
	public Campaign() {}

	public Campaign(int id, String name, int discountAmount ) {
		super(id, name);
		this.discountAmount = discountAmount;
	}

	public int getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}

	
	
	
}
