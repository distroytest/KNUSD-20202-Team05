import javax.swing.*;

public class Bread {
	String name;
	int size;
	ImageIcon pic;
	
	public Bread(String name, int size, ImageIcon pic) {
		this.name = name;
		this.size = size;
		this.pic = pic;
	}
	Bread honeyoat15 = new Bread("허니오트", 15, new ImageIcon("img/breadhoneyoat.jpg"));
	Bread hearty15 = new Bread("하티", 15, new ImageIcon("img/breadhearty.jpg"));
	Bread wheat15 = new Bread("위트", 15, new ImageIcon("img/breadwheat.jpg"));
	Bread parmesan15 = new Bread("파마산 오레가노", 15, new ImageIcon("img/breadparmesan.jpg"));
	Bread white15 = new Bread("화이트", 15, new ImageIcon("img/breadwhite.jpg"));
	Bread flatbread15 = new Bread("플랫브래드", 15, new ImageIcon("img/breadflat.jpg"));
	
	Bread honeyoat30 = new Bread("허니오트", 15, new ImageIcon("img/honeyoat.jpg"));
	Bread hearty30 = new Bread("하티", 15, new ImageIcon("img/breadhearty.jpg"));
	Bread wheat30 = new Bread("위트", 15, new ImageIcon("img/breadwheat.jpg"));
	Bread parmesan30 = new Bread("파마산 오레가노", 15, new ImageIcon("img/breadparmesan.jpg"));
	Bread white30 = new Bread("화이트", 15, new ImageIcon("img/breadwhite.jpg"));
	Bread flatbread30 = new Bread("플랫브래드", 15, new ImageIcon("img/breadflat.jpg"));
}
