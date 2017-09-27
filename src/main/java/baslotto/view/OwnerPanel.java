//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.view;

import baslotto.database.OwnerDB;
import baslotto.database.OwnerDBImplement;
import baslotto.entity.OwnerInfo;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
        this.setBounds(100, 100, 1280, 670);
        this.setLayout((LayoutManager)null);
        this.setBounds(100, 100, 1280, 670);
        this.setLayout((LayoutManager)null);
        JLabel label_1 = new JLabel("อัตราการจ่ายและเปอรเซ็น ");
        label_1.setBounds(341, 49, 610, 46);
        this.add(label_1);
        JLabel lblNewLabel_1 = new JLabel("3 เต็ง");
        lblNewLabel_1.setBounds(339, 119, 125, 40);
        this.add(lblNewLabel_1);
        this.textField_1 = new JTextField();
        this.textField_1.setEditable(false);
        this.textField_1.setBounds(492, 119, 125, 40);
        this.add(this.textField_1);
        this.textField_1.setColumns(10);
        this.button_4 = new JButton("จบการทำรายการ");
        this.button_4.setBounds(1075, 578, 178, 70);
        this.add(this.button_4);
        JLabel label_10 = new JLabel("%");
        label_10.setBounds(652, 119, 16, 40);
        this.add(label_10);
        this.textField = new JTextField();
        this.textField.setFont(new Font("Lucida Grande", 0, 13));
        this.textField.setEditable(false);
        this.textField.setColumns(10);
        this.textField.setBounds(693, 119, 125, 40);
        this.add(this.textField);
        JLabel label = new JLabel("3ตัวโต๊ด");
        label.setBounds(339, 179, 125, 40);
        this.add(label);
        this.textField_2 = new JTextField();
        this.textField_2.setFont(new Font("Lucida Grande", 0, 13));
        this.textField_2.setEditable(false);
        this.textField_2.setColumns(10);
        this.textField_2.setBounds(492, 179, 125, 40);
        this.add(this.textField_2);
        JLabel label_2 = new JLabel("%");
        label_2.setBounds(652, 179, 16, 40);
        this.add(label_2);
        this.textField_3 = new JTextField();
        this.textField_3.setFont(new Font("Lucida Grande", 0, 13));
        this.textField_3.setEditable(false);
        this.textField_3.setColumns(10);
        this.textField_3.setBounds(693, 179, 125, 40);
        this.add(this.textField_3);
        JLabel label_3 = new JLabel("2ตัวบน");
        label_3.setBounds(341, 239, 125, 40);
        this.add(label_3);
        this.textField_4 = new JTextField();
        this.textField_4.setFont(new Font("Lucida Grande", 0, 13));
        this.textField_4.setEditable(false);
        this.textField_4.setColumns(10);
        this.textField_4.setBounds(492, 239, 125, 40);
        this.add(this.textField_4);
        JLabel label_4 = new JLabel("%");
        label_4.setBounds(652, 239, 16, 40);
        this.add(label_4);
        this.textField_5 = new JTextField();
        this.textField_5.setFont(new Font("Lucida Grande", 0, 13));
        this.textField_5.setEditable(false);
        this.textField_5.setColumns(10);
        this.textField_5.setBounds(693, 239, 125, 40);
        this.add(this.textField_5);
        JLabel label_5 = new JLabel("2ตัวล่าง");
        label_5.setBounds(341, 299, 125, 40);
        this.add(label_5);
        this.textField_6 = new JTextField();
        this.textField_6.setFont(new Font("Lucida Grande", 0, 13));
        this.textField_6.setEditable(false);
        this.textField_6.setColumns(10);
        this.textField_6.setBounds(492, 299, 125, 40);
        this.add(this.textField_6);
        JLabel label_6 = new JLabel("%");
        label_6.setBounds(652, 299, 16, 40);
        this.add(label_6);
        this.textField_7 = new JTextField();
        this.textField_7.setFont(new Font("Lucida Grande", 0, 13));
        this.textField_7.setEditable(false);
        this.textField_7.setColumns(10);
        this.textField_7.setBounds(693, 299, 125, 40);
        this.add(this.textField_7);
        JLabel label_7 = new JLabel("วิ่งบน");
        label_7.setBounds(341, 359, 125, 40);
        this.add(label_7);
        this.textField_8 = new JTextField();
        this.textField_8.setFont(new Font("Lucida Grande", 0, 13));
        this.textField_8.setEditable(false);
        this.textField_8.setColumns(10);
        this.textField_8.setBounds(492, 359, 125, 40);
        this.add(this.textField_8);
        JLabel label_8 = new JLabel("%");
        label_8.setBounds(652, 359, 16, 40);
        this.add(label_8);
        this.textField_9 = new JTextField();
        this.textField_9.setFont(new Font("Lucida Grande", 0, 13));
        this.textField_9.setEditable(false);
        this.textField_9.setColumns(10);
        this.textField_9.setBounds(693, 359, 125, 40);
        this.add(this.textField_9);
        JLabel label_9 = new JLabel("วิ่งล่าง");
        label_9.setBounds(341, 419, 125, 40);
        this.add(label_9);
        this.textField_10 = new JTextField();
        this.textField_10.setFont(new Font("Lucida Grande", 0, 13));
        this.textField_10.setEditable(false);
        this.textField_10.setColumns(10);
        this.textField_10.setBounds(492, 419, 125, 40);
        this.add(this.textField_10);
        JLabel label_11 = new JLabel("%");
        label_11.setBounds(652, 419, 16, 40);
        this.add(label_11);
        this.textField_11 = new JTextField();
        this.textField_11.setFont(new Font("Lucida Grande", 0, 13));
        this.textField_11.setEditable(false);
        this.textField_11.setColumns(10);
        this.textField_11.setBounds(693, 419, 125, 40);
        this.add(this.textField_11);
        JButton button = new JButton("บันทึก");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OwnerInfo ownerInfo = new OwnerInfo();
                ownerInfo.setThreeTopPer(OwnerPanel.this.textField_1.getText());
                ownerInfo.setThreeTodPer(OwnerPanel.this.textField_2.getText());
                ownerInfo.setTwoTopPer(OwnerPanel.this.textField_4.getText());
                ownerInfo.setTwoBotPer(OwnerPanel.this.textField_6.getText());
                ownerInfo.setRunTopPer(OwnerPanel.this.textField_8.getText());
                ownerInfo.setRunBotPer(OwnerPanel.this.textField_10.getText());
                ownerInfo.setThreeTop(OwnerPanel.this.textField.getText());
                ownerInfo.setThreeTod(OwnerPanel.this.textField_3.getText());
                ownerInfo.setTwoTop(OwnerPanel.this.textField_5.getText());
                ownerInfo.setTwoBot(OwnerPanel.this.textField_7.getText());
                ownerInfo.setRunTop(OwnerPanel.this.textField_9.getText());
                ownerInfo.setRunBot(OwnerPanel.this.textField_11.getText());
                OwnerPanel.this.ownerDB.addOwner(ownerInfo);
            }
        });
        button.setBounds(386, 535, 158, 70);
        this.add(button);
        JButton button_1 = new JButton("แก้ไข");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OwnerPanel.this.textField_1.setEditable(true);
                OwnerPanel.this.textField_2.setEditable(true);
                OwnerPanel.this.textField_4.setEditable(true);
                OwnerPanel.this.textField_6.setEditable(true);
                OwnerPanel.this.textField_8.setEditable(true);
                OwnerPanel.this.textField_10.setEditable(true);
                OwnerPanel.this.textField.setEditable(true);
                OwnerPanel.this.textField_3.setEditable(true);
                OwnerPanel.this.textField_5.setEditable(true);
                OwnerPanel.this.textField_7.setEditable(true);
                OwnerPanel.this.textField_9.setEditable(true);
                OwnerPanel.this.textField_11.setEditable(true);
            }
        });
        button_1.setBounds(575, 535, 158, 70);
        this.add(button_1);
        JButton button_2 = new JButton("ล้างค่า");
        button_2.setBounds(765, 535, 158, 70);
        this.add(button_2);
        OwnerInfo ownerInfo = this.ownerDB.getOwner();
        if (ownerInfo != null) {
            this.textField_1.setText(ownerInfo.getThreeTopPer());
            this.textField_2.setText(ownerInfo.getThreeTodPer());
            this.textField_4.setText(ownerInfo.getTwoTopPer());
            this.textField_6.setText(ownerInfo.getTwoBotPer());
            this.textField_8.setText(ownerInfo.getRunTopPer());
            this.textField_10.setText(ownerInfo.getRunBotPer());
            this.textField.setText(ownerInfo.getThreeTop());
            this.textField_3.setText(ownerInfo.getThreeTod());
            this.textField_5.setText(ownerInfo.getTwoTop());
            this.textField_7.setText(ownerInfo.getTwoBot());
            this.textField_9.setText(ownerInfo.getRunTop());
            this.textField_11.setText(ownerInfo.getRunBot());
        }

    }
}
