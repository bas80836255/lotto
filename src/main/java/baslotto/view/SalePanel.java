//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.view;

import baslotto.database.CustomerDBImplement;
import baslotto.database.SaleDBImplement;
import baslotto.entity.CustomerInfo;
import baslotto.entity.SaleInfo;
import baslotto.view.popup.NullPopup;

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.h2.util.StringUtils;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SalePanel extends JPanel {
	private JTable table;
	private JTextField numberTextField;
	private JButton button_4;
	private JTextField priceTextField;
	private JComboBox comboBoxCustomerName;
	private JComboBox comboBoxPage;
	private SaleDBImplement saleDBImplement = new SaleDBImplement();
	private CustomerDBImplement customerDBImplement = new CustomerDBImplement();
	// private String customerName;
	// private String page;

	public SalePanel() {
		setBounds(100, 100, 1280, 670);
		setLayout((LayoutManager) null);
		setLayout(null);
		setLayout(null);
		JButton btnNewButton = new JButton("แทรก");
		btnNewButton.setBounds(35, 607, 115, 44);
		add(btnNewButton);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 158, 917, 437);
		add(scrollPane);
		table = new JTable();
		scrollPane.setViewportView(table);
		JLabel label_1 = new JLabel("เลข");
		label_1.setBounds(25, 39, 109, 61);
		add(label_1);
		JLabel label_2 = new JLabel("ราคา");
		label_2.setBounds(378, 39, 109, 61);
		add(label_2);
		numberTextField = new JTextField();
		numberTextField.setBounds(152, 34, 178, 70);
		add(numberTextField);
		numberTextField.setColumns(10);
		priceTextField = new JTextField();
		priceTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (StringUtils.isNullOrEmpty(numberTextField.getText())
							&& StringUtils.isNullOrEmpty(priceTextField.getText())) {
						NullPopup nullPopup = new NullPopup("ใส่เลขหรือราคาไม่ถูกต้อง");
						nullPopup.setModal(true);
						nullPopup.setVisible(true);
					} else {
						// 3
						if (Pattern.matches("\\d{3}", numberTextField.getText())) {
							threeNumber(numberTextField.getText(), priceTextField.getText(),
									comboBoxCustomerName.getSelectedItem().toString(),
									comboBoxPage.getSelectedItem().toString());
							NullPopup nullPopup = new NullPopup("เรียบร้อย");
							nullPopup.setModal(true);
							nullPopup.setVisible(true);
						}
						// 2
						if (Pattern.matches("\\d{2}", numberTextField.getText())) {
							twoNumber(numberTextField.getText(), priceTextField.getText(),
									comboBoxCustomerName.getSelectedItem().toString(),
									comboBoxPage.getSelectedItem().toString());
							NullPopup nullPopup = new NullPopup("เรียบร้อย");
							nullPopup.setModal(true);
							nullPopup.setVisible(true);
						}
						// 1
						if (Pattern.matches("\\d{1}", numberTextField.getText())) {
							oneNumber(numberTextField.getText(), priceTextField.getText(),
									comboBoxCustomerName.getSelectedItem().toString(),
									comboBoxPage.getSelectedItem().toString());
							NullPopup nullPopup = new NullPopup("เรียบร้อย");
							nullPopup.setModal(true);
							nullPopup.setVisible(true);
						}
						// special
						if (Pattern.matches("\\d{2}\\-\\d{2}", numberTextField.getText())
								|| Pattern.matches("\\-\\-", numberTextField.getText())
								|| Pattern.matches("\\d{1}\\*", numberTextField.getText())
								|| Pattern.matches("\\*\\d{1}", numberTextField.getText())
								|| (Pattern.matches("\\*\\d{1}\\*", numberTextField.getText())
										|| Pattern.matches("\\d{1}\\*\\*", numberTextField.getText()))) {
							specialNumber(numberTextField.getText(), priceTextField.getText(),
									comboBoxCustomerName.getSelectedItem().toString(),
									comboBoxPage.getSelectedItem().toString());
							NullPopup nullPopup = new NullPopup("เรียบร้อย");
							nullPopup.setModal(true);
							nullPopup.setVisible(true);
						}
					}
				}
			}
		});
		priceTextField.setColumns(10);
		priceTextField.setBounds(506, 34, 178, 70);
		add(priceTextField);
		button_4 = new JButton("จบการทำรายการ");
		button_4.setBounds(1113, 607, 135, 44);
		add(button_4);
		JButton button = new JButton("แก้ไข");
		button.setBounds(162, 607, 115, 44);
		add(button);
		JButton button_1 = new JButton("ลบ");
		button_1.setBounds(289, 607, 115, 44);
		add(button_1);
		JButton button_2 = new JButton("ย้ายแผ่น");
		button_2.setBounds(416, 607, 115, 44);
		add(button_2);
		JButton button_3 = new JButton("เลือกทั้งหมด");
		button_3.setBounds(544, 607, 115, 44);
		add(button_3);
		Map<String, String> customerNameMap = customerDBImplement.getCustomerName();
		Vector<String> Items = new Vector();
		if (!customerNameMap.isEmpty()) {
			customerNameMap.forEach((id, name) -> {
				Items.add(name);
			});
		}

		DefaultComboBoxModel modelCustomer = new DefaultComboBoxModel(Items);
		comboBoxCustomerName = new JComboBox(modelCustomer);
		comboBoxCustomerName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Set<String> pageList = saleDBImplement
						.getCustomerPage(comboBoxCustomerName.getSelectedItem().toString());
				comboBoxPage.removeAllItems();
				if (!pageList.isEmpty() && pageList != null) {
					Iterator var3 = pageList.iterator();

					while (var3.hasNext()) {
						String page = (String) var3.next();
						comboBoxPage.addItem(page);
					}
				} else {
					comboBoxPage.addItem("1");
				}

			}
		});
		comboBoxCustomerName.setBounds(1059, 57, 115, 27);
		add(comboBoxCustomerName);
		JLabel lblNewLabel = new JLabel("ลูกค้า");
		lblNewLabel.setBounds(986, 61, 61, 16);
		add(lblNewLabel);
		JLabel label = new JLabel("แผ่นที่");
		label.setBounds(986, 102, 61, 16);
		add(label);
		Set<String> pageList = saleDBImplement.getCustomerPage(comboBoxCustomerName.getSelectedItem().toString());
		Vector<String> pageItems = new Vector();
		if (!pageList.isEmpty() && pageList != null) {
			Iterator var16 = pageList.iterator();

			while (var16.hasNext()) {
				String page = (String) var16.next();
				pageItems.add(page);
			}
		} else {
			pageItems.add("1");
		}

		DefaultComboBoxModel modelPage = new DefaultComboBoxModel(pageItems);
		comboBoxPage = new JComboBox(modelPage);
		comboBoxPage.setBounds(1059, 98, 115, 27);
		add(comboBoxPage);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(990, 158, 258, 437);
		add(scrollPane_1);
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addColumn("ลำดับ");
		model.addColumn("เลข");
		model.addColumn("ประเภท");
		model.addColumn("ราคา");
		model.addColumn("เวลา");

		List<SaleInfo> saleInfoList = saleDBImplement.getSaleListbyPage(
				comboBoxCustomerName.getSelectedItem().toString(), comboBoxPage.getSelectedItem().toString());
		int i = 0;
		for (SaleInfo saleInfo : saleInfoList) {
			model.addRow(new Object[0]);
			model.setValueAt(i + 1, i, 0);
			model.setValueAt(saleInfo.getLottoNumber(), i, 1);
			model.setValueAt(transNumberToWordLotto(saleInfo.getType()), i, 2);
			model.setValueAt(saleInfo.getPrice(), i, 3);
			model.setValueAt(saleInfo.getDate(), i, 4);
			i++;
		}

	}

	public void threeNumber(String number, String price, String customerName, String page) {
		SaleInfo saleInfo = new SaleInfo();
		saleInfo.setCustomerName(customerName);
		saleInfo.setPage(page);
		saleInfo.setDate(setTime());

		// threeTop and threeTod
		if (Pattern.matches("\\d{1,6}\\+\\d{1,6}", price)) {
			
			String[] splitPrice = price.split("\\+");
			saleInfo.setLottoNumber(number);
			saleInfo.setType("1");
			saleInfo.setPrice(splitPrice[0]);
			saleDBImplement.addSale(saleInfo);
			saleInfo.setType("2");
			saleInfo.setPrice(splitPrice[1]);
			saleDBImplement.addSale(saleInfo);
		}

		// threeTopx6 || threeTopx3
		if (Pattern.matches("\\d{1,6}\\-", price)) {
			// notsame
			if (!(Pattern.matches("(?:\\d{1})(\\d{1})\\1", number) || Pattern.matches("(\\d{1})\\1(?:\\d{1})", number)
					|| Pattern.matches("(\\d{1})(?:\\d{1})\\1", number))) {
				saleInfo.setPrice(price);
				saleInfo.setType("1");
				Set<String> todLotto = seperateTod(number);
				Iterator<String> iterator = todLotto.iterator();
				while (iterator.hasNext()) {
					saleInfo.setLottoNumber(iterator.next());
					saleDBImplement.addSale(saleInfo);
				}
			}
			// same two
			if ((Pattern.matches("(?:\\d{1})(\\d{1})\\1", number) || Pattern.matches("(\\d{1})\\1(?:\\d{1})", number)
					|| Pattern.matches("(\\d{1})(?:\\d{1})\\1", number))
					&& !(Pattern.matches("(?:\\d{1})(\\d{1})\\1", number)
							&& Pattern.matches("(\\d{1})\\1(?:\\d{1})", number)
							&& Pattern.matches("(\\d{1})(?:\\d{1})\\1", number))) {
				saleInfo.setPrice(price);
				saleInfo.setType("1");
				Set<String> todLotto = seperateTod(number);
				Iterator<String> iterator = todLotto.iterator();
				while (iterator.hasNext()) {
					saleInfo.setLottoNumber(iterator.next());
					saleDBImplement.addSale(saleInfo);
				}
			}
			// same three
			if (Pattern.matches("(?:\\d{1})(\\d{1})\\1", number) && Pattern.matches("(\\d{1})\\1(?:\\d{1})", number)
					&& Pattern.matches("(\\d{1})(?:\\d{1})\\1", number)) {
				saleInfo.setType("1");
				saleInfo.setPrice(price);
				saleInfo.setLottoNumber(number);
				saleDBImplement.addSale(saleInfo);
			}
		}

		// threeTop
		if (Pattern.matches("\\d{1,6}", price)) {
			saleInfo.setType("1");
			saleInfo.setPrice(price);
			saleInfo.setLottoNumber(number);
			saleDBImplement.addSale(saleInfo);
		}

		// threeTod
		if (Pattern.matches("\\+\\d{1,6}", price) || Pattern.matches("0\\+\\d{1,6}", price)) {
			saleInfo.setType("2");
			saleInfo.setPrice(price);
			saleInfo.setLottoNumber(number);
			saleDBImplement.addSale(saleInfo);
		}
	}

	public void twoNumber(String number, String price, String customerName, String page) {
		SaleInfo saleInfo = new SaleInfo();
		saleInfo.setCustomerName(customerName);
		saleInfo.setPage(page);
		saleInfo.setDate(setTime());

		// 50+50 top bot
		if (Pattern.matches("\\d{1,6}\\+\\d{1,6}", price)) {
			String[] splitPrice = price.split("\\+");
			saleInfo.setLottoNumber(number);
			saleInfo.setType("3");
			saleInfo.setPrice(splitPrice[0]);
			saleDBImplement.addSale(saleInfo);
			saleInfo.setType("4");
			saleInfo.setPrice(splitPrice[1]);
			saleDBImplement.addSale(saleInfo);
		}

		// 50+50- top bot switch
		if (Pattern.matches("\\d{1,6}\\+\\d{1,6}\\-", price)) {
			String[] splitPrice = price.split("\\+");
			String firstNumber = number.substring(0, 1);
			String secondNumber = number.substring(1, 2);
			saleInfo.setType("3");
			saleInfo.setPrice(splitPrice[0]);
			saleInfo.setLottoNumber(firstNumber + secondNumber);
			saleDBImplement.addSale(saleInfo);
			saleInfo.setLottoNumber(secondNumber + firstNumber);
			saleDBImplement.addSale(saleInfo);
			saleInfo.setType("4");
			saleInfo.setPrice(splitPrice[1]);
			saleInfo.setLottoNumber(firstNumber + secondNumber);
			saleDBImplement.addSale(saleInfo);
			saleInfo.setLottoNumber(secondNumber + firstNumber);
			saleDBImplement.addSale(saleInfo);
		}
		// 50- top switch
		if (Pattern.matches("\\d{1,6}\\-", price)) {
			String firstNumber = number.substring(0, 1);
			String secondNumber = number.substring(1, 2);
			saleInfo.setType("3");
			saleInfo.setPrice(price);
			saleInfo.setLottoNumber(firstNumber + secondNumber);
			saleDBImplement.addSale(saleInfo);
			saleInfo.setLottoNumber(secondNumber + firstNumber);
			saleDBImplement.addSale(saleInfo);
		}
		// 50 top
		if (Pattern.matches("\\d{1,6}", price)) {
			saleInfo.setType("3");
			saleInfo.setPrice(price);
			saleInfo.setLottoNumber(number);
			saleDBImplement.addSale(saleInfo);
		}
		// +50- || 0+50- bot switch
		if (Pattern.matches("\\+\\d{1,6}\\-", price) || Pattern.matches("0\\+\\d{1,6}\\-", price)) {
			String firstNumber = number.substring(0, 1);
			String secondNumber = number.substring(1, 2);
			saleInfo.setType("4");
			saleInfo.setPrice(price);
			saleInfo.setLottoNumber(firstNumber + secondNumber);
			saleDBImplement.addSale(saleInfo);
			saleInfo.setLottoNumber(secondNumber + firstNumber);
			saleDBImplement.addSale(saleInfo);
		}
		// +50 || 0+50 bot
		if (Pattern.matches("\\+\\d{1,6}", price) || Pattern.matches("0\\+\\d{1,6}", price)) {
			saleInfo.setType("3");
			saleInfo.setPrice(price);
			saleInfo.setLottoNumber(number);
			saleDBImplement.addSale(saleInfo);
		}
	}

	public void oneNumber(String number, String price, String customerName, String page) {
		SaleInfo saleInfo = new SaleInfo();
		saleInfo.setCustomerName(customerName);
		saleInfo.setPage(page);
		saleInfo.setDate(setTime());

		// 50+50 runtop runbot
		if (Pattern.matches("\\d{1,6}\\+\\d{1,6}", price)) {
			saleInfo.setLottoNumber(number);
			String[] splitPrice = price.split("\\+");
			saleInfo.setType("5");
			saleInfo.setPrice(splitPrice[0]);
			saleDBImplement.addSale(saleInfo);
			saleInfo.setPrice(splitPrice[1]);
			saleInfo.setType("6");
			saleDBImplement.addSale(saleInfo);
		}

		// 50 runtop
		if (Pattern.matches("\\d{1,6}", price)) {
			saleInfo.setLottoNumber(number);
			saleInfo.setType("5");
			saleInfo.setPrice(price);
			saleDBImplement.addSale(saleInfo);
		}

		// +50 || 0+50 runbot
		if (Pattern.matches("\\+\\d{1,6}", price) || Pattern.matches("0\\+\\d{1,6}", price)) {
			saleInfo.setLottoNumber(number);
			saleInfo.setType("6");
			saleInfo.setPrice(price);
			saleDBImplement.addSale(saleInfo);
		}

		// 50- topx19
		if (Pattern.matches("\\d{1,6}\\-", price)) {
			saleInfo.setType("3");
			saleInfo.setPrice(price);
			for (int i = 0; i < 10; i++) {
				saleInfo.setLottoNumber(number + String.valueOf(i));
				saleDBImplement.addSale(saleInfo);
			}
			for (int y = 0; y < 10; y++) {
				if (number.equals(String.valueOf(y))) {
					saleInfo.setLottoNumber(String.valueOf(y) + number);
					saleDBImplement.addSale(saleInfo);
				}
			}
		}

		// +50- || 0+50- botx19
		if (Pattern.matches("\\+\\d{1,6}\\-", price) || Pattern.matches("0\\+\\d{1,6}\\-", price)) {
			saleInfo.setType("4");
			saleInfo.setPrice(price);
			for (int i = 0; i < 10; i++) {
				saleInfo.setLottoNumber(number + String.valueOf(i));
				saleDBImplement.addSale(saleInfo);
			}
			for (int y = 0; y < 10; y++) {
				if (number.equals(String.valueOf(y))) {
					saleInfo.setLottoNumber(String.valueOf(y) + number);
					saleDBImplement.addSale(saleInfo);
				}
			}
		}
	}

	public void specialNumber(String number, String price, String customerName, String page) {
		SaleInfo saleInfo = new SaleInfo();
		saleInfo.setCustomerName(customerName);
		saleInfo.setPage(page);
		saleInfo.setDate(setTime());

		// -- two double
		if (Pattern.matches("\\-\\-", number) && Pattern.matches("\\d{1,6}", price)) {
			saleInfo.setType("3");
			saleInfo.setPrice(price);
			for (int i = 0; i < 10; i++) {
				saleInfo.setLottoNumber(String.valueOf(i) + String.valueOf(i));
				saleDBImplement.addSale(saleInfo);
			}
		}
		// 10-15 number to number
		if (Pattern.matches("\\d{2}\\-\\d{2}", number) && Pattern.matches("\\d{1,6}", price)) {
			saleInfo.setType("3");
			saleInfo.setPrice(price);
			String[] splitNumber = number.split("\\-");
			int firstNumber = Integer.parseInt(splitNumber[0]);
			int secondNumber = Integer.parseInt(splitNumber[1]);
			if (secondNumber > firstNumber) {
				int duration = secondNumber - firstNumber;
				for (int i = 0; i < duration; i++) {
					saleInfo.setLottoNumber(String.valueOf(firstNumber + i));
					saleDBImplement.addSale(saleInfo);
				}
			}
		}
		// 5* 50,51,52,53,54,55,56,57,58,59
		if (Pattern.matches("\\d{1}\\*", number) && Pattern.matches("\\d{1,6}", price)) {
			saleInfo.setType("3");
			saleInfo.setPrice(price);
			for (int i = 0; i < 10; i++) {
				saleInfo.setLottoNumber(number + String.valueOf(i));
				saleDBImplement.addSale(saleInfo);
			}
		}
		// *5 05,15,25,35,45,55,65,75,85,95
		if (Pattern.matches("\\*\\d{1}", number) && Pattern.matches("\\d{1,6}", price)) {
			saleInfo.setType("3");
			saleInfo.setPrice(price);
			for (int i = 0; i < 10; i++) {
				saleInfo.setLottoNumber(String.valueOf(i) + number);
				saleDBImplement.addSale(saleInfo);
			}
		}
		// *5* 5**
		if ((Pattern.matches("\\*\\d{1}\\*", number) || Pattern.matches("\\d{1}\\*\\*", number))
				&& Pattern.matches("\\d{1,6}", price)) {
			saleInfo.setType("3");
			saleInfo.setPrice(price);
			for (int i = 0; i < 10; i++) {
				saleInfo.setLottoNumber(number + String.valueOf(i));
				saleDBImplement.addSale(saleInfo);
			}
			for (int i = 0; i < 10; i++) {
				saleInfo.setLottoNumber(String.valueOf(i) + number);
				saleDBImplement.addSale(saleInfo);
			}
		}
	}

	private Set<String> seperateTod(String threeLotto) {
		Set<String> todLotto = new HashSet();
		String firstNumber = threeLotto.substring(0, 1);
		String secondNumber = threeLotto.substring(1, 2);
		String thirdNumber = threeLotto.substring(2);
		todLotto.add(firstNumber + secondNumber + thirdNumber);
		todLotto.add(firstNumber + thirdNumber + secondNumber);
		todLotto.add(secondNumber + firstNumber + thirdNumber);
		todLotto.add(secondNumber + thirdNumber + firstNumber);
		todLotto.add(thirdNumber + firstNumber + secondNumber);
		todLotto.add(thirdNumber + secondNumber + firstNumber);
		return todLotto;
	}

	private String transNumberToWordLotto(String lottoNumber) {
		String lottoWord = "";
		switch (lottoNumber) {
		case "1":
			lottoWord = "3ตัวเต็ง";
			break;
		case "2":
			lottoWord = "3ตัวโต๊ด";
			break;
		case "3":
			lottoWord = "2ตัวบน";
			break;
		case "4":
			lottoWord = "2ตัวล่าง";
			break;
		case "5":
			lottoWord = "วิ่งบน";
			break;
		case "6":
			lottoWord = "วิ่งล่าง";
			break;
		}
		return lottoWord;
	}

	private String setTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
		LocalDateTime localDateTime = LocalDateTime.now();
		return localDateTime.format(formatter);
	}
}
