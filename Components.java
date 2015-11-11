import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Components extends JApplet {
    @Override
    public void init() {
        this.add(new JLabel("This is a label"));
        this.add(new JTextField("This is a text field", 20));
        this.add(new JButton("This is a button"));
        this.setLayout(new FlowLayout());
    }
}