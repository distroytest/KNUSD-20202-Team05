import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Order extends JFrame {
	public ArrayList<Sandwich> sandwichList;
	public ArrayList<Drink> drinkList;
	public ArrayList<Side> sideList;
	int totalPrice;
	int orderNumber;

	public Order() {
		this.sandwichList = new ArrayList<>();
		this.drinkList = new ArrayList<>();
		this.sideList  = new ArrayList<>();
		this.totalPrice = 0;
	}
	public void uploadSandwichToCart(Sandwich sandwich) {
		sandwichList.add(sandwich);
		calculatePrice();
		for(int i =0;i<sandwichList.size();i++) {
			System.out.println(sandwichList.get(i).type + totalPrice);
		}
	}
	
	public void uploadDrinkToCart(Drink drink) {
		drinkList.add(drink);
		calculatePrice();
		for(int i =0;i<drinkList.size();i++) {
			System.out.println(drinkList.get(i).name + totalPrice);
		}
	}
	
	public void uploadSideToCart(Side side) {
		sideList.add(side);
		calculatePrice();
		for(int i =0;i<sideList.size();i++) {
			System.out.println(sideList.get(i).name + totalPrice);
		}
	}
	public void calculatePrice() {
		totalPrice = 0;
		for(int i =0;i<sandwichList.size();i++) {
			totalPrice += sandwichList.get(i).price * sandwichList.get(i).num;
		}
		for(int i =0;i<drinkList.size();i++) {
			totalPrice += drinkList.get(i).price * drinkList.get(i).num;
		}
		for(int i =0;i<sideList.size();i++) {
			totalPrice += sideList.get(i).price * sideList.get(i).num;
		}
	}

}