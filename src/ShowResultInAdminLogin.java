import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowResultInAdminLogin extends JFrame{

   
  JFrame studentPageFrame;
  JTextField hinField,enField,evsField,gkField,mathField;
 


  // public static void main(String[] args) {
  //  new StudentPage("puchu@28", "puchu@123");
  // }
  
  ShowResultInAdminLogin(String name,int mathmarks,int hindiMarks,int englishMarks,int evsMarks,int gkMarks){
  studentPageFrame=this;
  studentPageFrame.setTitle("School Management System");
  studentPageFrame.setSize(1000,600);
  studentPageFrame.setLayout(null);

  studentPageFrame.setResizable(false);
 

      
   JLabel backgroundLabel=new JLabel();
   backgroundLabel.setLayout(null);
   backgroundLabel.setBounds(0, 0, 1000, 600);
   backgroundLabel.setForeground(new Color(245,242,242));
  
       Image icon = Toolkit.getDefaultToolkit().getImage(
       "C:\\Users\\dell\\OneDrive\\Desktop\\poorvi singh\\My student management system\\My student management system\\src\\result.jpeg");
 
       icon=icon.getScaledInstance(1000, 600, Image.SCALE_SMOOTH);
       ImageIcon i = new ImageIcon(icon);
       backgroundLabel.setIcon(i);
       


    JLabel currentStudentLabel=new JLabel();
    currentStudentLabel.setBounds(100,20,400,40);
    currentStudentLabel.setFont(new Font("Arial",Font.BOLD,30));
    currentStudentLabel.setForeground(new Color(245,242,242));
    currentStudentLabel.setText("Hello Sir!");
    this.add(currentStudentLabel);

    JLabel resultLabel, hindi,english,math,evs,generalKnowledge;

    resultLabel=new JLabel();
    hindi=new JLabel();
    english=new JLabel();
    evs=new JLabel();
    generalKnowledge=new JLabel();
    math=new JLabel();

    

    resultLabel.setBounds(250,135,400,40);
    resultLabel.setText(name+"'s result is : ");
    resultLabel.setFont(new Font("Arial",Font.BOLD,30));
    resultLabel.setForeground(new Color(245,242,242));
    this.add(resultLabel);



    hindi.setBounds(150,200,200,40);
    hindi.setText("Hindi: ");
    hindi.setFont(new Font("Arial",Font.BOLD,30));
    hindi.setForeground(new Color(245,242,242));
    this.add(hindi);



    english.setBounds(150,250,200,40);
    english.setText("English:");
    english.setFont(new Font("Arial",Font.BOLD,30));
    english.setForeground(new Color(245,242,242));
    this.add(english);

    math.setBounds(150,300,200,40);
    math.setText("Math:");
    math.setFont(new Font("Arial",Font.BOLD,30));
    math.setForeground(new Color(245,242,242));
    this.add(math);

    evs.setBounds(150,350,200,40);
    evs.setText("EVS:");
    evs.setFont(new Font("Arial",Font.BOLD,30));
    evs.setForeground(new Color(245,242,242));
    this.add(evs);

    generalKnowledge.setBounds(150,400,200,40);
    generalKnowledge.setText("GK:");
    generalKnowledge.setFont(new Font("Arial",Font.BOLD,30));
    generalKnowledge.setForeground(new Color(245,242,242));
    this.add(generalKnowledge);
   

    hinField=new JTextField();
    hinField.setBounds(400, 200, 150, 30);
    hinField.setFont(new Font("Arial",Font.BOLD,30));
    hinField.setEditable(false);
    hinField.setText(hindiMarks+"");
    this.add(hinField);

    enField=new JTextField();
    enField.setBounds(400, 250, 150, 30);
    enField.setFont(new Font("Arial",Font.BOLD,30)); 
    enField.setEditable(false);
    enField.setText(englishMarks+"");
    this.add(enField);
    
    mathField=new JTextField();
    mathField.setBounds(400, 300, 150, 30);
    mathField.setFont(new Font("Arial",Font.BOLD,30));
    mathField.setEditable(false);
    mathField.setText(mathmarks+"");
    this.add(mathField);
   

    evsField=new JTextField();
    evsField.setBounds(400, 350, 150, 30);
    evsField.setFont(new Font("Arial",Font.BOLD,30));
    evsField.setEditable(false);
    evsField.setText(evsMarks+"");
    this.add(evsField);

    gkField=new JTextField();
    gkField.setBounds(400, 400, 150, 30);
    gkField.setFont(new Font("Arial",Font.BOLD,30));
    gkField.setEditable(false);
    gkField.setText(gkMarks+"");
    this.add(gkField);

    
  
    studentPageFrame.add(backgroundLabel);
    this.setVisible(true);
    
   }
}






