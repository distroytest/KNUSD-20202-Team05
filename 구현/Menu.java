import java.util.ArrayList;
import javax.swing.*;

public class Menu {
	ArrayList<Menuinfo> sandwich;
	ArrayList<Menuinfo> salad;
	ArrayList<Menuinfo> wrap;
	ArrayList<Menuinfo> drink;
	ArrayList<Menuinfo> side;
	
	public Menu() {
	
	Menuinfo swMeatball = new Menuinfo("��Ʈ��", 5200, new ImageIcon("img/swmeatball.jpg") );
	Menuinfo swSteakCheese = new Menuinfo("������ũ & ġ��", 6500, new ImageIcon("img/swsteakandcheese.jpg"));
	Menuinfo swKBarbeque = new Menuinfo("K-�ٺ�ť", 6000, new ImageIcon("img/swkbarbeque.jpg"));
	Menuinfo swSubwayClub = new Menuinfo("������ Ŭ��", 5700, new ImageIcon("img/swsubwayclub.jpg"));
	Menuinfo swRoastChicken = new Menuinfo("�ν�Ʈ ġŲ", 5900, new ImageIcon("img/swroastchicken.jpg"));
	Menuinfo swItalianBMT = new Menuinfo("��Ż���� ��Ƽ", 5200, new ImageIcon("img/switalian.jpg"));
	Menuinfo swEggMayo = new Menuinfo("���׸���", 4300, new ImageIcon("img/sweggmayo.jpg"));
	Menuinfo swHam = new Menuinfo("��", 4700, new ImageIcon("img/swham.jpg"));
	Menuinfo swTuna = new Menuinfo("��ġ", 4800, new ImageIcon("img/swtuna.jpg"));
	
	Menuinfo drinkSprite = new Menuinfo("��������Ʈ", 1800, new ImageIcon("img/drinksprite.jpg"));
	Menuinfo drinkSoda16oz = new Menuinfo("ź������ 16oz", 1500, new ImageIcon("img/drinksoda16.jpg"));
	Menuinfo drinkSoda22oz = new Menuinfo("ź������ 22oz", 1700, new ImageIcon("img/drinksoda22.jpg"));
	Menuinfo drinkCokeCola = new Menuinfo("��ī�ݶ�", 1800, new ImageIcon("img/drinkcoke.jpg"));
	Menuinfo drinkAmericano = new Menuinfo("�Ƹ޸�ī��", 2000, new ImageIcon("img/drinkcoffee.jpg"));
	Menuinfo drinkIceAmericano = new Menuinfo("���̽� �Ƹ޸�ī��", 2500, new ImageIcon("img/drinkicecoffee.jpg"));
	
	Menuinfo sideChocochip = new Menuinfo("����Ĩ ��Ű", 1000, new ImageIcon("img/sidechoco.jpg"));
	Menuinfo sideDoubleChocochip = new Menuinfo("���� ����Ĩ ��Ű", 1000, new ImageIcon("img/sidedoublechoco.jpg"));
	Menuinfo sideRaspberryCheeseCake = new Menuinfo("����� ġ������ ��Ű", 1000, new ImageIcon("img/sideraspberry.jpg"));
	Menuinfo sideOatmealRisin = new Menuinfo("��Ʈ�� ������ ��Ű", 1000, new ImageIcon("img/sideoatmeal.jpg"));
	Menuinfo sideWhiteChocoMacadamia = new Menuinfo("ȭ��Ʈ���� ��ī�ٹ̾� ��Ű", 1000, new ImageIcon("img/sidewhitechoco.jpg"));
	
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

