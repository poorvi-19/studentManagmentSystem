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



public class AddStudentFeeDetails extends JFrame implements ActionListener{
    

   //  public static void main(String[] args) {
   //     new AddStudentFeeDetails();
   //  }

    AddStudentFeeDetails(){

   this.setLayout(null);
    this.setSize(900,600);
    this.setTitle("Add Student Fee Details");
    this.setForeground(Color.GRAY);
     this.setResizable(false);
   
     JLabel backgroundLabel=new JLabel();
        backgroundLabel.setLayout(null);
        backgroundLabel.setBounds(0, 0, 1000, 600);
  
       Image icon = Toolkit.getDefaultToolkit().getImage(
       "C:\\Users\\dell\\OneDrive\\Desktop\\poorvi singh\\My student management system\\My student management system\\src\\addnewteacher.jpeg");  
       icon=icon.getScaledInstance(1050, 600, Image.SCALE_SMOOTH);
       ImageIcon i = new ImageIcon(icon);
       backgroundLabel.setIcon(i);

    JLabel classnamelabel=new JLabel();
    classnamelabel.setText("Class Name");
    classnamelabel.setBounds(90, 50, 150, 20);
    classnamelabel.setFont(new Font("Arial",Font.PLAIN,20));
    classnamelabel.setLayout(null);
    this.add(classnamelabel);

    JLabel usernamelabel = new JLabel();
    usernamelabel.setText("Username");
    usernamelabel.setBounds(90, 100, 150, 20);
    usernamelabel.setFont(new Font("Arial",Font.PLAIN,20));
    usernamelabel.setLayout(null);
    this.add(usernamelabel);


     JLabel emaillabel = new JLabel();
    emaillabel.setText("Email id");
    emaillabel.setBounds(90, 150, 150, 20);
    emaillabel.setFont(new Font("Arial",Font.PLAIN,20));
    emaillabel.setLayout(null);
    this.add(emaillabel);


     JLabel submitfee = new JLabel();
    submitfee.setText("Submit Fee");
    submitfee.setBounds(90, 200, 150, 20);
    submitfee.setFont(new Font("Arial",Font.PLAIN,20));
    submitfee.setLayout(null);
    this.add(submitfee);

     

    JLabel sectionlabel=new JLabel();
    sectionlabel.setText("Class Name");
    sectionlabel.setBounds(450, 50, 150, 20);
    sectionlabel.setFont(new Font("Arial",Font.PLAIN,20));
    sectionlabel.setLayout(null);
    this.add(sectionlabel);

    JLabel studentnamelabel = new JLabel();
    studentnamelabel.setText("Username");
    studentnamelabel.setBounds(450, 100, 150, 20);
    studentnamelabel.setFont(new Font("Arial",Font.PLAIN,20));
    studentnamelabel.setLayout(null);
    this.add(studentnamelabel);


     JLabel totalfeelabel = new JLabel();
    totalfeelabel.setText("Email id");
    totalfeelabel.setBounds(450, 150, 150, 20);
    totalfeelabel.setFont(new Font("Arial",Font.PLAIN,20));
    totalfeelabel.setLayout(null);
    this.add(totalfeelabel);


     JLabel feestatuslabel = new JLabel();
    feestatuslabel.setText("Submit Fee");
    feestatuslabel.setBounds(450, 200, 150, 20);
    feestatuslabel.setFont(new Font("Arial",Font.PLAIN,20));
    feestatuslabel.setLayout(null);
    this.add(feestatuslabel);

    JTextField classnametextfield = new JTextField();
    classnametextfield.setBounds(220, 50, 200, 30);
    classnametextfield.setVisible(true);
    classnametextfield.setFont(new Font("Arial", Font.PLAIN, 20));
    this.add(classnametextfield);

   JTextField usernametextfield= new JTextField();
   usernametextfield.setBounds(220,100,200,30);
   usernametextfield.setFont(new Font("Arial",Font.PLAIN,20));
   this.add(usernametextfield);

   
   JTextField emailtextfield= new JTextField();
   emailtextfield.setBounds(220,150,200,30);
   emailtextfield.setFont(new Font("Arial",Font.PLAIN,20));
   this.add(emailtextfield);

   JTextField submitfeetextfield= new JTextField();
   submitfeetextfield.setBounds(220,200,200,30);
   submitfeetextfield.setFont(new Font("Arial",Font.PLAIN,20));
   this.add(submitfeetextfield);

    JTextField sectiontextfield = new JTextField();
    sectiontextfield.setBounds(580, 50, 200, 30);
    sectiontextfield.setVisible(true);
    sectiontextfield.setFont(new Font("Arial", Font.PLAIN, 20));
    this.add(sectiontextfield);

   JTextField studentnametextfield= new JTextField();
   studentnametextfield.setBounds(580,100,200,30);
   studentnametextfield.setFont(new Font("Arial",Font.PLAIN,20));
   this.add(studentnametextfield);

   
   JTextField totalfeetextfield= new JTextField();
   totalfeetextfield.setBounds(580,150,200,30);
   totalfeetextfield.setFont(new Font("Arial",Font.PLAIN,20));
   this.add(totalfeetextfield);

   
   JTextField feestatustextfield= new JTextField();
   feestatustextfield.setBounds(580,200,200,30);
   feestatustextfield.setFont(new Font("Arial",Font.PLAIN,20));
   this.add(feestatustextfield);


    JButton submitbutton=new JButton();
    submitbutton.setText("Submit ");
    submitbutton.setForeground(Color.WHITE);
    submitbutton.setBackground(Color.BLACK);
    submitbutton.setBounds(220,250,150,35);
    submitbutton.setFont(new Font("Arial",Font.PLAIN,20));
    submitbutton.setFocusable(false);
    this.add(submitbutton);


  JButton backbutton=new JButton();
     backbutton.setText("Back");
    backbutton.setForeground(Color.GREEN);
    backbutton.setBackground(Color.BLACK);
    backbutton.setBounds(580, 250, 200, 35);
    backbutton.setFont(new Font("Arial",Font.PLAIN,20));
    backbutton.setFocusable(false);

    
    submitbutton.addActionListener(this);
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



