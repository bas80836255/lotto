//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.view;

import baslotto.database.BanDBImplement;
import baslotto.database.CustomerDBImplement;
import baslotto.database.LottoDBImplement;
import baslotto.database.OwnerDBImplement;
import baslotto.database.SaleDBImplement;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
    public MainPanel() {
        this.setBounds(100, 100, 1280, 670);
        this.setLayout((LayoutManager)null);
        JLabel lblPanelMain = new JLabel("Panel Main");
        lblPanelMain.setBounds(6, 6, 800, 600);
        lblPanelMain.setFont(new Font("Tahoma", 0, 20));
        lblPanelMain.setHorizontalAlignment(0);
        this.add(lblPanelMain);
        JButton btnNewButton = new JButton("create Table");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LottoDBImplement lottoDBImplement = new LottoDBImplement();
                lottoDBImplement.createTable();
                CustomerDBImplement customerDBImplement = new CustomerDBImplement();
                customerDBImplement.createTable();
                OwnerDBImplement ownerDBImplement = new OwnerDBImplement();
                ownerDBImplement.createTable();
                BanDBImplement banDBImplement = new BanDBImplement();
                banDBImplement.createTable();
                SaleDBImplement saleDBImplement = new SaleDBImplement();
                saleDBImplement.createTable();
            }
        });
        btnNewButton.setBounds(318, 361, 180, 53);
        this.add(btnNewButton);
    }
}
