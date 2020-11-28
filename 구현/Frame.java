import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Frame extends JFrame{
	Menu menu = new Menu();
	Container contentPane = getContentPane();
	JPanel orderPanel = new JPanel();
	JPanel menuPanel = new JPanel();
	JPanel cartPanel = new JPanel();
	JPanel loginPanel = new JPanel();	
	JPanel sandwichPanel = new JPanel();
	JPanel saladPanel = new JPanel();
	JPanel wrapPanel = new JPanel();
	JPanel sidePanel = new JPanel();
	JPanel drinkPanel = new JPanel();
	
	JTextField txtID = new JTextField(10);
	JPasswordField txtPW = new JPasswordField(10);
	
	public Frame() {
		setTitle("SUBWAY KIOSK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1500,1000);
		setResizable(false);
		
		contentPane.setLayout(null);
		
		JPanel IDPWPanel = new JPanel();
		JPanel topPanel = new JPanel();
		JPanel topPanel1 = new JPanel();	
		JPanel sortPanel = new JPanel();
		
		orderPanel.setLayout(null);
		orderPanel.setSize(1500,1000);
		orderPanel.setBackground(new Color(117,228,126));
		loginPanel.setLayout(null);
		loginPanel.setSize(1500,1000);
		loginPanel.setBackground(new Color(117,228,126));
		
		txtID.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN,30));
		txtPW.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN,30));
		
		IDPWPanel.setSize(400, 180);
		IDPWPanel.setLocation(550,320);
		IDPWPanel.setBackground(Color.WHITE);
		IDPWPanel.setLayout(new GridLayout(2, 1, 0, 5));
		
		JLabel idLabel = new JLabel("ID");
		JLabel pwLabel = new JLabel("PW");
		JLabel sortLabel = new JLabel("ºÐ·ù");
		JLabel menuLabel = new JLabel("¸Þ´º");
		JLabel cartLabel = new JLabel("Àå¹Ù±¸´Ï");
		JLabel topLabel = new JLabel("SUBWAY");
		JLabel topLabel1 = new JLabel("SUBWAY");
		JButton loginButton = new JButton("·Î±×ÀÎ");
		JButton orderButton = new JButton("ÁÖ¹®");
		JButton cancelButton = new JButton("Ãë¼Ò");
		JButton sandwich = new JButton("»÷µåÀ§Ä¡");
		JButton salad = new JButton("»ø·¯µå");
		JButton wrap = new JButton("·¦");
		JButton side = new JButton("»çÀÌµå");
		JButton drink = new JButton("À½·á");
		JButton loginButton1 = new JButton("·Î±×ÀÎ");
		JButton backButton = new JButton("µÚ·Î°¡±â");
		
		idLabel.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,60));
		pwLabel.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,60));
		sortLabel.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,40));
		menuLabel.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,40));
		cartLabel.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,40));
		topLabel.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,60));
		topLabel1.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,60));
		
		idLabel.setSize(100,100);
		idLabel.setLocation(400,300);
		pwLabel.setSize(100,100);
		pwLabel.setLocation(400,400);
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
		loginButton1.setFocusable(false);
		loginButton1.setSize(180,180);
		loginButton1.setBackground(Color.WHITE);
		loginButton1.setLocation(955,320);
		loginButton1.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,30));
		backButton.setFocusable(false);
		backButton.setSize(100,40);
		backButton.setBackground(Color.WHITE);
		backButton.setLocation(1320,30);
		
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
		topPanel1.setBackground(Color.WHITE);
		sortPanel.setBackground(Color.WHITE);
		menuPanel.setBackground(Color.WHITE);
		cartPanel.setBackground(Color.WHITE);
		topPanel.setLocation(60, 100);
		topPanel1.setLocation(60, 100);
		sortPanel.setLocation(60,330);
		menuPanel.setLocation(300,330);
		cartPanel.setLocation(1120,330);
		topPanel.setSize(1360,100);
		topPanel1.setSize(1360,100);
		sortPanel.setSize(200,550);
		menuPanel.setSize(780,550);
		cartPanel.setSize(300,430);
		menuPanel.setLayout(new BorderLayout());
		
		topPanel.add(topLabel);
		topPanel1.add(topLabel1);
		
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
		loginButton.addMouseListener(new loginMouseListener());
		backButton.addMouseListener(new backMouseListener());
		loginButton1.addMouseListener(new loginMouseListener1());
		
		orderPanel.add(topPanel);
		orderPanel.add(sortPanel);
		orderPanel.add(menuPanel);
		orderPanel.add(cartPanel);
		orderPanel.add(loginButton);
		orderPanel.add(sortLabel);
		orderPanel.add(menuLabel);
		orderPanel.add(cartLabel);
		orderPanel.add(orderButton);
		orderPanel.add(cancelButton);
		
		IDPWPanel.add(txtID);
		IDPWPanel.add(txtPW);
		
		loginPanel.add(idLabel);
		loginPanel.add(pwLabel);
		loginPanel.add(loginButton1);
		loginPanel.add(backButton);
		loginPanel.add(IDPWPanel);
		loginPanel.add(topPanel1);
		
		contentPane.add(orderPanel);
		contentPane.add(loginPanel);
		loginPanel.setVisible(false);
		
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
	
	class loginMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			orderPanel.setVisible(false);
			loginPanel.setVisible(true);
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
	
	class backMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			txtID.setText("");
			txtPW.setText("");
			loginPanel.setVisible(false);
			orderPanel.setVisible(true);
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
	
	class loginMouseListener1 implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			txtID.setText("");
			txtPW.setText("");
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