package Panel;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test {

    public static void main(String[] args) {
            
            JLabel label = new JLabel();
            JPanel bluepanel= new JPanel();
            JPanel redpanel = new JPanel();
            JPanel greenpanel = new JPanel();
            
            
            

            label.setText("HI");
            ImageIcon image = new ImageIcon("indir.png");
            label.setIcon(image);
            label.setVerticalAlignment(JLabel.BOTTOM);
            label.setHorizontalAlignment(JLabel.RIGHT);
            redpanel.setBackground(Color.red);
            redpanel.setBounds(0,0,250,250);
          
            
            bluepanel.setBackground(Color.blue);
            bluepanel.setBounds(250,0,250,250);
            
            
            greenpanel.setBackground(Color.green);
            greenpanel.setBounds(0,250,500,250);
            
            
        
            
            
            

        
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.setSize(750,750);
            frame.setVisible(true);
            greenpanel.add(label);
            frame.add(greenpanel);
            frame.add(bluepanel);
            frame.add(redpanel);
            






    }
    
}
