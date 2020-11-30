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
	//---------------------------------------------------------------------------------------------------
	// 빵 치즈 토핑 소스 추가
	Bread bread = new Bread();
	Cheese cheese = new Cheese();
	Topping topping = new Topping();
	Sauce sauce = new Sauce();
	//------------------------------------------------------------------------------------------------------
	
	
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
	
	JPanel IDPWPanel = new JPanel();
	JPanel topPanel = new JPanel();
	JPanel topPanel1 = new JPanel();	
	JPanel sortPanel = new JPanel();			// sortPanel은 리스너에서 참조를 못해서 생성자 함수에서 빼냈음
	JPanel sortPanel2 = new JPanel();
	
	//----------------------------------------------------------------------------------------------------------
	// 빵, 치즈, 토핑, 소스 패널 추가
	
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
		
		txtID.setFont(new Font("맑은 고딕",Font.PLAIN,30));
		txtPW.setFont(new Font("맑은 고딕",Font.PLAIN,30));
		
		IDPWPanel.setSize(400, 180);
		IDPWPanel.setLocation(550,320);
		IDPWPanel.setBackground(Color.WHITE);
		IDPWPanel.setLayout(new GridLayout(2, 1, 0, 5));
		
		JLabel idLabel = new JLabel("ID");
		JLabel pwLabel = new JLabel("PW");
		JLabel sortLabel = new JLabel("분류");
		JLabel menuLabel = new JLabel("메뉴");
		JLabel cartLabel = new JLabel("장바구니");
		JLabel topLabel = new JLabel("SUBWAY");
		JLabel topLabel1 = new JLabel("SUBWAY");
		JButton loginButton = new JButton("로그인");
		JButton orderButton = new JButton("주문");
		JButton cancelButton = new JButton("취소");
		JButton sandwich = new JButton("샌드위치");
		JButton salad = new JButton("샐러드");
		JButton wrap = new JButton("랩");
		JButton side = new JButton("사이드");
		JButton drink = new JButton("음료");
		JButton loginButton1 = new JButton("로그인");
		JButton backButton = new JButton("뒤로가기");
		
		//-------------------------------------------------------------------------------------------------
		// 2번째 소트패널에 붙일 빵, 치즈, 토핑, 소스 버튼
		JButton bread = new JButton("빵");
		JButton cheese = new JButton("치즈");
		JButton topping = new JButton("토핑");
		JButton sauce = new JButton("소스");
		
		
		bread.setFocusable(false);
		bread.setSize(150, 70);
		bread.setLocation(25,20);
		bread.setBackground(new Color(246, 241, 123));
		bread.setFont(new Font("맑은 고딕",Font.BOLD,20));
		cheese.setFocusable(false);
		cheese.setSize(150, 70);
		cheese.setLocation(25,126);
		cheese.setBackground(new Color(246, 241, 123));
		cheese.setFont(new Font("맑은 고딕",Font.BOLD,20));
		topping.setFocusable(false);
		topping.setSize(150, 70);
		topping.setLocation(25,232);
		topping.setBackground(new Color(246, 241, 123));
		topping.setFont(new Font("맑은 고딕",Font.BOLD,20));
		sauce.setFocusable(false);
		sauce.setSize(150, 70);
		sauce.setLocation(25,338);
		sauce.setBackground(new Color(246, 241, 123));
		sauce.setFont(new Font("맑은 고딕",Font.BOLD,20));
		//--------------------------------------------------------------------------------------------------
		
		
		idLabel.setFont(new Font("맑은 고딕",Font.BOLD,60));
		pwLabel.setFont(new Font("맑은 고딕",Font.BOLD,60));
		sortLabel.setFont(new Font("맑은 고딕",Font.BOLD,40));
		menuLabel.setFont(new Font("맑은 고딕",Font.BOLD,40));
		cartLabel.setFont(new Font("맑은 고딕",Font.BOLD,40));
		topLabel.setFont(new Font("맑은 고딕",Font.BOLD,60));
		topLabel1.setFont(new Font("맑은 고딕",Font.BOLD,60));
		
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
		orderButton.setFont(new Font("맑은 고딕",Font.BOLD,30));
		cancelButton.setFocusable(false);
		cancelButton.setSize(140,100);
		cancelButton.setLocation(1280,780);
		cancelButton.setBackground(Color.white);
		cancelButton.setFont(new Font("맑은 고딕",Font.BOLD,30));
		loginButton1.setFocusable(false);
		loginButton1.setSize(180,180);
		loginButton1.setBackground(Color.WHITE);
		loginButton1.setLocation(955,320);
		loginButton1.setFont(new Font("맑은 고딕",Font.BOLD,30));
		backButton.setFocusable(false);
		backButton.setSize(100,40);
		backButton.setBackground(Color.WHITE);
		backButton.setLocation(1320,30);
		
		sandwich.setFocusable(false);
		sandwich.setSize(150, 70);
		sandwich.setLocation(25,20);
		sandwich.setBackground(new Color(246, 241, 123));
		sandwich.setFont(new Font("맑은 고딕",Font.BOLD,20));
		salad.setFocusable(false);
		salad.setSize(150, 70);
		salad.setLocation(25,126);
		salad.setBackground(new Color(246, 241, 123));
		salad.setFont(new Font("맑은 고딕",Font.BOLD,20));
		wrap.setFocusable(false);
		wrap.setSize(150, 70);
		wrap.setLocation(25,232);
		wrap.setBackground(new Color(246, 241, 123));
		wrap.setFont(new Font("맑은 고딕",Font.BOLD,20));
		side.setFocusable(false);
		side.setSize(150, 70);
		side.setLocation(25,338);
		side.setBackground(new Color(246, 241, 123));
		side.setFont(new Font("맑은 고딕",Font.BOLD,20));
		drink.setFocusable(false);
		drink.setSize(150, 70);
		drink.setLocation(25,444);
		drink.setBackground(new Color(246, 241, 123));
		drink.setFont(new Font("맑은 고딕",Font.BOLD,20));
		
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
		
		//------------------------두번째 소트 패널 --------------------------------------------------
		// 빵, 치즈, 토핑, 소스 버튼에 리스너 추가 	
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
		//---------------------------------------------------------------------------
		
		
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
		
		
		///-------------------두번째 소트 패널을 오더패널에 붙임  -----------------------------------------------------------
		orderPanel.add(sortPanel2);
		///---------------------------------------------------------------------------------
		
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
		
		//------------------  초기화면 샌드위치로 초기화---------------------------------------------------------
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
			button.addMouseListener(new sandwichClickedMouseListener());
			//
			
			sandwichPanel.add(button);
		}
		JScrollPane scroll = new JScrollPane(sandwichPanel);
		scroll.getVerticalScrollBar().setUnitIncrement(10);
		menuPanel.add(scroll,BorderLayout.CENTER);
		
		
		//--------------------------------------------------------------------------------------------------------
		
		
		
		
		//----------------------------------------------cart
		cartPanel.setLayout(new BorderLayout());
		JLabel category = new JLabel("        메뉴            가격         수량");
		Allprice = new JLabel("     합계 :");
		category.setFont(new Font("맑은 고딕", Font.PLAIN ,15));
		Allprice.setFont(new Font("맑은 고딕",Font.BOLD,20));
		selectedMenu.setLayout(new GridLayout(0,1));
		selectedMenu.setBackground(Color.white);
		JScrollPane cartscroll = new JScrollPane(selectedMenu, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		cartPanel.add(category, BorderLayout.NORTH);
		cartPanel.add(Allprice, BorderLayout.SOUTH);
		cartPanel.add(cartscroll, BorderLayout.CENTER);
		//----------------------------------------------------------
		
		
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
				
				//
				button.addMouseListener(new sandwichClickedMouseListener());
				//
				
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
			
			
			//----------------------------------------------- 카트담기 sample
			Cart sample1 = new Cart(menu.drink.get(1).name, menu.drink.get(1).price);//get(1) -> Menuinfo list에서 n번째 제품
			// 이름 길어지면 panel 길이 달라지므로 메뉴마다 mouselistener 함수에서 String 조절하기 (5자 추천)
			sample1.uploadCart();
			//---------------------------------------------------------------
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
	
//--------------------------------------------------------------------------------------------------------------------------------------
// 추가로 작성한 마우스 리스너
	class sandwichClickedMouseListener implements MouseListener{			// 샌드위치 패널의 버튼이 클릭됐을 때 리스너
																			// clicked를 덧붙임
		@Override															// 아래는 기존 버튼 함수들과 동일한 리스너, 아마 기존 버튼에 sortPanel2.setVisible(false)를 추가해야 할지도?
		public void mouseClicked(MouseEvent e) {
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
		
	public static void main(String[] args) {
		new Frame();
	}
	
	
}
