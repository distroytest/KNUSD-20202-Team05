import java.util.ArrayList;
public class Menu {
	ArrayList<Menuinfo> sandwich;
	ArrayList<Menuinfo> salad;
	ArrayList<Menuinfo> wrap;
	ArrayList<Menuinfo> drink;
	ArrayList<Menuinfo> side;
	
	public Menu() {
	
	Menuinfo swMeatball = new Menuinfo("미트볼", 5200 );
	Menuinfo swSteakCheese = new Menuinfo("스테이크 & 치즈", 6500);
	Menuinfo swKBarbeque = new Menuinfo("K-바베큐", 6000);
	Menuinfo swSubwayClub = new Menuinfo("써브웨이 클럽", 5700);
	Menuinfo swRoastChicken = new Menuinfo("로스트 치킨", 5900);
	Menuinfo swItalianBMT = new Menuinfo("이탈리안 비엠티", 5200);
	Menuinfo swEggMayo = new Menuinfo("에그마요", 4300);
	Menuinfo swHam = new Menuinfo("햄", 4700);
	Menuinfo swTuna = new Menuinfo("참치", 4800);
	
	Menuinfo drinkSprite = new Menuinfo("스프라이트", 1800);
	Menuinfo drinkSoda16oz = new Menuinfo("탄산음료 16oz", 1500);
	Menuinfo drinkSoda22oz = new Menuinfo("탄산음료 22oz", 1700);
	Menuinfo drinkCokeCola = new Menuinfo("코카콜라", 1800);
	Menuinfo drinkAmericano = new Menuinfo("아메리카노", 2000);
	Menuinfo drinkIceAmericano = new Menuinfo("아이스 아메리카노", 2500);
	
	Menuinfo sideChocochip = new Menuinfo("초코칩 쿠키", 1000);
	Menuinfo sideDoubleChocochip = new Menuinfo("더블 초코칩 쿠키", 1000);
	Menuinfo sideRaspberryCheeseCake = new Menuinfo("라즈베리 치즈케익 쿠키", 1000);
	Menuinfo sideOatmealRisin = new Menuinfo("오트밀 레이즌 쿠키", 1000);
	Menuinfo sideWhiteChocoMacadamia = new Menuinfo("화이트초코 마카다미아 쿠키", 1000);
	
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

