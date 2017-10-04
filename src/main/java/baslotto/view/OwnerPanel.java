//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.view;

import baslotto.database.OwnerDB;
import baslotto.database.OwnerDBImplement;
import baslotto.entity.OwnerInfo;
import baslotto.view.popup.NullPopup;

import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;

public class OwnerPanel extends JPanel {
	private JTextField textField_1;
	private JButton button_4;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private OwnerDB ownerDB = new OwnerDBImplement();

	public OwnerPanel() {
		setBounds(100, 100, 1280, 670);
		setLayout((LayoutManager) null);
		setBounds(100, 100, 1280, 670);
		setLayout((LayoutManager) null);
		JLabel label_1 = new JLabel("อัตราการจ่ายและเปอรเซ็น ");
		label_1.setBounds(341, 49, 610, 46);
		add(label_1);
		JLabel lblNewLabel_1 = new JLabel("3 เต็ง");
		lblNewLabel_1.setBounds(339, 119, 125, 40);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setEditable(false);
		textField_1.setBounds(492, 119, 125, 40);
		add(textField_1);
		textField_1.setColumns(10);
		
		button_4 = new JButton("จบการทำรายการ");
		button_4.setBounds(1075, 578, 178, 70);
		add(button_4);
		JLabel label_10 = new JLabel("%");
		label_10.setBounds(652, 119, 16, 40);
		add(label_10);
		textField = new JTextField();
		
		textField.setFont(new Font("Lucida Grande", 0, 13));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(693, 119, 125, 40);
		add(textField);
		
		JLabel label = new JLabel("3ตัวโต๊ด");
		label.setBounds(339, 179, 125, 40);
		add(label);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Lucida Grande", 0, 13));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(492, 179, 125, 40);
		add(textField_2);
		
		JLabel label_2 = new JLabel("%");
		label_2.setBounds(652, 179, 16, 40);
		add(label_2);
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Lucida Grande", 0, 13));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(693, 179, 125, 40);
		add(textField_3);
		
		JLabel label_3 = new JLabel("2ตัวบน");
		label_3.setBounds(341, 239, 125, 40);
		add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Lucida Grande", 0, 13));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(492, 239, 125, 40);
		add(textField_4);
		
		JLabel label_4 = new JLabel("%");
		label_4.setBounds(652, 239, 16, 40);
		add(label_4);
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Lucida Grande", 0, 13));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(693, 239, 125, 40);
		add(textField_5);
		
		JLabel label_5 = new JLabel("2ตัวล่าง");
		label_5.setBounds(341, 299, 125, 40);
		add(label_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Lucida Grande", 0, 13));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(492, 299, 125, 40);
		add(textField_6);
		
		JLabel label_6 = new JLabel("%");
		label_6.setBounds(652, 299, 16, 40);
		add(label_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Lucida Grande", 0, 13));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(693, 299, 125, 40);
		add(textField_7);
		
		JLabel label_7 = new JLabel("วิ่งบน");
		label_7.setBounds(341, 359, 125, 40);
		add(label_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Lucida Grande", 0, 13));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(492, 359, 125, 40);
		add(textField_8);
		
		JLabel label_8 = new JLabel("%");
		label_8.setBounds(652, 359, 16, 40);
		add(label_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Lucida Grande", 0, 13));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(693, 359, 125, 40);
		add(textField_9);
		
		JLabel label_9 = new JLabel("วิ่งล่าง");
		label_9.setBounds(341, 419, 125, 40);
		add(label_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Lucida Grande", 0, 13));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(492, 419, 125, 40);
		add(textField_10);
		
		JLabel label_11 = new JLabel("%");
		label_11.setBounds(652, 419, 16, 40);
		add(label_11);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Lucida Grande", 0, 13));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(693, 419, 125, 40);
		add(textField_11);
		
		JButton button = new JButton("บันทึก");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean allTextIsNull = true;
				if (textField_1.getText().isEmpty() && textField_2.getText().isEmpty()
						&& textField_2.getText().isEmpty() && textField_3.getText().isEmpty()
						&& textField_4.getText().isEmpty() && textField_5.getText().isEmpty()
						&& textField_6.getText().isEmpty() && textField_7.getText().isEmpty()
						&& textField_8.getText().isEmpty() && textField_9.getText().isEmpty()
						&& textField_10.getText().isEmpty() && textField_11.getText().isEmpty()
						&& textField.getText().isEmpty()) {
					NullPopup nullPopup = new NullPopup("กดแก้ไข และ ใส่ข้อมูลให้ครบ");
					nullPopup.setModal(true);
					nullPopup.setVisible(true);
					allTextIsNull = false;
				}
				if (allTextIsNull && (textField_1.getText().isEmpty() || textField_2.getText().isEmpty()
						|| textField_2.getText().isEmpty() || textField_3.getText().isEmpty()
						|| textField_4.getText().isEmpty() || textField_5.getText().isEmpty()
						|| textField_6.getText().isEmpty() || textField_7.getText().isEmpty()
						|| textField_8.getText().isEmpty() || textField_9.getText().isEmpty()
						|| textField_10.getText().isEmpty() || textField_11.getText().isEmpty()
						|| textField.getText().isEmpty())) {
					NullPopup nullPopup = new NullPopup("ยังใส่ข้อมูลไม่ครบ");
					nullPopup.setModal(true);
					nullPopup.setVisible(true);
				} else {
					OwnerInfo ownerInfo = new OwnerInfo();
					ownerInfo.setThreeTopPer(textField_1.getText());
					ownerInfo.setThreeTodPer(textField_2.getText());
					ownerInfo.setTwoTopPer(textField_4.getText());
					ownerInfo.setTwoBotPer(textField_6.getText());
					ownerInfo.setRunTopPer(textField_8.getText());
					ownerInfo.setRunBotPer(textField_10.getText());
					ownerInfo.setThreeTop(textField.getText());
					ownerInfo.setThreeTod(textField_3.getText());
					ownerInfo.setTwoTop(textField_5.getText());
					ownerInfo.setTwoBot(textField_7.getText());
					ownerInfo.setRunTop(textField_9.getText());
					ownerInfo.setRunBot(textField_11.getText());
					ownerDB.addOwner(ownerInfo);
				}
			}
		});
		button.setBounds(386, 535, 158, 70);
		add(button);
		
		JButton button_1 = new JButton("แก้ไข");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_4.setEditable(true);
				textField_6.setEditable(true);
				textField_8.setEditable(true);
				textField_10.setEditable(true);
				textField.setEditable(true);
				textField_3.setEditable(true);
				textField_5.setEditable(true);
				textField_7.setEditable(true);
				textField_9.setEditable(true);
				textField_11.setEditable(true);
			}
		});
		button_1.setBounds(575, 535, 158, 70);
		add(button_1);
		
		JButton button_2 = new JButton("ล้างค่า");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				textField_2.setText("");
				textField_4.setText("");
				textField_6.setText("");
				textField_8.setText("");
				textField_10.setText("");
				textField.setText("");
				textField_3.setText("");
				textField_5.setText("");
				textField_7.setText("");
				textField_9.setText("");
				textField_11.setText("");
			}
		});
		
		button_2.setBounds(765, 535, 158, 70);
		add(button_2);
		OwnerInfo ownerInfo = ownerDB.getOwner();
		if (ownerInfo != null) {
			textField_1.setText(ownerInfo.getThreeTopPer());
			textField_2.setText(ownerInfo.getThreeTodPer());
			textField_4.setText(ownerInfo.getTwoTopPer());
			textField_6.setText(ownerInfo.getTwoBotPer());
			textField_8.setText(ownerInfo.getRunTopPer());
			textField_10.setText(ownerInfo.getRunBotPer());
			textField.setText(ownerInfo.getThreeTop());
			textField_3.setText(ownerInfo.getThreeTod());
			textField_5.setText(ownerInfo.getTwoTop());
			textField_7.setText(ownerInfo.getTwoBot());
			textField_9.setText(ownerInfo.getRunTop());
			textField_11.setText(ownerInfo.getRunBot());
		}

	}
}
