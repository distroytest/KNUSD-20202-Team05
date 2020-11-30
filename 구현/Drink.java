
public class Drink {
	int price;
	String name;
	
	public Drink() {
		
	}
	public void selectDrink(Menuinfo menu) {
		this.name = menu.name;
		this.price = menu.price;
	}
}
