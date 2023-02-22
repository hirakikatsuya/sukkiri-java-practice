package chapter18;

import java.awt.FlowLayout;
import javax.swing.*;

public class Main4 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("はじめてのGUI");
    JLabel label = new JLabel("HELLO WORLD!");
    JButton button = new JButton("押してね!");
    frame.getContentPane().setLayout(new FlowLayout());
    frame.getContentPane().add(label);
    frame.getContentPane().add(button);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 100);
    frame.setVisible(true);
  }
}
