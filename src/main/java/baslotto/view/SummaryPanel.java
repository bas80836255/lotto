//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package baslotto.view;

import baslotto.database.CustomerDBImplement;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;
import java.awt.LayoutManager;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Vector;
import java.util.function.BiConsumer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class SummaryPanel extends JPanel {
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
    private JTextField textField_15;
    private JTextField textField_16;
    private JTextField textField_17;
    private JTextField textField_18;
    private JTextField textField_19;
    private JTextField textField_20;
    private JTextField textField_21;
    private JTextField textField_22;
    private JTextField textField_23;
    private JTextField textField_24;
    private JTextField textField_25;
    private JTextField textField_26;
    private JTextField textField_27;
    private JTextField textField_28;
    private JTextField textField_29;
    private JTextField textField_30;
    private JTextField textField_31;
    private JTextField textField_32;
    private JTextField textField_33;
    private JTextField textField_34;
    private JLabel label_23;
    private JLabel label_24;
    private Font font;
    private CustomerDBImplement customerDBImplement;

    public SummaryPanel() throws IOException, DocumentException {
        this.createBaseFont();
        this.setBounds(100, 100, 1280, 670);
        this.setLayout((LayoutManager)null);
        this.customerDBImplement = new CustomerDBImplement();
        JTabbedPane tabbedPane = new JTabbedPane(1);
        tabbedPane.setBounds(0, 0, 1280, 670);
        this.add(tabbedPane);
        JPanel panel = new JPanel();
        tabbedPane.addTab("New tab", (Icon)null, panel, (String)null);
        panel.setLayout((LayoutManager)null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(23, 25, 662, 577);
        panel.add(scrollPane);
        JEditorPane editorPane = new JEditorPane();
        scrollPane.setViewportView(editorPane);
        this.textField = new JTextField();
        this.textField.setBounds(863, 103, 145, 34);
        panel.add(this.textField);
        this.textField.setColumns(10);
        this.textField_1 = new JTextField();
        this.textField_1.setColumns(10);
        this.textField_1.setBounds(1050, 103, 145, 34);
        panel.add(this.textField_1);
        JLabel lblNewLabel = new JLabel("3 ตัวโต๊ด");
        lblNewLabel.setBounds(744, 103, 85, 34);
        panel.add(lblNewLabel);
        JLabel label = new JLabel("3 ตัวเต็ง");
        label.setBounds(744, 168, 85, 34);
        panel.add(label);
        this.textField_2 = new JTextField();
        this.textField_2.setColumns(10);
        this.textField_2.setBounds(863, 168, 145, 34);
        panel.add(this.textField_2);
        this.textField_3 = new JTextField();
        this.textField_3.setColumns(10);
        this.textField_3.setBounds(1050, 168, 145, 34);
        panel.add(this.textField_3);
        JLabel label_1 = new JLabel("2 ตัวบน");
        label_1.setBounds(744, 233, 85, 34);
        panel.add(label_1);
        this.textField_4 = new JTextField();
        this.textField_4.setColumns(10);
        this.textField_4.setBounds(863, 233, 145, 34);
        panel.add(this.textField_4);
        this.textField_5 = new JTextField();
        this.textField_5.setColumns(10);
        this.textField_5.setBounds(1050, 233, 145, 34);
        panel.add(this.textField_5);
        JLabel label_2 = new JLabel("2 ตัวล่าง");
        label_2.setBounds(744, 307, 85, 34);
        panel.add(label_2);
        this.textField_6 = new JTextField();
        this.textField_6.setColumns(10);
        this.textField_6.setBounds(863, 307, 145, 34);
        panel.add(this.textField_6);
        this.textField_7 = new JTextField();
        this.textField_7.setColumns(10);
        this.textField_7.setBounds(1050, 307, 145, 34);
        panel.add(this.textField_7);
        JLabel label_3 = new JLabel("วิ่งบน");
        label_3.setBounds(744, 377, 85, 34);
        panel.add(label_3);
        this.textField_8 = new JTextField();
        this.textField_8.setColumns(10);
        this.textField_8.setBounds(863, 377, 145, 34);
        panel.add(this.textField_8);
        this.textField_9 = new JTextField();
        this.textField_9.setColumns(10);
        this.textField_9.setBounds(1050, 377, 145, 34);
        panel.add(this.textField_9);
        JLabel label_4 = new JLabel("วิ่งล่าง");
        label_4.setBounds(744, 438, 85, 34);
        panel.add(label_4);
        this.textField_10 = new JTextField();
        this.textField_10.setColumns(10);
        this.textField_10.setBounds(863, 438, 145, 34);
        panel.add(this.textField_10);
        this.textField_11 = new JTextField();
        this.textField_11.setColumns(10);
        this.textField_11.setBounds(1050, 438, 145, 34);
        panel.add(this.textField_11);
        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("New tab", (Icon)null, panel_1, (String)null);
        panel_1.setLayout((LayoutManager)null);
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(23, 25, 662, 577);
        panel_1.add(scrollPane_1);
        this.textField_12 = new JTextField();
        this.textField_12.setColumns(10);
        this.textField_12.setBounds(863, 343, 115, 34);
        panel_1.add(this.textField_12);
        this.textField_13 = new JTextField();
        this.textField_13.setColumns(10);
        this.textField_13.setBounds(990, 343, 115, 34);
        panel_1.add(this.textField_13);
        JLabel label_5 = new JLabel("3 ตัวโต๊ด");
        label_5.setBounds(744, 343, 85, 34);
        panel_1.add(label_5);
        JLabel label_6 = new JLabel("3 ตัวเต็ง");
        label_6.setBounds(744, 385, 85, 34);
        panel_1.add(label_6);
        this.textField_14 = new JTextField();
        this.textField_14.setColumns(10);
        this.textField_14.setBounds(863, 385, 115, 34);
        panel_1.add(this.textField_14);
        this.textField_15 = new JTextField();
        this.textField_15.setColumns(10);
        this.textField_15.setBounds(990, 385, 115, 34);
        panel_1.add(this.textField_15);
        JLabel label_7 = new JLabel("2 ตัวบน");
        label_7.setBounds(744, 428, 85, 34);
        panel_1.add(label_7);
        this.textField_16 = new JTextField();
        this.textField_16.setColumns(10);
        this.textField_16.setBounds(863, 428, 115, 34);
        panel_1.add(this.textField_16);
        this.textField_17 = new JTextField();
        this.textField_17.setColumns(10);
        this.textField_17.setBounds(990, 428, 115, 34);
        panel_1.add(this.textField_17);
        JLabel label_8 = new JLabel("2 ตัวล่าง");
        label_8.setBounds(744, 463, 85, 34);
        panel_1.add(label_8);
        this.textField_18 = new JTextField();
        this.textField_18.setColumns(10);
        this.textField_18.setBounds(863, 463, 115, 34);
        panel_1.add(this.textField_18);
        this.textField_19 = new JTextField();
        this.textField_19.setColumns(10);
        this.textField_19.setBounds(990, 463, 115, 34);
        panel_1.add(this.textField_19);
        JLabel label_9 = new JLabel("วิ่งบน");
        label_9.setBounds(744, 503, 85, 34);
        panel_1.add(label_9);
        this.textField_20 = new JTextField();
        this.textField_20.setColumns(10);
        this.textField_20.setBounds(863, 503, 115, 34);
        panel_1.add(this.textField_20);
        this.textField_21 = new JTextField();
        this.textField_21.setColumns(10);
        this.textField_21.setBounds(990, 503, 115, 34);
        panel_1.add(this.textField_21);
        JLabel label_10 = new JLabel("วิ่งล่าง");
        label_10.setBounds(744, 540, 85, 34);
        panel_1.add(label_10);
        this.textField_22 = new JTextField();
        this.textField_22.setColumns(10);
        this.textField_22.setBounds(863, 540, 115, 34);
        panel_1.add(this.textField_22);
        this.textField_23 = new JTextField();
        this.textField_23.setColumns(10);
        this.textField_23.setBounds(990, 540, 115, 34);
        panel_1.add(this.textField_23);
        this.textField_24 = new JTextField();
        this.textField_24.setColumns(10);
        this.textField_24.setBounds(1117, 343, 115, 34);
        panel_1.add(this.textField_24);
        this.textField_25 = new JTextField();
        this.textField_25.setColumns(10);
        this.textField_25.setBounds(1117, 385, 115, 34);
        panel_1.add(this.textField_25);
        this.textField_26 = new JTextField();
        this.textField_26.setColumns(10);
        this.textField_26.setBounds(1117, 428, 115, 34);
        panel_1.add(this.textField_26);
        this.textField_27 = new JTextField();
        this.textField_27.setColumns(10);
        this.textField_27.setBounds(1117, 463, 115, 34);
        panel_1.add(this.textField_27);
        this.textField_28 = new JTextField();
        this.textField_28.setColumns(10);
        this.textField_28.setBounds(1117, 503, 115, 34);
        panel_1.add(this.textField_28);
        this.textField_29 = new JTextField();
        this.textField_29.setColumns(10);
        this.textField_29.setBounds(1117, 540, 115, 34);
        panel_1.add(this.textField_29);
        this.customerDBImplement.getCustomerName();
        Map<String, String> customerNameMap = this.customerDBImplement.getCustomerName();
        Vector<String> Items = new Vector();
        if (!customerNameMap.isEmpty()) {
            customerNameMap.forEach((id, name) -> {
                Items.add(name);
            });
        }

        DefaultComboBoxModel modelCustomer = new DefaultComboBoxModel(Items);
        JComboBox comboBox = new JComboBox(modelCustomer);
        comboBox.setBounds(863, 30, 223, 27);
        panel_1.add(comboBox);
        JLabel label_11 = new JLabel("ลูกค้า");
        label_11.setBounds(744, 25, 85, 34);
        panel_1.add(label_11);
        JLabel label_12 = new JLabel("ยอดขาย");
        label_12.setBounds(744, 76, 85, 34);
        panel_1.add(label_12);
        JLabel label_13 = new JLabel("%ขาย");
        label_13.setBounds(744, 122, 85, 34);
        panel_1.add(label_13);
        JLabel label_14 = new JLabel("คงเหลือ");
        label_14.setBounds(744, 169, 85, 34);
        panel_1.add(label_14);
        JLabel label_15 = new JLabel("ยอดถูก");
        label_15.setBounds(744, 224, 85, 34);
        panel_1.add(label_15);
        JLabel label_16 = new JLabel("ยอดสุทธิ");
        label_16.setBounds(744, 270, 85, 34);
        panel_1.add(label_16);
        this.textField_30 = new JTextField();
        this.textField_30.setColumns(10);
        this.textField_30.setBounds(863, 80, 242, 34);
        panel_1.add(this.textField_30);
        this.textField_31 = new JTextField();
        this.textField_31.setColumns(10);
        this.textField_31.setBounds(863, 126, 242, 34);
        panel_1.add(this.textField_31);
        this.textField_32 = new JTextField();
        this.textField_32.setColumns(10);
        this.textField_32.setBounds(863, 173, 242, 34);
        panel_1.add(this.textField_32);
        this.textField_33 = new JTextField();
        this.textField_33.setColumns(10);
        this.textField_33.setBounds(863, 224, 242, 34);
        panel_1.add(this.textField_33);
        this.textField_34 = new JTextField();
        this.textField_34.setColumns(10);
        this.textField_34.setBounds(863, 270, 242, 34);
        panel_1.add(this.textField_34);
        JLabel label_17 = new JLabel("บาท");
        label_17.setBounds(1117, 76, 85, 34);
        panel_1.add(label_17);
        JLabel label_18 = new JLabel("บาท");
        label_18.setBounds(1117, 122, 85, 34);
        panel_1.add(label_18);
        JLabel label_19 = new JLabel("บาท");
        label_19.setBounds(1117, 169, 85, 34);
        panel_1.add(label_19);
        JLabel label_20 = new JLabel("บาท");
        label_20.setBounds(1117, 224, 85, 34);
        panel_1.add(label_20);
        JLabel label_21 = new JLabel("บาท");
        label_21.setBounds(1117, 270, 85, 34);
        panel_1.add(label_21);
        JLabel label_22 = new JLabel("ขาย");
        label_22.setHorizontalAlignment(0);
        label_22.setBounds(886, 316, 71, 27);
        panel_1.add(label_22);
        this.label_23 = new JLabel("% ขาย");
        this.label_23.setHorizontalAlignment(0);
        this.label_23.setBounds(1005, 316, 71, 27);
        panel_1.add(this.label_23);
        this.label_24 = new JLabel("ถูก");
        this.label_24.setHorizontalAlignment(0);
        this.label_24.setBounds(1131, 316, 71, 27);
        panel_1.add(this.label_24);
        this.mainSummaryPdf();
        this.customerSummaryPdf();
        this.fullcustomerSummaryPdf();
    }

    public void mainSummaryPdf() throws IOException {
        Document document = new Document();

        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("main.pdf"));
            document.open();
            document.add(this.addHeaderParagraph("รายงานสรุปผลกำไร", "งวดประจำวันที่ : "));
            document.add(new Paragraph("\n"));
            document.add(this.mainSummaryTable());
            document.add(new Paragraph("\n"));
            document.add(this.unBorderSummaryTable());
            document.add(new Paragraph("\n"));
            document.add(new LineSeparator());
            document.add(new Paragraph("\n"));
            document.add(this.headCustomerTable());
            document.add(this.customerSummaryTable());
            document.close();
            writer.close();
        } catch (DocumentException var3) {
            var3.printStackTrace();
        } catch (FileNotFoundException var4) {
            var4.printStackTrace();
        }

    }

    public void customerSummaryPdf() throws IOException {
        Document document = new Document();

        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("customer.pdf"));
            document.open();
            document.add(this.addHeaderParagraph("รายงานสรุปการขาย(ย่อ)", "งวดประจำวันที่ : "));
            document.add(new Paragraph("ลูกค้า : ", this.font));
            document.add(new Paragraph("\n"));
            document.add(this.subCustomerSummaryTable());
            document.close();
            writer.close();
        } catch (DocumentException var3) {
            var3.printStackTrace();
        } catch (FileNotFoundException var4) {
            var4.printStackTrace();
        }

    }

    public void fullcustomerSummaryPdf() throws IOException {
        Document document = new Document();

        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("fullcustomer.pdf"));
            document.open();
            document.add(this.addHeaderParagraph("รายงานสรุปการขาย(เต็ม)", "งวดประจำวันที่ : "));
            document.add(new Paragraph("ลูกค้า : ", this.font));
            document.add(new Paragraph("\n"));
            document.add(this.fullCustomerSummaryTable());
            document.close();
            writer.close();
        } catch (DocumentException var3) {
            var3.printStackTrace();
        } catch (FileNotFoundException var4) {
            var4.printStackTrace();
        }

    }

    public Paragraph addHeaderParagraph(String leftHeader, String rightHeader) throws DocumentException, IOException {
        Paragraph preface = new Paragraph(leftHeader, this.font);
        preface.add(new Chunk(new VerticalPositionMark()));
        preface.add(rightHeader);
        preface.setAlignment(2);
        return preface;
    }

    public PdfPTable mainSummaryTable() throws DocumentException, IOException {
        PdfPTable table = new PdfPTable(1);
        Paragraph preface = new Paragraph("ผลกำไร", this.font);
        preface.add(new Chunk(new VerticalPositionMark()));
        preface.add("341,241");
        preface.setAlignment(1);
        preface.add(new Chunk(new VerticalPositionMark()));
        preface.add("งวดประจำวันที่ : ");
        preface.setAlignment(2);
        PdfPCell c1 = new PdfPCell(preface);
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        return table;
    }

    public PdfPTable unBorderSummaryTable() {
        PdfPTable table = new PdfPTable(4);
        PdfPCell c1 = new PdfPCell(new Phrase("ยอดขายรวม", this.font));
        c1.setBorder(0);
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("% ขายรวม", this.font));
        c1.setBorder(0);
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("คงเหลือ", this.font));
        c1.setBorder(0);
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("ยอดถูกรวม", this.font));
        c1.setBorder(0);
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("ยอดสุทธิ", this.font));
        c1.setBorder(0);
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        table.setHeaderRows(1);
        table.addCell(c1);
        table.addCell(c1);
        table.addCell(c1);
        table.addCell(c1);
        return table;
    }

    public PdfPTable customerSummaryTable() {
        PdfPTable table = new PdfPTable(6);
        PdfPCell c1 = new PdfPCell(new Phrase("ชื่อ", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("ยอดขาย", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("เปอรเซนต์", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("คงเหลือ", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("ยอดถูก", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("ยอดสุทธิ", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        table.setHeaderRows(1);
        table.addCell(c1);
        table.addCell(c1);
        table.addCell(c1);
        table.addCell(c1);
        table.addCell(c1);
        table.addCell(c1);
        this.allSummaryTable(table);
        return table;
    }

    public PdfPTable subCustomerSummaryTable() {
        PdfPTable table = new PdfPTable(6);
        PdfPCell c1 = new PdfPCell(new Phrase("แผ่นที่", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("ยอดขาย", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("เปอรเซนต์", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("คงเหลือ", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("ยอดถูก", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("ยอดสุทธิ", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        table.setHeaderRows(1);
        table.addCell(c1);
        table.addCell(c1);
        table.addCell(c1);
        table.addCell(c1);
        table.addCell(c1);
        table.addCell(c1);
        this.allSummaryTable(table);
        return table;
    }

    public PdfPTable fullCustomerSummaryTable() {
        PdfPTable table = new PdfPTable(6);
        PdfPCell c1 = new PdfPCell(new Phrase("แผ่นที่", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("3ตัวโต๊ด", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("3ตัวเต็ง", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("2ตัวบน", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("2ตัวล่าง", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("วิ่งบน", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("วิงล่าง", this.font));
        c1.setHorizontalAlignment(1);
        table.addCell(c1);
        table.setHeaderRows(1);
        table.addCell(c1);
        table.addCell(c1);
        table.addCell(c1);
        table.addCell(c1);
        table.addCell(c1);
        table.addCell(c1);
        table.addCell(c1);
        return table;
    }

    private void allSummaryTable(PdfPTable table) {
        Phrase phrase = new Phrase("รวม", this.font);
        PdfPCell summaryCell = new PdfPCell(phrase);
        summaryCell.setHorizontalAlignment(1);
        table.addCell(summaryCell);
        summaryCell.setPhrase(Phrase.getInstance("bas"));
        summaryCell.setHorizontalAlignment(2);
        table.addCell(summaryCell);
        table.addCell(summaryCell);
        table.addCell(summaryCell);
        table.addCell(summaryCell);
        table.addCell(summaryCell);
    }

    public PdfPTable headCustomerTable() {
        PdfPTable headTable = new PdfPTable(1);
        headTable.addCell(new Phrase("รายการสรุปยอดลูกค้า", this.font));
        return headTable;
    }

    public void createBaseFont() throws DocumentException, IOException {
        this.font = new Font(BaseFont.createFont("/THSarabun.ttf", "Identity-H", true));
    }
}
