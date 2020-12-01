
public class Drink {
	int price;
	String name;
	int num;
	public Drink() {
		
	}
	public void selectDrink(Menuinfo menu) {
		this.name = menu.name;
		this.price = menu.price;
		this.num = 1;
	}
}
