//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.view;

import baslotto.database.CustomerDBImplement;
import baslotto.database.OwnerDBImplement;
import baslotto.entity.CustomerInfo;
import baslotto.entity.OwnerInfo;
import baslotto.view.popup.ErrorPopup;
import baslotto.view.popup.UpdateCustomerPopup;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
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
        this.setBounds(100, 100, 1280, 670);
        this.setLayout((LayoutManager)null);
        this.customerDB = new CustomerDBImplement();
        this.ownerDBImplement = new OwnerDBImplement();
        JLabel label = new JLabel("Panel 1");
        label.setHorizontalAlignment(0);
        label.setFont(new Font("Tahoma", 0, 20));
        label.setBounds(50, 101, 187, 31);
        this.add(label);
        MaskFormatter numberTwo = null;

        try {
            numberTwo = new MaskFormatter("##");
            numberTwo.setPlaceholderCharacter('_');
            this.numberThree = new MaskFormatter("##");
        } catch (Exception var28) {
            var28.printStackTrace();
        }

        JButton btnNewButton = new JButton("เพิ่ม");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CustomerInfo customerInfo = new CustomerInfo();
                customerInfo.setName(CustomerPanel.this.textField.getText());
                customerInfo.setThreeTopPer(CustomerPanel.this.textField_1.getText());
                customerInfo.setThreeTodPer(CustomerPanel.this.textField_2.getText());
                customerInfo.setTwoTopPer(CustomerPanel.this.textField_3.getText());
                customerInfo.setTwoBotPer(CustomerPanel.this.textField_4.getText());
                customerInfo.setRunTopPer(CustomerPanel.this.textField_5.getText());
                customerInfo.setRunBotPer(CustomerPanel.this.textField_6.getText());
                customerInfo.setThreeTop(CustomerPanel.this.textField_1_1.getText());
                customerInfo.setThreeTod(CustomerPanel.this.textField_2_1.getText());
                customerInfo.setTwoTop(CustomerPanel.this.textField_3_1.getText());
                customerInfo.setTwoBot(CustomerPanel.this.textField_4_1.getText());
                customerInfo.setRunTop(CustomerPanel.this.textField_5_1.getText());
                customerInfo.setRunBot(CustomerPanel.this.textField_6_1.getText());
                CustomerPanel.this.customerDB.addCustomer(customerInfo);
                int i = CustomerPanel.this.model.getRowCount();
                CustomerPanel.this.model.addRow(new Object[0]);
                CustomerPanel.this.model.setValueAt(CustomerPanel.this.customerDB.getIdCustomer(customerInfo.getName()), i, 0);
                CustomerPanel.this.model.setValueAt(CustomerPanel.this.textField.getText(), i, 1);
                CustomerPanel.this.model.setValueAt(CustomerPanel.this.textField.getText(), i, 1);
                CustomerPanel.this.model.setValueAt(CustomerPanel.this.textField_1.getText(), i, 2);
                CustomerPanel.this.model.setValueAt(CustomerPanel.this.textField_2.getText(), i, 3);
                CustomerPanel.this.model.setValueAt(CustomerPanel.this.textField_3.getText(), i, 4);
                CustomerPanel.this.model.setValueAt(CustomerPanel.this.textField_4.getText(), i, 5);
                CustomerPanel.this.model.setValueAt(CustomerPanel.this.textField_5.getText(), i, 6);
                CustomerPanel.this.model.setValueAt(CustomerPanel.this.textField_6.getText(), i, 7);
                CustomerPanel.this.model.setValueAt(CustomerPanel.this.textField_1_1.getText(), i, 8);
                CustomerPanel.this.model.setValueAt(CustomerPanel.this.textField_2_1.getText(), i, 9);
                CustomerPanel.this.model.setValueAt(CustomerPanel.this.textField_3_1.getText(), i, 10);
                CustomerPanel.this.model.setValueAt(CustomerPanel.this.textField_4_1.getText(), i, 11);
                CustomerPanel.this.model.setValueAt(CustomerPanel.this.textField_5_1.getText(), i, 12);
                CustomerPanel.this.model.setValueAt(CustomerPanel.this.textField_6_1.getText(), i, 13);
                ErrorPopup errorPopup = new ErrorPopup();
                errorPopup.setModal(true);
                errorPopup.setVisible(true);
            }
        });
        btnNewButton.setBounds(306, 578, 130, 44);
        this.add(btnNewButton);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(306, 60, 947, 484);
        this.add(scrollPane);
        this.table = new JTable();
        this.table.setSelectionMode(0);
        scrollPane.setViewportView(this.table);
        JLabel lblNewLabel = new JLabel("ชื่อลูกค้า");
        lblNewLabel.setBounds(16, 193, 61, 16);
        this.add(lblNewLabel);
        this.textField = new JTextField();
        this.textField.setBounds(83, 188, 130, 26);
        this.add(this.textField);
        this.textField.setColumns(10);
        JLabel label_1 = new JLabel("อัตราการจ่ายและเปอรเซ็น ");
        label_1.setBounds(16, 273, 187, 16);
        this.add(label_1);
        JLabel lblNewLabel_1 = new JLabel("3 เต็ง");
        lblNewLabel_1.setBounds(16, 317, 61, 16);
        this.add(lblNewLabel_1);
        JLabel label_2 = new JLabel("3 ตัวโต๊ด");
        label_2.setBounds(16, 345, 61, 16);
        this.add(label_2);
        JLabel label_3 = new JLabel("2 ตัวบน");
        label_3.setBounds(16, 373, 61, 16);
        this.add(label_3);
        JLabel label_4 = new JLabel("2 ตัวล่าง");
        label_4.setBounds(16, 401, 61, 16);
        this.add(label_4);
        JLabel label_5 = new JLabel("วิ่งบน");
        label_5.setBounds(16, 429, 61, 16);
        this.add(label_5);
        JLabel label_6 = new JLabel("วิ่งล่าง");
        label_6.setBounds(16, 457, 61, 16);
        this.add(label_6);
        this.textField_1 = new JFormattedTextField(this.numberThree);
        this.textField_1.setBounds(83, 312, 70, 26);
        this.add(this.textField_1);
        this.textField_2 = new JFormattedTextField(this.numberThree);
        this.textField_2.setBounds(83, 340, 70, 26);
        this.add(this.textField_2);
        this.textField_3 = new JFormattedTextField(this.numberThree);
        this.textField_3.setBounds(83, 368, 70, 26);
        this.add(this.textField_3);
        this.textField_4 = new JFormattedTextField(this.numberThree);
        this.textField_4.setBounds(83, 396, 70, 26);
        this.add(this.textField_4);
        this.textField_5 = new JFormattedTextField(this.numberThree);
        this.textField_5.setBounds(83, 424, 70, 26);
        this.add(this.textField_5);
        this.textField_6 = new JFormattedTextField(this.numberThree);
        this.textField_6.setBounds(83, 452, 70, 26);
        this.add(this.textField_6);
        this.textField_3_1 = new JFormattedTextField();
        this.textField_3_1.setBounds(188, 368, 70, 26);
        this.add(this.textField_3_1);
        this.textField_6_1 = new JFormattedTextField();
        this.textField_6_1.setBounds(188, 452, 70, 26);
        this.add(this.textField_6_1);
        this.textField_5_1 = new JFormattedTextField();
        this.textField_5_1.setBounds(188, 424, 70, 26);
        this.add(this.textField_5_1);
        this.textField_4_1 = new JFormattedTextField();
        this.textField_4_1.setBounds(188, 396, 70, 26);
        this.add(this.textField_4_1);
        this.textField_1_1 = new JFormattedTextField();
        this.textField_1_1.setBounds(188, 312, 70, 26);
        this.add(this.textField_1_1);
        this.textField_2_1 = new JFormattedTextField();
        this.textField_2_1.setBounds(188, 340, 70, 26);
        this.add(this.textField_2_1);
        this.button_4 = new JButton("จบการทำรายการ");
        this.button_4.setBounds(1075, 578, 178, 70);
        this.add(this.button_4);
        JButton button = new JButton("แก้ไข");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CustomerPanel.this.table.getSelectedRow();
                CustomerInfo customerInfoUpdate = new CustomerInfo();
                customerInfoUpdate.setName(CustomerPanel.this.model.getValueAt(CustomerPanel.this.table.getSelectedRow(), 1).toString());
                customerInfoUpdate.setThreeTopPer(CustomerPanel.this.model.getValueAt(CustomerPanel.this.table.getSelectedRow(), 2).toString());
                customerInfoUpdate.setThreeTodPer(CustomerPanel.this.model.getValueAt(CustomerPanel.this.table.getSelectedRow(), 3).toString());
                customerInfoUpdate.setTwoTopPer(CustomerPanel.this.model.getValueAt(CustomerPanel.this.table.getSelectedRow(), 4).toString());
                customerInfoUpdate.setTwoBotPer(CustomerPanel.this.model.getValueAt(CustomerPanel.this.table.getSelectedRow(), 5).toString());
                customerInfoUpdate.setRunTopPer(CustomerPanel.this.model.getValueAt(CustomerPanel.this.table.getSelectedRow(), 6).toString());
                customerInfoUpdate.setRunBotPer(CustomerPanel.this.model.getValueAt(CustomerPanel.this.table.getSelectedRow(), 7).toString());
                customerInfoUpdate.setThreeTop(CustomerPanel.this.model.getValueAt(CustomerPanel.this.table.getSelectedRow(), 8).toString());
                customerInfoUpdate.setThreeTod(CustomerPanel.this.model.getValueAt(CustomerPanel.this.table.getSelectedRow(), 9).toString());
                customerInfoUpdate.setTwoTop(CustomerPanel.this.model.getValueAt(CustomerPanel.this.table.getSelectedRow(), 10).toString());
                customerInfoUpdate.setTwoBot(CustomerPanel.this.model.getValueAt(CustomerPanel.this.table.getSelectedRow(), 11).toString());
                customerInfoUpdate.setRunTop(CustomerPanel.this.model.getValueAt(CustomerPanel.this.table.getSelectedRow(), 12).toString());
                customerInfoUpdate.setRunBot(CustomerPanel.this.model.getValueAt(CustomerPanel.this.table.getSelectedRow(), 13).toString());
                UpdateCustomerPopup updateCustomerPopup = new UpdateCustomerPopup(customerInfoUpdate);
                updateCustomerPopup.setModal(true);
                updateCustomerPopup.setVisible(true);
            }
        });
        button.setBounds(448, 578, 130, 44);
        this.add(button);
        JButton button_1 = new JButton("ลบ");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Row = " + CustomerPanel.this.table.getSelectedRow());
                System.out.println("Column = " + CustomerPanel.this.table.getSelectedColumn());
                System.out.println(CustomerPanel.this.model.getValueAt(CustomerPanel.this.table.getSelectedRow(), CustomerPanel.this.table.getSelectedColumn()));
                CustomerPanel.this.customerDB.removeCustomer(CustomerPanel.this.model.getValueAt(CustomerPanel.this.table.getSelectedRow(), 1).toString());
            }
        });
        button_1.setBounds(590, 578, 130, 44);
        this.add(button_1);
        JButton button_2 = new JButton("บันทึก");
        button_2.setBounds(732, 578, 130, 44);
        this.add(button_2);
        JButton button_3 = new JButton("ยกเลิก");
        button_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(CustomerPanel.this.textField_1.getText());
                CustomerPanel.this.textField_1.setText("");
            }
        });
        button_3.setBounds(874, 578, 130, 44);
        this.add(button_3);
        JLabel label_10 = new JLabel("%");
        label_10.setBounds(165, 317, 9, 16);
        this.add(label_10);
        JLabel label_11 = new JLabel("%");
        label_11.setBounds(165, 345, 9, 16);
        this.add(label_11);
        JLabel label_12 = new JLabel("%");
        label_12.setBounds(165, 373, 9, 16);
        this.add(label_12);
        JLabel label_13 = new JLabel("%");
        label_13.setBounds(165, 401, 9, 16);
        this.add(label_13);
        JLabel label_14 = new JLabel("%");
        label_14.setBounds(165, 429, 9, 16);
        this.add(label_14);
        JLabel label_15 = new JLabel("%");
        label_15.setBounds(165, 457, 9, 16);
        this.add(label_15);
        final JCheckBox checkBox = new JCheckBox("ใช้ข้อมูลเจ้ามือ");
        checkBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    CustomerPanel.this.textField_1.setEditable(false);
                    CustomerPanel.this.textField_2.setEditable(false);
                    CustomerPanel.this.textField_3.setEditable(false);
                    CustomerPanel.this.textField_4.setEditable(false);
                    CustomerPanel.this.textField_5.setEditable(false);
                    CustomerPanel.this.textField_6.setEditable(false);
                    CustomerPanel.this.textField_1_1.setEditable(false);
                    CustomerPanel.this.textField_2_1.setEditable(false);
                    CustomerPanel.this.textField_3_1.setEditable(false);
                    CustomerPanel.this.textField_4_1.setEditable(false);
                    CustomerPanel.this.textField_5_1.setEditable(false);
                    CustomerPanel.this.textField_6_1.setEditable(false);
                    OwnerInfo ownerInfo = CustomerPanel.this.ownerDBImplement.getOwner();
                    CustomerPanel.this.textField_1.setText(ownerInfo.getThreeTopPer());
                    CustomerPanel.this.textField_2.setText(ownerInfo.getThreeTodPer());
                    CustomerPanel.this.textField_3.setText(ownerInfo.getTwoTopPer());
                    CustomerPanel.this.textField_4.setText(ownerInfo.getTwoBotPer());
                    CustomerPanel.this.textField_5.setText(ownerInfo.getRunTopPer());
                    CustomerPanel.this.textField_6.setText(ownerInfo.getRunBotPer());
                    CustomerPanel.this.textField_1_1.setText(ownerInfo.getThreeTop());
                    CustomerPanel.this.textField_2_1.setText(ownerInfo.getThreeTod());
                    CustomerPanel.this.textField_3_1.setText(ownerInfo.getTwoTop());
                    CustomerPanel.this.textField_4_1.setText(ownerInfo.getTwoBot());
                    CustomerPanel.this.textField_5_1.setText(ownerInfo.getRunTop());
                    CustomerPanel.this.textField_6_1.setText(ownerInfo.getRunBot());
                    System.out.println("select");
                    System.out.println(ownerInfo.getThreeTopPer());
                }

                if (!checkBox.isSelected()) {
                    CustomerPanel.this.textField_1.setText("");
                    CustomerPanel.this.textField_2.setText("");
                    CustomerPanel.this.textField_3.setText("");
                    CustomerPanel.this.textField_4.setText("");
                    CustomerPanel.this.textField_5.setText("");
                    CustomerPanel.this.textField_6.setText("");
                    CustomerPanel.this.textField_1_1.setText("");
                    CustomerPanel.this.textField_2_1.setText("");
                    CustomerPanel.this.textField_3_1.setText("");
                    CustomerPanel.this.textField_4_1.setText("");
                    CustomerPanel.this.textField_5_1.setText("");
                    CustomerPanel.this.textField_6_1.setText("");
                    CustomerPanel.this.textField_1.setEditable(true);
                    CustomerPanel.this.textField_2.setEditable(true);
                    CustomerPanel.this.textField_3.setEditable(true);
                    CustomerPanel.this.textField_4.setEditable(true);
                    CustomerPanel.this.textField_5.setEditable(true);
                    CustomerPanel.this.textField_6.setEditable(true);
                    CustomerPanel.this.textField_1_1.setEditable(true);
                    CustomerPanel.this.textField_2_1.setEditable(true);
                    CustomerPanel.this.textField_3_1.setEditable(true);
                    CustomerPanel.this.textField_4_1.setEditable(true);
                    CustomerPanel.this.textField_5_1.setEditable(true);
                    CustomerPanel.this.textField_6_1.setEditable(true);
                    System.out.println("not select");
                }

            }
        });
        checkBox.setBounds(16, 503, 128, 23);
        this.add(checkBox);
        this.model = (DefaultTableModel)this.table.getModel();
        this.model.addColumn("ลำดับ");
        this.model.addColumn("ชื่อลูกค้า");
        this.model.addColumn("%3ตัวเต็ง");
        this.model.addColumn("%3ตัวโต๊ด");
        this.model.addColumn("%2ตัวบน");
        this.model.addColumn("%2ตัวล่าง");
        this.model.addColumn("%1วิ่งบน");
        this.model.addColumn("%1วิ่งล่าง");
        this.model.addColumn("3เต็ง");
        this.model.addColumn("3โต๊ด");
        this.model.addColumn("2บน");
        this.model.addColumn("2ล่าง");
        this.model.addColumn("1วิ่งบน");
        this.model.addColumn("1วิ่งล่าง");
        List<CustomerInfo> customerInfoList = this.customerDB.getCustomer();
        int i = 0;

        for(Iterator var26 = customerInfoList.iterator(); var26.hasNext(); ++i) {
            CustomerInfo customerInfo = (CustomerInfo)var26.next();
            this.model.addRow(new Object[0]);
            this.model.setValueAt(customerInfo.getID(), i, 0);
            this.model.setValueAt(customerInfo.getName(), i, 1);
            this.model.setValueAt(customerInfo.getThreeTopPer(), i, 2);
            this.model.setValueAt(customerInfo.getThreeTodPer(), i, 3);
            this.model.setValueAt(customerInfo.getTwoTopPer(), i, 4);
            this.model.setValueAt(customerInfo.getTwoBotPer(), i, 5);
            this.model.setValueAt(customerInfo.getRunTopPer(), i, 6);
            this.model.setValueAt(customerInfo.getRunBotPer(), i, 7);
            this.model.setValueAt(customerInfo.getThreeTop(), i, 8);
            this.model.setValueAt(customerInfo.getThreeTod(), i, 9);
            this.model.setValueAt(customerInfo.getTwoTop(), i, 10);
            this.model.setValueAt(customerInfo.getTwoBot(), i, 11);
            this.model.setValueAt(customerInfo.getRunTop(), i, 12);
            this.model.setValueAt(customerInfo.getRunBot(), i, 13);
        }

    }
}
