package Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label; 

    MyFrame(){
        ImageIcon icon = new ImageIcon("button.png");
        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150,250,150,150);
        label.setVisible(false);


        button = new JButton();
        button.setBounds(200,100,500,250);
        button.setText("BUTTON");
        button.setFocusable(false);
        button.addActionListener(this);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        
        // action listener ekleme ve üstteki method eklemek yerine aşşağıdaki kodu yazarsak ta aynı şey olur.
        // button.addActionListener(e -> System.out.println("Merhaba")); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500,500);
        this.setLayout(null);
        this.add(button);
        this.add(label);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Merhaba");
            button.setEnabled(false);
            label.setVisible(true);
        }
        // TODO Auto-generated method stub
        
    }



    
}
