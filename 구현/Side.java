
public class Side {
	int price;
	String name;
	
	public Side() {
		
	}
	public void selectSide(Menuinfo menu) {
		this.name = menu.name;
		this.price = menu.price;
	}
}
