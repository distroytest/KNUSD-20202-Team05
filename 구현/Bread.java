import javax.swing.*;
import java.util.ArrayList;

public class Bread {
	ArrayList<Breadinfo> bread;
	
	public Bread() {
		
		Breadinfo honeyoat = new Breadinfo("��Ͽ�Ʈ", new ImageIcon("img/breadhoneyoat.jpg"));
		Breadinfo hearty = new Breadinfo("��Ƽ", new ImageIcon("img/breadhearty.jpg"));
		Breadinfo wheat = new Breadinfo("��Ʈ", new ImageIcon("img/breadwheat.jpg"));
		Breadinfo parmesan = new Breadinfo("�ĸ��� ��������", new ImageIcon("img/breadparmesan.jpg"));
		Breadinfo white = new Breadinfo("ȭ��Ʈ", new ImageIcon("img/breadwhite.jpg"));
		Breadinfo flatbread = new Breadinfo("�÷��귡��", new ImageIcon("img/breadflat.jpg"));
		
		this.bread = new ArrayList<>();
		
		this.bread.add(honeyoat);
		this.bread.add(hearty);
		this.bread.add(wheat);
		this.bread.add(parmesan);
		this.bread.add(white);
		this.bread.add(flatbread);
	}
	
	
	
	
	
	

}
