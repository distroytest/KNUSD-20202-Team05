import javax.swing.*;

public class Toppinginfo {
	String name;
	ImageIcon pic;
	public Toppinginfo(String name, ImageIcon pic) {
		this.name = name;
		this.pic = pic;
	}
	public Toppinginfo(String name) {
		this.name = name;
	}
	
	public void selectTopping(String topping) {
		name = topping;
	}
}
