import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Order extends JFrame{
	Container contentPane = getContentPane();
	public Order() {
		setTitle("SUBWAY KIOSK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1500,1000);
		
		
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(117, 228, 126));
		
		JPanel topPanel = new JPanel();
		JPanel sortPanel = new JPanel();
		JPanel menuPanel = new JPanel();
		JPanel cartPanel = new JPanel();
		JLabel sortLabel = new JLabel("ºÐ·ù");
		JLabel menuLabel = new JLabel("¸Þ´º");
		JLabel cartLabel = new JLabel("Àå¹Ù±¸´Ï");
		JLabel topLabel = new JLabel("SUBWAY");
		JButton loginButton = new JButton("·Î±×ÀÎ");
		JButton orderButton = new JButton("ÁÖ¹®");
		JButton cancelButton = new JButton("Ãë¼Ò");
		JButton sandwich = new JButton("»÷µåÀ§Ä¡");
		JButton salad = new JButton("»ø·¯µå");
		JButton lab = new JButton("·¦");
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
		lab.setFocusable(false);
		lab.setSize(150, 70);
		lab.setLocation(25,232);
		lab.setBackground(new Color(246, 241, 123));
		lab.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,20));
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
		
		topPanel.add(topLabel);
		
		sortPanel.setLayout(null);
		sortPanel.add(sandwich);
		sortPanel.add(salad);
		sortPanel.add(lab);
		sortPanel.add(side);
		sortPanel.add(drink);
	
	
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

	public static void main(String[] args) {
		new Order();
	}
	
	
}