
public class Side {
	int price;
	String name;
	int num;
	public Side() {
		
	}
	public void selectSide(Menuinfo menu) {
		this.name = menu.name;
		this.price = menu.price;
		this.num = 1;
	}
}
