package GUI;

import javax.swing.JOptionPane;

public class Reader {
    int k;
    int i;
    String n1, n2;

    public void Scan() {
        n1 = JOptionPane.showInputDialog("Input first number");
        n2 = JOptionPane.showInputDialog("Input second number");
        i = Integer.parseInt(n1);
        k = Integer.parseInt(n2);

    }

    public void Scan(int a, int b) {
        JOptionPane.showMessageDialog(null, "First number=" + a);
        JOptionPane.showMessageDialog(null, "Second number=" + b);
    }
}
