// Various Swing buttons.
// <applet code=Buttons
//  width=450 height=200></applet>
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.basic.*;
import javax.swing.border.*;

public class Buttons extends JApplet {
  JButton jb = new JButton("JButton");
  JToggleButton jt =   new JToggleButton("JToggleButton");
  JCheckBox  jc = new JCheckBox("JCheckBox");
  JRadioButton  jr = new JRadioButton("JRadioButton");
  BasicArrowButton
    up = new BasicArrowButton(
      BasicArrowButton.NORTH),
    down = new BasicArrowButton(
      BasicArrowButton.SOUTH),
    right = new BasicArrowButton(
      BasicArrowButton.EAST),
    left = new BasicArrowButton(
      BasicArrowButton.WEST);
  public void init() {
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    cp.add(jb);
    cp.add(jt);
    cp.add(jc);
    cp.add(jr);
    JPanel jp = new JPanel();
    jp.setBorder(new TitledBorder("Directions"));
    jp.add(up);
    jp.add(down);
    jp.add(left);
    jp.add(right);
    cp.add(jp);
  }
  public static void main(String[] args) {
    Console.run(new Buttons(), 450, 200);
  }
} 
