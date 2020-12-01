import java.util.ArrayList;

public class Sandwich {
	int price;
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
	int num;
	
	public Sandwich() {
		this.toppings = new ArrayList<>();
		this.sauces = new ArrayList<>();
		this.num = 1;
	}
	
	public void selectSandwich(Menuinfo menu) {
		type = menu.name;
		price = menu.price;
	}
	
	public void getBread(Breadinfo bread) {
		breadType = bread.name;
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
	public void calculateCost() {
		if(type == "에그마요" && breadSize == 30) {
			price = 8000;
		}
		if(type == "미트볼" && breadSize == 30) {
			price = 9200;
		}
		if(type == "스테이크 & 치즈" && breadSize == 30) {
			price = 10900;
		}
		if(type == "K-바베큐" && breadSize == 30) {
			price = 10700;
		}
		if(type == "로스트 치킨" && breadSize == 30) {
			price = 10500;
		}
		if(type == "이탈리안 비엠티" && breadSize == 30) {
			price = 9200;
		}
		if(type == "햄" && breadSize == 30) {
			price = 8600;
		}
		if(type == "참치" && breadSize == 30) {
			price = 8700;
		}
		if(type == "써브웨이 클럽" && breadSize == 30) {
			price = 10100;
		}
	}
}
