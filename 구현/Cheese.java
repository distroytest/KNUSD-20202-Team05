import javax.swing.*;

public class Cheese {
	String name;
	ImageIcon pic;
	
	public Cheese(String name, ImageIcon pic) {
		this.name = name;
		this.pic = pic;
	}
	Cheese american = new Cheese("�Ƹ޸�ĭ ġ��", new ImageIcon("img/cheeseamerican.jpg"));
	Cheese shredded = new Cheese("������� ġ��", new ImageIcon("img/cheeseshredded.jpg"));
	Cheese mozzarella = new Cheese("�������� ġ��", new ImageIcon("img/cheesemozzarella.jpg"));
	Cheese selectno = new Cheese("���þ���", new ImageIcon("img/selectno.jpg"));
}
