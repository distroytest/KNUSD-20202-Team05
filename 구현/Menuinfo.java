import javax.swing.*;


public class Menuinfo {
	String name;
	int price;
	ImageIcon pic;
	
	public Menuinfo(String name, int price, ImageIcon pic) {
		this.name = name;
		this.price = price;
		this.pic = pic;
	}
	
	public Menuinfo(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
