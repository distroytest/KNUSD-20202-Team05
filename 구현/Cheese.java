import javax.swing.*;
import java.util.ArrayList;

public class Cheese {
	ArrayList<Cheeseinfo> cheese;
	
	public Cheese() {
		this.cheese = new ArrayList<>();
		
		Cheeseinfo american = new Cheeseinfo("�Ƹ޸�ĭ ġ��", new ImageIcon("img/cheeseamerican.jpg"));
		Cheeseinfo shredded = new Cheeseinfo("������� ġ��", new ImageIcon("img/cheeseshredded.jpg"));
		Cheeseinfo mozzarella = new Cheeseinfo("�������� ġ��", new ImageIcon("img/cheesemozzarella.jpg"));
		Cheeseinfo selectno = new Cheeseinfo("ġ�����", new ImageIcon("img/selectno.jpg"));
		
		this.cheese.add(american);
		this.cheese.add(shredded);
		this.cheese.add(mozzarella);
		this.cheese.add(selectno);
	}
	
	public void insertCheese(String name, ImageIcon pic) {
		Cheeseinfo newCheese = new Cheeseinfo(name, pic);
		this.cheese.add(newCheese);
	}
	
	public void refineCheese(Cheeseinfo cheeseinfo,String name,ImageIcon pic) {
		cheeseinfo.name = name;
		if(pic != null)
			cheeseinfo.pic = pic;
	}
	
	public void deleteCheese(int i) {
		cheese.remove(i);
	}
}
