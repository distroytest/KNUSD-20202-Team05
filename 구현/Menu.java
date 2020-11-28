import java.util.ArrayList;
public class Menu {
	ArrayList<Menuinfo> sandwich;
	ArrayList<Menuinfo> salad;
	ArrayList<Menuinfo> wrap;
	ArrayList<Menuinfo> drink;
	ArrayList<Menuinfo> side;
	
	public Menu() {
	
	Menuinfo swMeatball = new Menuinfo("��Ʈ��", 5200 );
	Menuinfo swSteakCheese = new Menuinfo("������ũ & ġ��", 6500);
	Menuinfo swKBarbeque = new Menuinfo("K-�ٺ�ť", 6000);
	Menuinfo swSubwayClub = new Menuinfo("������ Ŭ��", 5700);
	Menuinfo swRoastChicken = new Menuinfo("�ν�Ʈ ġŲ", 5900);
	Menuinfo swItalianBMT = new Menuinfo("��Ż���� ��Ƽ", 5200);
	Menuinfo swEggMayo = new Menuinfo("���׸���", 4300);
	Menuinfo swHam = new Menuinfo("��", 4700);
	Menuinfo swTuna = new Menuinfo("��ġ", 4800);
	
	Menuinfo drinkSprite = new Menuinfo("��������Ʈ", 1800);
	Menuinfo drinkSoda16oz = new Menuinfo("ź������ 16oz", 1500);
	Menuinfo drinkSoda22oz = new Menuinfo("ź������ 22oz", 1700);
	Menuinfo drinkCokeCola = new Menuinfo("��ī�ݶ�", 1800);
	Menuinfo drinkAmericano = new Menuinfo("�Ƹ޸�ī��", 2000);
	Menuinfo drinkIceAmericano = new Menuinfo("���̽� �Ƹ޸�ī��", 2500);
	
	Menuinfo sideChocochip = new Menuinfo("����Ĩ ��Ű", 1000);
	Menuinfo sideDoubleChocochip = new Menuinfo("���� ����Ĩ ��Ű", 1000);
	Menuinfo sideRaspberryCheeseCake = new Menuinfo("����� ġ������ ��Ű", 1000);
	Menuinfo sideOatmealRisin = new Menuinfo("��Ʈ�� ������ ��Ű", 1000);
	Menuinfo sideWhiteChocoMacadamia = new Menuinfo("ȭ��Ʈ���� ��ī�ٹ̾� ��Ű", 1000);
	
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

