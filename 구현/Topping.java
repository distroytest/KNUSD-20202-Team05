import javax.swing.*;

public class Topping {
	String name;
	ImageIcon pic;
	
	public Topping(String name, ImageIcon pic) {
		this.name = name;
		this.pic = pic;
	}
	Topping tomato = new Topping("토마토", new ImageIcon("img/toptomato"));
	Topping cucumber = new Topping("오이", new ImageIcon("img/topcucumber"));
	Topping jelapeno = new Topping("할라피뇨", new ImageIcon("img/topjelapeno"));
	Topping lettuce = new Topping("양상추", new ImageIcon("img/toplettuce"));
	Topping olive = new Topping("올리브", new ImageIcon("img/toptolive"));
	Topping onion = new Topping("양파", new ImageIcon("img/toponion"));
	Topping pickle = new Topping("피클", new ImageIcon("img/toppickle"));
	Topping pimang = new Topping("피망", new ImageIcon("img/toppickle"));
	Topping selectno = new Topping("선택안함", new ImageIcon("img/selectno"));
}
