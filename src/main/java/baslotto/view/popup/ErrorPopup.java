//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.view.popup;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ErrorPopup extends JDialog {
    private final JPanel contentPanel = new JPanel();

    public ErrorPopup() {
        this.setBounds(100, 100, 450, 300);
        this.getContentPane().setLayout(new BorderLayout());
        this.contentPanel.setLayout(new FlowLayout());
        this.contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.getContentPane().add(this.contentPanel, "Center");
        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new FlowLayout(2));
        this.getContentPane().add(buttonPane, "South");
        JButton cancelButton = new JButton("OK");
        cancelButton.setActionCommand("OK");
        buttonPane.add(cancelButton);
        this.getRootPane().setDefaultButton(cancelButton);
        cancelButton = new JButton("Cancel");
        cancelButton.setActionCommand("Cancel");
        buttonPane.add(cancelButton);
    }
}
