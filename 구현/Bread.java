import javax.swing.*;
import java.util.ArrayList;

public class Bread {
	ArrayList<Breadinfo> bread;
	
	public Bread() {
		
		Breadinfo honeyoat = new Breadinfo("허니오트", new ImageIcon("img/breadhoneyoat.jpg"));
		Breadinfo hearty = new Breadinfo("하티", new ImageIcon("img/breadhearty.jpg"));
		Breadinfo wheat = new Breadinfo("위트", new ImageIcon("img/breadwheat.jpg"));
		Breadinfo parmesan = new Breadinfo("파마산 오레가노", new ImageIcon("img/breadparmesan.jpg"));
		Breadinfo white = new Breadinfo("화이트", new ImageIcon("img/breadwhite.jpg"));
		Breadinfo flatbread = new Breadinfo("플랫브래드", new ImageIcon("img/breadflat.jpg"));
		
		this.bread = new ArrayList<>();
		
		this.bread.add(honeyoat);
		this.bread.add(hearty);
		this.bread.add(wheat);
		this.bread.add(parmesan);
		this.bread.add(white);
		this.bread.add(flatbread);
	}
	
	
	
	
	
	

}
