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
		if(type == "���׸���" && breadSize == 30) {
			price = 8000;
		}
		else if(type == "��Ʈ��" && breadSize == 30) {
			price = 9200;
		}
		else if(type == "������ũ & ġ��" && breadSize == 30) {
			price = 10900;
		}
		else if(type == "K-�ٺ�ť" && breadSize == 30) {
			price = 10700;
		}
		else if(type == "�ν�Ʈ ġŲ" && breadSize == 30) {
			price = 10500;
		}
		else if(type == "��Ż���� ��Ƽ" && breadSize == 30) {
			price = 9200;
		}
		else if(type == "��" && breadSize == 30) {
			price = 8600;
		}
		else if(type == "��ġ" && breadSize == 30) {
			price = 8700;
		}
		else if(type == "������ Ŭ��" && breadSize == 30) {
			price = 10100;
		}
		else if(breadSize == 30) {
			for(int i=0;i<Frame.menu.sandwich.size();i++) {
				if(type.equals(Frame.menu.sandwich.get(i).name) == true) {
					price = Frame.menu.sandwich.get(i).price*2;
				}
			}
		}
	}
}
