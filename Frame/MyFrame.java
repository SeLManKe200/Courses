package Frame;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

MyFrame(){
    
        this.setVisible(true);
        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        ImageIcon image = new ImageIcon("logo.png");
        this.setIconImage(image.getImage());       //change icon of frame 

        this.getContentPane().setBackground(new Color(0,0,0));
}

    
}
