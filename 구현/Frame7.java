import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Frame extends JFrame {
	Menu menu = new Menu();
	// ---------------------------------------------------------------------------------------------------
	// �� ġ�� ���� �ҽ� �߰�
	Bread bread = new Bread();
	Cheese cheese = new Cheese();
	Topping topping = new Topping();
	Sauce sauce = new Sauce();
	Sandwich sandwich = new Sandwich();
	Drink drink = new Drink();
	Side side = new Side();
	Order order = new Order();
	OrderList orderlist = new OrderList();
	static int orderNum = 1;

	// ------------------------------------------------------------------------------------------------------

	Container contentPane = getContentPane();
	JPanel orderPanel = new JPanel();
	JPanel menuPanel = new JPanel();

	JPanel cartFramePanel = new JPanel(); // ��ٱ��� �� �� ��ư 2�� �����ϴ� �г�
	JPanel cartPanel = new JPanel();
	JPanel makeSandwichPanel = new JPanel();
	JPanel sandwichContentPanel = new JPanel();
	JPanel sandwichContentPanel1 = new JPanel(); // �߰�

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
	// ������ �г� �߰�
	JPanel managerPanel = new JPanel();
	JPanel topPanel2 = new JPanel();
	JPanel sortPanel3 = new JPanel(); // �ʱ�
	JPanel sortPanel4 = new JPanel(); // �޴����� Ŭ��
	JPanel sortPanel5 = new JPanel(); // ������Ȳ Ŭ��
	JPanel sortPanel6 = new JPanel(); // �߰�,����,���� Ŭ��
	JPanel managePanel = new JPanel();
	JPanel addPanel = new JPanel();
	JPanel refinePanel = new JPanel();
	JPanel deletePanel = new JPanel();
	JPanel salesPanel = new JPanel();
	JPanel topPanel3 = new JPanel();
	// -------------------------------------------------------------------------------------------------------
	// ���� �г� �߰� ==================================================================
	// 1202
	JPanel paymentPanel = new JPanel();
	JPanel cashPanel = new JPanel();
	JPanel cardPanel = new JPanel();
	JLabel cashLabel = new JLabel("����");
	JLabel cardLabel = new JLabel("ī��");
	JButton cardButton = new JButton(new ImageIcon("img/card.jpg"));
	JButton cashButton = new JButton(new ImageIcon("img/cash.jpg"));
	JButton backToMenuButton = new JButton("���ư���");
	JPanel paymentPanel1 = new JPanel();

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

		txtID.setFont(new Font("���� ���", Font.PLAIN, 30));
		txtPW.setFont(new Font("���� ���", Font.PLAIN, 30));

		IDPWPanel.setSize(400, 180);
		IDPWPanel.setLocation(550, 320);
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

		// -------------------------------------------------------------------------------------------------
		// 2��° ��Ʈ�гο� ���� ��, ġ��, ����, �ҽ� ��ư
		JButton bread = new JButton("��");
		JButton cheese = new JButton("ġ��");
		JButton topping = new JButton("����");
		JButton sauce = new JButton("�ҽ�");

		bread.setFocusable(false);
		bread.setSize(150, 70);
		bread.setLocation(25, 20);
		bread.setBackground(new Color(246, 241, 123));
		bread.setFont(new Font("���� ���", Font.BOLD, 20));
		cheese.setFocusable(false);
		cheese.setSize(150, 70);
		cheese.setLocation(25, 126);
		cheese.setBackground(new Color(246, 241, 123));
		cheese.setFont(new Font("���� ���", Font.BOLD, 20));
		topping.setFocusable(false);
		topping.setSize(150, 70);
		topping.setLocation(25, 232);
		topping.setBackground(new Color(246, 241, 123));
		topping.setFont(new Font("���� ���", Font.BOLD, 20));
		sauce.setFocusable(false);
		sauce.setSize(150, 70);
		sauce.setLocation(25, 338);
		sauce.setBackground(new Color(246, 241, 123));
		sauce.setFont(new Font("���� ���", Font.BOLD, 20));

		// --------------------------------------------------------------------------------------------------

		idLabel.setFont(new Font("���� ���", Font.BOLD, 60));
		pwLabel.setFont(new Font("���� ���", Font.BOLD, 60));
		sortLabel.setFont(new Font("���� ���", Font.BOLD, 40));
		menuLabel.setFont(new Font("���� ���", Font.BOLD, 40));
		topLabel.setFont(new Font("���� ���", Font.BOLD, 60));
		topLabel1.setFont(new Font("���� ���", Font.BOLD, 60));

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
		loginButton1.setFont(new Font("���� ���", Font.BOLD, 30));
		backButton.setFocusable(false);
		backButton.setSize(100, 40);
		backButton.setBackground(Color.WHITE);
		backButton.setLocation(1320, 30);

		sandwich.setFocusable(false);
		sandwich.setSize(150, 70);
		sandwich.setLocation(25, 20);
		sandwich.setBackground(new Color(246, 241, 123));
		sandwich.setFont(new Font("���� ���", Font.BOLD, 20));
		salad.setFocusable(false);
		salad.setSize(150, 70);
		salad.setLocation(25, 126);
		salad.setBackground(new Color(246, 241, 123));
		salad.setFont(new Font("���� ���", Font.BOLD, 20));
		wrap.setFocusable(false);
		wrap.setSize(150, 70);
		wrap.setLocation(25, 232);
		wrap.setBackground(new Color(246, 241, 123));
		wrap.setFont(new Font("���� ���", Font.BOLD, 20));
		side.setFocusable(false);
		side.setSize(150, 70);
		side.setLocation(25, 338);
		side.setBackground(new Color(246, 241, 123));
		side.setFont(new Font("���� ���", Font.BOLD, 20));
		drink.setFocusable(false);
		drink.setSize(150, 70);
		drink.setLocation(25, 444);
		drink.setBackground(new Color(246, 241, 123));
		drink.setFont(new Font("���� ���", Font.BOLD, 20));

		topPanel.setBackground(Color.WHITE);
		topPanel1.setBackground(Color.WHITE);
		sortPanel.setBackground(Color.WHITE);
		menuPanel.setBackground(Color.WHITE);

// -------------------------------------- ��ٱ��� UI	-------------------------------------------------//	

		JLabel cartLabel = new JLabel("��ٱ���");
		cartLabel.setFont(new Font("���� ���", Font.BOLD, 40));
		cartLabel.setSize(300, 100);
		cartLabel.setLocation(0, 0);
		cartLabel.setHorizontalAlignment(JLabel.CENTER);

		JButton cancelButton = new JButton("���");
		cancelButton.setFocusable(false);
		cancelButton.setSize(140, 100);
		cancelButton.setLocation(0, 570);
		cancelButton.setBackground(Color.white);
		cancelButton.setFont(new Font("���� ���", Font.BOLD, 30));
		cancelButton.addMouseListener(new cancelOrderMouseListener());

		JButton orderButton = new JButton("�ֹ�");
		orderButton.setFocusable(false);
		orderButton.setSize(140, 100);
		orderButton.setLocation(160, 570);
		orderButton.setBackground(Color.white);
		orderButton.setFont(new Font("���� ���", Font.BOLD, 30));
		orderButton.addMouseListener(new requestOrderMouseListener());

		cartPanel.setLayout(null);
		cartPanel.setLocation(0, 120);
		cartPanel.setSize(300, 430);
		cartPanel.setBackground(Color.WHITE);

		JLabel allPrice = new JLabel(); ///
		allPrice.setText(" �հ� :	           " + order.totalPrice);
		allPrice.setSize(300, 40);
		allPrice.setFont(new Font("���� ���", Font.BOLD, 30));
		allPrice.setLocation(0, 390);
		allPrice.setBackground(new Color(246, 241, 123));
		allPrice.setOpaque(true);
		cartPanel.add(allPrice);

		cartFramePanel.setLayout(null);
		cartFramePanel.setBackground(new Color(117, 228, 126));
		cartFramePanel.setSize(300, 700);
		cartFramePanel.setLocation(1120, 210);
		cartFramePanel.add(cartLabel);
		cartFramePanel.add(cartPanel);
		cartFramePanel.add(cancelButton);
		cartFramePanel.add(orderButton);

//-----------------------------------------------------------------------------------------------------//
//------------------------------------  ������ġ ���� UI---------------------------------------------------//

		JLabel sandwichCotentLabel = new JLabel("����");
		sandwichCotentLabel.setFont(new Font("���� ���", Font.BOLD, 40));
		sandwichCotentLabel.setSize(300, 100);
		sandwichCotentLabel.setLocation(0, 0);
		sandwichCotentLabel.setHorizontalAlignment(JLabel.CENTER);

		JButton cancelMakingSandwichButton = new JButton("���");
		cancelMakingSandwichButton.setFocusable(false);
		cancelMakingSandwichButton.setSize(140, 100);
		cancelMakingSandwichButton.setLocation(0, 570);
		cancelMakingSandwichButton.setBackground(Color.white);
		cancelMakingSandwichButton.setFont(new Font("���� ���", Font.BOLD, 30));
		cancelMakingSandwichButton.addMouseListener(new makeSandwichCancelListener());

		JButton requestSandwichButton = new JButton("�Ϸ�");
		requestSandwichButton.setFocusable(false);
		requestSandwichButton.setSize(140, 100);
		requestSandwichButton.setLocation(160, 570);
		requestSandwichButton.setBackground(Color.white);
		requestSandwichButton.setFont(new Font("���� ���", Font.BOLD, 30));
		requestSandwichButton.addMouseListener(new completeMakingSandwichListener()); // ------------ �߰��� ---------

		JLabel breadSizeLabel = new JLabel("�� ����");
		breadSizeLabel.setBackground(new Color(246, 241, 123));
		breadSizeLabel.setOpaque(true);
		breadSizeLabel.setFont(new Font("���� ���", Font.BOLD, 20));
		breadSizeLabel.setSize(100, 86);
		breadSizeLabel.setLocation(0, 0);
		breadSizeLabel.setHorizontalAlignment(JLabel.CENTER);

		JLabel breadTypeLabel = new JLabel("��");
		breadTypeLabel.setBackground(new Color(246, 241, 123));
		breadTypeLabel.setOpaque(true);
		breadTypeLabel.setFont(new Font("���� ���", Font.BOLD, 20));
		breadTypeLabel.setSize(100, 86);
		breadTypeLabel.setLocation(0, 86);
		breadTypeLabel.setHorizontalAlignment(JLabel.CENTER);

		JLabel cheeseTypeLabel = new JLabel("ġ��");
		cheeseTypeLabel.setBackground(new Color(246, 241, 123));
		cheeseTypeLabel.setOpaque(true);
		cheeseTypeLabel.setFont(new Font("���� ���", Font.BOLD, 20));
		cheeseTypeLabel.setSize(100, 86);
		cheeseTypeLabel.setLocation(0, 172);
		cheeseTypeLabel.setHorizontalAlignment(JLabel.CENTER);

		JLabel toppingTypeLabel = new JLabel("����");
		toppingTypeLabel.setBackground(new Color(246, 241, 123));
		toppingTypeLabel.setOpaque(true);
		toppingTypeLabel.setFont(new Font("���� ���", Font.BOLD, 20));
		toppingTypeLabel.setSize(100, 86);
		toppingTypeLabel.setLocation(0, 258);
		toppingTypeLabel.setHorizontalAlignment(JLabel.CENTER);

		JLabel sauceTypeLabel = new JLabel("�ҽ�");
		sauceTypeLabel.setBackground(new Color(246, 241, 123));
		sauceTypeLabel.setOpaque(true);
		sauceTypeLabel.setFont(new Font("���� ���", Font.BOLD, 20));
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

		getSandwichCotentForLabel();

//-------------------------------------------------------------------------------------------�������------------	

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

		contentPane.add(paymentPanel); // ���� �г�
		contentPane.add(orderPanel);
		contentPane.add(loginPanel);
		loginPanel.setVisible(false);

		// -------------------------������
		// ȭ��----------------------------------------------------------------
		JLabel topLabel2 = new JLabel("SUBWAY");
		JLabel sortLabel1 = new JLabel("�з�");
		JLabel manageLabel = new JLabel("����");

		JButton logoutButton = new JButton("�α׾ƿ�");
		JButton manageButton = new JButton("�޴�����");
		JButton salesButton = new JButton("������Ȳ");
		JButton addButton = new JButton();
		JButton refineButton = new JButton();
		JButton deleteButton = new JButton();

		sortLabel1.setSize(200, 100);
		sortLabel1.setLocation(60, 210);
		sortLabel1.setHorizontalAlignment(JLabel.CENTER);
		sortLabel1.setFont(new Font("���� ���", Font.BOLD, 40));
		manageLabel.setSize(1120, 100);
		manageLabel.setLocation(300, 210);
		manageLabel.setHorizontalAlignment(JLabel.CENTER);
		manageLabel.setFont(new Font("���� ���", Font.BOLD, 40));
		topLabel2.setFont(new Font("���� ���", Font.BOLD, 60));

		logoutButton.setFocusable(false);
		logoutButton.setSize(100, 40);
		logoutButton.setLocation(1320, 30);
		logoutButton.setBackground(Color.WHITE);
		logoutButton.addMouseListener(new logoutMouseListener());
		manageButton.setFocusable(false);
		manageButton.setSize(150, 70);
		manageButton.setLocation(25, 85);
		manageButton.setBackground(new Color(246, 241, 123));
		manageButton.setFont(new Font("���� ���", Font.BOLD, 20));
		salesButton.setFocusable(false);
		salesButton.setSize(150, 70);
		salesButton.setLocation(25, 320);
		salesButton.setBackground(new Color(246, 241, 123));
		salesButton.setFont(new Font("���� ���", Font.BOLD, 20));

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
//==============================   ���� UI  =======================================================================

		paymentPanel.setLayout(null);
		paymentPanel.setSize(1500, 1000);
		paymentPanel.setBackground(new Color(117, 228, 126));

		cashPanel.setLayout(null);
		cashPanel.setSize(500, 500);
		cashPanel.setLocation(125, 250);
		cardPanel.setLayout(null);
		cardPanel.setSize(500, 500);
		cardPanel.setLocation(875, 250);

		cashLabel.setSize(500, 100);
		cashLabel.setBackground(Color.white);
		cashLabel.setFont(new Font("���� ���", Font.BOLD, 20));
		cashLabel.setHorizontalAlignment(JLabel.CENTER);
		cashLabel.setLocation(0, 400);
		cardLabel.setSize(500, 100);
		cardLabel.setBackground(Color.white);
		cardLabel.setFont(new Font("���� ���", Font.BOLD, 20));
		cardLabel.setLocation(0, 400);
		cardLabel.setHorizontalAlignment(JLabel.CENTER);

		backToMenuButton.setSize(250, 100);
		backToMenuButton.setFont(new Font("���� ���", Font.BOLD, 30));
		backToMenuButton.setHorizontalAlignment(JLabel.CENTER);
		backToMenuButton.setBackground(new Color(246, 241, 123));
		backToMenuButton.setLocation(1125, 800);
		backToMenuButton.addMouseListener(new backToMenuMouseListener());

		cashButton.setSize(500, 400);
		cashButton.setBackground(Color.black);
		cashButton.setLocation(0, 0);
		cashButton.addMouseListener(new payByCashMouseListener());
		cardButton.setSize(500, 400);
		cardButton.setLocation(0, 0);
		cardButton.setBackground(Color.black);

		topPanel3.setLocation(60, 100);
		topPanel3.setSize(1360, 100);
		topPanel3.setBackground(Color.white);

		JLabel topLabel3 = new JLabel("SUBWAY");
		topLabel3.setFont(new Font("���� ���", Font.BOLD, 60));

		paymentPanel1.setSize(750, 1000);
		paymentPanel1.setLocation(375, 0);
		paymentPanel1.setBackground(Color.white);
		paymentPanel1.setVisible(false);

		topPanel3.add(topLabel3);
		cashPanel.add(cashButton);
		cashPanel.add(cashLabel);
		cardPanel.add(cardLabel);
		cardPanel.add(cardButton);
		paymentPanel.add(topPanel3);
		paymentPanel.add(backToMenuButton);
		paymentPanel.add(cashPanel);
		paymentPanel.add(cardPanel);
		paymentPanel.setVisible(false);


//==========================================================================================================		

		// ------------------ �ʱ�ȭ�� ������ġ��
		// �ʱ�ȭ---------------------------------------------------------
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
						int i = 0;
						sidePanel.setBackground(Color.white);
						sidePanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
						Side side1 = new Side();
						side1.selectSide(menuSide);
						order.uploadSideToCart(side1);
						if (order.sideList.size() > 1) {
							for (i = 0; i < order.sideList.size() - 1; i++) {
								if (side1.name == order.sideList.get(i).name) {
									order.sideList.remove(side1);
									order.sideList.remove(order.sideList.get(i));
									order.calculatePrice();
									updateCartContent();
								}
							}
						}
						order.calculatePrice();
						updateCartContent();// =======================================================================
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
						Drink drink1 = new Drink();
						drink1.selectDrink(menuDrink);
						order.uploadDrinkToCart(drink1);
						if (order.drinkList.size() > 1) {
							for (int i = 0; i < order.drinkList.size() - 1; i++) {
								if (drink1.name == order.drinkList.get(i).name) {
									order.drinkList.remove(drink1);
									order.drinkList.remove(order.drinkList.get(i));
									order.calculatePrice();
									updateCartContent();
								}
							}
						}
						int i = 0;
						drinkPanel.setBackground(Color.white);
						order.calculatePrice();
						updateCartContent();// ======================================================================
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
				JOptionPane.showMessageDialog(null, "�α��� ����");
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
						getSandwichCotentForLabel();// ------------------------------------------------------?
						sandwich.getBread(breadinfo);
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
// ============================================================== ġ�� ���콺 ������ ===========================================
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
// ========================================================= ���� ���콺 ������ =====================================================
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
//-------------------------------------------------------------------------------------- ���� ���� ���� ����  ---------------------	
						if (sandwich.toppings.size() == 0) {
							sandwich.getTopping(toppinginfo);
						} else if (sandwich.toppings.size() != 0 && sandwich.toppings.get(0).name != "���ξ���") {
							sandwich.getTopping(toppinginfo);
						} else if (sandwich.toppings.size() != 0 && sandwich.toppings.get(0).name == "���ξ���") {
							sandwich.toppings.clear();
							sandwich.getTopping(toppinginfo);
						}
						if (toppinginfo.name == "���ξ���") {
							sandwich.toppings.clear();
							sandwich.getTopping(toppinginfo);
						}
						if (sandwich.toppings.size() > 1) {
							for (int i = 0; i < sandwich.toppings.size() - 1; i++) {
								if (toppinginfo.name == sandwich.toppings.get(i).name) {
									sandwich.toppings.remove(toppinginfo);
									sandwich.toppings.remove(sandwich.toppings.get(i));
								}
							}
						}
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
//===================================================================== �ҽ� ���콺 ������ ===========================================
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
//-------------------------------------------------------------------------------------- �ҽ� ���� ���� ���� -------------------------	
						if (sandwich.sauces.size() == 0) {
							sandwich.getSauce(sauceinfo);
						} else if (sandwich.sauces.size() != 0 && sandwich.sauces.get(0).name != "�ҽ�����") {
							sandwich.getSauce(sauceinfo);
						} else if (sandwich.sauces.size() != 0 && sandwich.sauces.get(0).name == "�ҽ�����") {
							sandwich.sauces.clear();
							sandwich.getSauce(sauceinfo);
						}
						if (sauceinfo.name == "�ҽ�����") {
							sandwich.sauces.clear();
							sandwich.getSauce(sauceinfo);
						}
						if (sandwich.sauces.size() > 1) {
							for (int i = 0; i < sandwich.sauces.size() - 1; i++) {
								if (sauceinfo.name == sandwich.sauces.get(i).name) {
									sandwich.sauces.remove(sauceinfo);
									sandwich.sauces.remove(sandwich.sauces.get(i));
								}
							}
						}
						if (sandwich.sauces.size() > 3) {
							sandwich.sauces.remove(sauceinfo);
							JOptionPane.showMessageDialog(null, "�ҽ��� 3�������� ���� �����մϴ�");
						}
						getSandwichCotentForLabel();///////////////////////
//------------------------------------------------------------------------------------------�������-------------------------------					

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
//================================================= ������ġ ���� UI���� ��� ��ư ���콺 ������ ==============================================
	class makeSandwichCancelListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			sortPanel2.setVisible(false);
			makeSandwichPanel.setVisible(false);
			sortPanel.setVisible(true);
			cartFramePanel.setVisible(true);
			menuPanel.removeAll();
			sandwichPanel.removeAll();
			initSandwich();// �ʱ�ȭ
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
						sandwich.selectSandwich(menuSandwich); // ----------------------------- syso �����Ұ�
						int i = 0;
						breadPanel.setBackground(Color.white);
						breadPanel.setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
						updateCartContent();// ====================================================================
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
// ================================================ ������ġ ���� UI���� �ϷḦ ������ �� ���콺 ������ ===========================================
	class completeMakingSandwichListener implements MouseListener { 

		@Override
		public void mouseClicked(MouseEvent e) {
			int check = 1;
			if (sandwich.breadType == null) {
				JOptionPane.showMessageDialog(null, "���� ����ּ���");
				check = 0;
			}
			if (check != 0 && sandwich.cheeseType == null) {
				JOptionPane.showMessageDialog(null, "ġ� ����ּ���");
				check = 0;
			}
			if (check != 0 && sandwich.toppings.size() == 0) {
				JOptionPane.showMessageDialog(null, "������ ����ּ���");
				check = 0;
			}
			if (check != 0 && sandwich.sauces.size() == 0) {
				JOptionPane.showMessageDialog(null, "�ҽ� �� ������� ����ּ���");
				check = 0;
			}
			if (check != 0) {
				if (sandwich.breadType != null // ���� �ҽ� ������ ���� �� ���� ����� 0�϶��� �ٲ����
						&& sandwich.cheeseType != null && sandwich.sauces.size() != 0
						&& sandwich.toppings.size() != 0) {
					// ========================================
					sandwich.calculateCost(); // ���� ���
					if(sandwich.breadSize!=30)
						sandwich.breadSize = 15;
					Sandwich sandwich1 = new Sandwich();
					sandwich1.type = sandwich.type;
					sandwich1.breadSize = sandwich.breadSize;
					sandwich1.breadType = sandwich.breadType;
					sandwich1.cheeseType = sandwich.cheeseType;
					
					for(int i=0;i<sandwich.toppings.size();i++) {
						sandwich1.toppings.add(sandwich.toppings.get(i));
					}
					for(int j=0;j<sandwich.sauces.size();j++) {
						sandwich1.sauces.add(sandwich.sauces.get(j));
					}
					sandwich1.price = sandwich.price;
					sandwich1.num = sandwich.num;
					order.uploadSandwichToCart(sandwich1);
				}
				// =========================================
				initSandwich(); // �ʱ�ȭ
				getSandwichCotentForLabel();
				updateCartContent();// ====================================================================
				sortPanel2.setVisible(false);
				makeSandwichPanel.setVisible(false);
				sortPanel.setVisible(true);
				cartFramePanel.setVisible(true);
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
//===================================================== ������ġ �ʱ�ȭ �Լ� ========================================================
	public void initSandwich() { // ������ġ ���� ���� �� īƮ�� �ְ� �ʱ�ȭ �� =============================================================
		sandwich.sauces.clear();
		sandwich.toppings.clear();
		sandwich.breadType = null;
		sandwich.breadSize = 0;
		sandwich.cheeseType = null;
	}
// ============================================= ������ġ ����ǰ�� ������Ʈ ���ִ� �Լ� =====================================================
	public void getSandwichCotentForLabel() { 

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

		JLabel breadTypeContentLabel = new JLabel(sandwich.breadType);
		JLabel cheeseTypeContentLabel = new JLabel(sandwich.cheeseType);
		JLabel toppingTypeContentLabel = new JLabel(toppingcontent);
		JLabel sauceTypeContentLabel = new JLabel(saucecontent);

		JRadioButton breadSizeContent[] = new JRadioButton[2];
		ButtonGroup group = new ButtonGroup();
		breadSizeContent[0] = new JRadioButton("15cm");
		breadSizeContent[1] = new JRadioButton("30cm");
		if (sandwich.breadSize == 30) {
			breadSizeContent[1].setSelected(true);
		} else {
			breadSizeContent[0].setSelected(true);
		}
		breadSizeContent[0].setSize(100, 86);
		breadSizeContent[1].setSize(100, 86);
		breadSizeContent[1].setLocation(100, 0);
		breadSizeContent[0].addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (breadSizeContent[0].isSelected()) {
					sandwich.breadSize = 15;
					breadSizeContent[0].setSelected(true);
				} else {
					sandwich.breadSize = 30;
					breadSizeContent[1].setSelected(true);
				}
			}
		});
		breadSizeContent[0].addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (breadSizeContent[0].isSelected()) {
					sandwich.breadSize = 15;
					breadSizeContent[0].setSelected(true);
				} else {
					sandwich.breadSize = 30;
					breadSizeContent[1].setSelected(true);
				}
			}
		});
		group.add(breadSizeContent[0]);
		group.add(breadSizeContent[1]);
		breadTypeContentLabel.setFont(new Font("���� ���", Font.BOLD, 20));
		breadTypeContentLabel.setSize(200, 86);
		breadTypeContentLabel.setLocation(0, 86);
		breadTypeContentLabel.setHorizontalAlignment(JLabel.CENTER);

		cheeseTypeContentLabel.setFont(new Font("���� ���", Font.BOLD, 20));
		cheeseTypeContentLabel.setSize(200, 86);
		cheeseTypeContentLabel.setLocation(0, 172);
		cheeseTypeContentLabel.setHorizontalAlignment(JLabel.CENTER);

		toppingTypeContentLabel.setFont(new Font("���� ���", Font.BOLD, 8));
		toppingTypeContentLabel.setSize(200, 86);
		toppingTypeContentLabel.setLocation(0, 258);
		toppingTypeContentLabel.setHorizontalAlignment(JLabel.CENTER);

		sauceTypeContentLabel.setFont(new Font("���� ���", Font.BOLD, 10));
		sauceTypeContentLabel.setSize(200, 86);
		sauceTypeContentLabel.setLocation(0, 344);
		sauceTypeContentLabel.setHorizontalAlignment(JLabel.CENTER);

		sandwichContentPanel2.add(breadSizeContent[0]);
		sandwichContentPanel2.add(breadSizeContent[1]);
		sandwichContentPanel2.add(breadTypeContentLabel);
		sandwichContentPanel2.add(cheeseTypeContentLabel);
		sandwichContentPanel2.add(toppingTypeContentLabel);
		sandwichContentPanel2.add(sauceTypeContentLabel);

		sandwichContentPanel1 = sandwichContentPanel2;
		sandwichContentPanel.add(sandwichContentPanel1);
		sandwichContentPanel.setVisible(true);
	}
// ================================================= ��ٱ��ϸ� ������Ʈ ���ִ� �Լ� =======================================================
	public void updateCartContent() {
		cartPanel.setVisible(false);
		cartPanel.removeAll();
		int contentNum = 0;
		for (int i = 0; i < order.sandwichList.size(); i++) {
			JPanel cartContent = new JPanel();
			int num = i;
			cartContent.setLayout(null);
			cartContent.setSize(300, 40);
			cartContent.setLocation(0, contentNum * 40);
			JLabel cartContentName = new JLabel();
			cartContentName.setText(" " + order.sandwichList.get(i).type);
			cartContentName.setSize(180, 40);
			cartContentName.setFont(new Font("���� ���", Font.BOLD, 13));
			JLabel cartContentNum = new JLabel();
			cartContentNum.setText("" + order.sandwichList.get(i).num);
			cartContentNum.setSize(40, 40);
			cartContentNum.setLocation(180, 0);
			cartContentNum.setFont(new Font("���� ���", Font.BOLD, 15));
			JButton addSelectedContentButton = new JButton("+");
			addSelectedContentButton.setSize(40, 40);
			addSelectedContentButton.setLocation(220, 0);
			addSelectedContentButton.setFont(new Font("���� ���", Font.BOLD, 8));
			addSelectedContentButton.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					order.sandwichList.get(num).num++;
					order.calculatePrice();
					updateCartContent();
				}
			});
			JButton subSelectedContentButton = new JButton("-");
			subSelectedContentButton.setSize(40, 40);
			subSelectedContentButton.setLocation(260, 0);
			subSelectedContentButton.setFont(new Font("���� ���", Font.BOLD, 15));
			subSelectedContentButton.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					int num1 = order.sandwichList.get(num).num;
					if (num1 > 1) {
						order.sandwichList.get(num).num--;
						order.calculatePrice();
						updateCartContent();
					} else {
						JOptionPane.showMessageDialog(null, "�� �̻� ���� �� �����ϴ�");
					}

				}
			});
			cartContent.add(cartContentName);
			cartContent.add(cartContentNum);
			cartContent.add(addSelectedContentButton);
			cartContent.add(subSelectedContentButton);
			cartPanel.add(cartContent);
			contentNum++;
		}
		for (int i = 0; i < order.drinkList.size(); i++) {
			JPanel cartContent = new JPanel();
			int num = i;
			cartContent.setLayout(null);
			cartContent.setSize(300, 40);
			cartContent.setLocation(0, contentNum * 40);
			JLabel cartContentName = new JLabel();
			cartContentName.setText(" " + order.drinkList.get(i).name);
			cartContentName.setSize(180, 40);
			cartContentName.setFont(new Font("���� ���", Font.BOLD, 13));
			JLabel cartContentNum = new JLabel();
			cartContentNum.setText("" + order.drinkList.get(i).num);
			cartContentNum.setSize(40, 40);
			cartContentNum.setLocation(180, 0);
			cartContentNum.setFont(new Font("���� ���", Font.BOLD, 15));
			JButton addSelectedContentButton = new JButton("+");
			addSelectedContentButton.setSize(40, 40);
			addSelectedContentButton.setLocation(220, 0);
			addSelectedContentButton.setFont(new Font("���� ���", Font.BOLD, 9));
			addSelectedContentButton.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					order.drinkList.get(num).num++;
					order.calculatePrice();
					updateCartContent();
				}
			});
			JButton subSelectedContentButton = new JButton("-");
			subSelectedContentButton.setSize(40, 40);
			subSelectedContentButton.setLocation(260, 0);
			subSelectedContentButton.setFont(new Font("���� ���", Font.BOLD, 15));
			subSelectedContentButton.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					int num1 = order.drinkList.get(num).num;
					if (num1 > 1) {
						order.drinkList.get(num).num--;
						order.calculatePrice();
						updateCartContent();
					}
				}
			});
			cartContent.add(cartContentName);
			cartContent.add(cartContentNum);
			cartContent.add(addSelectedContentButton);
			cartContent.add(subSelectedContentButton);
			cartPanel.add(cartContent);
			contentNum++;
		}
		for (int i = 0; i < order.sideList.size(); i++) {
			JPanel cartContent = new JPanel();
			int num = i;
			cartContent.setLayout(null);
			cartContent.setSize(300, 40);
			cartContent.setLocation(0, contentNum * 40);
			JLabel cartContentName = new JLabel();
			cartContentName.setText(" " + order.sideList.get(i).name);
			cartContentName.setSize(180, 40);
			cartContentName.setFont(new Font("���� ���", Font.BOLD, 13));
			JLabel cartContentNum = new JLabel();
			cartContentNum.setText("" + order.sideList.get(i).num);
			cartContentNum.setSize(40, 40);
			cartContentNum.setLocation(180, 0);
			cartContentNum.setFont(new Font("���� ���", Font.BOLD, 15));
			JButton addSelectedContentButton = new JButton("+");
			addSelectedContentButton.setSize(40, 40);
			addSelectedContentButton.setLocation(220, 0);
			addSelectedContentButton.setFont(new Font("���� ���", Font.BOLD, 8));
			addSelectedContentButton.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					order.sideList.get(num).num++;
					order.calculatePrice();
					updateCartContent();
				}
			});
			JButton subSelectedContentButton = new JButton("-");
			subSelectedContentButton.setSize(40, 40);
			subSelectedContentButton.setLocation(260, 0);
			subSelectedContentButton.setFont(new Font("���� ���", Font.BOLD, 15));
			subSelectedContentButton.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					int num1 = order.sideList.get(num).num;
					if (num1 > 1) {
						order.sideList.get(num).num--;
						order.calculatePrice();
						updateCartContent();
					}
				}
			});
			cartContent.add(cartContentName);
			cartContent.add(cartContentNum);
			cartContent.add(addSelectedContentButton);
			cartContent.add(subSelectedContentButton);
			cartPanel.add(cartContent);
			contentNum++;
		}

		JLabel allPrice1 = new JLabel();
		allPrice1.setText(" �հ� :	           " + order.totalPrice);
		allPrice1.setSize(300, 40);
		allPrice1.setFont(new Font("���� ���", Font.BOLD, 30));
		allPrice1.setLocation(0, 390);
		allPrice1.setBackground(new Color(246, 241, 123));
		allPrice1.setOpaque(true);
		cartPanel.add(allPrice1);
		cartPanel.setVisible(true);
	}
// =============================================================== �޴� ȭ�鿡�� ��� ��ư ���콺 ������ ====================================
	class cancelOrderMouseListener implements MouseListener {	// īƮ�� �ʱ�ȭ ���� ================================================
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (order.sandwichList.size() != 0 || order.drinkList.size() != 0 || order.sideList.size() != 0) {
				order.sandwichList.clear();
				order.sideList.clear();
				order.drinkList.clear();
				order.calculatePrice();
				updateCartContent();
				JOptionPane.showMessageDialog(null, "�ֹ��� ��ҵǾ����ϴ�");
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
// ======================================================== �ֹ� ��ư ������ ���� ������ ==============================================
	class requestOrderMouseListener implements MouseListener {	// �ֹ� ������ ������� =============================================

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (order.sandwichList.size() != 0 || order.drinkList.size() != 0 || order.sideList.size() != 0) {
				order.orderNumber = orderNum++;
				
				String orderList = "";
				orderList += ("��û��ȣ : " + order.orderNumber);
				orderList += ("\n=========================================================\n");
				for(int i=0;i<order.sandwichList.size();i++) {
					orderList += ("������ġ : "+ order.sandwichList.get(i).type + order.sandwichList.get(i).num + " ��\n");
					orderList += ("�� : " + order.sandwichList.get(i).breadType);
					orderList += (order.sandwichList.get(i).breadSize + " cm\n");
					orderList += ("ġ�� : " +order.sandwichList.get(i).cheeseType + "\n���� : ");
					for(int j=0;j<order.sandwichList.get(i).toppings.size();j++) {
						if(j!=order.sandwichList.get(i).toppings.size()-1) {
							orderList += (order.sandwichList.get(i).toppings.get(j).name + ", ");
						}
						else {
							orderList += (order.sandwichList.get(i).toppings.get(j).name);
						}
					}
					orderList += "\n�ҽ� �� ����� : ";
					for(int k=0;k<order.sandwichList.get(i).sauces.size();k++) {
						if(k!=order.sandwichList.get(i).sauces.size()-1) {
							orderList += (order.sandwichList.get(i).sauces.get(k).name + ", ");
						}
						else {
							orderList += (order.sandwichList.get(i).sauces.get(k).name + "\n");
						}
					}
					orderList += (order.sandwichList.get(i).num * order.sandwichList.get(i).price + "��");
					orderList += "\n=========================================================\n";
				}
				for(int j=0;j<order.drinkList.size();j++) {
					orderList += ("���� : " + order.drinkList.get(j).name + order.drinkList.get(j).num + " ��\n");
					orderList += (order.drinkList.get(j).num * order.drinkList.get(j).price + "��");
				}
				if(order.drinkList.size()!=0) {
					orderList += "\n=========================================================\n";
				}
				for(int k=0;k<order.sideList.size();k++) {
					orderList += ("���̵� : " + order.sideList.get(k).name + order.sideList.get(k).num + " ��\n");
					orderList += (order.sideList.get(k).num * order.sideList.get(k).price + "��");
				}
				if(order.sideList.size()!=0) {
					orderList += "\n=========================================================\n";
				}
				orderList += ("\t\t\t\t �� ���� : " + order.totalPrice + "��");
				
				
				
				int result = JOptionPane.showConfirmDialog(null, "�ֹ��Ͻðڽ��ϱ�?\n\n" + orderList, null, JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				if (result == JOptionPane.YES_OPTION) {
					orderPanel.setVisible(false);
					paymentPanel.setVisible(true);
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
//=================================================== �����ϴ� �޴��� ���ư� ���� ���콺 ������ =========================================
	class backToMenuMouseListener implements MouseListener {		// ���� ���� ===============================================

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			paymentPanel.setVisible(false);
			orderPanel.setVisible(true);
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
// ============================================================ ���� ���� ���콺 ������ =================================================
	class payByCashMouseListener implements MouseListener {			

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			String money = null;
			int result = JOptionPane.showConfirmDialog(paymentPanel1, "������ �����Ͻðڽ��ϱ�?", "����â", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if (result == JOptionPane.YES_OPTION) {
				money = JOptionPane.showInputDialog("������ �������ּ���");
			}
			if(money != null) {
				int money1 = Integer.parseInt(money);
				if(money1>order.totalPrice) {
					JOptionPane.showMessageDialog(null, "������ �Ϸ�Ǿ����ϴ�");
					JOptionPane.showMessageDialog(null, "�Ž����� " + (money1 - order.totalPrice) + "���� �޾��ֽʽÿ�");
					orderPanel.setVisible(true);
					paymentPanel.setVisible(false);
					Order completedOrder = new Order();
					//completedOrder.drinkList = order.drinkList;
					//completedOrder.sandwichList = order.sandwichList;
					//completedOrder.sideList = order.sideList;
					
					for(int i=0;i<order.drinkList.size();i++) {
						completedOrder.drinkList.add(order.drinkList.get(i));
					}
					for(int j=0;j<order.sandwichList.size();j++) {
						completedOrder.sandwichList.add(order.sandwichList.get(j));
					}
					for(int k=0;k<order.sideList.size();k++) {
						completedOrder.sideList.add(order.sideList.get(k));
					}
					completedOrder.totalPrice = order.totalPrice;
					completedOrder.orderNumber = order.orderNumber;
					orderlist.orderlist.add(completedOrder);
					initOrder();				// order �ʱ�ȭ
					updateCartContent();		// ��ٱ��� UI �ʱ�ȭ
				}
				else {
					JOptionPane.showMessageDialog(null, "�ݾ��� �����մϴ�. ���� ��ȯ�˴ϴ�.");
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
//============================================================================================================================	
	private void initOrder() {					// �ֹ� ���� �ʱ�ȭ �Լ� 
		order.drinkList.clear();				// ���� ���� �� ���⳻���� �� �� �ʱ�ȭ ��
		order.sandwichList.clear();
		order.sideList.clear();
		order.totalPrice = 0;
	}
//=====================================================================================================================
	public static void main(String[] args) {
		new Frame();
	}
}
