//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.view;

import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import org.h2.util.StringUtils;

import baslotto.database.CustomerDBImplement;
import baslotto.database.OwnerDBImplement;
import baslotto.entity.CustomerInfo;
import baslotto.entity.OwnerInfo;
import baslotto.view.popup.NullPopup;
import baslotto.view.popup.UpdateCustomerPopup;
import baslotto.view.popup.WarningPopup;

public class CustomerPanel extends JPanel {
	private JTable table;
	private JTextField textField;
	private JFormattedTextField textField_1;
	private JFormattedTextField textField_2;
	private JFormattedTextField textField_3;
	private JFormattedTextField textField_4;
	private JFormattedTextField textField_5;
	private JFormattedTextField textField_6;
	private JFormattedTextField textField_1_1;
	private JFormattedTextField textField_2_1;
	private JFormattedTextField textField_3_1;
	private JFormattedTextField textField_4_1;
	private JFormattedTextField textField_5_1;
	private JFormattedTextField textField_6_1;
	private JButton button_4;
	private DefaultTableModel model;
	private CustomerDBImplement customerDB;
	private OwnerDBImplement ownerDBImplement;
	private MaskFormatter numberThree = null;

	public CustomerPanel() {
		setBounds(100, 100, 1280, 670);
		setLayout((LayoutManager) null);
		customerDB = new CustomerDBImplement();
		ownerDBImplement = new OwnerDBImplement();
		setLayout(null);
		JLabel label = new JLabel("Panel 1");
		label.setHorizontalAlignment(0);
		label.setFont(new Font("Tahoma", 0, 20));
		label.setBounds(50, 101, 187, 31);
		add(label);
		MaskFormatter numberTwo = null;

		try {
			numberTwo = new MaskFormatter("##");
			numberTwo.setPlaceholderCharacter('_');
			numberThree = new MaskFormatter("##");
		} catch (Exception var28) {
			var28.printStackTrace();
		}

		JButton btnNewButton = new JButton("เพิ่ม");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isCustomerTextNotNull()) {
					CustomerInfo customerInfo = new CustomerInfo();
					customerInfo.setName(textField.getText());
					customerInfo.setThreeTopPer(textField_1.getText());
					customerInfo.setThreeTodPer(textField_2.getText());
					customerInfo.setTwoTopPer(textField_3.getText());
					customerInfo.setTwoBotPer(textField_4.getText());
					customerInfo.setRunTopPer(textField_5.getText());
					customerInfo.setRunBotPer(textField_6.getText());
					customerInfo.setThreeTop(textField_1_1.getText());
					customerInfo.setThreeTod(textField_2_1.getText());
					customerInfo.setTwoTop(textField_3_1.getText());
					customerInfo.setTwoBot(textField_4_1.getText());
					customerInfo.setRunTop(textField_5_1.getText());
					customerInfo.setRunBot(textField_6_1.getText());
					customerDB.addCustomer(customerInfo);
					int i = model.getRowCount();
					model.addRow(new Object[0]);
					model.setValueAt(customerDB.getIdCustomer(customerInfo.getName()), i, 0);
					model.setValueAt(textField.getText(), i, 1);
					model.setValueAt(textField.getText(), i, 1);
					model.setValueAt(textField_1.getText(), i, 2);
					model.setValueAt(textField_2.getText(), i, 3);
					model.setValueAt(textField_3.getText(), i, 4);
					model.setValueAt(textField_4.getText(), i, 5);
					model.setValueAt(textField_5.getText(), i, 6);
					model.setValueAt(textField_6.getText(), i, 7);
					model.setValueAt(textField_1_1.getText(), i, 8);
					model.setValueAt(textField_2_1.getText(), i, 9);
					model.setValueAt(textField_3_1.getText(), i, 10);
					model.setValueAt(textField_4_1.getText(), i, 11);
					model.setValueAt(textField_5_1.getText(), i, 12);
					model.setValueAt(textField_6_1.getText(), i, 13);
				} else {
					NullPopup nullPopup = new NullPopup("ใส่ข้อมูลลูกค้าไม่ครบ");
					nullPopup.setModal(true);
					nullPopup.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(306, 578, 130, 44);
		add(btnNewButton);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(306, 60, 947, 484);
		add(scrollPane);
		table = new JTable();
		table.setSelectionMode(0);
		scrollPane.setViewportView(table);
		JLabel lblNewLabel = new JLabel("ชื่อลูกค้า");
		lblNewLabel.setBounds(16, 193, 61, 16);
		add(lblNewLabel);
		textField = new JTextField();
		textField.setBounds(83, 188, 130, 26);
		add(textField);
		textField.setColumns(10);
		JLabel label_1 = new JLabel("อัตราการจ่ายและเปอรเซ็น ");
		label_1.setBounds(16, 273, 187, 16);
		add(label_1);
		JLabel lblNewLabel_1 = new JLabel("3 เต็ง");
		lblNewLabel_1.setBounds(16, 317, 61, 16);
		add(lblNewLabel_1);
		JLabel label_2 = new JLabel("3 ตัวโต๊ด");
		label_2.setBounds(16, 345, 61, 16);
		add(label_2);
		JLabel label_3 = new JLabel("2 ตัวบน");
		label_3.setBounds(16, 373, 61, 16);
		add(label_3);
		JLabel label_4 = new JLabel("2 ตัวล่าง");
		label_4.setBounds(16, 401, 61, 16);
		add(label_4);
		JLabel label_5 = new JLabel("วิ่งบน");
		label_5.setBounds(16, 429, 61, 16);
		add(label_5);
		JLabel label_6 = new JLabel("วิ่งล่าง");
		label_6.setBounds(16, 457, 61, 16);
		add(label_6);
		textField_1 = new JFormattedTextField(numberThree);
		textField_1.setBounds(83, 312, 70, 26);
		add(textField_1);
		textField_2 = new JFormattedTextField(numberThree);
		textField_2.setBounds(83, 340, 70, 26);
		add(textField_2);
		textField_3 = new JFormattedTextField(numberThree);
		textField_3.setBounds(83, 368, 70, 26);
		add(textField_3);
		textField_4 = new JFormattedTextField(numberThree);
		textField_4.setBounds(83, 396, 70, 26);
		add(textField_4);
		textField_5 = new JFormattedTextField(numberThree);
		textField_5.setBounds(83, 424, 70, 26);
		add(textField_5);
		textField_6 = new JFormattedTextField(numberThree);
		textField_6.setBounds(83, 452, 70, 26);
		add(textField_6);
		textField_3_1 = new JFormattedTextField();
		textField_3_1.setBounds(188, 368, 70, 26);
		add(textField_3_1);
		textField_6_1 = new JFormattedTextField();
		textField_6_1.setBounds(188, 452, 70, 26);
		add(textField_6_1);
		textField_5_1 = new JFormattedTextField();
		textField_5_1.setBounds(188, 424, 70, 26);
		add(textField_5_1);
		textField_4_1 = new JFormattedTextField();
		textField_4_1.setBounds(188, 396, 70, 26);
		add(textField_4_1);
		textField_1_1 = new JFormattedTextField();
		textField_1_1.setBounds(188, 312, 70, 26);
		add(textField_1_1);
		textField_2_1 = new JFormattedTextField();
		textField_2_1.setBounds(188, 340, 70, 26);
		add(textField_2_1);
		button_4 = new JButton("จบการทำรายการ");
		button_4.setBounds(1075, 578, 178, 70);
		add(button_4);
		JButton button = new JButton("แก้ไข");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectRow = table.getSelectedRow();
				if (selectRow >= 0) {
					CustomerInfo customerInfoUpdate = new CustomerInfo();
					customerInfoUpdate.setName(model.getValueAt(table.getSelectedRow(), 1).toString());
					customerInfoUpdate.setThreeTopPer(model.getValueAt(table.getSelectedRow(), 2).toString());
					customerInfoUpdate.setThreeTodPer(model.getValueAt(table.getSelectedRow(), 3).toString());
					customerInfoUpdate.setTwoTopPer(model.getValueAt(table.getSelectedRow(), 4).toString());
					customerInfoUpdate.setTwoBotPer(model.getValueAt(table.getSelectedRow(), 5).toString());
					customerInfoUpdate.setRunTopPer(model.getValueAt(table.getSelectedRow(), 6).toString());
					customerInfoUpdate.setRunBotPer(model.getValueAt(table.getSelectedRow(), 7).toString());
					customerInfoUpdate.setThreeTop(model.getValueAt(table.getSelectedRow(), 8).toString());
					customerInfoUpdate.setThreeTod(model.getValueAt(table.getSelectedRow(), 9).toString());
					customerInfoUpdate.setTwoTop(model.getValueAt(table.getSelectedRow(), 10).toString());
					customerInfoUpdate.setTwoBot(model.getValueAt(table.getSelectedRow(), 11).toString());
					customerInfoUpdate.setRunTop(model.getValueAt(table.getSelectedRow(), 12).toString());
					customerInfoUpdate.setRunBot(model.getValueAt(table.getSelectedRow(), 13).toString());
					UpdateCustomerPopup updateCustomerPopup = new UpdateCustomerPopup(customerInfoUpdate);
					updateCustomerPopup.setModal(true);
					updateCustomerPopup.setVisible(true);
					setDataTable();
				} else {
					NullPopup nullPopup = new NullPopup("ยังไม่ได้เลือกลูกค้า");
					nullPopup.setModal(true);
					nullPopup.setVisible(true);
				}
			}
		});
		button.setBounds(448, 578, 130, 44);
		add(button);
		JButton button_1 = new JButton("ลบ");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectRow = table.getSelectedRow();
				if (selectRow >= 0) {
					WarningPopup warningPopup = new WarningPopup("ต้องการลบข้อมูลลูกค้า ?");
					warningPopup.setModal(true);
					warningPopup.setVisible(true);
					if (warningPopup.isPositive()) {
						customerDB.removeCustomer(model.getValueAt(table.getSelectedRow(), 1).toString());
						setDataTable();
					}
					warningPopup.dispose();

				} else {
					NullPopup nullPopup = new NullPopup("ยังไม่ได้เลือกลูกค้า");
					nullPopup.setModal(true);
					nullPopup.setVisible(true);
				}
			}
		});
		button_1.setBounds(590, 578, 130, 44);
		add(button_1);
		JLabel label_10 = new JLabel("%");
		label_10.setBounds(165, 317, 9, 16);
		add(label_10);
		JLabel label_11 = new JLabel("%");
		label_11.setBounds(165, 345, 9, 16);
		add(label_11);
		JLabel label_12 = new JLabel("%");
		label_12.setBounds(165, 373, 9, 16);
		add(label_12);
		JLabel label_13 = new JLabel("%");
		label_13.setBounds(165, 401, 9, 16);
		add(label_13);
		JLabel label_14 = new JLabel("%");
		label_14.setBounds(165, 429, 9, 16);
		add(label_14);
		JLabel label_15 = new JLabel("%");
		label_15.setBounds(165, 457, 9, 16);
		add(label_15);
		final JCheckBox checkBox = new JCheckBox("ใช้ข้อมูลเจ้ามือ");
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OwnerInfo ownerInfo = ownerDBImplement.getOwner();
				if (ownerInfo == null) {
					NullPopup nullOwnerInfoPopup = new NullPopup("ยังไม่มีข้อมูลเจ้ามือ");
					nullOwnerInfoPopup.setModal(true);
					nullOwnerInfoPopup.setVisible(true);
					checkBox.setSelected(false);
				} else {
					if (checkBox.isSelected()) {
						textField_1.setEditable(false);
						textField_2.setEditable(false);
						textField_3.setEditable(false);
						textField_4.setEditable(false);
						textField_5.setEditable(false);
						textField_6.setEditable(false);
						textField_1_1.setEditable(false);
						textField_2_1.setEditable(false);
						textField_3_1.setEditable(false);
						textField_4_1.setEditable(false);
						textField_5_1.setEditable(false);
						textField_6_1.setEditable(false);
						textField_1.setText(ownerInfo.getThreeTopPer());
						textField_2.setText(ownerInfo.getThreeTodPer());
						textField_3.setText(ownerInfo.getTwoTopPer());
						textField_4.setText(ownerInfo.getTwoBotPer());
						textField_5.setText(ownerInfo.getRunTopPer());
						textField_6.setText(ownerInfo.getRunBotPer());
						textField_1_1.setText(ownerInfo.getThreeTop());
						textField_2_1.setText(ownerInfo.getThreeTod());
						textField_3_1.setText(ownerInfo.getTwoTop());
						textField_4_1.setText(ownerInfo.getTwoBot());
						textField_5_1.setText(ownerInfo.getRunTop());
						textField_6_1.setText(ownerInfo.getRunBot());
						System.out.println("select");
						System.out.println(ownerInfo.getThreeTopPer());
					}

					if (!checkBox.isSelected()) {
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
						textField_1_1.setText("");
						textField_2_1.setText("");
						textField_3_1.setText("");
						textField_4_1.setText("");
						textField_5_1.setText("");
						textField_6_1.setText("");
						textField_1.setEditable(true);
						textField_2.setEditable(true);
						textField_3.setEditable(true);
						textField_4.setEditable(true);
						textField_5.setEditable(true);
						textField_6.setEditable(true);
						textField_1_1.setEditable(true);
						textField_2_1.setEditable(true);
						textField_3_1.setEditable(true);
						textField_4_1.setEditable(true);
						textField_5_1.setEditable(true);
						textField_6_1.setEditable(true);
						System.out.println("not select");
					}
				}
			}
		});
		checkBox.setBounds(16, 503, 128, 23);
		add(checkBox);
		setDataTable();
	}

	public void setDataTable() {
		model = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				// Only the third column
				return false;
			}
		};
		table.setModel(model);
		setColumnTable();
		setRowTable();
	}

	public void setColumnTable() {
		model.addColumn("ลำดับ");
		model.addColumn("ชื่อลูกค้า");
		model.addColumn("%3ตัวเต็ง");
		model.addColumn("%3ตัวโต๊ด");
		model.addColumn("%2ตัวบน");
		model.addColumn("%2ตัวล่าง");
		model.addColumn("%1วิ่งบน");
		model.addColumn("%1วิ่งล่าง");
		model.addColumn("3เต็ง");
		model.addColumn("3โต๊ด");
		model.addColumn("2บน");
		model.addColumn("2ล่าง");
		model.addColumn("1วิ่งบน");
		model.addColumn("1วิ่งล่าง");
	}

	public void setRowTable() {
		List<CustomerInfo> customerInfoList = customerDB.getCustomer();
		int i = 0;

		for (CustomerInfo customerInfo : customerInfoList) {
			model.addRow(new Object[0]);
			model.setValueAt(i + 1, i, 0);
			model.setValueAt(customerInfo.getName(), i, 1);
			model.setValueAt(customerInfo.getThreeTopPer(), i, 2);
			model.setValueAt(customerInfo.getThreeTodPer(), i, 3);
			model.setValueAt(customerInfo.getTwoTopPer(), i, 4);
			model.setValueAt(customerInfo.getTwoBotPer(), i, 5);
			model.setValueAt(customerInfo.getRunTopPer(), i, 6);
			model.setValueAt(customerInfo.getRunBotPer(), i, 7);
			model.setValueAt(customerInfo.getThreeTop(), i, 8);
			model.setValueAt(customerInfo.getThreeTod(), i, 9);
			model.setValueAt(customerInfo.getTwoTop(), i, 10);
			model.setValueAt(customerInfo.getTwoBot(), i, 11);
			model.setValueAt(customerInfo.getRunTop(), i, 12);
			model.setValueAt(customerInfo.getRunBot(), i, 13);
			i++;
		}
	}

	public boolean isCustomerTextNotNull() {
		if (StringUtils.isNullOrEmpty(textField.getText())) {
			return false;
		}
		if (StringUtils.isNullOrEmpty(textField_1.getText())) {
			return false;
		}
		if (StringUtils.isNullOrEmpty(textField_2.getText())) {
			return false;
		}
		if (StringUtils.isNullOrEmpty(textField_3.getText())) {
			return false;
		}
		if (StringUtils.isNullOrEmpty(textField_4.getText())) {
			return false;
		}
		if (StringUtils.isNullOrEmpty(textField_5.getText())) {
			return false;
		}
		if (StringUtils.isNullOrEmpty(textField_6.getText())) {
			return false;
		}
		if (StringUtils.isNullOrEmpty(textField_1_1.getText())) {
			return false;
		}
		if (StringUtils.isNullOrEmpty(textField_2_1.getText())) {
			return false;
		}
		if (StringUtils.isNullOrEmpty(textField_3_1.getText())) {
			return false;
		}
		if (StringUtils.isNullOrEmpty(textField_4_1.getText())) {
			return false;
		}
		if (StringUtils.isNullOrEmpty(textField_5_1.getText())) {
			return false;
		}
		if (StringUtils.isNullOrEmpty(textField_6_1.getText())) {
			return false;
		}
		return true;
	}
}
