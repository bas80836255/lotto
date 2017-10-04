//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.view;

import baslotto.database.CustomerDBImplement;
import baslotto.database.SaleDBImplement;
import baslotto.entity.SaleInfo;

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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

public class SalePanel extends JPanel {
	private JTable table;
	private JTextField textField_1;
	private JButton button_4;
	private JTextField textField;
	private JComboBox comboBoxCustomerName;
	private JComboBox comboBoxPage;
	private SaleDBImplement saleDBImplement = new SaleDBImplement();
	private CustomerDBImplement customerDBImplement = new CustomerDBImplement();

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
		textField_1 = new JTextField();
		textField_1.setBounds(152, 34, 178, 70);
		add(textField_1);
		textField_1.setColumns(10);
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(506, 34, 178, 70);
		add(textField);
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
				List<String> pageList = saleDBImplement
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
		List<String> pageList = saleDBImplement.getCustomerPage(comboBoxCustomerName.getSelectedItem().toString());
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
		model.addColumn("3เต็ง");
		model.addColumn("3โต๊ด");
		model.addColumn("2บน");
		model.addColumn("2ล่าง");
		model.addColumn("1วิ่งบน");
		model.addColumn("1วิ่งล่าง");
		model.addColumn("เวลา");

		for (int i = 0; i <= 20; ++i) {
			model.addRow(new Object[0]);
			model.setValueAt(i + 1, i, 0);
			model.setValueAt("Data Col 1", i, 1);
			model.setValueAt("Data Col 2", i, 2);
			model.setValueAt("Data Col 3", i, 3);
			model.setValueAt("Data Col 4", i, 4);
			model.setValueAt("Data Col 5", i, 5);
			model.setValueAt("Data Col 6", i, 6);
			model.setValueAt("Data Col 6", i, 7);
			model.setValueAt("Data Col 6", i, 8);
		}

	}

	public void threeNumber(String number, String price) {
		// notsame
		if (!(Pattern.matches("(?:\\d{1})(\\d{1})\\1", number) || Pattern.matches("(\\d{1})\\1(?:\\d{1})", number)
				|| Pattern.matches("(\\d{1})(?:\\d{1})\\1", number))) {
			if (Pattern.matches("\\d{3}\\+\\d{3}", price)) {

			}
			if (Pattern.matches("\\d{3}\\-", price)) {

			}
			if (Pattern.matches("\\+\\d{3}", price) | Pattern.matches("\\0+\\d{3}", price)) {

			}

		}
		// same two
		if ((Pattern.matches("(?:\\d{1})(\\d{1})\\1", number) || Pattern.matches("(\\d{1})\\1(?:\\d{1})", number)
				|| Pattern.matches("(\\d{1})(?:\\d{1})\\1", number))
				&& !(Pattern.matches("(?:\\d{1})(\\d{1})\\1", number)
						&& Pattern.matches("(\\d{1})\\1(?:\\d{1})", number)
						&& Pattern.matches("(\\d{1})(?:\\d{1})\\1", number))) {
			if (Pattern.matches("\\d{3}\\+\\d{3}", price)) {

			}
			if (Pattern.matches("\\d{3}\\-", price)) {

			}
			if (Pattern.matches("\\+\\d{3}", price) | Pattern.matches("\\0+\\d{3}", price)) {

			}

		}
		// same three
		if (Pattern.matches("(?:\\d{1})(\\d{1})\\1", number) && Pattern.matches("(\\d{1})\\1(?:\\d{1})", number)
				&& Pattern.matches("(\\d{1})(?:\\d{1})\\1", number)) {
			if (Pattern.matches("\\d{3}\\+\\d{3}", price)) {

			}
			if (Pattern.matches("\\d{3}\\-", price)) {

			}
			if (Pattern.matches("\\+\\d{3}", price) | Pattern.matches("\\0+\\d{3}", price)) {

			}
		}
	}

	public void twoNumber(String number, String price) {
		// 50+50 top bot
		if (Pattern.matches("\\d{3}+\\d{3}", price)) {

		}
		// 50+50- top bot switch
		if (Pattern.matches("\\d{3}+\\d{3}\\-", price)) {

		}
		// 50- top switch
		if (Pattern.matches("\\d{3}\\-", price)) {

		}
		// 50 top
		if (Pattern.matches("\\d{3}", price)) {

		}
		// +50- || 0+50- bot switch
		if (Pattern.matches("\\+\\d{1,6}\\-", price) || Pattern.matches("0\\+\\d{1,6}\\-", price)) {

		}
		// +50 || 0+50 bot
		if (Pattern.matches("\\+\\d{1,6}", price) || Pattern.matches("0\\+\\d{1,6}", price)) {
			System.out.println("true");
		}
	}

	public void oneNumber(String number, String price) {
		// 50+50 runtop runbot
		if (Pattern.matches("\\d{1,6}\\+\\d{1,6}", price)) {

		}
		// 50- topx19
		if (Pattern.matches("\\d{3}\\-", price)) {

		}
		// +50- || 0+50- botx19
		if (Pattern.matches("\\+\\d{1,6}\\-", price) || Pattern.matches("0\\+\\d{1,6}\\-", price)) {

		}
	}

	public void specialNumber(String number, String price, String customerName, String page) {
		SaleInfo saleInfo = new SaleInfo();
		saleInfo.setCustomerName(customerName);
		saleInfo.setPage(page);
		// -- two double
		if (Pattern.matches("\\-\\-", number) && Pattern.matches("\\d{1,6}", price)) {
			saleInfo.setType("3");
			for (int i = 0; i < 10; i++) {
				saleInfo.setLottoNumber(String.valueOf(i)+String.valueOf(i));
				saleDBImplement.addSale(saleInfo);
			}
		}
		// 10-15 number to number
		if (Pattern.matches("\\d{2}\\-\\d{2}", number) && Pattern.matches("\\d{1,6}", price)) {
			saleInfo.setType("3");
			String[] splitNumber = number.split("-");
			int firstNumber = Integer.parseInt(splitNumber[0]);
			int secondNumber = Integer.parseInt(splitNumber[1]);
			if(secondNumber > firstNumber) {
				int duration = secondNumber-firstNumber;
				for (int i = 0; i < duration; i++) {
					saleInfo.setLottoNumber(String.valueOf(firstNumber+i));
					saleDBImplement.addSale(saleInfo);
				}
			}
		}
		// 5* 50,51,52,53,54,55,56,57,58,59
		if (Pattern.matches("\\d{1}\\*", number) && Pattern.matches("\\d{1,6}", price)) {
			saleInfo.setType("3");
			for (int i = 0; i < 10; i++) {
				saleInfo.setLottoNumber(number+String.valueOf(i));
				saleDBImplement.addSale(saleInfo);
			}
		}
		// *5 05,15,25,35,45,55,65,75,85,95
		if (Pattern.matches("\\*\\d{1}", number) && Pattern.matches("\\d{1,6}", price)) {
			saleInfo.setType("3");
			for (int i = 0; i < 10; i++) {
				saleInfo.setLottoNumber(String.valueOf(i)+number);
				saleDBImplement.addSale(saleInfo);
			}
		}
		// *5* 5**
		if ((Pattern.matches("\\*\\d{1}\\*", number) || Pattern.matches("\\d{1}\\*\\*", number))
				&& Pattern.matches("\\d{1,6}", price)) {
			saleInfo.setType("3");
			for (int i = 0; i < 10; i++) {
				saleInfo.setLottoNumber(number+String.valueOf(i));
				saleDBImplement.addSale(saleInfo);
			}
			for (int i = 0; i < 10; i++) {
				saleInfo.setLottoNumber(String.valueOf(i)+number);
				saleDBImplement.addSale(saleInfo);
			}
		}
	}
}
