package baslotto.view.popup;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import baslotto.entity.SaleInfo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

public class UpdateSalePopup extends JDialog {

    private final JPanel contentPanel = new JPanel();
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_12;
    
    private SaleInfo newSaleInfo;
    private boolean isPositive;
    private JComboBox<String> comboBoxPage;

    public SaleInfo getNewSaleInfo() {
        return newSaleInfo;
    }

    public void setNewSaleInfo(SaleInfo newSaleInfo) {
        this.newSaleInfo = newSaleInfo;
    }

    public boolean isPositive() {
        return isPositive;
    }

    public void setPositive(boolean isPositive) {
        this.isPositive = isPositive;
    }

    /**
     * Create the dialog.
     */
    public UpdateSalePopup(SaleInfo oldSaleInfo , Set<String> pageList) {
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 396, 422);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);
        
        JLabel label = new JLabel("เลข");
        label.setBounds(98, 120, 61, 16);
        contentPanel.add(label);
        
        JLabel label_1 = new JLabel("ประเภท");
        label_1.setBounds(98, 148, 61, 16);
        contentPanel.add(label_1);
        
        JLabel label_2 = new JLabel("ราคา");
        label_2.setBounds(98, 176, 61, 16);
        contentPanel.add(label_2);
        
        JLabel label_3 = new JLabel("แผ่น");
        label_3.setBounds(98, 204, 61, 16);
        contentPanel.add(label_3);
        
        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(165, 115, 70, 26);
        contentPanel.add(textField);
        
        textField_1 = new JTextField();
        textField_1.setBounds(165, 143, 70, 26);
        contentPanel.add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setBounds(165, 171, 70, 26);
        contentPanel.add(textField_2);
        
        JLabel label_12 = new JLabel("ชื่อลูกค้า");
        label_12.setBounds(74, 58, 73, 16);
        contentPanel.add(label_12);
        
        textField_12 = new JTextField();
        textField_12.setEditable(false);
        textField_12.setBounds(159, 53, 95, 26);
        contentPanel.add(textField_12);
        
        Vector<String> pageItems = new Vector();
        Iterator iterator = pageList.iterator();

        while (iterator.hasNext()) {
            String page = iterator.next().toString();
            pageItems.add(page);
        }
        
        DefaultComboBoxModel<String> modelPage = new DefaultComboBoxModel<String>(pageItems);
        comboBoxPage = new JComboBox<String>(modelPage);
        comboBoxPage.setBounds(165, 200, 70, 27);
        contentPanel.add(comboBoxPage);
        comboBoxPage.setSelectedIndex(Integer.parseInt(oldSaleInfo.getPage())-1);
        System.out.println(Integer.parseInt(oldSaleInfo.getPage())-1);
//        comboBox.
        
        
        {
            JPanel buttonPane = new JPanel();
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);
            {
                JButton okButton = new JButton("OK");
                okButton.setActionCommand("OK");
                buttonPane.add(okButton);
                getRootPane().setDefaultButton(okButton);
            }
            {
                JButton cancelButton = new JButton("Cancel");
                cancelButton.setActionCommand("Cancel");
                buttonPane.add(cancelButton);
            }
        }
        textField_12.setText(oldSaleInfo.getCustomerName());
        textField.setText(oldSaleInfo.getLottoNumber());
        textField_1.setText(oldSaleInfo.getType());
        textField_2.setText(oldSaleInfo.getPrice());
        
    }
}
