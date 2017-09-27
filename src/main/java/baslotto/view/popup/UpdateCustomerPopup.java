//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.view.popup;

import baslotto.entity.CustomerInfo;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UpdateCustomerPopup extends JDialog {
    private final JPanel contentPanel = new JPanel();
    private CustomerInfo customerInfo;

    public CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    public UpdateCustomerPopup(CustomerInfo customerInfo) {
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 396, 422);
        this.getContentPane().setLayout((LayoutManager)null);
        this.contentPanel.setBounds(0, 0, 396, 361);
        this.contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.getContentPane().add(this.contentPanel);
        this.contentPanel.setLayout((LayoutManager)null);
        JLabel label = new JLabel("3 เต็ง");
        label.setBounds(74, 104, 61, 16);
        this.contentPanel.add(label);
        JLabel label_1 = new JLabel("3 ตัวโต๊ด");
        label_1.setBounds(74, 132, 61, 16);
        this.contentPanel.add(label_1);
        JLabel label_2 = new JLabel("2 ตัวบน");
        label_2.setBounds(74, 160, 61, 16);
        this.contentPanel.add(label_2);
        JLabel label_3 = new JLabel("2 ตัวล่าง");
        label_3.setBounds(74, 188, 61, 16);
        this.contentPanel.add(label_3);
        JLabel label_4 = new JLabel("วิ่งบน");
        label_4.setBounds(74, 216, 61, 16);
        this.contentPanel.add(label_4);
        JLabel label_5 = new JLabel("วิ่งล่าง");
        label_5.setBounds(74, 244, 61, 16);
        this.contentPanel.add(label_5);
        JTextField formattedTextField = new JTextField();
        formattedTextField.setBounds(141, 99, 70, 26);
        this.contentPanel.add(formattedTextField);
        JTextField formattedTextField_1 = new JTextField();
        formattedTextField_1.setBounds(141, 127, 70, 26);
        this.contentPanel.add(formattedTextField_1);
        JTextField formattedTextField_2 = new JTextField();
        formattedTextField_2.setBounds(141, 155, 70, 26);
        this.contentPanel.add(formattedTextField_2);
        JTextField formattedTextField_3 = new JTextField();
        formattedTextField_3.setBounds(141, 183, 70, 26);
        this.contentPanel.add(formattedTextField_3);
        JTextField formattedTextField_4 = new JTextField();
        formattedTextField_4.setBounds(141, 211, 70, 26);
        this.contentPanel.add(formattedTextField_4);
        JTextField formattedTextField_5 = new JTextField();
        formattedTextField_5.setBounds(141, 239, 70, 26);
        this.contentPanel.add(formattedTextField_5);
        JTextField formattedTextField_6 = new JTextField();
        formattedTextField_6.setBounds(246, 155, 70, 26);
        this.contentPanel.add(formattedTextField_6);
        JTextField formattedTextField_7 = new JTextField();
        formattedTextField_7.setBounds(246, 239, 70, 26);
        this.contentPanel.add(formattedTextField_7);
        JTextField formattedTextField_8 = new JTextField();
        formattedTextField_8.setBounds(246, 211, 70, 26);
        this.contentPanel.add(formattedTextField_8);
        JTextField formattedTextField_9 = new JTextField();
        formattedTextField_9.setBounds(246, 183, 70, 26);
        this.contentPanel.add(formattedTextField_9);
        JTextField formattedTextField_10 = new JTextField();
        formattedTextField_10.setBounds(246, 99, 70, 26);
        this.contentPanel.add(formattedTextField_10);
        JTextField formattedTextField_11 = new JTextField();
        formattedTextField_11.setBounds(246, 127, 70, 26);
        this.contentPanel.add(formattedTextField_11);
        JLabel label_6 = new JLabel("%");
        label_6.setBounds(223, 104, 9, 16);
        this.contentPanel.add(label_6);
        JLabel label_7 = new JLabel("%");
        label_7.setBounds(223, 132, 9, 16);
        this.contentPanel.add(label_7);
        JLabel label_8 = new JLabel("%");
        label_8.setBounds(223, 160, 9, 16);
        this.contentPanel.add(label_8);
        JLabel label_9 = new JLabel("%");
        label_9.setBounds(223, 188, 9, 16);
        this.contentPanel.add(label_9);
        JLabel label_10 = new JLabel("%");
        label_10.setBounds(223, 216, 9, 16);
        this.contentPanel.add(label_10);
        JLabel label_11 = new JLabel("%");
        label_11.setBounds(223, 244, 9, 16);
        this.contentPanel.add(label_11);
        formattedTextField.setText(customerInfo.getThreeTopPer());
        formattedTextField_1.setText(customerInfo.getThreeTodPer());
        formattedTextField_2.setText(customerInfo.getTwoTopPer());
        formattedTextField_3.setText(customerInfo.getTwoBotPer());
        formattedTextField_4.setText(customerInfo.getRunTopPer());
        formattedTextField_5.setText(customerInfo.getRunBotPer());
        formattedTextField_6.setText(customerInfo.getThreeTop());
        formattedTextField_7.setText(customerInfo.getThreeTod());
        formattedTextField_8.setText(customerInfo.getTwoTop());
        formattedTextField_9.setText(customerInfo.getTwoBot());
        formattedTextField_10.setText(customerInfo.getRunTop());
        formattedTextField_11.setText(customerInfo.getRunBot());
        JCheckBox checkBox = new JCheckBox("ใช้ข้อมูลเจ้ามือ");
        checkBox.setBounds(74, 290, 128, 23);
        this.contentPanel.add(checkBox);
        JLabel label_12 = new JLabel("ชื่อลูกค้า");
        label_12.setBounds(82, 48, 73, 16);
        this.contentPanel.add(label_12);
        JLabel label_13 = new JLabel("");
        label_13.setBounds(179, 48, 103, 16);
        this.contentPanel.add(label_13);
        label_13.setText(customerInfo.getName());
        JPanel buttonPane = new JPanel();
        buttonPane.setBounds(0, 361, 396, 39);
        buttonPane.setLayout(new FlowLayout(2));
        this.getContentPane().add(buttonPane);
        JButton cancelButton = new JButton("OK");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UpdateCustomerPopup.this.dispose();
            }
        });
        cancelButton.setActionCommand("OK");
        buttonPane.add(cancelButton);
        this.getRootPane().setDefaultButton(cancelButton);
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UpdateCustomerPopup.this.dispose();
            }
        });
        cancelButton.setActionCommand("Cancel");
        buttonPane.add(cancelButton);
    }
}
