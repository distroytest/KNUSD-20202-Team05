import javax.swing.*;
import java.util.ArrayList;

public class Sauce {
	ArrayList<Sauceinfo> sauce;
	
	public Sauce() {
		this.sauce = new ArrayList<>();
		
		Sauceinfo ranch = new Sauceinfo("��ġ�巹��", new ImageIcon("img/sauceranch.jpg"));
		Sauceinfo mayonnaise = new Sauceinfo("�������", new ImageIcon("img/saucemayo.jpg"));
		Sauceinfo sweetonion = new Sauceinfo("����Ʈ ��Ͼ�", new ImageIcon("img/saucesweetonion.jpg"));
		Sauceinfo honeymustard = new Sauceinfo("��� �ӽ�Ÿ��", new ImageIcon("img/saucehoneymustard.jpg"));
		Sauceinfo sweetchilli = new Sauceinfo("����Ʈ ĥ��", new ImageIcon("img/saucesweetchilli.jpg"));
		Sauceinfo hotchilli = new Sauceinfo("�� ĥ��", new ImageIcon("img/saucehotchilli.jpg"));
		Sauceinfo chipotle = new Sauceinfo("��콺 ����Ʈ", new ImageIcon("img/saucesouthwest.jpg"));
		Sauceinfo yellowmustard = new Sauceinfo("�ӽ�Ÿ��", new ImageIcon("img/sauceyellowmustard.jpg"));
		Sauceinfo horseradish = new Sauceinfo("Ȧ������", new ImageIcon("img/saucehorseradish.jpg"));
		Sauceinfo oliveoil = new Sauceinfo("�ø��� ����", new ImageIcon("img/sauceoliveoil.jpg"));
		Sauceinfo redwinevinaigrette = new Sauceinfo("������ν���", new ImageIcon("img/sauceredwine.jpg"));
		Sauceinfo salt = new Sauceinfo("�ұ�", new ImageIcon("img/saucesalt.jpg"));
		Sauceinfo blackpepper = new Sauceinfo("����", new ImageIcon("img/sauceblackpepper.jpg"));
		Sauceinfo smokebbq = new Sauceinfo("����ũ �ٺ�ť", new ImageIcon("img/saucesmokebbq.jpg"));
		Sauceinfo selectno = new Sauceinfo("�ҽ�����", new ImageIcon("img/selectno.jpg"));
		
		this.sauce.add(ranch);
		this.sauce.add(mayonnaise);
		this.sauce.add(sweetonion);
		this.sauce.add(honeymustard);
		this.sauce.add(sweetchilli);
		this.sauce.add(hotchilli);
		this.sauce.add(chipotle);
		this.sauce.add(yellowmustard);
		this.sauce.add(horseradish);
		this.sauce.add(oliveoil);
		this.sauce.add(redwinevinaigrette);
		this.sauce.add(salt);
		this.sauce.add(blackpepper);
		this.sauce.add(smokebbq);
		this.sauce.add(selectno);
		
	}
	
}
