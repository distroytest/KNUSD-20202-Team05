import javax.swing.*;
import java.util.ArrayList;

public class Topping {
	ArrayList<Toppinginfo> topping;
	
	public Topping() {
		this.topping = new ArrayList<>();
		
		Toppinginfo tomato = new Toppinginfo("�丶��", new ImageIcon("img/toptomato"));
		Toppinginfo cucumber = new Toppinginfo("����", new ImageIcon("img/topcucumber"));
		Toppinginfo jelapeno = new Toppinginfo("�Ҷ��Ǵ�", new ImageIcon("img/topjelapeno"));
		Toppinginfo lettuce = new Toppinginfo("�����", new ImageIcon("img/toplettuce"));
		Toppinginfo olive = new Toppinginfo("�ø���", new ImageIcon("img/toptolive"));
		Toppinginfo onion = new Toppinginfo("����", new ImageIcon("img/toponion"));
		Toppinginfo pickle = new Toppinginfo("��Ŭ", new ImageIcon("img/toppickle"));
		Toppinginfo pimang = new Toppinginfo("�Ǹ�", new ImageIcon("img/toppickle"));
		Toppinginfo selectno = new Toppinginfo("���þ���", new ImageIcon("img/selectno"));
		
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
