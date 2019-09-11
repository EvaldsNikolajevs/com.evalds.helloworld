package lab0;

import javax.swing.*;

public class HelloWorld2 {
    public static void main(String[] args) {
        //asks to input name
        String name = JOptionPane.showInputDialog("enter name: ");

        JOptionPane.showMessageDialog(null,name);
    }
}
