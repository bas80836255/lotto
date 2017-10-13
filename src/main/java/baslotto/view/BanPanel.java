//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.view;

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;
import java.util.Vector;

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

import baslotto.database.BanDB;
import baslotto.database.BanDBImplement;
import baslotto.database.CustomerDBImplement;
import baslotto.entity.BanInfo;
import baslotto.view.popup.NullPopup;
import baslotto.view.popup.UpdateBanPopup;
import baslotto.view.popup.WarningPopup;

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
    private DefaultTableModel model;
    private BanDBImplement banDB = new BanDBImplement();
    private CustomerDBImplement customerDB = new CustomerDBImplement();

    public BanPanel() {
        setBounds(100, 100, 1280, 670);
        setLayout((LayoutManager) null);
        JButton btnNewButton = new JButton("เพิ่ม");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BanInfo banInfo = new BanInfo();
                if (checkBoxCustomerName.isSelected()) {
                    banInfo.setName("ทั้งหมด");
                } else {
                    banInfo.setName(comboBox.getSelectedItem().toString());
                }

                banInfo.setType(comboBox_1.getSelectedItem().toString());
                banInfo.setLottoNumber(textField_1.getText());
                if (checkBox_1.isSelected()) {
                    banInfo.setPrice("0");
                    banInfo.setBuyable("ปิดรับ");
                } else {
                    banInfo.setPrice(textField_2.getText());
                    banInfo.setBuyable("อั้นราคา");
                }

                banDB.addBan(banInfo);
                if (checkBoxswapNumber.isSelected()) {
                    banInfo.setLottoNumber(textField_1.getText().substring(1)
                            + textField_1.getText().substring(0, 1));
                    banDB.addBan(banInfo);
                }
                setDataTable();
            }
        });
        btnNewButton.setBounds(306, 578, 130, 44);
        add(btnNewButton);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(306, 60, 947, 484);
        add(scrollPane);
        table = new JTable();
        scrollPane.setViewportView(table);
        JLabel lblNewLabel = new JLabel("ชื่อลูกค้า");
        lblNewLabel.setBounds(16, 193, 61, 16);
        add(lblNewLabel);
        JLabel lblNewLabel_1 = new JLabel("เลข");
        lblNewLabel_1.setBounds(16, 352, 61, 16);
        add(lblNewLabel_1);
        JLabel label_2 = new JLabel("จ่าย");
        label_2.setBounds(17, 401, 61, 16);
        add(label_2);
        textField_1 = new JTextField();
        textField_1.setBounds(83, 347, 70, 26);
        add(textField_1);
        textField_1.setColumns(10);
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(84, 396, 70, 26);
        add(textField_2);
        textField_2_1 = new JTextField();
        textField_2_1.setColumns(10);
        textField_2_1.setBounds(189, 396, 70, 26);
        add(textField_2_1);
        button_4 = new JButton("จบการทำรายการ");
        button_4.setBounds(1075, 578, 178, 70);
        add(button_4);
        JButton button = new JButton("แก้ไข");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (table.getSelectedRowCount() > 1) {
                    NullPopup nullPopup = new NullPopup("เลือกแก้ไขเลขได้ทีละรายการ");
                    nullPopup.setModal(true);
                    nullPopup.setVisible(true);
                } else if (table.getSelectedRowCount() == 1) {
                    BanInfo oldBaninfo = new BanInfo();
                    oldBaninfo.setName((model.getValueAt(table.getSelectedRow(), 0).toString()));
                    oldBaninfo.setType((model.getValueAt(table.getSelectedRow(), 1).toString()));
                    oldBaninfo.setLottoNumber((model.getValueAt(table.getSelectedRow(), 2).toString()));
                    oldBaninfo.setPrice((model.getValueAt(table.getSelectedRow(), 3).toString()));
                    oldBaninfo.setBuyable((model.getValueAt(table.getSelectedRow(), 4).toString()));
                    UpdateBanPopup updateBanPopup = new UpdateBanPopup(oldBaninfo);
                    updateBanPopup.setModal(true);
                    updateBanPopup.setVisible(true);
                    if (updateBanPopup.isPositive()) {
                        banDB.updateBan(updateBanPopup.getUpdateBanInfo(), oldBaninfo);
                        setDataTable();
                    }
                    updateBanPopup.dispose();
                } else {
                    NullPopup nullPopup = new NullPopup("ยังไม่ได้เลือกเลขอั้น");
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
                if (table.getSelectedRowCount() > 0) {
                    WarningPopup warningPopup = new WarningPopup("ต้องการลบข้อมูลลูกค้า ?");
                    warningPopup.setModal(true);
                    warningPopup.setVisible(true);
                    if (warningPopup.isPositive()) {
                        int row[] = table.getSelectedRows();
                        for (int i = 0; i < row.length; i++) {
                            banDB.removeBan(model.getValueAt(row[i], 2).toString(),
                                    model.getValueAt(row[i], 1).toString());
                        }
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
        JLabel label_11 = new JLabel("%");
        label_11.setBounds(268, 401, 9, 16);
        add(label_11);
        checkBoxCustomerName = new JCheckBox("ลูกค้าทั้งหมด");
        checkBoxCustomerName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBoxCustomerName.isSelected()) {
                    comboBox.setEnabled(false);
                } else {
                    comboBox.setEnabled(true);
                }

            }
        });
        checkBoxCustomerName.setBounds(83, 238, 128, 23);
        add(checkBoxCustomerName);
        JLabel label = new JLabel("ประเภท");
        label.setBounds(12, 287, 61, 16);
        add(label);
        checkBoxswapNumber = new JCheckBox("กลับเลข");
        checkBoxswapNumber.setEnabled(false);
        checkBoxswapNumber.setBounds(189, 348, 88, 23);
        add(checkBoxswapNumber);
        Map<String, String> customerNameMap = customerDB.getCustomerName();
        Vector<String> Items = new Vector();
        if (!customerNameMap.isEmpty()) {
            customerNameMap.forEach((id, name) -> {
                Items.add(name);
            });
        }

        DefaultComboBoxModel modelCustomer = new DefaultComboBoxModel(Items);
        comboBox = new JComboBox(modelCustomer);
        comboBox.setBounds(89, 189, 170, 27);
        add(comboBox);
        if (customerNameMap.isEmpty()) {
            comboBox.setEnabled(false);
            checkBoxCustomerName.setSelected(true);
            checkBoxCustomerName.setEnabled(false);
        }

        String[] petStrings = new String[] {
                "3ตัวโต๊ด", "3ตัวเต็ง", "2ตัวบน", "2ตัวล่าง", "วิ่งบน", "วิ่งล่าง"
        };
        comboBox_1 = new JComboBox(petStrings);
        comboBox_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (comboBox_1.getSelectedIndex() != 2
                        && comboBox_1.getSelectedIndex() != 3) {
                    checkBoxswapNumber.setEnabled(false);
                    checkBoxswapNumber.setSelected(false);
                } else {
                    checkBoxswapNumber.setEnabled(true);
                }

            }
        });
        comboBox_1.setSelectedItem(Integer.valueOf(2));
        comboBox_1.setBounds(89, 281, 170, 27);
        add(comboBox_1);
        checkBox_1 = new JCheckBox("ปิดรับ");
        checkBox_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox_1.isSelected()) {
                    textField_2.setEditable(false);
                    textField_2_1.setEditable(false);
                } else {
                    textField_2.setEditable(true);
                    textField_2_1.setEditable(true);
                }

            }
        });
        checkBox_1.setBounds(83, 445, 88, 23);
        add(checkBox_1);
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
        model.addColumn("ลูกค้า");
        model.addColumn("ประเภท");
        model.addColumn("เลข");
        model.addColumn("ราคา");
        model.addColumn("ปดรับ");
    }

    public void setRowTable() {
        List<BanInfo> banInfoList = banDB.getBan();
        int i = 0;
        for (BanInfo banInfo : banInfoList) {
            model.addRow(new Object[0]);
            model.setValueAt(banInfo.getName(), i, 0);
            model.setValueAt(banInfo.getType(), i, 1);
            model.setValueAt(banInfo.getLottoNumber(), i, 2);
            model.setValueAt(banInfo.getPrice(), i, 3);
            model.setValueAt(banInfo.getBuyable(), i, 4);
            i++;
        }
    }
}
