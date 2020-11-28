import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Frame extends JFrame{
	Menu menu = new Menu();
	Container contentPane = getContentPane();
	JPanel topPanel = new JPanel();
	JPanel sortPanel = new JPanel();
	JPanel menuPanel = new JPanel();
	JPanel cartPanel = new JPanel();
	
	JPanel sandwichPanel = new JPanel();
	JPanel saladPanel = new JPanel();
	JPanel wrapPanel = new JPanel();
	JPanel sidePanel = new JPanel();
	JPanel drinkPanel = new JPanel();
	
	public Frame() {
		setTitle("SUBWAY KIOSK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1500,1000);
		setResizable(false);
		
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(117, 228, 126));
		
		
		JLabel sortLabel = new JLabel("ºÐ·ù");
		JLabel menuLabel = new JLabel("¸Þ´º");
		JLabel cartLabel = new JLabel("Àå¹Ù±¸´Ï");
		JLabel topLabel = new JLabel("SUBWAY");
		JButton loginButton = new JButton("·Î±×ÀÎ");
		JButton orderButton = new JButton("ÁÖ¹®");
		JButton cancelButton = new JButton("Ãë¼Ò");
		JButton sandwich = new JButton("»÷µåÀ§Ä¡");
		JButton salad = new JButton("»ø·¯µå");
		JButton wrap = new JButton("·¦");
		JButton side = new JButton("»çÀÌµå");
		JButton drink = new JButton("À½·á");
		
		sortLabel.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,40));
		menuLabel.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,40));
		cartLabel.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,40));
		topLabel.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,60));
		
		sortLabel.setSize(200,100);
		menuLabel.setSize(780,100);
		cartLabel.setSize(300,100);
		sortLabel.setLocation(60, 210);
		menuLabel.setLocation(300, 210);
		cartLabel.setLocation(1120, 210);
		sortLabel.setHorizontalAlignment(JLabel.CENTER);
		menuLabel.setHorizontalAlignment(JLabel.CENTER);
		cartLabel.setHorizontalAlignment(JLabel.CENTER);
		
		loginButton.setFocusable(false);
		loginButton.setSize(100,40);
		loginButton.setLocation(1320,30);
		loginButton.setBackground(Color.WHITE);
		orderButton.setFocusable(false);
		orderButton.setSize(140,100);
		orderButton.setLocation(1120,780);
		orderButton.setBackground(Color.white);
		orderButton.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,30));
		cancelButton.setFocusable(false);
		cancelButton.setSize(140,100);
		cancelButton.setLocation(1280,780);
		cancelButton.setBackground(Color.white);
		cancelButton.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,30));
		
		sandwich.setFocusable(false);
		sandwich.setSize(150, 70);
		sandwich.setLocation(25,20);
		sandwich.setBackground(new Color(246, 241, 123));
		sandwich.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,20));
		salad.setFocusable(false);
		salad.setSize(150, 70);
		salad.setLocation(25,126);
		salad.setBackground(new Color(246, 241, 123));
		salad.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,20));
		wrap.setFocusable(false);
		wrap.setSize(150, 70);
		wrap.setLocation(25,232);
		wrap.setBackground(new Color(246, 241, 123));
		wrap.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,20));
		side.setFocusable(false);
		side.setSize(150, 70);
		side.setLocation(25,338);
		side.setBackground(new Color(246, 241, 123));
		side.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,20));
		drink.setFocusable(false);
		drink.setSize(150, 70);
		drink.setLocation(25,444);
		drink.setBackground(new Color(246, 241, 123));
		drink.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,20));
		
		topPanel.setBackground(Color.WHITE);
		sortPanel.setBackground(Color.WHITE);
		menuPanel.setBackground(Color.WHITE);
		cartPanel.setBackground(Color.WHITE);
		topPanel.setLocation(60, 100);
		sortPanel.setLocation(60,330);
		menuPanel.setLocation(300,330);
		cartPanel.setLocation(1120,330);
		topPanel.setSize(1360,100);
		sortPanel.setSize(200,550);
		menuPanel.setSize(780,550);
		cartPanel.setSize(300,430);
		menuPanel.setLayout(new BorderLayout());
		
		topPanel.add(topLabel);
		
		sortPanel.setLayout(null);
		sortPanel.add(sandwich);
		sortPanel.add(salad);
		sortPanel.add(wrap);
		sortPanel.add(side);
		sortPanel.add(drink);
		sandwich.addMouseListener(new sandwichMouseListener());
		salad.addMouseListener(new saladMouseListener());
		wrap.addMouseListener(new wrapMouseListener());
		side.addMouseListener(new sideMouseListener());
		drink.addMouseListener(new drinkMouseListener());
		
		contentPane.add(topPanel);
		contentPane.add(sortPanel);
		contentPane.add(menuPanel);
		contentPane.add(cartPanel);
		contentPane.add(loginButton);
		contentPane.add(sortLabel);
		contentPane.add(menuLabel);
		contentPane.add(cartLabel);
		contentPane.add(orderButton);
		contentPane.add(cancelButton);
		
		setVisible(true);	
	}
	
	class sandwichMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			menuPanel.removeAll();
			sandwichPanel.removeAll();
			int i = 0;
			sandwichPanel.setBackground(Color.white);
			sandwichPanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
			for(i=0;i<menu.sandwich.size();i++) {
				JButton button = new JButton(menu.sandwich.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220,220));
				sandwichPanel.add(button);
			}
			JScrollPane scroll = new JScrollPane(sandwichPanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll,BorderLayout.CENTER);
			setVisible(true);
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}
		
	}
	
	class saladMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			menuPanel.removeAll();
			saladPanel.removeAll();
			int i = 0;
			saladPanel.setBackground(Color.white);
			saladPanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
			for(i=0;i<menu.salad.size();i++) {
				JButton button = new JButton(menu.salad.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220,220));
				saladPanel.add(button);
			}
			JScrollPane scroll = new JScrollPane(saladPanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll,BorderLayout.CENTER);
			setVisible(true);
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}
		
	}
	
	class wrapMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			menuPanel.removeAll();
			wrapPanel.removeAll();
			int i = 0;
			wrapPanel.setBackground(Color.white);
			wrapPanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
			for(i=0;i<menu.wrap.size();i++) {
				JButton button = new JButton(menu.wrap.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220,220));
				wrapPanel.add(button);
			}
			JScrollPane scroll = new JScrollPane(saladPanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll,BorderLayout.CENTER);
			setVisible(true);
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}
		
	}
	
	class sideMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			menuPanel.removeAll();
			sidePanel.removeAll();
			int i = 0;
			sidePanel.setBackground(Color.white);
			sidePanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
			for(i=0;i<menu.side.size();i++) {
				JButton button = new JButton(menu.side.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220,220));
				sidePanel.add(button);
			}
			JScrollPane scroll = new JScrollPane(sidePanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll,BorderLayout.CENTER);
			setVisible(true);
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}
		
	}
	
	class drinkMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			menuPanel.removeAll();
			drinkPanel.removeAll();
			int i = 0;
			drinkPanel.setBackground(Color.white);
			drinkPanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
			for(i=0;i<menu.drink.size();i++) {
				JButton button = new JButton(menu.drink.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220,220));
				drinkPanel.add(button);
			}
			JScrollPane scroll = new JScrollPane(drinkPanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll,BorderLayout.CENTER);
			setVisible(true);
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}
		
	}

	public static void main(String[] args) {
		new Frame();
	}
	
	
}
