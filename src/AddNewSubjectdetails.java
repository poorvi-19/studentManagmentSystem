
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

public class AddNewSubjectdetails extends JFrame implements ActionListener {

    // public static void main(String[] args) {
    //       new AddNewSubjectdetails();
    // }



    
    AddNewSubjectdetails(){





    this.setLayout(null);
    this.setSize(700,500);
    this.setTitle("Add New Subject Details");
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

    JLabel subjectcodelabel=new JLabel();
    subjectcodelabel.setText("Subject Code");
    subjectcodelabel.setBounds(90, 50, 150, 30);
    subjectcodelabel.setFont(new Font("Arial",Font.PLAIN,20));
    subjectcodelabel.setLayout(null);
    this.add(subjectcodelabel);

    JLabel subjectnamelabel = new JLabel();
    subjectnamelabel.setText("Subject Name");
    subjectnamelabel.setBounds(90, 100, 150, 30);
    subjectnamelabel.setFont(new Font("Arial",Font.PLAIN,20));
    subjectnamelabel.setLayout(null);
    this.add(subjectnamelabel);


    JTextField subjectcodetextfield = new JTextField();
    subjectcodetextfield.setBounds(270,50,150,30);
    subjectcodetextfield.setFont(new Font("Arial",Font.PLAIN,30));
   subjectcodetextfield.setLayout(null);
    this.add(subjectcodetextfield);


    JTextField subjectnametextfield = new JTextField();
    subjectnametextfield.setBounds(270,100,150,30);
    subjectnametextfield.setFont(new Font("Arial",Font.PLAIN,30));
    subjectnametextfield.setLayout(null);
    this.add(subjectnametextfield);

   
    JButton addsubjectbutton=new JButton();
    addsubjectbutton.setText("Add Subject");
    addsubjectbutton.setForeground(Color.WHITE);
    addsubjectbutton.setBackground(Color.BLACK);
    addsubjectbutton.setBounds(90,150,150,35);
    addsubjectbutton.setFont(new Font("Arial",Font.PLAIN,20));
    addsubjectbutton.setFocusable(false);
      this.add(addsubjectbutton);

    JButton backbutton=new JButton();
    backbutton.setText("Back");
    backbutton.setForeground(Color.GREEN);
    backbutton.setBackground(Color.BLACK);
    backbutton.setBounds(270,150,150, 35);
    backbutton.setFont(new Font("Arial",Font.PLAIN,20));
    backbutton.setFocusable(false);

    addsubjectbutton.addActionListener(this);
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



