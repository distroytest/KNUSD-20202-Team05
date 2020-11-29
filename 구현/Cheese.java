import javax.swing.*;

public class Cheese {
	String name;
	ImageIcon pic;
	
	public Cheese(String name, ImageIcon pic) {
		this.name = name;
		this.pic = pic;
	}
	Cheese american = new Cheese("아메리칸 치즈", new ImageIcon("img/cheeseamerican.jpg"));
	Cheese shredded = new Cheese("슈레디드 치즈", new ImageIcon("img/cheeseshredded.jpg"));
	Cheese mozzarella = new Cheese("모차렐라 치즈", new ImageIcon("img/cheesemozzarella.jpg"));
	Cheese selectno = new Cheese("선택없음", new ImageIcon("img/selectno.jpg"));
}
