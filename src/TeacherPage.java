import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TeacherPage extends JFrame implements ActionListener{




  JFrame teacherPageFrame;
  String recUsernameString;

  TeacherPage(String usernameString){
  recUsernameString=usernameString;
  teacherPageFrame=this;
  teacherPageFrame.setTitle("Teacher Login Page");
  teacherPageFrame.setSize(1000,600);
  teacherPageFrame.setLayout(null);
  teacherPageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  teacherPageFrame.setResizable(false);


   JLabel backgroundLabel=new JLabel();
   backgroundLabel.setLayout(null);
   backgroundLabel.setBounds(0, 0, 1000, 600);
  
       Image icon = Toolkit.getDefaultToolkit().getImage(
       "C:\\Users\\dell\\OneDrive\\Desktop\\poorvi singh\\My student management system\\My student management system\\src\\addnewteacher.jpeg");
       icon=icon.getScaledInstance(1000, 600, Image.SCALE_SMOOTH);
       ImageIcon i = new ImageIcon(icon);
       backgroundLabel.setIcon(i);
       




  JMenuBar menuBar=new JMenuBar();
  menuBar.setBackground(new Color(160,160,160));
  menuBar.setSize(1000,70);

  JMenu teacherDetailMenu=new JMenu("Your Details");
  JMenu studentDetailsMenu=new JMenu("Student Details");
  JMenuItem addStudent=new JMenuItem("Add Student");
  JMenuItem updateStudent=new JMenuItem("Update student");
  JMenuItem updateMarks=new JMenuItem("Update Marks");
  JMenuItem deleteStudent=new JMenuItem("Delete Student");
  JMenuItem viewYourDetailsItem=new JMenuItem("View Your Details");
  teacherDetailMenu.add(viewYourDetailsItem);


  
  studentDetailsMenu.add(addStudent);
  studentDetailsMenu.add(updateStudent);
  studentDetailsMenu.add(updateMarks);
  studentDetailsMenu.add(deleteStudent);


  JMenu logoutMenu=new JMenu("Logout");
  JMenuItem logout=new JMenuItem("Exit");
  logoutMenu.add(logout);

      menuBar.add(teacherDetailMenu);
      menuBar.add(studentDetailsMenu);
      menuBar.add(logoutMenu);


       viewYourDetailsItem.addActionListener(this);
       addStudent.addActionListener(this);
       updateStudent.addActionListener(this);
       updateMarks.addActionListener(this);
       deleteStudent.addActionListener(this);
       logout.addActionListener(this);
    

  teacherPageFrame.setJMenuBar(menuBar);
  teacherPageFrame.add(backgroundLabel);
  teacherPageFrame.setVisible(true);






//  this.setVisible(true);




   }
     @Override
     public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
           if(e.getActionCommand()=="Exit"){
            this.setVisible(false);
            new LoginFrame();
            
           }else if(e.getActionCommand()=="View Your Details"){
               new ViewTeacherDetails(recUsernameString);
           }else if(e.getActionCommand()=="Add Student"){
                new AddNewStudentdetails();
           }else if(e.getActionCommand()=="Update student"){
                new UpdateStudentDetails();
               
           }else if(e.getActionCommand()=="Update Marks"){
                 new AddMarksDetails();
           }
           else if(e.getActionCommand()=="Delete Student"){
                // new deleteStudent();
           }

      throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
     }
}
