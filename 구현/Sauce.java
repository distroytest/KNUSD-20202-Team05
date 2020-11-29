import javax.swing.*;

public class Sauce {
	String name;
	ImageIcon pic;
	
	public Sauce(String name, ImageIcon pic) {
		this.name = name;
		this.pic = pic;
	}
	Sauce yuja = new Sauce("유자 폰즈", new ImageIcon("img/sauceyuja.jpg"));
	Sauce ranch = new Sauce("랜치드레싱", new ImageIcon("img/sauceranch.jpg"));
	Sauce mayonnaise = new Sauce("마요네즈", new ImageIcon("img/saucemayo.jpg"));
	Sauce sweetonion = new Sauce("스위트 어니언", new ImageIcon("img/saucesweetonion.jpg"));
	Sauce honeymustard = new Sauce("허니 머스타드", new ImageIcon("img/saucehoneymustard.jpg"));
	Sauce sweetchilli = new Sauce("스위트 칠리", new ImageIcon("img/saucesweetchilli.jpg"));
	Sauce hotchilli = new Sauce("핫 칠리", new ImageIcon("img/saucehotchilli.jpg"));
	Sauce chipotle = new Sauce("사우스 웨스트", new ImageIcon("img/saucesouthwest.jpg"));
	Sauce yellowmustard = new Sauce("머스타드", new ImageIcon("img/sauceyellowmustard.jpg"));
	Sauce horseradish = new Sauce("홀스래디쉬", new ImageIcon("img/saucehorseradish.jpg"));
	Sauce oliveoil = new Sauce("올리브 오일", new ImageIcon("img/sauceoliveoil.jpg"));
	Sauce redwinevinaigrette = new Sauce("레드와인식초", new ImageIcon("img/sauceredwine.jpg"));
	Sauce salt = new Sauce("소금", new ImageIcon("img/saucesalt.jpg"));
	Sauce blackpepper = new Sauce("후추", new ImageIcon("img/sauceblackpepper.jpg"));
	Sauce smokebbq = new Sauce("스모크 바비큐", new ImageIcon("img/saucesmokebbq.jpg"));
	Sauce selectno = new Sauce("선택안함", new ImageIcon("img/selectno.jpg"));
}
