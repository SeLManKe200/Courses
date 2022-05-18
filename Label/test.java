package Label;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class test {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Border border = BorderFactory.createLineBorder(Color.green,3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  frame.setSize(500,500);
        frame.setVisible(true);
        
        JLabel label = new JLabel("Bro , do you even code?");
        frame.add(label);
        ImageIcon image = new ImageIcon("coder.png");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV BOli",Font.PLAIN,20));
        label.setIconTextGap(5);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
       // label.setBounds(0,0,250,250);
       // frame.setLayout(null);
        frame.pack();   //bunu yazmadan önce eklenecek bütün şeylerin eklenmesi lazım 
    }
    
}
