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
	Bread honeyoat15 = new Bread("��Ͽ�Ʈ", 15, new ImageIcon("img/breadhoneyoat.jpg"));
	Bread hearty15 = new Bread("��Ƽ", 15, new ImageIcon("img/breadhearty.jpg"));
	Bread wheat15 = new Bread("��Ʈ", 15, new ImageIcon("img/breadwheat.jpg"));
	Bread parmesan15 = new Bread("�ĸ��� ��������", 15, new ImageIcon("img/breadparmesan.jpg"));
	Bread white15 = new Bread("ȭ��Ʈ", 15, new ImageIcon("img/breadwhite.jpg"));
	Bread flatbread15 = new Bread("�÷��귡��", 15, new ImageIcon("img/breadflat.jpg"));
	
	Bread honeyoat30 = new Bread("��Ͽ�Ʈ", 15, new ImageIcon("img/honeyoat.jpg"));
	Bread hearty30 = new Bread("��Ƽ", 15, new ImageIcon("img/breadhearty.jpg"));
	Bread wheat30 = new Bread("��Ʈ", 15, new ImageIcon("img/breadwheat.jpg"));
	Bread parmesan30 = new Bread("�ĸ��� ��������", 15, new ImageIcon("img/breadparmesan.jpg"));
	Bread white30 = new Bread("ȭ��Ʈ", 15, new ImageIcon("img/breadwhite.jpg"));
	Bread flatbread30 = new Bread("�÷��귡��", 15, new ImageIcon("img/breadflat.jpg"));
}
