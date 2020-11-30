import java.awt.BorderLayout;
import java.awt.event.*;
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
	//---------------------------------------------------------------------------------------------------
	// �� ġ�� ���� �ҽ� �߰�
	Bread bread = new Bread();
	Cheese cheese = new Cheese();
	Topping topping = new Topping();
	Sauce sauce = new Sauce();
	Sandwich sandwich = new Sandwich();
	Drink drink = new Drink();
	Side side = new Side();
	

	//------------------------------------------------------------------------------------------------------
	
	
	Container contentPane = getContentPane();
	JPanel orderPanel = new JPanel();
	JPanel menuPanel = new JPanel();
	
	JPanel cartFramePanel = new JPanel();			// ��ٱ��� �� �� ��ư 2�� �����ϴ� �г�
	JPanel cartPanel = new JPanel();
	JPanel makeSandwichPanel = new JPanel();
	JPanel sandwichContentPanel = new JPanel();
	
	JPanel loginPanel = new JPanel();	
	JPanel sandwichPanel = new JPanel();
	JPanel saladPanel = new JPanel();
	JPanel wrapPanel = new JPanel();
	JPanel sidePanel = new JPanel();
	JPanel drinkPanel = new JPanel();
	
	JPanel IDPWPanel = new JPanel();
	JPanel topPanel = new JPanel();
	JPanel topPanel1 = new JPanel();	
	JPanel sortPanel = new JPanel();			
	JPanel sortPanel2 = new JPanel();
	
	JPanel breadPanel = new JPanel();
	JPanel cheesePanel = new JPanel();
	JPanel toppingPanel = new JPanel();
	JPanel saucePanel = new JPanel();
	
	
	
	
	
	//-------------------------------------------------------------------------------------------------------
	
	JTextField txtID = new JTextField(10);
	JPasswordField txtPW = new JPasswordField(10);
	
	public Frame() {
		setTitle("SUBWAY KIOSK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1500,1000);
		setResizable(false);
		
		contentPane.setLayout(null);
		
		orderPanel.setLayout(null);
		orderPanel.setSize(1500,1000);
		orderPanel.setBackground(new Color(117,228,126));
		loginPanel.setLayout(null);
		loginPanel.setSize(1500,1000);
		loginPanel.setBackground(new Color(117,228,126));
		
		
		txtID.setFont(new Font("���� ���",Font.PLAIN,30));
		txtPW.setFont(new Font("���� ���",Font.PLAIN,30));
		
		IDPWPanel.setSize(400, 180);
		IDPWPanel.setLocation(550,320);
		IDPWPanel.setBackground(Color.WHITE);
		IDPWPanel.setLayout(new GridLayout(2, 1, 0, 5));
		
		JLabel idLabel = new JLabel("ID");
		JLabel pwLabel = new JLabel("PW");
		JLabel sortLabel = new JLabel("�з�");
		JLabel menuLabel = new JLabel("�޴�");
		JLabel topLabel = new JLabel("SUBWAY");
		JLabel topLabel1 = new JLabel("SUBWAY");
		JButton loginButton = new JButton("�α���");
		JButton sandwich = new JButton("������ġ");
		JButton salad = new JButton("������");
		JButton wrap = new JButton("��");
		JButton side = new JButton("���̵�");
		JButton drink = new JButton("����");
		JButton loginButton1 = new JButton("�α���");
		JButton backButton = new JButton("�ڷΰ���");
		
		//-------------------------------------------------------------------------------------------------
		// 2��° ��Ʈ�гο� ���� ��, ġ��, ����, �ҽ� ��ư
		JButton bread = new JButton("��");
		JButton cheese = new JButton("ġ��");
		JButton topping = new JButton("����");
		JButton sauce = new JButton("�ҽ�");
		
		
		
		bread.setFocusable(false);
		bread.setSize(150, 70);
		bread.setLocation(25,20);
		bread.setBackground(new Color(246, 241, 123));
		bread.setFont(new Font("���� ���",Font.BOLD,20));
		cheese.setFocusable(false);
		cheese.setSize(150, 70);
		cheese.setLocation(25,126);
		cheese.setBackground(new Color(246, 241, 123));
		cheese.setFont(new Font("���� ���",Font.BOLD,20));
		topping.setFocusable(false);
		topping.setSize(150, 70);
		topping.setLocation(25,232);
		topping.setBackground(new Color(246, 241, 123));
		topping.setFont(new Font("���� ���",Font.BOLD,20));
		sauce.setFocusable(false);
		sauce.setSize(150, 70);
		sauce.setLocation(25,338);
		sauce.setBackground(new Color(246, 241, 123));
		sauce.setFont(new Font("���� ���",Font.BOLD,20));
	
		//--------------------------------------------------------------------------------------------------
		
		
		idLabel.setFont(new Font("���� ���",Font.BOLD,60));
		pwLabel.setFont(new Font("���� ���",Font.BOLD,60));
		sortLabel.setFont(new Font("���� ���",Font.BOLD,40));
		menuLabel.setFont(new Font("���� ���",Font.BOLD,40));
		topLabel.setFont(new Font("���� ���",Font.BOLD,60));
		topLabel1.setFont(new Font("���� ���",Font.BOLD,60));
		
		idLabel.setSize(100,100);
		idLabel.setLocation(400,300);
		pwLabel.setSize(100,100);
		pwLabel.setLocation(400,400);
		sortLabel.setSize(200,100);
		menuLabel.setSize(780,100);
		sortLabel.setLocation(60, 210);
		menuLabel.setLocation(300, 210);
		sortLabel.setHorizontalAlignment(JLabel.CENTER);
		menuLabel.setHorizontalAlignment(JLabel.CENTER);
		
		
		loginButton.setFocusable(false);
		loginButton.setSize(100,40);
		loginButton.setLocation(1320,30);
		loginButton.setBackground(Color.WHITE);
		loginButton1.setFocusable(false);
		loginButton1.setSize(180,180);
		loginButton1.setBackground(Color.WHITE);
		loginButton1.setLocation(955,320);
		loginButton1.setFont(new Font("���� ���",Font.BOLD,30));
		backButton.setFocusable(false);
		backButton.setSize(100,40);
		backButton.setBackground(Color.WHITE);
		backButton.setLocation(1320,30);
		
		sandwich.setFocusable(false);
		sandwich.setSize(150, 70);
		sandwich.setLocation(25,20);
		sandwich.setBackground(new Color(246, 241, 123));
		sandwich.setFont(new Font("���� ���",Font.BOLD,20));
		salad.setFocusable(false);
		salad.setSize(150, 70);
		salad.setLocation(25,126);
		salad.setBackground(new Color(246, 241, 123));
		salad.setFont(new Font("���� ���",Font.BOLD,20));
		wrap.setFocusable(false);
		wrap.setSize(150, 70);
		wrap.setLocation(25,232);
		wrap.setBackground(new Color(246, 241, 123));
		wrap.setFont(new Font("���� ���",Font.BOLD,20));
		side.setFocusable(false);
		side.setSize(150, 70);
		side.setLocation(25,338);
		side.setBackground(new Color(246, 241, 123));
		side.setFont(new Font("���� ���",Font.BOLD,20));
		drink.setFocusable(false);
		drink.setSize(150, 70);
		drink.setLocation(25,444);
		drink.setBackground(new Color(246, 241, 123));
		drink.setFont(new Font("���� ���",Font.BOLD,20));
		
		topPanel.setBackground(Color.WHITE);
		topPanel1.setBackground(Color.WHITE);
		sortPanel.setBackground(Color.WHITE);
		menuPanel.setBackground(Color.WHITE);
		
// -------------------------------------- ��ٱ��� UI	-------------------------------------------------//	
		
		JLabel cartLabel = new JLabel("��ٱ���");
		cartLabel.setFont(new Font("���� ���",Font.BOLD,40));
		cartLabel.setSize(300,100);
		cartLabel.setLocation(0, 0);
		cartLabel.setHorizontalAlignment(JLabel.CENTER);
		
		JButton cancelButton = new JButton("���");
		cancelButton.setFocusable(false);
		cancelButton.setSize(140,100);
		cancelButton.setLocation(0,570);
		cancelButton.setBackground(Color.white);
		cancelButton.setFont(new Font("���� ���",Font.BOLD,30));
		
		JButton orderButton = new JButton("�ֹ�");
		orderButton.setFocusable(false);
		orderButton.setSize(140,100);
		orderButton.setLocation(160,570);
		orderButton.setBackground(Color.white);
		orderButton.setFont(new Font("���� ���",Font.BOLD,30));
		
		cartPanel.setLocation(0,120);
		cartPanel.setSize(300,430);
		cartPanel.setBackground(Color.WHITE);
		
		cartFramePanel.setLayout(null);
		cartFramePanel.setBackground(new Color(117,228,126));
		cartFramePanel.setSize(300,700);
		cartFramePanel.setLocation(1120,210);
		cartFramePanel.add(cartLabel);
		cartFramePanel.add(cartPanel);
		cartFramePanel.add(cancelButton);
		cartFramePanel.add(orderButton);
		
//-----------------------------------------------------------------------------------------------------//
//------------------------------------  ������ġ ���� UI---------------------------------------------------//
		
		JLabel sandwichCotentLabel = new JLabel("����");
		sandwichCotentLabel.setFont(new Font("���� ���",Font.BOLD,40));
		sandwichCotentLabel.setSize(300,100);
		sandwichCotentLabel.setLocation(0, 0);
		sandwichCotentLabel.setHorizontalAlignment(JLabel.CENTER);
		
		JButton cancelMakingSandwichButton = new JButton("���");
		cancelMakingSandwichButton.setFocusable(false);
		cancelMakingSandwichButton.setSize(140,100);
		cancelMakingSandwichButton.setLocation(0,570);
		cancelMakingSandwichButton.setBackground(Color.white);
		cancelMakingSandwichButton.setFont(new Font("���� ���",Font.BOLD,30));
		cancelMakingSandwichButton.addMouseListener(new makeSandwichCancelListener());
		
		JButton requestSandwichButton = new JButton("�Ϸ�");
		requestSandwichButton.setFocusable(false);
		requestSandwichButton.setSize(140,100);
		requestSandwichButton.setLocation(160,570);
		requestSandwichButton.setBackground(Color.white);
		requestSandwichButton.setFont(new Font("���� ���",Font.BOLD,30));
		requestSandwichButton.addMouseListener( new completeMakingSandwichListener()); // ------------ �߰��� ---------
		
		JLabel breadSizeLabel = new JLabel("�� ����");
		breadSizeLabel.setFont(new Font("���� ���",Font.BOLD,20));
		breadSizeLabel.setSize(100,86);
		breadSizeLabel.setLocation(0, 0);
		breadSizeLabel.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel breadTypeLabel = new JLabel("��");
		breadTypeLabel.setFont(new Font("���� ���",Font.BOLD,20));
		breadTypeLabel.setSize(100,86);
		breadTypeLabel.setLocation(0, 86);
		breadTypeLabel.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel cheeseTypeLabel = new JLabel("ġ��");
		cheeseTypeLabel.setFont(new Font("���� ���",Font.BOLD,20));
		cheeseTypeLabel.setSize(100,86);
		cheeseTypeLabel.setLocation(0, 172);
		cheeseTypeLabel.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel toppingTypeLabel = new JLabel("����");
		toppingTypeLabel.setFont(new Font("���� ���",Font.BOLD,20));
		toppingTypeLabel.setSize(100,86);
		toppingTypeLabel.setLocation(0, 258);
		toppingTypeLabel.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel sauceTypeLabel = new JLabel("�ҽ�");
		sauceTypeLabel.setFont(new Font("���� ���",Font.BOLD,20));
		sauceTypeLabel.setSize(100,86);
		sauceTypeLabel.setLocation(0, 344);
		sauceTypeLabel.setHorizontalAlignment(JLabel.CENTER);
			
		sandwichContentPanel.setLayout(null);
		sandwichContentPanel.add(breadSizeLabel);
		sandwichContentPanel.add(breadTypeLabel);
		sandwichContentPanel.add(cheeseTypeLabel);
		sandwichContentPanel.add(toppingTypeLabel);
		sandwichContentPanel.add(sauceTypeLabel);
		sandwichContentPanel.setLocation(0,120);
		sandwichContentPanel.setSize(300,430);
		sandwichContentPanel.setBackground(Color.WHITE);
		
		makeSandwichPanel.setLayout(null);
		makeSandwichPanel.setBackground(new Color(117,228,126));
		makeSandwichPanel.setSize(300,700);
		makeSandwichPanel.setLocation(1120,210);
		makeSandwichPanel.add(sandwichCotentLabel);
		makeSandwichPanel.add(sandwichContentPanel);
		makeSandwichPanel.add(cancelMakingSandwichButton);
		makeSandwichPanel.add(requestSandwichButton);
		makeSandwichPanel.setVisible(false);
		
//-------------------------------------------------------------------------------------------�������------------	
			
		topPanel.setLocation(60, 100);
		topPanel1.setLocation(60, 100);
		sortPanel.setLocation(60,330);
		menuPanel.setLocation(300,330);
		topPanel.setSize(1360,100);
		topPanel1.setSize(1360,100);
		sortPanel.setSize(200,550);
		menuPanel.setSize(780,550);
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
		
		
		bread.addMouseListener(new breadMouseListener());
		cheese.addMouseListener(new cheeseMouseListener());
		topping.addMouseListener(new toppingMouseListener());
		sauce.addMouseListener(new sauceMouseListener());
		
		sortPanel2.setBackground(Color.WHITE);
		sortPanel2.setLocation(60,330);
		sortPanel2.setSize(200,550);
		sortPanel2.setLayout(null);
		
		sortPanel2.add(bread);
		sortPanel2.add(cheese);
		sortPanel2.add(topping);
		sortPanel2.add(sauce);
		
		
		orderPanel.add(cartFramePanel);
		orderPanel.add(makeSandwichPanel);
		orderPanel.add(topPanel);
		orderPanel.add(sortPanel);
		orderPanel.add(menuPanel);
		orderPanel.add(loginButton);
		orderPanel.add(sortLabel);
		orderPanel.add(menuLabel);
		orderPanel.add(sortPanel2);
		
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
		
		//------------------  �ʱ�ȭ�� ������ġ�� �ʱ�ȭ---------------------------------------------------------
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
			
			//
			button.addMouseListener(new sandwichMouseListener());
			//
			
			sandwichPanel.add(button);
		}
		JScrollPane scroll = new JScrollPane(sandwichPanel);
		scroll.getVerticalScrollBar().setUnitIncrement(10);
		menuPanel.add(scroll,BorderLayout.CENTER);
		
		
		//--------------------------------------------------------------------------------------------------------
		
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
				Menuinfo menuSandwich = new Menuinfo(menu.sandwich.get(i).name, menu.sandwich.get(i).price);
				//
				button.addMouseListener(new MouseAdapter() {
					@Override															
					public void mouseClicked(MouseEvent e) {
						sortPanel.setVisible(false);
						cartFramePanel.setVisible(false);
						sortPanel2.setVisible(true);
						makeSandwichPanel.setVisible(true);
						menuPanel.removeAll();
						breadPanel.removeAll();
						sandwich.selectSandwich(menuSandwich);	
						int i = 0;
						breadPanel.setBackground(Color.white);
						breadPanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
						for(i=0;i<bread.bread.size();i++) {
							JButton button = new JButton(bread.bread.get(i).pic);
							button.setBackground(Color.BLACK);
							button.setFocusable(false);
							button.setPreferredSize(new Dimension(220,220));
							breadPanel.add(button);
							button.addMouseListener(new breadMouseListener());
						}
						JScrollPane scroll = new JScrollPane(breadPanel);
						scroll.getVerticalScrollBar().setUnitIncrement(10);
						menuPanel.add(scroll,BorderLayout.CENTER);
						setVisible(true);
					}
				});
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
				Menuinfo menuSide = new Menuinfo(menu.side.get(i).name, menu.side.get(i).price);
				button.addMouseListener(new MouseAdapter() {
					@Override															
					public void mouseClicked(MouseEvent e) {
						sortPanel.setVisible(true);
						cartFramePanel.setVisible(true);
						sortPanel2.setVisible(false);
						makeSandwichPanel.setVisible(false);
						menuPanel.removeAll();
						sidePanel.removeAll();
						side.selectSide(menuSide);
						int i = 0;
						sidePanel.setBackground(Color.white);
						sidePanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
						for(i=0;i<menu.side.size();i++) {
							JButton button = new JButton(menu.side.get(i).pic);
							button.setBackground(Color.BLACK);
							button.setFocusable(false);
							button.setPreferredSize(new Dimension(220,220));
							sidePanel.add(button);
							button.addMouseListener(new sideMouseListener());
						}
						JScrollPane scroll = new JScrollPane(sidePanel);
						scroll.getVerticalScrollBar().setUnitIncrement(10);
						menuPanel.add(scroll,BorderLayout.CENTER);
						setVisible(true);
					}
				});	
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
				Menuinfo menuDrink = new Menuinfo(menu.drink.get(i).name, menu.drink.get(i).price);
				button.addMouseListener(new MouseAdapter() {
					@Override															
					public void mouseClicked(MouseEvent e) {
						sortPanel.setVisible(true);
						cartFramePanel.setVisible(true);
						sortPanel2.setVisible(false);
						makeSandwichPanel.setVisible(false);
						menuPanel.removeAll();
						drinkPanel.removeAll();
						drink.selectDrink(menuDrink);	
						int i = 0;
						drinkPanel.setBackground(Color.white);
						drinkPanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
						for(i=0;i<menu.drink.size();i++) {
							JButton button = new JButton(menu.drink.get(i).pic);
							button.setBackground(Color.BLACK);
							button.setFocusable(false);
							button.setPreferredSize(new Dimension(220,220));
							drinkPanel.add(button);
							button.addMouseListener(new drinkMouseListener());
						}
						JScrollPane scroll = new JScrollPane(drinkPanel);
						scroll.getVerticalScrollBar().setUnitIncrement(10);
						menuPanel.add(scroll,BorderLayout.CENTER);
						setVisible(true);
					}
				});	
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
	


	class breadMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			sortPanel.setVisible(false);
			sortPanel2.setVisible(true);
			menuPanel.removeAll();
			breadPanel.removeAll();
			int i = 0;
			breadPanel.setBackground(Color.white);
			breadPanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
			for(i=0;i<bread.bread.size();i++) {
				JButton button = new JButton(bread.bread.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220,220));
				breadPanel.add(button);
				Breadinfo breadinfo = new Breadinfo(bread.bread.get(i).name);
				button.addMouseListener(new MouseAdapter() {
					@Override															
					public void mouseClicked(MouseEvent e) {
						sortPanel.setVisible(false);
						cartFramePanel.setVisible(false);
						sortPanel2.setVisible(true);
						makeSandwichPanel.setVisible(true);
						menuPanel.removeAll();
						breadPanel.removeAll();
						sandwich.getBread(breadinfo);	
						int i = 0;
						breadPanel.setBackground(Color.white);
						breadPanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
						for(i=0;i<bread.bread.size();i++) {
							JButton button = new JButton(bread.bread.get(i).pic);
							button.setBackground(Color.BLACK);
							button.setFocusable(false);
							button.setPreferredSize(new Dimension(220,220));
							breadPanel.add(button);
							button.addMouseListener(new breadMouseListener());
						}
						JScrollPane scroll = new JScrollPane(breadPanel);
						scroll.getVerticalScrollBar().setUnitIncrement(10);
						menuPanel.add(scroll,BorderLayout.CENTER);
						setVisible(true);
					}
				});
			}
			JScrollPane scroll = new JScrollPane(breadPanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll,BorderLayout.CENTER);
			setVisible(true);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class cheeseMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			sortPanel.setVisible(false);
			sortPanel2.setVisible(true);
			menuPanel.removeAll();
			cheesePanel.removeAll();
			int i = 0;
			cheesePanel.setBackground(Color.white);
			cheesePanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
			for(i=0;i<cheese.cheese.size();i++) {
				JButton button = new JButton(cheese.cheese.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220,220));
				cheesePanel.add(button);
				Cheeseinfo cheeseinfo = new Cheeseinfo(cheese.cheese.get(i).name);
				button.addMouseListener(new MouseAdapter() {
					@Override															
					public void mouseClicked(MouseEvent e) {
						sortPanel.setVisible(false);
						cartFramePanel.setVisible(false);
						sortPanel2.setVisible(true);
						makeSandwichPanel.setVisible(true);
						menuPanel.removeAll();
						cheesePanel.removeAll();
						sandwich.getCheese(cheeseinfo);	
						int i = 0;
						cheesePanel.setBackground(Color.white);
						cheesePanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
						for(i=0;i<cheese.cheese.size();i++) {
							JButton button = new JButton(cheese.cheese.get(i).pic);
							button.setBackground(Color.BLACK);
							button.setFocusable(false);
							button.setPreferredSize(new Dimension(220,220));
							cheesePanel.add(button);
							button.addMouseListener(new cheeseMouseListener());
						}
						JScrollPane scroll = new JScrollPane(cheesePanel);
						scroll.getVerticalScrollBar().setUnitIncrement(10);
						menuPanel.add(scroll,BorderLayout.CENTER);
						setVisible(true);
					}
				});
			}
			JScrollPane scroll = new JScrollPane(cheesePanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll,BorderLayout.CENTER);
			setVisible(true);
		
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	class toppingMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			sortPanel.setVisible(false);
			sortPanel2.setVisible(true);
			menuPanel.removeAll();
			toppingPanel.removeAll();
			int i = 0;
			toppingPanel.setBackground(Color.white);
			toppingPanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
			for(i=0;i<topping.topping.size();i++) {
				JButton button = new JButton(topping.topping.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220,220));
				toppingPanel.add(button);
				Toppinginfo toppinginfo = new Toppinginfo(topping.topping.get(i).name);
				button.addMouseListener(new MouseAdapter() {
					@Override															
					public void mouseClicked(MouseEvent e) {
						sortPanel.setVisible(false);
						cartFramePanel.setVisible(false);
						sortPanel2.setVisible(true);
						makeSandwichPanel.setVisible(true);
						menuPanel.removeAll();
						toppingPanel.removeAll();
						
						sandwich.toppings.add(toppinginfo);
						
						
						int i;
						toppingPanel.setBackground(Color.white);
						toppingPanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
						for(i=0;i<topping.topping.size();i++) {
							JButton button = new JButton(topping.topping.get(i).pic);
							button.setBackground(Color.BLACK);
							button.setFocusable(false);
							button.setPreferredSize(new Dimension(220,220));
							toppingPanel.add(button);
							button.addMouseListener(new toppingMouseListener());
						}
						JScrollPane scroll = new JScrollPane(toppingPanel);
						scroll.getVerticalScrollBar().setUnitIncrement(10);
						menuPanel.add(scroll,BorderLayout.CENTER);
						setVisible(true);
					}
				});
				
			}
			JScrollPane scroll = new JScrollPane(toppingPanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll,BorderLayout.CENTER);
			setVisible(true);
		
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class sauceMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			sortPanel.setVisible(false);
			sortPanel2.setVisible(true);
			menuPanel.removeAll();
			saucePanel.removeAll();
			int i = 0;
			saucePanel.setBackground(Color.white);
			saucePanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
			for(i=0;i<sauce.sauce.size();i++) {
				JButton button = new JButton(sauce.sauce.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220,220));
				saucePanel.add(button);
				Sauceinfo sauceinfo = new Sauceinfo(sauce.sauce.get(i).name);
				button.addMouseListener(new MouseAdapter() {
					@Override															
					public void mouseClicked(MouseEvent e) {
						sortPanel.setVisible(false);
						cartFramePanel.setVisible(false);
						sortPanel2.setVisible(true);
						makeSandwichPanel.setVisible(true);
						menuPanel.removeAll();
						saucePanel.removeAll();
						if(sandwich.sauces.size()>3) {
							System.out.println("�ҽ��� 3�������� ���� �����մϴ�");
						}
						sandwich.getSauce(sauceinfo);	
						int i;
						saucePanel.setBackground(Color.white);
						saucePanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
						for(i=0;i<sauce.sauce.size();i++) {
							JButton button = new JButton(sauce.sauce.get(i).pic);
							button.setBackground(Color.BLACK);
							button.setFocusable(false);
							button.setPreferredSize(new Dimension(220,220));
							saucePanel.add(button);
							button.addMouseListener(new sauceMouseListener());
						}
						JScrollPane scroll = new JScrollPane(saucePanel);
						scroll.getVerticalScrollBar().setUnitIncrement(10);
						menuPanel.add(scroll,BorderLayout.CENTER);
						setVisible(true);
					}
				});
			}
			JScrollPane scroll = new JScrollPane(saucePanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll,BorderLayout.CENTER);
			setVisible(true);
		
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class makeSandwichCancelListener implements MouseListener{							// ������ġ ������ �� ��� ��ư

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			sortPanel2.setVisible(false);
			makeSandwichPanel.setVisible(false);
			sortPanel.setVisible(true);
			cartFramePanel.setVisible(true);
			menuPanel.removeAll();
			sandwichPanel.removeAll();
			initSandwich();
			int i = 0;
			sandwichPanel.setBackground(Color.white);
			sandwichPanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
			for(i=0;i<menu.sandwich.size();i++) {
				JButton button = new JButton(menu.sandwich.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220,220));
				Menuinfo menuSandwich = new Menuinfo(menu.sandwich.get(i).name, menu.sandwich.get(i).price);
				button.addMouseListener(new MouseAdapter() {
					@Override															
					public void mouseClicked(MouseEvent e) {
						sortPanel.setVisible(false);
						cartFramePanel.setVisible(false);
						sortPanel2.setVisible(true);
						makeSandwichPanel.setVisible(true);
						menuPanel.removeAll();
						breadPanel.removeAll();
						sandwich.selectSandwich(menuSandwich);	//
						System.out.println(sandwich.type);
						int i = 0;
						breadPanel.setBackground(Color.white);
						breadPanel.setLayout(new WrapLayout(WrapLayout.LEFT,25,25));
						for(i=0;i<bread.bread.size();i++) {
							JButton button = new JButton(bread.bread.get(i).pic);
							button.setBackground(Color.BLACK);
							button.setFocusable(false);
							button.setPreferredSize(new Dimension(220,220));
							breadPanel.add(button);
							button.addMouseListener(new breadMouseListener());
						}
						JScrollPane scroll = new JScrollPane(breadPanel);
						scroll.getVerticalScrollBar().setUnitIncrement(10);
						menuPanel.add(scroll,BorderLayout.CENTER);
						setVisible(true);
					}
				});
				
				sandwichPanel.add(button);
			}
			JScrollPane scroll = new JScrollPane(sandwichPanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll,BorderLayout.CENTER);
			setVisible(true);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class completeMakingSandwichListener implements MouseListener{							// ������ġ ���� �� �� �Ϸ� ��ư

		@Override
		public void mouseClicked(MouseEvent e) {
			if(sandwich.breadType != null
					&& sandwich.cheeseType != null && sandwich.sauces.get(0).name != null
					&& sandwich.toppings.get(0).name != null) {
				System.out.println(sandwich.type);
				System.out.println(sandwich.breadType);
				System.out.println(sandwich.cheeseType);
				int i;
				for(i=0;i<sandwich.sauces.size();i++) {
					System.out.println(sandwich.sauces.get(i).name);
				}
				for(i=0;i<sandwich.toppings.size();i++) {
					System.out.println(sandwich.toppings.get(i).name);
				}
			}
				
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public void initSandwich() {					// �ʱ�ȭ �Լ� �߰�
		sandwich.sauces.clear();
		sandwich.toppings.clear();
		sandwich.breadType = null;
		sandwich.breadSize = 0;
		sandwich.cheeseType = null;
	}
	
	

		
	public static void main(String[] args) {
		new Frame();
	}
	
	
}