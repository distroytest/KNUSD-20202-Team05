import java.util.ArrayList;
import javax.swing.*;

public class Menu {
	ArrayList<Menuinfo> sandwich;
	ArrayList<Menuinfo> salad;
	ArrayList<Menuinfo> wrap;
	ArrayList<Menuinfo> drink;
	ArrayList<Menuinfo> side;
	
	public Menu() {
	
	Menuinfo swMeatball = new Menuinfo("미트볼", 5200, new ImageIcon("img/swmeatball.jpg") );
	Menuinfo swSteakCheese = new Menuinfo("스테이크 & 치즈", 6500, new ImageIcon("img/swsteakandcheese.jpg"));
	Menuinfo swKBarbeque = new Menuinfo("K-바베큐", 6000, new ImageIcon("img/swkbarbeque.jpg"));
	Menuinfo swSubwayClub = new Menuinfo("써브웨이 클럽", 5700, new ImageIcon("img/swsubwayclub.jpg"));
	Menuinfo swRoastChicken = new Menuinfo("로스트 치킨", 5900, new ImageIcon("img/swroastchicken.jpg"));
	Menuinfo swItalianBMT = new Menuinfo("이탈리안 비엠티", 5200, new ImageIcon("img/switalian.jpg"));
	Menuinfo swEggMayo = new Menuinfo("에그마요", 4300, new ImageIcon("img/sweggmayo.jpg"));
	Menuinfo swHam = new Menuinfo("햄", 4700, new ImageIcon("img/swham.jpg"));
	Menuinfo swTuna = new Menuinfo("참치", 4800, new ImageIcon("img/swtuna.jpg"));
	
	Menuinfo drinkSprite = new Menuinfo("스프라이트", 1800, new ImageIcon("img/drinksprite.jpg"));
	Menuinfo drinkSoda16oz = new Menuinfo("탄산음료 16oz", 1500, new ImageIcon("img/drinksoda16.jpg"));
	Menuinfo drinkSoda22oz = new Menuinfo("탄산음료 22oz", 1700, new ImageIcon("img/drinksoda22.jpg"));
	Menuinfo drinkCokeCola = new Menuinfo("코카콜라", 1800, new ImageIcon("img/drinkcoke.jpg"));
	Menuinfo drinkAmericano = new Menuinfo("아메리카노", 2000, new ImageIcon("img/drinkcoffee.jpg"));
	Menuinfo drinkIceAmericano = new Menuinfo("아이스 아메리카노", 2500, new ImageIcon("img/drinkicecoffee.jpg"));
	
	Menuinfo sideChocochip = new Menuinfo("초코칩 쿠키", 1000, new ImageIcon("img/sidechoco.jpg"));
	Menuinfo sideDoubleChocochip = new Menuinfo("더블 초코칩 쿠키", 1000, new ImageIcon("img/sidedoublechoco.jpg"));
	Menuinfo sideRaspberryCheeseCake = new Menuinfo("라즈베리 치즈케익 쿠키", 1000, new ImageIcon("img/sideraspberry.jpg"));
	Menuinfo sideOatmealRisin = new Menuinfo("오트밀 레이즌 쿠키", 1000, new ImageIcon("img/sideoatmeal.jpg"));
	Menuinfo sideWhiteChocoMacadamia = new Menuinfo("화이트초코 마카다미아 쿠키", 1000, new ImageIcon("img/sidewhitechoco.jpg"));
	
	this.sandwich = new ArrayList<>();
	this.salad = new ArrayList<>();
	this.wrap = new ArrayList<>();
	this.drink = new ArrayList<>();
	this.side = new ArrayList<>();
	
	this.sandwich.add(swEggMayo);
	this.sandwich.add(swRoastChicken);
	this.sandwich.add(swKBarbeque);
	this.sandwich.add(swSteakCheese);
	this.sandwich.add(swMeatball);
	this.sandwich.add(swTuna);
	this.sandwich.add(swHam);
	this.sandwich.add(swItalianBMT);
	this.sandwich.add(swSubwayClub);
	
	this.drink.add(drinkIceAmericano);
	this.drink.add(drinkAmericano);
	this.drink.add(drinkCokeCola);
	this.drink.add(drinkSprite);
	this.drink.add(drinkSoda22oz);
	this.drink.add(drinkSoda16oz);
	
	this.side.add(sideWhiteChocoMacadamia);
	this.side.add(sideOatmealRisin);
	this.side.add(sideRaspberryCheeseCake);
	this.side.add(sideDoubleChocochip);
	this.side.add(sideChocochip);
	}
}

