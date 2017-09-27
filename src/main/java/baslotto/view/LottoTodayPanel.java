//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.view;

import baslotto.database.LottoDB;
import baslotto.database.LottoDBImplement;
import baslotto.entity.Lotto;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LottoTodayPanel extends JPanel {
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField textField_14;
    private LottoDB LottoDb = new LottoDBImplement();
    private Lotto lotto;

    public LottoTodayPanel() {
        this.setBounds(100, 100, 1280, 670);
        this.setLayout((LayoutManager)null);
        this.textField = new JTextField();
        this.textField.setColumns(10);
        this.textField.setBounds(174, 153, 157, 47);
        this.add(this.textField);
        JLabel label = new JLabel("รางวัลที่ 1");
        label.setBounds(39, 156, 106, 40);
        this.add(label);
        JButton btnNewButton = new JButton("บันทึก");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Lotto newlotto = new Lotto();
                LottoTodayPanel.this.textField_6.setText(LottoTodayPanel.this.textField.getText());
                LottoTodayPanel.this.textField_10.setText(LottoTodayPanel.this.textField_5.getText());
                List<String> bigLotto = LottoTodayPanel.this.setBigLotto(LottoTodayPanel.this.textField.getText());
                List<String> runBotList = LottoTodayPanel.this.seperateRun(LottoTodayPanel.this.textField_5.getText());
                LottoTodayPanel.this.textField_8.setText((String)bigLotto.get(1));
                LottoTodayPanel.this.textField_9.setText(((String)bigLotto.get(1)).substring(1));
                List<String> runTopList = LottoTodayPanel.this.seperateRun(((String)bigLotto.get(1)).substring(1));
                if (runBotList.size() == 1) {
                    LottoTodayPanel.this.textField_12.setText((String)runBotList.get(0));
                } else {
                    LottoTodayPanel.this.textField_12.setText((String)runBotList.get(0) + " , " + (String)runBotList.get(1));
                }

                if (runTopList.size() == 1) {
                    LottoTodayPanel.this.textField_11.setText((String)runTopList.get(0));
                } else {
                    LottoTodayPanel.this.textField_11.setText((String)runTopList.get(0) + " , " + (String)runTopList.get(1));
                }

                String straightNumber = "";

                String number;
                for(Iterator var7 = LottoTodayPanel.this.seperateTod((String)bigLotto.get(1)).iterator(); var7.hasNext(); straightNumber = straightNumber + number + " , ") {
                    number = (String)var7.next();
                }

                LottoTodayPanel.this.textField_7.setText(straightNumber.substring(0, straightNumber.length() - 3));
                newlotto.setJackpot(LottoTodayPanel.this.textField_6.getText());
                newlotto.setThreeTop(LottoTodayPanel.this.textField_8.getText());
                newlotto.setThreeTod(LottoTodayPanel.this.textField_7.getText());
                newlotto.setThreeBotBack(LottoTodayPanel.this.textField_1.getText());
                newlotto.setThreeBotFront(LottoTodayPanel.this.textField_2.getText());
                newlotto.setTwoTop(LottoTodayPanel.this.textField_9.getText());
                newlotto.setTwoBot(LottoTodayPanel.this.textField_10.getText());
                newlotto.setRunTop(LottoTodayPanel.this.textField_11.getText());
                newlotto.setRunBot(LottoTodayPanel.this.textField_12.getText());
                LottoTodayPanel.this.LottoDb.addLotto(newlotto);
            }
        });
        btnNewButton.setBounds(174, 519, 157, 80);
        this.add(btnNewButton);
        JLabel lblNewLabel = new JLabel("ผลสลาก ประจำงวด : ");
        lblNewLabel.setBounds(126, 76, 280, 40);
        this.add(lblNewLabel);
        this.textField_1 = new JTextField();
        this.textField_1.setColumns(10);
        this.textField_1.setBounds(174, 234, 157, 47);
        this.add(this.textField_1);
        this.textField_2 = new JTextField();
        this.textField_2.setColumns(10);
        this.textField_2.setBounds(174, 317, 157, 47);
        this.add(this.textField_2);
        this.textField_3 = new JTextField();
        this.textField_3.setColumns(10);
        this.textField_3.setBounds(366, 234, 157, 47);
        this.add(this.textField_3);
        this.textField_4 = new JTextField();
        this.textField_4.setColumns(10);
        this.textField_4.setBounds(366, 317, 157, 47);
        this.add(this.textField_4);
        this.textField_5 = new JTextField();
        this.textField_5.setColumns(10);
        this.textField_5.setBounds(174, 400, 157, 47);
        this.add(this.textField_5);
        JLabel label_1 = new JLabel("เลขท้าย 3 ตัว");
        label_1.setBounds(39, 234, 106, 40);
        this.add(label_1);
        JLabel label_2 = new JLabel("เลขหน้า 3 ตัว");
        label_2.setBounds(39, 317, 106, 40);
        this.add(label_2);
        JLabel label_3 = new JLabel("เลขท้าย 2 ตัว");
        label_3.setBounds(41, 403, 106, 40);
        this.add(label_3);
        JButton button = new JButton("ยกเลิก");
        button.setBounds(366, 519, 157, 80);
        this.add(button);
        JLabel lblNewLabel_1 = new JLabel("รางวัลที่1");
        lblNewLabel_1.setBounds(666, 79, 118, 34);
        this.add(lblNewLabel_1);
        this.textField_6 = new JTextField();
        this.textField_6.setEditable(false);
        this.textField_6.setBounds(796, 76, 359, 40);
        this.add(this.textField_6);
        this.textField_6.setColumns(10);
        JLabel label_4 = new JLabel("3ตัวโต๊ด");
        label_4.setBounds(666, 130, 118, 34);
        this.add(label_4);
        this.textField_7 = new JTextField();
        this.textField_7.setEditable(false);
        this.textField_7.setColumns(10);
        this.textField_7.setBounds(796, 127, 359, 40);
        this.add(this.textField_7);
        JLabel label_5 = new JLabel("3ตัวเต็ง");
        label_5.setBounds(666, 186, 118, 34);
        this.add(label_5);
        this.textField_8 = new JTextField();
        this.textField_8.setEditable(false);
        this.textField_8.setColumns(10);
        this.textField_8.setBounds(796, 183, 359, 40);
        this.add(this.textField_8);
        JLabel label_6 = new JLabel("2ตัวบน");
        label_6.setBounds(666, 237, 118, 34);
        this.add(label_6);
        this.textField_9 = new JTextField();
        this.textField_9.setEditable(false);
        this.textField_9.setColumns(10);
        this.textField_9.setBounds(796, 234, 359, 40);
        this.add(this.textField_9);
        JLabel label_7 = new JLabel("2ตัวล่าง");
        label_7.setBounds(666, 286, 118, 34);
        this.add(label_7);
        this.textField_10 = new JTextField();
        this.textField_10.setEditable(false);
        this.textField_10.setColumns(10);
        this.textField_10.setBounds(796, 283, 359, 40);
        this.add(this.textField_10);
        JLabel label_8 = new JLabel("วิ่งบน");
        label_8.setBounds(666, 340, 118, 34);
        this.add(label_8);
        this.textField_11 = new JTextField();
        this.textField_11.setEditable(false);
        this.textField_11.setColumns(10);
        this.textField_11.setBounds(796, 337, 359, 40);
        this.add(this.textField_11);
        JLabel label_9 = new JLabel("วิ่งล่าง");
        label_9.setBounds(666, 389, 118, 34);
        this.add(label_9);
        this.textField_12 = new JTextField();
        this.textField_12.setEditable(false);
        this.textField_12.setColumns(10);
        this.textField_12.setBounds(796, 386, 359, 40);
        this.add(this.textField_12);
        JLabel label_10 = new JLabel("3ตัวหน้า");
        label_10.setBounds(666, 438, 118, 34);
        this.add(label_10);
        this.textField_13 = new JTextField();
        this.textField_13.setEditable(false);
        this.textField_13.setColumns(10);
        this.textField_13.setBounds(796, 435, 359, 40);
        this.add(this.textField_13);
        JLabel label_11 = new JLabel("3ตัวหลัง");
        label_11.setBounds(666, 494, 118, 34);
        this.add(label_11);
        this.textField_14 = new JTextField();
        this.textField_14.setEditable(false);
        this.textField_14.setColumns(10);
        this.textField_14.setBounds(796, 491, 359, 40);
        this.add(this.textField_14);
        this.setOldData();
    }

    public List<String> seperateRun(String runTop) {
        List<String> listRunTop = new ArrayList();
        if (runTop.charAt(0) == runTop.charAt(1)) {
            listRunTop.add(runTop.substring(0, 1));
        } else {
            listRunTop.add(runTop.substring(0, 1));
            listRunTop.add(runTop.substring(1));
        }

        return listRunTop;
    }

    private List<String> setBigLotto(String bigLotto) {
        String threeLotto = bigLotto.substring(0, 3);
        List<String> listBiglotto = new ArrayList();
        listBiglotto.add(threeLotto);
        listBiglotto.add(bigLotto.substring(3));
        return listBiglotto;
    }

    private Set<String> seperateTod(String threeSLotto) {
        Set<String> todLotto = new HashSet();
        String firstNumber = threeSLotto.substring(0, 1);
        String secondNumber = threeSLotto.substring(1, 2);
        String thirdNumber = threeSLotto.substring(2);
        todLotto.add(firstNumber + secondNumber + thirdNumber);
        todLotto.add(firstNumber + thirdNumber + secondNumber);
        todLotto.add(secondNumber + firstNumber + thirdNumber);
        todLotto.add(secondNumber + thirdNumber + firstNumber);
        todLotto.add(thirdNumber + firstNumber + secondNumber);
        todLotto.add(thirdNumber + secondNumber + firstNumber);
        return todLotto;
    }

    private void setOldData() {
        try {
            this.lotto = this.LottoDb.getLottos();
        } catch (Exception var2) {
            var2.printStackTrace();
        }

        if (this.lotto != null) {
            this.textField_6.setText(this.lotto.getJackpot());
            this.textField_7.setText(this.lotto.getThreeTod());
            this.textField_8.setText(this.lotto.getThreeTop());
            this.textField_9.setText(this.lotto.getTwoTop());
            this.textField_10.setText(this.lotto.getTwoBot());
            this.textField_11.setText(this.lotto.getRunTop());
            this.textField_12.setText(this.lotto.getRunBot());
        }

    }
}
