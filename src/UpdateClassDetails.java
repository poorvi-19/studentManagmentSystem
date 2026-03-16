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

public class UpdateClassDetails extends JFrame implements ActionListener{

    // public static void main(String[] args) {
    //     new UpdateClassDetails();
    // }

    UpdateClassDetails(){

    this.setLayout(null);
    this.setSize(1000,700);
    this.setTitle("Update Class Details");
    
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

   
    JLabel classnameupdateLabel = new JLabel();
    classnameupdateLabel.setText("Class Name");
    classnameupdateLabel.setBounds(100,70,150,30);
    classnameupdateLabel.setFont(new Font("Arial",Font.PLAIN,20));
    classnameupdateLabel.setLayout(null);
    this.add(classnameupdateLabel);

    JLabel sectionupdateLabel = new JLabel();
    sectionupdateLabel.setText("Section");
    sectionupdateLabel.setBounds(100,140,150,30);
    sectionupdateLabel.setFont(new Font("Arial",Font.PLAIN,20));
    sectionupdateLabel.setLayout(null);
    this.add(sectionupdateLabel);

    JLabel classstrengthupdateLabel = new JLabel();
    classstrengthupdateLabel.setText("Class Strength ");
    classstrengthupdateLabel.setBounds(100,210,150,30);
    classstrengthupdateLabel.setFont(new Font("Arial",Font.PLAIN,20));
    classstrengthupdateLabel.setLayout(null);
    this.add(classstrengthupdateLabel);


    JLabel enrolledstudentupdateLabel = new JLabel();
    enrolledstudentupdateLabel.setText("Enrolled Student");
    enrolledstudentupdateLabel.setBounds(100,280,150,30);
   enrolledstudentupdateLabel.setFont(new Font("Arial",Font.PLAIN,20));
    enrolledstudentupdateLabel.setLayout(null);
    this.add(enrolledstudentupdateLabel);

     
    JTextField classnameupdatetextfield = new JTextField();
    classnameupdatetextfield.setBounds(400,70,150,30);
    classnameupdatetextfield.setFont(new Font("Arial",Font.PLAIN,20));
   classnameupdatetextfield.setLayout(null);
    this.add(classnameupdatetextfield);


    JTextField sectionupdatetextfield = new JTextField();
    sectionupdatetextfield.setBounds(400,140,150,30);
    sectionupdatetextfield.setFont(new Font("Arial",Font.PLAIN,20));
    sectionupdatetextfield.setLayout(null);
    this.add(sectionupdatetextfield);

    
    JTextField studentstrengthupdatetextfield = new JTextField();
    studentstrengthupdatetextfield.setBounds(400,210,150,30);
    studentstrengthupdatetextfield.setFont(new Font("Arial",Font.PLAIN,20));
    studentstrengthupdatetextfield.setLayout(null);
    this.add(studentstrengthupdatetextfield);
    

     JTextField enrolledstudentupdatetextfield = new JTextField();
    enrolledstudentupdatetextfield.setBounds(400,280,150,30);
    enrolledstudentupdatetextfield.setFont(new Font("Arial",Font.PLAIN,20));
   enrolledstudentupdatetextfield.setLayout(null);
    this.add(enrolledstudentupdatetextfield);

    
    JButton updateclassbutton = new JButton();
    updateclassbutton.setText("Update Class ");
    updateclassbutton.setForeground(Color.WHITE);
    updateclassbutton.setBackground(Color.BLACK);
    updateclassbutton.setBounds(100,350,180,40);
    updateclassbutton.setFont(new Font("Arial",Font.PLAIN,20));
    updateclassbutton.setFocusable(false);this.add(updateclassbutton);
    
    JButton backbutton = new JButton();
    backbutton.setText("BACK");
    backbutton.setForeground(Color.GREEN);
    backbutton.setBackground(Color.BLACK);
    backbutton.setBounds(400,350,150,40);
    backbutton.setFont(new Font("Arial",Font.PLAIN,20));
    backbutton.setFocusable(false);


     updateclassbutton.addActionListener(this);
    backbutton.addActionListener(this);
     this.add(updateclassbutton);
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
