package Deneme;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test {




    public static void main(String[] args)  {
        JFrame frame = new JFrame("Rastgele bir Örnek");
        frame.setSize(500,500);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3= new JPanel();
        JLabel label = new JLabel();
        JButton button = new JButton();
        JTextField text = new JTextField();
        text.setBounds(0,100,200,200);
        text.setText("YAZI KISMI");

       
        
        
        
    
        panel.setBounds(0,0,100,100);
       panel.setBackground(Color.black);
       panel2.setBounds(0,100,100,100);
       panel2.setBackground(Color.red);
       panel3.setBounds(0,200,100,100);
       panel3.setBackground(Color.yellow);
       ButtonGroup bGroup=new ButtonGroup();
       bGroup.add(button);
       button.setBounds(20,300,150,100);
       button.addActionListener((ActionListener) new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(null);
            panel2.setBackground(Color.red);
            panel3.setBackground(Color.white);
            label.setText("Bayraklar asildi");
            label.setBounds(0,0,100,100);

            
        }


       });
       button.setText("AS BAYRAKLARI AS ");

       
       






        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(button);
        frame.add(label);
        frame.add(text);

      
        
       
        


    }
    
}
