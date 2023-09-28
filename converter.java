import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class converter {
    public static JFrame frmMain;
    public static JLabel lbl;
    public static JTextField text;
    public static JTextField textF;
    public static JLabel lblF;
    public static JButton bCtoF;
    public static JButton bFtoC;

    public static void main(String[] args) {
        frmMain = new JFrame("Temprature conveter");
        frmMain.setSize(150, 200);
        frmMain.setLayout(new FlowLayout());
        lbl = new JLabel("Input:");
        text = new JTextField(10);
        lblF = new JLabel("output:");
        textF = new JTextField(10);
        bCtoF = new JButton("Convert C to F");
        bFtoC = new JButton("Convert F to C");
        bCtoF.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String cText = text.getText();
                        double c = Double.parseDouble(cText);
                        double f = (c * 9 / 5) + 32;
                        textF.setText(String.valueOf(f));
                    }
                }
        );bFtoC.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String fText = text.getText();
                        double f= Double.parseDouble(fText);
                        double c = (f-32)*5/9;
                        textF.setText(String.valueOf(c));
                    }
                }
        );

        frmMain.add(lbl);
        frmMain.add(text);
        frmMain.add(lblF);
        frmMain.add(textF);
        frmMain.add(bCtoF);
        frmMain.add(bFtoC);
        frmMain.setVisible(true);
    }
}
