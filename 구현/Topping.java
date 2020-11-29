import javax.swing.*;
import java.util.ArrayList;

public class Topping {
	ArrayList<Toppinginfo> topping;
	
	public Topping() {
		this.topping = new ArrayList<>();
		
		Toppinginfo tomato = new Toppinginfo("토마토", new ImageIcon("img/toptomato.jpg"));
		Toppinginfo cucumber = new Toppinginfo("오이", new ImageIcon("img/topcucumber.jpg"));
		Toppinginfo jelapeno = new Toppinginfo("할라피뇨", new ImageIcon("img/topjelapeno.jpg"));
		Toppinginfo lettuce = new Toppinginfo("양상추", new ImageIcon("img/toplettuce.jpg"));
		Toppinginfo olive = new Toppinginfo("올리브", new ImageIcon("img/topolive.jpg"));
		Toppinginfo onion = new Toppinginfo("양파", new ImageIcon("img/toponion.jpg"));
		Toppinginfo pickle = new Toppinginfo("피클", new ImageIcon("img/toppickle.jpg"));
		Toppinginfo pimang = new Toppinginfo("피망", new ImageIcon("img/toppimang.jpg"));
		Toppinginfo selectno = new Toppinginfo("선택안함", new ImageIcon("img/selectno.jpg"));
		
		this.topping.add(tomato);
		this.topping.add(cucumber);
		this.topping.add(jelapeno);
		this.topping.add(lettuce);
		this.topping.add(olive);
		this.topping.add(onion);
		this.topping.add(pickle);
		this.topping.add(pimang);
		this.topping.add(selectno);
	}
	
}
