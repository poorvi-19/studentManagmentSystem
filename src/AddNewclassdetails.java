import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddNewclassdetails extends JFrame implements ActionListener{


// public static void main(String[] args) {
//     new AddNewclassdetails();
// }
  


AddNewclassdetails(){
   

       
    this.setLayout(null);
    this.setSize(1000,700);
    this.setTitle("Add new class details");
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
    classnamelabel.setBounds(90, 50, 150, 20);
    classnamelabel.setFont(new Font("Arial",Font.PLAIN,20));
    classnamelabel.setLayout(null);
    this.add(classnamelabel);

    JLabel sectionlabel = new JLabel();
    sectionlabel.setText("Section");
    sectionlabel.setBounds(90, 100, 150, 20);
    sectionlabel.setFont(new Font("Arial",Font.PLAIN,20));
    sectionlabel.setLayout(null);
    this.add(sectionlabel);

    JLabel studentusernamelabel = new JLabel();
    studentusernamelabel.setText("Student Strength");
    studentusernamelabel.setBounds(90, 150, 180, 20);
    studentusernamelabel.setFont(new Font("Arial",Font.PLAIN,20));
    studentusernamelabel.setLayout(null);
    this.add(studentusernamelabel);

    JLabel enrolledstudentLabel = new JLabel();
    enrolledstudentLabel.setText("Enrolled Student");
    enrolledstudentLabel.setBounds(90, 200, 180, 20);
    enrolledstudentLabel.setFont(new Font("Arial",Font.PLAIN,20));
    enrolledstudentLabel.setLayout(null);
    this.add(enrolledstudentLabel);



    JTextField classnametextfield = new JTextField();
    classnametextfield.setBounds(300, 50, 200, 30);
    classnametextfield.setVisible(true);
    classnametextfield.setFont(new Font("Arial", Font.PLAIN, 20));
    this.add(classnametextfield);

   JTextField sectiontextfield= new JTextField();
   sectiontextfield.setBounds(300,100,200,30);
   sectiontextfield.setFont(new Font("Arial",Font.PLAIN,20));
   this.add(sectiontextfield);

    
   JTextField studentstrengthtextfield= new JTextField();
   studentstrengthtextfield.setBounds(300,150,200,30);
   studentstrengthtextfield.setFont(new Font("Arial",Font.PLAIN,20));
   this.add(studentstrengthtextfield);

   JTextField enrolledstudenttextfield= new JTextField();
   enrolledstudenttextfield.setBounds(300,200,200,30);
   enrolledstudenttextfield.setFont(new Font("Arial",Font.PLAIN,20));
   this.add(enrolledstudenttextfield);



    JButton addclassbutton=new JButton();
    addclassbutton.setText("Add Class");
    addclassbutton.setForeground(Color.WHITE);
    addclassbutton.setBackground(Color.BLACK);
    addclassbutton.setBounds(90,300,150,35);
    addclassbutton.setFont(new Font("Arial",Font.PLAIN,20));
    addclassbutton.setFocusable(false);
    this.add(addclassbutton);

    JButton backbutton=new JButton();
    backbutton.setText("Back");
    backbutton.setForeground(Color.GREEN);
    backbutton.setBackground(Color.BLACK);
    backbutton.setBounds(320, 300, 150, 35);
    backbutton.setFont(new Font("Arial",Font.PLAIN,20));
    backbutton.setFocusable(false);
    addclassbutton.addActionListener(this);
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
