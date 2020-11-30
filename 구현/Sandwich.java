import java.util.ArrayList;

public class Sandwich {
	int pirce;
	String type;
	int breadSize;
	String breadType;
	String cheeseType;
	ArrayList<Toppinginfo> toppings;
	ArrayList<Sauceinfo> sauces;
	String set;
	String drink;
	String drinkSize;
	String side;
	
	public Sandwich() {
		this.toppings = new ArrayList<>();
		this.sauces = new ArrayList<>();
	}
	
	public void selectSandwich(Menuinfo menu) {
		type = menu.name;
	}
	
	public void getBread(Breadinfo bread) {
		breadType = bread.name;
		breadSize = bread.size;
	}
	public void getCheese(Cheeseinfo cheese) {
		cheeseType = cheese.name;
	}
	public void getTopping(Toppinginfo topping) {
		toppings.add(topping);
	}
	public void getSauce(Sauceinfo sauce) {
		sauces.add(sauce);
	}
}
