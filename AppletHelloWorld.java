import java.awt.Color;
import javax.swing.JApplet;
import javax.swing.JTextArea;

public class AppletHelloWorld extends JApplet {

    @Override
    public void init() {
        JTextArea area = new JTextArea("Hello 1 World");
        this.add(area);
        area.setBackground(Color.LIGHT_GRAY);
    }
}
