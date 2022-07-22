import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class currency_conventer {
    public static void converter() {

        JFrame f = new JFrame(" CURRENCY CONVERTER");

        JLabel l1, l2, l3;
        l1 = new JLabel("ENTER AMOUNT:");
        l1.setBounds(60, 10, 160, 40);
        l2 = new JLabel("CONVERT FROM:");
        l2.setBounds(60, 60, 140, 40);
        l3 = new JLabel("COVERT TO:");
        l3.setBounds(80, 110, 100, 40);

        JTextField t1;
        t1 = new JTextField("");
        t1.setBounds(170, 10, 80, 40);
        t1.setBackground(Color.GRAY);
        t1.setForeground(Color.BLACK);

        JButton b1;
        b1 = new JButton("convert");
        b1.setBounds(170, 150, 100, 40);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.BLACK);

        String currency[] = { "Rupees", "Dollar", "Euro" };
        JComboBox cb = new JComboBox(currency);
        cb.setBounds(170, 70, 90, 20);
        String Currency[] = { "Dollar", "Rupees", "Euro" };
        JComboBox cb1 = new JComboBox(Currency);
        cb1.setBounds(170, 120, 90, 20);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double d = Double.parseDouble(t1.getText());
                if (cb.getSelectedItem().toString() == "Rupees" && cb1.getSelectedItem().toString() == "Dollar") {
                    double convert = d / 75;
                    JOptionPane.showMessageDialog(null, "The converted Amount is:  " + convert + "USD");
                } else if (cb.getSelectedItem().toString() == "Rupees" && cb1.getSelectedItem().toString() == "Euro") {
                    double convert = d / 84;
                    JOptionPane.showMessageDialog(null, "The converted Amount is:  " + convert + "EUR");
                } else if (cb.getSelectedItem().toString() == "Dollar"
                        && cb1.getSelectedItem().toString() == "Rupees") {
                    double convert = d * 75;
                    JOptionPane.showMessageDialog(null, "The converted Amount is:  " + convert + "INR");
                } else if (cb.getSelectedItem().toString() == "Dollar" && cb1.getSelectedItem().toString() == "Euro") {
                    double convert = d * 0.89;
                    JOptionPane.showMessageDialog(null, "The converted Amount is:  " + convert + "EUR");
                } else if (cb.getSelectedItem().toString() == "Euro" && cb1.getSelectedItem().toString() == "Dollar") {
                    double convert = d / 0.89;
                    JOptionPane.showMessageDialog(null, "The converted Amount is:  " + convert + "USD");
                } else if (cb.getSelectedItem().toString() == "Euro" && cb1.getSelectedItem().toString() == "Rupees") {
                    double convert = d * 84;
                    JOptionPane.showMessageDialog(null, "The converted Amount is:  " + convert + "INR");
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot Be Converted ");
                }
            }
        });
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(b1);
        f.add(cb);
        f.add(cb1);
        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        converter();
    }
}
