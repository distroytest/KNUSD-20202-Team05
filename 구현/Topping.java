import javax.swing.*;

public class Topping {
	String name;
	ImageIcon pic;
	
	public Topping(String name, ImageIcon pic) {
		this.name = name;
		this.pic = pic;
	}
	Topping tomato = new Topping("�丶��", new ImageIcon("img/toptomato"));
	Topping cucumber = new Topping("����", new ImageIcon("img/topcucumber"));
	Topping jelapeno = new Topping("�Ҷ��Ǵ�", new ImageIcon("img/topjelapeno"));
	Topping lettuce = new Topping("�����", new ImageIcon("img/toplettuce"));
	Topping olive = new Topping("�ø���", new ImageIcon("img/toptolive"));
	Topping onion = new Topping("����", new ImageIcon("img/toponion"));
	Topping pickle = new Topping("��Ŭ", new ImageIcon("img/toppickle"));
	Topping pimang = new Topping("�Ǹ�", new ImageIcon("img/toppickle"));
	Topping selectno = new Topping("���þ���", new ImageIcon("img/selectno"));
}
