//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.view;

import com.itextpdf.text.DocumentException;

import baslotto.database.CustomerDBImplement;
import baslotto.database.DBUtils;
import baslotto.view.popup.NullPopup;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class IndexForm extends JFrame {
	static JPanel Option;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IndexForm window = new IndexForm();
					window.setVisible(true);
				} catch (Exception var2) {
					var2.printStackTrace();
				}

			}
		});
	}

	public IndexForm() {
		this.setBounds(100, 100, 1280, 720);
		this.setDefaultCloseOperation(3);
		this.getContentPane().setLayout(new BorderLayout(0, 0));
		MainPanel mainPanel = new MainPanel();
		this.getContentPane().add(mainPanel);
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		JMenuItem mnMain = new JMenuItem("หน้าหลัก");
		mnMain.setBackground(SystemColor.window);
		mnMain.setFont(new Font("TH SarabunPSK", 1, 22));
		mnMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel panel1 = new MainPanel();
				IndexForm.this.getContentPane().removeAll();
				IndexForm.this.getContentPane().add(panel1, "Center");
				IndexForm.this.getContentPane().doLayout();
			}
		});
		menuBar.add(mnMain);
		JMenuItem mnOption = new JMenuItem("ข้อมูลลูกค้า");
		mnOption.setBackground(SystemColor.window);
		mnOption.setFont(new Font("TH SarabunPSK", 1, 22));
		mnOption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (DBUtils.isCreateTable("CustomerInfo")) {
						CustomerPanel panel1 = new CustomerPanel();
						IndexForm.this.getContentPane().removeAll();
						IndexForm.this.getContentPane().add(panel1, "Center");
						IndexForm.this.getContentPane().doLayout();
					} else {
						NullPopup nullPopup = new NullPopup("ยังไม่เริ่มงวด");
						nullPopup.setModal(true);
						nullPopup.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		menuBar.add(mnOption);
		JMenuItem menu = new JMenuItem("ข้อมูลเจ้ามือ");
		menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (DBUtils.isCreateTable("OwnerInfo")) {
						OwnerPanel ownerInfoPanel = new OwnerPanel();
						IndexForm.this.getContentPane().removeAll();
						IndexForm.this.getContentPane().add(ownerInfoPanel, "Center");
						IndexForm.this.getContentPane().doLayout();
					} else {
						NullPopup nullPopup = new NullPopup("ยังไม่เริ่มงวด");
						nullPopup.setModal(true);
						nullPopup.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		menu.setBackground(SystemColor.window);
		menu.setFont(new Font("TH SarabunPSK", 1, 22));
		menuBar.add(menu);
		JMenuItem menu_1 = new JMenuItem("ทำรายการขาย");
		menu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (DBUtils.isCreateTable("SaleInfo")) {
						if (CustomerDBImplement.isCreateDatabase()) {
							SalePanel saleInfoPanel = new SalePanel();
							IndexForm.this.getContentPane().removeAll();
							IndexForm.this.getContentPane().add(saleInfoPanel, "Center");
							IndexForm.this.getContentPane().doLayout();
						} else {
							NullPopup nullPopup = new NullPopup("เพิ่มข้อมูลลูกค้าก่อน");
							nullPopup.setModal(true);
							nullPopup.setVisible(true);
						}
					} else {
						NullPopup nullPopup = new NullPopup("ยังไม่เริ่มงวด");
						nullPopup.setModal(true);
						nullPopup.setVisible(true);
					}
				} catch (SQLException | ClassNotFoundException e1) {
					e1.printStackTrace();
				}
			}
		});
		JMenuItem menu_4 = new JMenuItem("ใส่เลขอั้น");
		menu_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (DBUtils.isCreateTable("BanInfo")) {
						BanPanel bannerInfoPanel = new BanPanel();
						IndexForm.this.getContentPane().removeAll();
						IndexForm.this.getContentPane().add(bannerInfoPanel, "Center");
						IndexForm.this.getContentPane().doLayout();
					} else {
						NullPopup nullPopup = new NullPopup("ยังไม่เริ่มงวด");
						nullPopup.setModal(true);
						nullPopup.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		menu_4.setBackground(SystemColor.window);
		menu_4.setFont(new Font("TH SarabunPSK", 1, 22));
		menuBar.add(menu_4);
		menu_1.setBackground(SystemColor.window);
		menu_1.setFont(new Font("TH SarabunPSK", 1, 22));
		menuBar.add(menu_1);
		JMenuItem menu_2 = new JMenuItem("ใส่ผลสลาก");
		menu_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (DBUtils.isCreateTable("LOTTOS")) {
						LottoTodayPanel lottoTodayPanel = new LottoTodayPanel();
						IndexForm.this.getContentPane().removeAll();
						IndexForm.this.getContentPane().add(lottoTodayPanel, "Center");
						IndexForm.this.getContentPane().doLayout();
					} else {
						NullPopup nullPopup = new NullPopup("ยังไม่เริ่มงวด");
						nullPopup.setModal(true);
						nullPopup.setVisible(true);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		menu_2.setBackground(SystemColor.window);
		menu_2.setFont(new Font("TH SarabunPSK", 1, 22));
		menuBar.add(menu_2);
		JMenuItem menu_3 = new JMenuItem("รายการสรุปผล");
		menu_3.setBackground(SystemColor.window);
		menu_3.setFont(new Font("TH SarabunPSK", 1, 22));
		menu_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (DBUtils.isCreateTable("SaleInfo")) {
						if (CustomerDBImplement.isCreateDatabase()) {
							SummaryPanel summaryInfoPanel = new SummaryPanel();
							IndexForm.this.getContentPane().removeAll();
							IndexForm.this.getContentPane().add(summaryInfoPanel, "Center");
							IndexForm.this.getContentPane().doLayout();
						} else {
							NullPopup nullPopup = new NullPopup("เพิ่มข้อมูลลูกค้า");
							nullPopup.setModal(true);
							nullPopup.setVisible(true);
						}
					} else {
						NullPopup nullPopup = new NullPopup("ยังไม่เริ่มงวด");
						nullPopup.setModal(true);
						nullPopup.setVisible(true);
					}
				} catch (SQLException | IOException | DocumentException | ClassNotFoundException e1) {
					e1.printStackTrace();
				}
			}
		});
		menuBar.add(menu_3);
		JMenuItem menu_5 = new JMenuItem("สำรองข้อมูล");
		menu_5.setBackground(SystemColor.window);
		menu_5.setFont(new Font("TH SarabunPSK", 1, 22));
		menu_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RestorePanel restorePanel = new RestorePanel();
				IndexForm.this.getContentPane().removeAll();
				IndexForm.this.getContentPane().add(restorePanel, "Center");
				IndexForm.this.getContentPane().doLayout();
			}
		});
		menuBar.add(menu_5);
	}
}
