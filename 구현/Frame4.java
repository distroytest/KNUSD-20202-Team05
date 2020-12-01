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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Frame extends JFrame {
	Menu menu = new Menu();
	// ---------------------------------------------------------------------------------------------------
	// 빵 치즈 토핑 소스 추가
	Bread bread = new Bread();
	Cheese cheese = new Cheese();
	Topping topping = new Topping();
	Sauce sauce = new Sauce();
	Sandwich sandwich = new Sandwich();
	Drink drink = new Drink();
	Side side = new Side();

	// ------------------------------------------------------------------------------------------------------

	Container contentPane = getContentPane();
	JPanel orderPanel = new JPanel();
	JPanel menuPanel = new JPanel();

	JPanel cartFramePanel = new JPanel(); // 장바구니 라벨 및 버튼 2개 포함하는 패널
	JPanel cartPanel = new JPanel();
	JPanel makeSandwichPanel = new JPanel();
	JPanel sandwichContentPanel = new JPanel();
	JPanel sandwichContentPanel1 = new JPanel(); // 추가

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

	

	// -------------------------------------------------------------------------------------------------------
	// 관리자 패널 추가
	JPanel managerPanel = new JPanel();
	JPanel topPanel2 = new JPanel();
	JPanel sortPanel3 = new JPanel(); // 초기
	JPanel sortPanel4 = new JPanel(); // 메뉴관리 클릭
	JPanel sortPanel5 = new JPanel(); // 매출현황 클릭
	JPanel sortPanel6 = new JPanel(); // 추가,삭제,수정 클릭
	JPanel managePanel = new JPanel();
	JPanel addPanel = new JPanel();
	JPanel refinePanel = new JPanel();
	JPanel deletePanel = new JPanel();
	JPanel salesPanel = new JPanel();
	// -------------------------------------------------------------------------------------------------------

	// -------------------------------------------------------------------------------------------------------

	JTextField txtID = new JTextField(10);
	JPasswordField txtPW = new JPasswordField(10);

	public Frame() {
		setTitle("SUBWAY KIOSK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1500, 1000);
		setResizable(false);

		contentPane.setLayout(null);

		orderPanel.setLayout(null);
		orderPanel.setSize(1500, 1000);
		orderPanel.setBackground(new Color(117, 228, 126));
		loginPanel.setLayout(null);
		loginPanel.setSize(1500, 1000);
		loginPanel.setBackground(new Color(117, 228, 126));

		txtID.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		txtPW.setFont(new Font("맑은 고딕", Font.PLAIN, 30));

		IDPWPanel.setSize(400, 180);
		IDPWPanel.setLocation(550, 320);
		IDPWPanel.setBackground(Color.WHITE);
		IDPWPanel.setLayout(new GridLayout(2, 1, 0, 5));

		JLabel idLabel = new JLabel("ID");
		JLabel pwLabel = new JLabel("PW");
		JLabel sortLabel = new JLabel("분류");
		JLabel menuLabel = new JLabel("메뉴");
		JLabel topLabel = new JLabel("SUBWAY");
		JLabel topLabel1 = new JLabel("SUBWAY");
		JButton loginButton = new JButton("로그인");
		JButton sandwich = new JButton("샌드위치");
		JButton salad = new JButton("샐러드");
		JButton wrap = new JButton("랩");
		JButton side = new JButton("사이드");
		JButton drink = new JButton("음료");
		JButton loginButton1 = new JButton("로그인");
		JButton backButton = new JButton("뒤로가기");

		// -------------------------------------------------------------------------------------------------
		// 2번째 소트패널에 붙일 빵, 치즈, 토핑, 소스 버튼
		JButton bread = new JButton("빵");
		JButton cheese = new JButton("치즈");
		JButton topping = new JButton("토핑");
		JButton sauce = new JButton("소스");

		bread.setFocusable(false);
		bread.setSize(150, 70);
		bread.setLocation(25, 20);
		bread.setBackground(new Color(246, 241, 123));
		bread.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		cheese.setFocusable(false);
		cheese.setSize(150, 70);
		cheese.setLocation(25, 126);
		cheese.setBackground(new Color(246, 241, 123));
		cheese.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		topping.setFocusable(false);
		topping.setSize(150, 70);
		topping.setLocation(25, 232);
		topping.setBackground(new Color(246, 241, 123));
		topping.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		sauce.setFocusable(false);
		sauce.setSize(150, 70);
		sauce.setLocation(25, 338);
		sauce.setBackground(new Color(246, 241, 123));
		sauce.setFont(new Font("맑은 고딕", Font.BOLD, 20));

		// --------------------------------------------------------------------------------------------------

		idLabel.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		pwLabel.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		sortLabel.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		menuLabel.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		topLabel.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		topLabel1.setFont(new Font("맑은 고딕", Font.BOLD, 60));

		idLabel.setSize(100, 100);
		idLabel.setLocation(400, 300);
		pwLabel.setSize(100, 100);
		pwLabel.setLocation(400, 400);
		sortLabel.setSize(200, 100);
		menuLabel.setSize(780, 100);
		sortLabel.setLocation(60, 210);
		menuLabel.setLocation(300, 210);
		sortLabel.setHorizontalAlignment(JLabel.CENTER);
		menuLabel.setHorizontalAlignment(JLabel.CENTER);

		loginButton.setFocusable(false);
		loginButton.setSize(100, 40);
		loginButton.setLocation(1320, 30);
		loginButton.setBackground(Color.WHITE);
		loginButton1.setFocusable(false);
		loginButton1.setSize(180, 180);
		loginButton1.setBackground(Color.WHITE);
		loginButton1.setLocation(955, 320);
		loginButton1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		backButton.setFocusable(false);
		backButton.setSize(100, 40);
		backButton.setBackground(Color.WHITE);
		backButton.setLocation(1320, 30);

		sandwich.setFocusable(false);
		sandwich.setSize(150, 70);
		sandwich.setLocation(25, 20);
		sandwich.setBackground(new Color(246, 241, 123));
		sandwich.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		salad.setFocusable(false);
		salad.setSize(150, 70);
		salad.setLocation(25, 126);
		salad.setBackground(new Color(246, 241, 123));
		salad.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		wrap.setFocusable(false);
		wrap.setSize(150, 70);
		wrap.setLocation(25, 232);
		wrap.setBackground(new Color(246, 241, 123));
		wrap.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		side.setFocusable(false);
		side.setSize(150, 70);
		side.setLocation(25, 338);
		side.setBackground(new Color(246, 241, 123));
		side.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		drink.setFocusable(false);
		drink.setSize(150, 70);
		drink.setLocation(25, 444);
		drink.setBackground(new Color(246, 241, 123));
		drink.setFont(new Font("맑은 고딕", Font.BOLD, 20));

		topPanel.setBackground(Color.WHITE);
		topPanel1.setBackground(Color.WHITE);
		sortPanel.setBackground(Color.WHITE);
		menuPanel.setBackground(Color.WHITE);

// -------------------------------------- 장바구니 UI	-------------------------------------------------//	

		JLabel cartLabel = new JLabel("장바구니");
		cartLabel.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		cartLabel.setSize(300, 100);
		cartLabel.setLocation(0, 0);
		cartLabel.setHorizontalAlignment(JLabel.CENTER);

		JButton cancelButton = new JButton("취소");
		cancelButton.setFocusable(false);
		cancelButton.setSize(140, 100);
		cancelButton.setLocation(0, 570);
		cancelButton.setBackground(Color.white);
		cancelButton.setFont(new Font("맑은 고딕", Font.BOLD, 30));

		JButton orderButton = new JButton("주문");
		orderButton.setFocusable(false);
		orderButton.setSize(140, 100);
		orderButton.setLocation(160, 570);
		orderButton.setBackground(Color.white);
		orderButton.setFont(new Font("맑은 고딕", Font.BOLD, 30));

		cartPanel.setLocation(0, 120);
		cartPanel.setSize(300, 430);
		cartPanel.setBackground(Color.WHITE);

		cartFramePanel.setLayout(null);
		cartFramePanel.setBackground(new Color(117, 228, 126));
		cartFramePanel.setSize(300, 700);
		cartFramePanel.setLocation(1120, 210);
		cartFramePanel.add(cartLabel);
		cartFramePanel.add(cartPanel);
		cartFramePanel.add(cancelButton);
		cartFramePanel.add(orderButton);

//-----------------------------------------------------------------------------------------------------//
//------------------------------------  샌드위치 구성 UI---------------------------------------------------//

		JLabel sandwichCotentLabel = new JLabel("구성");
		sandwichCotentLabel.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		sandwichCotentLabel.setSize(300, 100);
		sandwichCotentLabel.setLocation(0, 0);
		sandwichCotentLabel.setHorizontalAlignment(JLabel.CENTER);

		JButton cancelMakingSandwichButton = new JButton("취소");
		cancelMakingSandwichButton.setFocusable(false);
		cancelMakingSandwichButton.setSize(140, 100);
		cancelMakingSandwichButton.setLocation(0, 570);
		cancelMakingSandwichButton.setBackground(Color.white);
		cancelMakingSandwichButton.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		cancelMakingSandwichButton.addMouseListener(new makeSandwichCancelListener());

		JButton requestSandwichButton = new JButton("완료");
		requestSandwichButton.setFocusable(false);
		requestSandwichButton.setSize(140, 100);
		requestSandwichButton.setLocation(160, 570);
		requestSandwichButton.setBackground(Color.white);
		requestSandwichButton.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		requestSandwichButton.addMouseListener(new completeMakingSandwichListener()); // ------------ 추가됨 ---------

		JLabel breadSizeLabel = new JLabel("빵 길이");
		breadSizeLabel.setBackground(new Color(246, 241, 123));
		breadSizeLabel.setOpaque(true);
		breadSizeLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		breadSizeLabel.setSize(100, 86);
		breadSizeLabel.setLocation(0, 0);
		breadSizeLabel.setHorizontalAlignment(JLabel.CENTER);

		JLabel breadTypeLabel = new JLabel("빵");
		breadTypeLabel.setBackground(new Color(246, 241, 123));
		breadTypeLabel.setOpaque(true);
		breadTypeLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		breadTypeLabel.setSize(100, 86);
		breadTypeLabel.setLocation(0, 86);
		breadTypeLabel.setHorizontalAlignment(JLabel.CENTER);

		JLabel cheeseTypeLabel = new JLabel("치즈");
		cheeseTypeLabel.setBackground(new Color(246, 241, 123));
		cheeseTypeLabel.setOpaque(true);
		cheeseTypeLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		cheeseTypeLabel.setSize(100, 86);
		cheeseTypeLabel.setLocation(0, 172);
		cheeseTypeLabel.setHorizontalAlignment(JLabel.CENTER);

		JLabel toppingTypeLabel = new JLabel("토핑");
		toppingTypeLabel.setBackground(new Color(246, 241, 123));
		toppingTypeLabel.setOpaque(true);
		toppingTypeLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		toppingTypeLabel.setSize(100, 86);
		toppingTypeLabel.setLocation(0, 258);
		toppingTypeLabel.setHorizontalAlignment(JLabel.CENTER);

		JLabel sauceTypeLabel = new JLabel("소스");
		sauceTypeLabel.setBackground(new Color(246, 241, 123));
		sauceTypeLabel.setOpaque(true);
		sauceTypeLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		sauceTypeLabel.setSize(100, 86);
		sauceTypeLabel.setLocation(0, 344);
		sauceTypeLabel.setHorizontalAlignment(JLabel.CENTER);

		sandwichContentPanel1.setLayout(null);
		sandwichContentPanel1.setLocation(100, 0);
		sandwichContentPanel1.setSize(200, 430);
		sandwichContentPanel1.setBackground(Color.WHITE);

		sandwichContentPanel.setLayout(null);
		sandwichContentPanel.add(breadSizeLabel);
		sandwichContentPanel.add(breadTypeLabel);
		sandwichContentPanel.add(cheeseTypeLabel);
		sandwichContentPanel.add(toppingTypeLabel);
		sandwichContentPanel.add(sauceTypeLabel);
		sandwichContentPanel.add(sandwichContentPanel1);
		
		sandwichContentPanel.setLocation(0, 120);
		sandwichContentPanel.setSize(300, 430);
		sandwichContentPanel.setBackground(Color.WHITE);
		
		
		makeSandwichPanel.setLayout(null);
		makeSandwichPanel.setBackground(new Color(117, 228, 126));
		makeSandwichPanel.setSize(300, 700);
		makeSandwichPanel.setLocation(1120, 210);
		makeSandwichPanel.add(sandwichCotentLabel);
		makeSandwichPanel.add(sandwichContentPanel);
		makeSandwichPanel.add(cancelMakingSandwichButton);
		makeSandwichPanel.add(requestSandwichButton);
		makeSandwichPanel.setVisible(false);

//-------------------------------------------------------------------------------------------여기까지------------	

		topPanel.setLocation(60, 100);
		topPanel1.setLocation(60, 100);
		sortPanel.setLocation(60, 330);
		menuPanel.setLocation(300, 330);
		topPanel.setSize(1360, 100);
		topPanel1.setSize(1360, 100);
		sortPanel.setSize(200, 550);
		menuPanel.setSize(780, 550);
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
		sortPanel2.setLocation(60, 330);
		sortPanel2.setSize(200, 550);
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

		// -------------------------관리자
		// 화면----------------------------------------------------------------
		JLabel topLabel2 = new JLabel("SUBWAY");
		JLabel sortLabel1 = new JLabel("분류");
		JLabel manageLabel = new JLabel("관리");

		JButton logoutButton = new JButton("로그아웃");
		JButton manageButton = new JButton("메뉴관리");
		JButton salesButton = new JButton("매출현황");
		JButton addButton = new JButton();
		JButton refineButton = new JButton();
		JButton deleteButton = new JButton();

		sortLabel1.setSize(200, 100);
		sortLabel1.setLocation(60, 210);
		sortLabel1.setHorizontalAlignment(JLabel.CENTER);
		sortLabel1.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		manageLabel.setSize(1120, 100);
		manageLabel.setLocation(300, 210);
		manageLabel.setHorizontalAlignment(JLabel.CENTER);
		manageLabel.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		topLabel2.setFont(new Font("맑은 고딕", Font.BOLD, 60));

		logoutButton.setFocusable(false);
		logoutButton.setSize(100, 40);
		logoutButton.setLocation(1320, 30);
		logoutButton.setBackground(Color.WHITE);
		logoutButton.addMouseListener(new logoutMouseListener());
		manageButton.setFocusable(false);
		manageButton.setSize(150, 70);
		manageButton.setLocation(25, 85);
		manageButton.setBackground(new Color(246, 241, 123));
		manageButton.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		salesButton.setFocusable(false);
		salesButton.setSize(150, 70);
		salesButton.setLocation(25, 320);
		salesButton.setBackground(new Color(246, 241, 123));
		salesButton.setFont(new Font("맑은 고딕", Font.BOLD, 20));

		topPanel2.setSize(1360, 100);
		topPanel2.setLocation(60, 100);
		topPanel2.setBackground(Color.WHITE);
		topPanel2.add(topLabel2);
		sortPanel3.setSize(200, 550);
		sortPanel3.setLocation(60, 330);
		sortPanel3.setBackground(Color.WHITE);
		sortPanel3.add(manageButton);
		sortPanel3.add(salesButton);
		sortPanel3.setLayout(null);
		managePanel.setSize(1120, 550);
		managePanel.setLocation(300, 330);
		managePanel.setBackground(Color.WHITE);

		managerPanel.setLayout(null);
		managerPanel.setSize(1500, 1000);
		managerPanel.setBackground(new Color(117, 228, 126));

		managerPanel.add(logoutButton);
		managerPanel.add(topPanel2);
		managerPanel.add(sortLabel1);
		managerPanel.add(manageLabel);
		managerPanel.add(sortPanel3);
		managerPanel.add(managePanel);

		contentPane.add(managerPanel);
		managerPanel.setVisible(false);
		// --------------------------------------------------------------------------------------------------------

		// ------------------ 초기화면 샌드위치로
		// 초기화---------------------------------------------------------
		menuPanel.removeAll();
		sandwichPanel.removeAll();
		int i = 0;
		sandwichPanel.setBackground(Color.white);
		sandwichPanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
		for (i = 0; i < menu.sandwich.size(); i++) {
			JButton button = new JButton(menu.sandwich.get(i).pic);
			button.setBackground(Color.BLACK);
			button.setFocusable(false);
			button.setPreferredSize(new Dimension(220, 220));

			//
			button.addMouseListener(new sandwichMouseListener());
			//

			sandwichPanel.add(button);
		}
		JScrollPane scroll = new JScrollPane(sandwichPanel);
		scroll.getVerticalScrollBar().setUnitIncrement(10);
		menuPanel.add(scroll, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------

		setVisible(true);
	}

	class sandwichMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			menuPanel.removeAll();
			sandwichPanel.removeAll();
			int i = 0;
			sandwichPanel.setBackground(Color.white);
			sandwichPanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
			for (i = 0; i < menu.sandwich.size(); i++) {
				JButton button = new JButton(menu.sandwich.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220, 220));
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
						breadPanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
						for (i = 0; i < bread.bread.size(); i++) {
							JButton button = new JButton(bread.bread.get(i).pic);
							button.setBackground(Color.BLACK);
							button.setFocusable(false);
							button.setPreferredSize(new Dimension(220, 220));
							breadPanel.add(button);
							button.addMouseListener(new breadMouseListener());
						}
						JScrollPane scroll = new JScrollPane(breadPanel);
						scroll.getVerticalScrollBar().setUnitIncrement(10);
						menuPanel.add(scroll, BorderLayout.CENTER);
						setVisible(true);
					}
				});
				sandwichPanel.add(button);
			}
			JScrollPane scroll = new JScrollPane(sandwichPanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll, BorderLayout.CENTER);
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

	class saladMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			menuPanel.removeAll();
			saladPanel.removeAll();
			int i = 0;
			saladPanel.setBackground(Color.white);
			saladPanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
			for (i = 0; i < menu.salad.size(); i++) {
				JButton button = new JButton(menu.salad.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220, 220));
				saladPanel.add(button);
			}
			JScrollPane scroll = new JScrollPane(saladPanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll, BorderLayout.CENTER);
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

	class wrapMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			menuPanel.removeAll();
			wrapPanel.removeAll();
			int i = 0;
			wrapPanel.setBackground(Color.white);
			wrapPanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
			for (i = 0; i < menu.wrap.size(); i++) {
				JButton button = new JButton(menu.wrap.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220, 220));
				wrapPanel.add(button);
			}
			JScrollPane scroll = new JScrollPane(saladPanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll, BorderLayout.CENTER);
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

	class sideMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			menuPanel.removeAll();
			sidePanel.removeAll();
			int i = 0;
			sidePanel.setBackground(Color.white);
			sidePanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
			for (i = 0; i < menu.side.size(); i++) {
				JButton button = new JButton(menu.side.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220, 220));
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
						sidePanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
						for (i = 0; i < menu.side.size(); i++) {
							JButton button = new JButton(menu.side.get(i).pic);
							button.setBackground(Color.BLACK);
							button.setFocusable(false);
							button.setPreferredSize(new Dimension(220, 220));
							sidePanel.add(button);
							button.addMouseListener(new sideMouseListener());
						}
						JScrollPane scroll = new JScrollPane(sidePanel);
						scroll.getVerticalScrollBar().setUnitIncrement(10);
						menuPanel.add(scroll, BorderLayout.CENTER);
						setVisible(true);
					}
				});
				sidePanel.add(button);
			}
			JScrollPane scroll = new JScrollPane(sidePanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll, BorderLayout.CENTER);
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

	class drinkMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			menuPanel.removeAll();
			drinkPanel.removeAll();
			int i = 0;
			drinkPanel.setBackground(Color.white);
			drinkPanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
			for (i = 0; i < menu.drink.size(); i++) {
				JButton button = new JButton(menu.drink.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220, 220));
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
						drinkPanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
						for (i = 0; i < menu.drink.size(); i++) {
							JButton button = new JButton(menu.drink.get(i).pic);
							button.setBackground(Color.BLACK);
							button.setFocusable(false);
							button.setPreferredSize(new Dimension(220, 220));
							drinkPanel.add(button);
							button.addMouseListener(new drinkMouseListener());
						}
						JScrollPane scroll = new JScrollPane(drinkPanel);
						scroll.getVerticalScrollBar().setUnitIncrement(10);
						menuPanel.add(scroll, BorderLayout.CENTER);
						setVisible(true);
					}
				});
				drinkPanel.add(button);
			}
			JScrollPane scroll = new JScrollPane(drinkPanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll, BorderLayout.CENTER);
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

	class loginMouseListener implements MouseListener {

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

	class loginMouseListener1 implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (LoginModel.id.equals(txtID.getText()) && LoginModel.pw.equals(txtPW.getText())) {
				loginPanel.setVisible(false);
				managerPanel.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "로그인 실패");
			}
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

	class logoutMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			managerPanel.setVisible(false);
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

	class backMouseListener implements MouseListener {

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

	class breadMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			sortPanel.setVisible(false);
			sortPanel2.setVisible(true);
			menuPanel.removeAll();
			breadPanel.removeAll();
			int i = 0;
			breadPanel.setBackground(Color.white);
			breadPanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
			for (i = 0; i < bread.bread.size(); i++) {
				JButton button = new JButton(bread.bread.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220, 220));
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
						getSandwichCotentForLabel();///////////////////////
						int i = 0;
						breadPanel.setBackground(Color.white);
						breadPanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
						for (i = 0; i < bread.bread.size(); i++) {
							JButton button = new JButton(bread.bread.get(i).pic);
							button.setBackground(Color.BLACK);
							button.setFocusable(false);
							button.setPreferredSize(new Dimension(220, 220));
							breadPanel.add(button);
							button.addMouseListener(new breadMouseListener());
						}
						JScrollPane scroll = new JScrollPane(breadPanel);
						scroll.getVerticalScrollBar().setUnitIncrement(10);
						menuPanel.add(scroll, BorderLayout.CENTER);
						setVisible(true);
					}
				});
			}
			JScrollPane scroll = new JScrollPane(breadPanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll, BorderLayout.CENTER);
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

	class cheeseMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			sortPanel.setVisible(false);
			sortPanel2.setVisible(true);
			menuPanel.removeAll();
			cheesePanel.removeAll();
			int i = 0;
			cheesePanel.setBackground(Color.white);
			cheesePanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
			for (i = 0; i < cheese.cheese.size(); i++) {
				JButton button = new JButton(cheese.cheese.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220, 220));
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
						getSandwichCotentForLabel();///////////////////////
						int i = 0;
						cheesePanel.setBackground(Color.white);
						cheesePanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
						for (i = 0; i < cheese.cheese.size(); i++) {
							JButton button = new JButton(cheese.cheese.get(i).pic);
							button.setBackground(Color.BLACK);
							button.setFocusable(false);
							button.setPreferredSize(new Dimension(220, 220));
							cheesePanel.add(button);
							button.addMouseListener(new cheeseMouseListener());
						}
						JScrollPane scroll = new JScrollPane(cheesePanel);
						scroll.getVerticalScrollBar().setUnitIncrement(10);
						menuPanel.add(scroll, BorderLayout.CENTER);
						setVisible(true);
					}
				});
			}
			JScrollPane scroll = new JScrollPane(cheesePanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll, BorderLayout.CENTER);
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

	class toppingMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			sortPanel.setVisible(false);
			sortPanel2.setVisible(true);
			menuPanel.removeAll();
			toppingPanel.removeAll();
			int i = 0;
			toppingPanel.setBackground(Color.white);
			toppingPanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
			for (i = 0; i < topping.topping.size(); i++) {
				JButton button = new JButton(topping.topping.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220, 220));
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
//-------------------------------------------------------------------------------------- 토핑 제한 사항 구현  ---------------------	
						if (sandwich.toppings.size() == 0) {
							sandwich.getTopping(toppinginfo);
						} else if (sandwich.toppings.size() != 0 && sandwich.toppings.get(0).name != "토핑없음") {
							sandwich.getTopping(toppinginfo);
						} else if (sandwich.toppings.size() != 0 && sandwich.toppings.get(0).name == "토핑없음") {
							sandwich.toppings.clear();
							sandwich.getTopping(toppinginfo);
						}
						if (toppinginfo.name == "토핑없음") {
							sandwich.toppings.clear();
							sandwich.getTopping(toppinginfo);
						}
						if (sandwich.toppings.size() > 1) {
							for (int i = 0; i < sandwich.toppings.size() - 1; i++) {
								if (toppinginfo.name == sandwich.toppings.get(i).name) {
									sandwich.toppings.remove(toppinginfo);
									sandwich.toppings.remove(sandwich.toppings.get(i));
									System.out.println("토핑 제거");
								}
							}
						}
						for (int i = 0; i < sandwich.toppings.size(); i++) {
							System.out.println(sandwich.toppings.get(i).name);
						}
						System.out.println("--------------");
						getSandwichCotentForLabel();///////////////////////
// ----------------------------------------------------------------------------------------------------------------------------						
						int i;
						toppingPanel.setBackground(Color.white);
						toppingPanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
						for (i = 0; i < topping.topping.size(); i++) {
							JButton button = new JButton(topping.topping.get(i).pic);
							button.setBackground(Color.BLACK);
							button.setFocusable(false);
							button.setPreferredSize(new Dimension(220, 220));
							toppingPanel.add(button);
							button.addMouseListener(new toppingMouseListener());
						}
						JScrollPane scroll = new JScrollPane(toppingPanel);
						scroll.getVerticalScrollBar().setUnitIncrement(10);
						menuPanel.add(scroll, BorderLayout.CENTER);
						setVisible(true);
					}
				});

			}
			JScrollPane scroll = new JScrollPane(toppingPanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll, BorderLayout.CENTER);
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

	class sauceMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			sortPanel.setVisible(false);
			sortPanel2.setVisible(true);
			menuPanel.removeAll();
			saucePanel.removeAll();
			int i = 0;
			saucePanel.setBackground(Color.white);
			saucePanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
			for (i = 0; i < sauce.sauce.size(); i++) {
				JButton button = new JButton(sauce.sauce.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220, 220));
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
//-------------------------------------------------------------------------------------- 소스 제한 사항 구현 -------------------------	
						if (sandwich.sauces.size() == 0) {
							sandwich.getSauce(sauceinfo);
						} else if (sandwich.sauces.size() != 0 && sandwich.sauces.get(0).name != "소스없음") {
							sandwich.getSauce(sauceinfo);
						} else if (sandwich.sauces.size() != 0 && sandwich.sauces.get(0).name == "소스없음") {
							sandwich.sauces.clear();
							sandwich.getSauce(sauceinfo);
						}
						if (sauceinfo.name == "소스없음") {
							sandwich.sauces.clear();
							sandwich.getSauce(sauceinfo);
						}
						if (sandwich.sauces.size() > 1) {
							for (int i = 0; i < sandwich.sauces.size() - 1; i++) {
								if (sauceinfo.name == sandwich.sauces.get(i).name) {
									sandwich.sauces.remove(sauceinfo);
									sandwich.sauces.remove(sandwich.sauces.get(i));
									System.out.println("소스 제거");
								}
							}
						}
						if (sandwich.sauces.size() > 3) {
							System.out.println("소스는 3개까지만 선택 가능합니다");
							sandwich.sauces.remove(sauceinfo);
						}
						for (int i = 0; i < sandwich.sauces.size(); i++) {
							System.out.println(sandwich.sauces.get(i).name);
						}
						System.out.println("--------------");
						getSandwichCotentForLabel();///////////////////////
//------------------------------------------------------------------------------------------여기까지-------------------------------					

						int i;
						saucePanel.setBackground(Color.white);
						saucePanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
						for (i = 0; i < sauce.sauce.size(); i++) {
							JButton button = new JButton(sauce.sauce.get(i).pic);
							button.setBackground(Color.BLACK);
							button.setFocusable(false);
							button.setPreferredSize(new Dimension(220, 220));
							saucePanel.add(button);
							button.addMouseListener(new sauceMouseListener());
						}
						JScrollPane scroll = new JScrollPane(saucePanel);
						scroll.getVerticalScrollBar().setUnitIncrement(10);
						menuPanel.add(scroll, BorderLayout.CENTER);
						setVisible(true);
					}
				});
			}
			JScrollPane scroll = new JScrollPane(saucePanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll, BorderLayout.CENTER);
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

	class makeSandwichCancelListener implements MouseListener { // 샌드위치 구성할 때 취소 버튼

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
			getSandwichCotentForLabel();
			int i = 0;
			sandwichPanel.setBackground(Color.white);
			sandwichPanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
			for (i = 0; i < menu.sandwich.size(); i++) {
				JButton button = new JButton(menu.sandwich.get(i).pic);
				button.setBackground(Color.BLACK);
				button.setFocusable(false);
				button.setPreferredSize(new Dimension(220, 220));
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
						sandwich.selectSandwich(menuSandwich); // ----------------------------- syso 삭제할것
						int i = 0;
						breadPanel.setBackground(Color.white);
						breadPanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
						for (i = 0; i < bread.bread.size(); i++) {
							JButton button = new JButton(bread.bread.get(i).pic);
							button.setBackground(Color.BLACK);
							button.setFocusable(false);
							button.setPreferredSize(new Dimension(220, 220));
							breadPanel.add(button);
							button.addMouseListener(new breadMouseListener());
						}
						JScrollPane scroll = new JScrollPane(breadPanel);
						scroll.getVerticalScrollBar().setUnitIncrement(10);
						menuPanel.add(scroll, BorderLayout.CENTER);
						setVisible(true);
					}
				});

				sandwichPanel.add(button);
			}
			JScrollPane scroll = new JScrollPane(sandwichPanel);
			scroll.getVerticalScrollBar().setUnitIncrement(10);
			menuPanel.add(scroll, BorderLayout.CENTER);
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

	class completeMakingSandwichListener implements MouseListener { // 샌드위치 구성 할 때 완료 버튼

		@Override
		public void mouseClicked(MouseEvent e) {
			if (sandwich.breadType == null) {
				System.out.println("빵을 골라주세요");
			}
			if (sandwich.cheeseType == null) {
				System.out.println("치즈를 골라주세요");
			}
			if (sandwich.toppings.size() == 0) {
				System.out.println("토핑을 골라주세요");
			}
			if (sandwich.sauces.size() == 0) {
				System.out.println("소스 및 시즈닝을 골라주세요");
			}
			if (sandwich.breadType != null // 토핑 소스 네임이 눌일 때 말고 사이즈가 0일때로 바꿔야함
					&& sandwich.cheeseType != null && sandwich.sauces.size() != 0 && sandwich.toppings.size() != 0) {
				System.out.println(sandwich.type);
				System.out.println(sandwich.breadType);
				System.out.println(sandwich.cheeseType);
				int i;
				for (i = 0; i < sandwich.sauces.size(); i++) {
					System.out.println(sandwich.sauces.get(i).name);
				}
				for (i = 0; i < sandwich.toppings.size(); i++) {
					System.out.println(sandwich.toppings.get(i).name);
				}
				initSandwich();								// 초기화
				getSandwichCotentForLabel();
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

	public void initSandwich() { // 초기화 함수 추가
		sandwich.sauces.clear();
		sandwich.toppings.clear();
		sandwich.breadType = null;
		sandwich.breadSize = 0;
		sandwich.cheeseType = null;
	}

	public void getSandwichCotentForLabel() {					// 샌드위치 내용 UI에 나타내는 함수
		
		
		sandwichContentPanel.remove(sandwichContentPanel1);
		
		JPanel sandwichContentPanel2 = new JPanel();
		sandwichContentPanel2.setLayout(null);
		sandwichContentPanel2.setLocation(100, 0);
		sandwichContentPanel2.setSize(200, 430);
		sandwichContentPanel2.setBackground(Color.WHITE);
		
		sandwichContentPanel.setVisible(false);
		
		String toppingcontent = "";
		for (int i = 0; i < sandwich.toppings.size(); i++) {
			toppingcontent += sandwich.toppings.get(i).name + " ";
		}
		String saucecontent = "";
		for (int i = 0; i < sandwich.sauces.size(); i++) {
			saucecontent += sandwich.sauces.get(i).name + " ";
		}
		
		JLabel breadSizeContentLabel = new JLabel(""); // 샌드위치 구성품 표시할 라벨
		JLabel breadTypeContentLabel = new JLabel(sandwich.breadType);
		JLabel cheeseTypeContentLabel = new JLabel(sandwich.cheeseType);
		JLabel toppingTypeContentLabel = new JLabel(toppingcontent);
		JLabel sauceTypeContentLabel = new JLabel(saucecontent);
		
		breadSizeContentLabel.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		breadSizeContentLabel.setSize(200, 86);
		breadSizeContentLabel.setLocation(0, 0);
		breadSizeContentLabel.setHorizontalAlignment(JLabel.CENTER);

		breadTypeContentLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		breadTypeContentLabel.setSize(200, 86);
		breadTypeContentLabel.setLocation(0, 86);
		breadTypeContentLabel.setHorizontalAlignment(JLabel.CENTER);

		cheeseTypeContentLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		cheeseTypeContentLabel.setSize(200, 86);
		cheeseTypeContentLabel.setLocation(0, 172);
		cheeseTypeContentLabel.setHorizontalAlignment(JLabel.CENTER);

		toppingTypeContentLabel.setFont(new Font("맑은 고딕", Font.BOLD, 8));
		toppingTypeContentLabel.setSize(200, 86);
		toppingTypeContentLabel.setLocation(0, 258);
		toppingTypeContentLabel.setHorizontalAlignment(JLabel.CENTER);

		sauceTypeContentLabel.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		sauceTypeContentLabel.setSize(200, 86);
		sauceTypeContentLabel.setLocation(0, 344);
		sauceTypeContentLabel.setHorizontalAlignment(JLabel.CENTER);

		sandwichContentPanel2.add(breadSizeContentLabel);
		sandwichContentPanel2.add(breadTypeContentLabel);
		sandwichContentPanel2.add(cheeseTypeContentLabel);
		sandwichContentPanel2.add(toppingTypeContentLabel);
		sandwichContentPanel2.add(sauceTypeContentLabel);
		
		sandwichContentPanel1 = sandwichContentPanel2;
		sandwichContentPanel.add(sandwichContentPanel1);
		sandwichContentPanel.setVisible(true);
	}

	public static void main(String[] args) {
		new Frame();
	}
}
