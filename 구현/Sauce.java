import javax.swing.*;
import java.util.ArrayList;

public class Sauce {
	ArrayList<Sauceinfo> sauce;
	
	public Sauce() {
		this.sauce = new ArrayList<>();
		
		Sauceinfo ranch = new Sauceinfo("랜치드레싱", new ImageIcon("img/sauceranch.jpg"));
		Sauceinfo mayonnaise = new Sauceinfo("마요네즈", new ImageIcon("img/saucemayo.jpg"));
		Sauceinfo sweetonion = new Sauceinfo("스위트 어니언", new ImageIcon("img/saucesweetonion.jpg"));
		Sauceinfo honeymustard = new Sauceinfo("허니 머스타드", new ImageIcon("img/saucehoneymustard.jpg"));
		Sauceinfo sweetchilli = new Sauceinfo("스위트 칠리", new ImageIcon("img/saucesweetchilli.jpg"));
		Sauceinfo hotchilli = new Sauceinfo("핫 칠리", new ImageIcon("img/saucehotchilli.jpg"));
		Sauceinfo chipotle = new Sauceinfo("사우스 웨스트", new ImageIcon("img/saucesouthwest.jpg"));
		Sauceinfo yellowmustard = new Sauceinfo("머스타드", new ImageIcon("img/sauceyellowmustard.jpg"));
		Sauceinfo horseradish = new Sauceinfo("홀스래디쉬", new ImageIcon("img/saucehorseradish.jpg"));
		Sauceinfo oliveoil = new Sauceinfo("올리브 오일", new ImageIcon("img/sauceoliveoil.jpg"));
		Sauceinfo redwinevinaigrette = new Sauceinfo("레드와인식초", new ImageIcon("img/sauceredwine.jpg"));
		Sauceinfo salt = new Sauceinfo("소금", new ImageIcon("img/saucesalt.jpg"));
		Sauceinfo blackpepper = new Sauceinfo("후추", new ImageIcon("img/sauceblackpepper.jpg"));
		Sauceinfo smokebbq = new Sauceinfo("스모크 바비큐", new ImageIcon("img/saucesmokebbq.jpg"));
		Sauceinfo selectno = new Sauceinfo("소스없음", new ImageIcon("img/selectno.jpg"));
		
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
