
package baslotto.view.popup;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import baslotto.entity.BanInfo;

public class UpdateBanPopup extends JDialog {

    private final JPanel contentPanel = new JPanel();
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_3;
    private BanInfo oldBanInfo;
    private BanInfo updateBanInfo;
    private boolean isPositive;

    public BanInfo getUpdateBanInfo() {
        return updateBanInfo;
    }

    public void setUpdateBanInfo(BanInfo updateBanInfo) {
        this.updateBanInfo = updateBanInfo;
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
    public UpdateBanPopup(BanInfo banInfo) {
        oldBanInfo = banInfo;
        setDefaultCloseOperation(2);
        setBounds(100, 100, 396, 422);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        JLabel label = new JLabel("เลข");
        label.setBounds(99, 114, 61, 16);
        contentPanel.add(label);

        JLabel label_2 = new JLabel("ราคา");
        label_2.setBounds(99, 147, 61, 16);
        contentPanel.add(label_2);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setText((String) null);
        textField.setBounds(166, 109, 110, 26);
        contentPanel.add(textField);

        textField_1 = new JTextField();
        textField_1.setText((String) null);
        textField_1.setBounds(166, 142, 110, 26);
        contentPanel.add(textField_1);

        JLabel label_8 = new JLabel("ชื่อลูกค้า");
        label_8.setBounds(85, 51, 73, 16);
        contentPanel.add(label_8);

        textField_3 = new JTextField();
        textField_3.setEditable(false);
        textField_3.setText((String) null);
        textField_3.setBounds(170, 46, 95, 26);
        contentPanel.add(textField_3);
        {
            JPanel buttonPane = new JPanel();
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);
            {
                JButton okButton = new JButton("OK");
                okButton.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        BanInfo getUpdateButton = new BanInfo();
                        getUpdateButton.setName(oldBanInfo.getName());
                        getUpdateButton.setType(oldBanInfo.getType());
                        getUpdateButton.setBuyable(oldBanInfo.getBuyable());
                        getUpdateButton.setLottoNumber(oldBanInfo.getLottoNumber());
                        getUpdateButton.setPrice(textField_1.getText());
                        setUpdateBanInfo(getUpdateButton);
                        isPositive = true;
                        setVisible(false);

                    }
                });
                okButton.setActionCommand("OK");
                buttonPane.add(okButton);
                getRootPane().setDefaultButton(okButton);
            }
            {
                JButton cancelButton = new JButton("Cancel");
                cancelButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        isPositive = false;
                        setVisible(false);
                    }
                });
                cancelButton.setActionCommand("Cancel");
                buttonPane.add(cancelButton);
            }
        }
        textField.setText(oldBanInfo.getLottoNumber());
        textField_1.setText(oldBanInfo.getPrice());
        textField_3.setText(oldBanInfo.getName());
    }
}
