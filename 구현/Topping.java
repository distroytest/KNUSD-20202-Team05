import javax.swing.*;
import java.util.ArrayList;

public class Topping {
	ArrayList<Toppinginfo> topping;
	
	public Topping() {
		this.topping = new ArrayList<>();
		
		Toppinginfo tomato = new Toppinginfo("�丶��", new ImageIcon("img/toptomato.jpg"));
		Toppinginfo cucumber = new Toppinginfo("����", new ImageIcon("img/topcucumber.jpg"));
		Toppinginfo jelapeno = new Toppinginfo("�Ҷ��Ǵ�", new ImageIcon("img/topjelapeno.jpg"));
		Toppinginfo lettuce = new Toppinginfo("�����", new ImageIcon("img/toplettuce.jpg"));
		Toppinginfo olive = new Toppinginfo("�ø���", new ImageIcon("img/topolive.jpg"));
		Toppinginfo onion = new Toppinginfo("����", new ImageIcon("img/toponion.jpg"));
		Toppinginfo pickle = new Toppinginfo("��Ŭ", new ImageIcon("img/toppickle.jpg"));
		Toppinginfo pimang = new Toppinginfo("�Ǹ�", new ImageIcon("img/toppimang.jpg"));
		Toppinginfo selectno = new Toppinginfo("���ξ���", new ImageIcon("img/selectno.jpg"));
		
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
	
	public void insertTopping(String name, ImageIcon pic) {
		Toppinginfo newTopping = new Toppinginfo(name, pic);
		this.topping.add(newTopping);
	}
	
	public void refineTopping(Toppinginfo toppinginfo,String name,ImageIcon pic) {
		toppinginfo.name = name;
		if(pic != null)
			toppinginfo.pic = pic;
	}
	
	public void deleteTopping(int i) {
		topping.remove(i);
	}
}
