//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.view;

import baslotto.database.BanDB;
import baslotto.database.BanDBImplement;
import baslotto.database.CustomerDBImplement;
import baslotto.entity.BanInfo;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.function.BiConsumer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class BanPanel extends JPanel {
    private JTable table;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_2_1;
    private JButton button_4;
    private JComboBox comboBox_1;
    private JComboBox comboBox;
    private JCheckBox checkBox_1;
    private JCheckBox checkBoxCustomerName;
    private JCheckBox checkBoxswapNumber;
    private BanDB banDB = new BanDBImplement();
    private CustomerDBImplement customerDB = new CustomerDBImplement();

    public BanPanel() {
        this.setBounds(100, 100, 1280, 670);
        this.setLayout((LayoutManager)null);
        JButton btnNewButton = new JButton("เพิ่ม");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BanInfo banInfo = new BanInfo();
                if (BanPanel.this.checkBoxCustomerName.isSelected()) {
                    banInfo.setName("ทั้งหมด");
                } else {
                    banInfo.setName(BanPanel.this.comboBox.getSelectedItem().toString());
                }

                banInfo.setType(BanPanel.this.comboBox_1.getSelectedItem().toString());
                banInfo.setLottoNumber(BanPanel.this.textField_1.getText());
                if (BanPanel.this.checkBox_1.isSelected()) {
                    banInfo.setPrice("0");
                    banInfo.setBuyable("ปิดรับ");
                } else {
                    banInfo.setPrice(BanPanel.this.textField_2.getText());
                    banInfo.setBuyable("อั้นราคา");
                }

                BanPanel.this.banDB.addBan(banInfo);
                if (BanPanel.this.checkBoxswapNumber.isSelected()) {
                    banInfo.setLottoNumber(BanPanel.this.textField_1.getText().substring(1) + BanPanel.this.textField_1.getText().substring(0, 1));
                    BanPanel.this.banDB.addBan(banInfo);
                }

            }
        });
        btnNewButton.setBounds(306, 578, 130, 44);
        this.add(btnNewButton);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(306, 60, 947, 484);
        this.add(scrollPane);
        this.table = new JTable();
        scrollPane.setViewportView(this.table);
        JLabel lblNewLabel = new JLabel("ชื่อลูกค้า");
        lblNewLabel.setBounds(16, 193, 61, 16);
        this.add(lblNewLabel);
        JLabel lblNewLabel_1 = new JLabel("เลข");
        lblNewLabel_1.setBounds(16, 352, 61, 16);
        this.add(lblNewLabel_1);
        JLabel label_2 = new JLabel("จ่าย");
        label_2.setBounds(17, 401, 61, 16);
        this.add(label_2);
        this.textField_1 = new JTextField();
        this.textField_1.setBounds(83, 347, 70, 26);
        this.add(this.textField_1);
        this.textField_1.setColumns(10);
        this.textField_2 = new JTextField();
        this.textField_2.setColumns(10);
        this.textField_2.setBounds(84, 396, 70, 26);
        this.add(this.textField_2);
        this.textField_2_1 = new JTextField();
        this.textField_2_1.setColumns(10);
        this.textField_2_1.setBounds(189, 396, 70, 26);
        this.add(this.textField_2_1);
        this.button_4 = new JButton("จบการทำรายการ");
        this.button_4.setBounds(1075, 578, 178, 70);
        this.add(this.button_4);
        JButton button = new JButton("แก้ไข");
        button.setBounds(448, 578, 130, 44);
        this.add(button);
        JButton button_1 = new JButton("ลบ");
        button_1.setBounds(590, 578, 130, 44);
        this.add(button_1);
        JButton button_2 = new JButton("บันทึก");
        button_2.setBounds(732, 578, 130, 44);
        this.add(button_2);
        JButton button_3 = new JButton("ยกเลิก");
        button_3.setBounds(874, 578, 130, 44);
        this.add(button_3);
        JLabel label_11 = new JLabel("%");
        label_11.setBounds(268, 401, 9, 16);
        this.add(label_11);
        this.checkBoxCustomerName = new JCheckBox("ลูกค้าทั้งหมด");
        this.checkBoxCustomerName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (BanPanel.this.checkBoxCustomerName.isSelected()) {
                    BanPanel.this.comboBox.setEnabled(false);
                } else {
                    BanPanel.this.comboBox.setEnabled(true);
                }

            }
        });
        this.checkBoxCustomerName.setBounds(83, 238, 128, 23);
        this.add(this.checkBoxCustomerName);
        JLabel label = new JLabel("ประเภท");
        label.setBounds(12, 287, 61, 16);
        this.add(label);
        this.checkBoxswapNumber = new JCheckBox("กลับเลข");
        this.checkBoxswapNumber.setEnabled(false);
        this.checkBoxswapNumber.setBounds(189, 348, 88, 23);
        this.add(this.checkBoxswapNumber);
        Map<String, String> customerNameMap = this.customerDB.getCustomerName();
        Vector<String> Items = new Vector();
        if (!customerNameMap.isEmpty()) {
            customerNameMap.forEach((id, name) -> {
                Items.add(name);
            });
        }

        DefaultComboBoxModel modelCustomer = new DefaultComboBoxModel(Items);
        this.comboBox = new JComboBox(modelCustomer);
        this.comboBox.setBounds(89, 189, 170, 27);
        this.add(this.comboBox);
        if (customerNameMap.isEmpty()) {
            this.comboBox.setEnabled(false);
            this.checkBoxCustomerName.setSelected(true);
            checkBoxCustomerName.setEnabled(false);
        }

        String[] petStrings = new String[]{"3ตัวโต๊ด", "3ตัวเต็ง", "2ตัวบน", "2ตัวล่าง", "วิ่งบน", "วิ่งล่าง"};
        this.comboBox_1 = new JComboBox(petStrings);
        this.comboBox_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (BanPanel.this.comboBox_1.getSelectedIndex() != 2 && BanPanel.this.comboBox_1.getSelectedIndex() != 3) {
                    BanPanel.this.checkBoxswapNumber.setEnabled(false);
                } else {
                    BanPanel.this.checkBoxswapNumber.setEnabled(true);
                }

            }
        });
        this.comboBox_1.setSelectedItem(Integer.valueOf(2));
        this.comboBox_1.setBounds(89, 281, 170, 27);
        this.add(this.comboBox_1);
        this.checkBox_1 = new JCheckBox("ปิดรับ");
        this.checkBox_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (BanPanel.this.checkBox_1.isSelected()) {
                    BanPanel.this.textField_2.setEditable(false);
                    BanPanel.this.textField_2_1.setEditable(false);
                } else {
                    BanPanel.this.textField_2.setEditable(true);
                    BanPanel.this.textField_2_1.setEditable(true);
                }

            }
        });
        this.checkBox_1.setBounds(83, 445, 88, 23);
        this.add(this.checkBox_1);
        DefaultTableModel model = (DefaultTableModel)this.table.getModel();
        model.addColumn("ลูกค้า");
        model.addColumn("ประเภท");
        model.addColumn("เลข");
        model.addColumn("ราคา");
        model.addColumn("ปดรับ");
        List<BanInfo> banInfoList = this.banDB.getBan();
        int i = 0;

        for(Iterator var19 = banInfoList.iterator(); var19.hasNext(); ++i) {
            BanInfo banInfo = (BanInfo)var19.next();
            model.addRow(new Object[0]);
            model.setValueAt(banInfo.getName(), i, 0);
            model.setValueAt(banInfo.getType(), i, 1);
            model.setValueAt(banInfo.getLottoNumber(), i, 2);
            model.setValueAt(banInfo.getPrice(), i, 3);
            model.setValueAt(banInfo.getBuyable(), i, 4);
        }

    }
}
