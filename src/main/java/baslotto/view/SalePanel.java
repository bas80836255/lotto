//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.view;

import baslotto.database.CustomerDBImplement;
import baslotto.database.SaleDBImplement;
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
        this.setBounds(100, 100, 1280, 670);
        this.setLayout((LayoutManager)null);
        JButton btnNewButton = new JButton("แทรก");
        btnNewButton.setBounds(31, 623, 115, 44);
        this.add(btnNewButton);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(21, 174, 917, 437);
        this.add(scrollPane);
        this.table = new JTable();
        scrollPane.setViewportView(this.table);
        JLabel label_1 = new JLabel("เลข");
        label_1.setBounds(25, 39, 109, 61);
        this.add(label_1);
        JLabel label_2 = new JLabel("ราคา");
        label_2.setBounds(378, 39, 109, 61);
        this.add(label_2);
        this.textField_1 = new JTextField();
        this.textField_1.setBounds(152, 34, 178, 70);
        this.add(this.textField_1);
        this.textField_1.setColumns(10);
        this.textField = new JTextField();
        this.textField.setColumns(10);
        this.textField.setBounds(506, 34, 178, 70);
        this.add(this.textField);
        this.button_4 = new JButton("จบการทำรายการ");
        this.button_4.setBounds(1109, 623, 135, 44);
        this.add(this.button_4);
        JButton button = new JButton("แก้ไข");
        button.setBounds(158, 623, 115, 44);
        this.add(button);
        JButton button_1 = new JButton("ลบ");
        button_1.setBounds(285, 623, 115, 44);
        this.add(button_1);
        JButton button_2 = new JButton("ย้ายแผ่น");
        button_2.setBounds(412, 623, 115, 44);
        this.add(button_2);
        JButton button_3 = new JButton("เลือกทั้งหมด");
        button_3.setBounds(540, 623, 115, 44);
        this.add(button_3);
        Map<String, String> customerNameMap = this.customerDBImplement.getCustomerName();
        Vector<String> Items = new Vector();
        if (!customerNameMap.isEmpty()) {
            customerNameMap.forEach((id, name) -> {
                Items.add(name);
            });
        }

        DefaultComboBoxModel modelCustomer = new DefaultComboBoxModel(Items);
        this.comboBoxCustomerName = new JComboBox(modelCustomer);
        this.comboBoxCustomerName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                List<String> pageList = SalePanel.this.saleDBImplement.getCustomerPage(SalePanel.this.comboBoxCustomerName.getSelectedItem().toString());
                SalePanel.this.comboBoxPage.removeAllItems();
                if (!pageList.isEmpty() && pageList != null) {
                    Iterator var3 = pageList.iterator();

                    while(var3.hasNext()) {
                        String page = (String)var3.next();
                        SalePanel.this.comboBoxPage.addItem(page);
                    }
                } else {
                    SalePanel.this.comboBoxPage.addItem("1");
                }

            }
        });
        this.comboBoxCustomerName.setBounds(1059, 57, 115, 27);
        this.add(this.comboBoxCustomerName);
        JLabel lblNewLabel = new JLabel("ลูกค้า");
        lblNewLabel.setBounds(986, 61, 61, 16);
        this.add(lblNewLabel);
        JLabel label = new JLabel("แผ่นที่");
        label.setBounds(986, 102, 61, 16);
        this.add(label);
        List<String> pageList = this.saleDBImplement.getCustomerPage(this.comboBoxCustomerName.getSelectedItem().toString());
        Vector<String> pageItems = new Vector();
        if (!pageList.isEmpty() && pageList != null) {
            Iterator var16 = pageList.iterator();

            while(var16.hasNext()) {
                String page = (String)var16.next();
                pageItems.add(page);
            }
        } else {
            pageItems.add("1");
        }

        DefaultComboBoxModel modelPage = new DefaultComboBoxModel(pageItems);
        this.comboBoxPage = new JComboBox(modelPage);
        this.comboBoxPage.setBounds(1059, 98, 115, 27);
        this.add(this.comboBoxPage);
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(986, 174, 258, 437);
        this.add(scrollPane_1);
        DefaultTableModel model = (DefaultTableModel)this.table.getModel();
        model.addColumn("ลำดับ");
        model.addColumn("เลข");
        model.addColumn("3เต็ง");
        model.addColumn("3โต๊ด");
        model.addColumn("2บน");
        model.addColumn("2ล่าง");
        model.addColumn("1วิ่งบน");
        model.addColumn("1วิ่งล่าง");
        model.addColumn("เวลา");

        for(int i = 0; i <= 20; ++i) {
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
}
