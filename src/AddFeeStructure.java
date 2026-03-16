import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddFeeStructure extends JFrame implements ActionListener{


//    public static void main(String[] args) {
//    new AddFeeStructure();
//    }



     AddFeeStructure(){
    this.setLayout(null);
    this.setSize(1000,700);
    this.setTitle("Add Fee Structure");
    this.setForeground(Color.GRAY);
    this.setResizable(false);

    JLabel backgroundLabel=new JLabel();
        backgroundLabel.setLayout(null);
        backgroundLabel.setBounds(0, 0, 1000, 700);
  
       Image icon = Toolkit.getDefaultToolkit().getImage(
       "C:\\Users\\dell\\OneDrive\\Desktop\\poorvi singh\\My student management system\\My student management system\\src\\addnewteacher.jpeg");
       icon=icon.getScaledInstance(1000, 700, Image.SCALE_SMOOTH);
       ImageIcon i = new ImageIcon(icon);
       backgroundLabel.setIcon(i);
   

    JLabel classnamelabel=new JLabel();
    classnamelabel.setText("Class Name");
    classnamelabel.setBounds(280, 100, 150, 20);
    classnamelabel.setFont(new Font("Arial",Font.PLAIN,20));
    classnamelabel.setLayout(null);
    this.add(classnamelabel);

    JLabel feelabel = new JLabel();
    feelabel.setText("Fee/Year(Rs)");
    feelabel.setBounds(280, 170, 150, 20);
    feelabel.setFont(new Font("Arial",Font.PLAIN,20));
    feelabel.setLayout(null);
    this.add(feelabel);

    JTextField classnametextfield = new JTextField();
    classnametextfield.setBounds(500, 100,200, 30);
    classnametextfield.setVisible(true);
    classnametextfield.setFont(new Font("Arial", Font.PLAIN, 20));
    this.add(classnametextfield);

   JTextField feetextfield= new JTextField();
   feetextfield.setBounds(500,170,200,30);
   feetextfield.setFont(new Font("Arial",Font.PLAIN,20));
   this.add(feetextfield);

    JButton addfeedetailsbutton=new JButton();
    addfeedetailsbutton.setText("Add Class");
    addfeedetailsbutton.setForeground(Color.WHITE);
    addfeedetailsbutton.setBackground(Color.BLACK);
    addfeedetailsbutton.setBounds(280,250,150,35);
    addfeedetailsbutton.setFont(new Font("Arial",Font.PLAIN,20));
    addfeedetailsbutton.setFocusable(false);
    this.add(addfeedetailsbutton);


  JButton backbutton=new JButton();
     backbutton.setText("Back");
    backbutton.setForeground(Color.GREEN);
    backbutton.setBackground(Color.BLACK);
    backbutton.setBounds(520, 250, 150, 35);
    backbutton.setFont(new Font("Arial",Font.PLAIN,20));
    backbutton.setFocusable(false);

    
    addfeedetailsbutton.addActionListener(this);
    backbutton.addActionListener(this);
    this.add(backbutton);

    
  
  

   this.add(backgroundLabel);

   this.setVisible(true);
}  
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
   


}

