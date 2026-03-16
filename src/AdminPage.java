import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class AdminPage extends JFrame implements ActionListener{

  JFrame adminPageFrame;

   AdminPage(String username,String password){
 
  adminPageFrame=this;
  adminPageFrame.setTitle("School Student Management System");
  adminPageFrame.setSize(1000,600);
  adminPageFrame.setLayout(null);
  adminPageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  adminPageFrame.setResizable(false);

     
   JLabel backgroundLabel=new JLabel();
   backgroundLabel.setLayout(null);
   backgroundLabel.setBounds(0, 0, 1000, 600);
  
       Image icon = Toolkit.getDefaultToolkit().getImage(
       "C:\\Users\\dell\\OneDrive\\Desktop\\poorvi singh\\My student management system\\My student management system\\src\\adminpage.jpeg");
       icon=icon.getScaledInstance(1000, 600, Image.SCALE_SMOOTH);
       ImageIcon i = new ImageIcon(icon);
       backgroundLabel.setIcon(i);
       

    JLabel currentAdminJLabel=new JLabel();
    currentAdminJLabel.setBounds(600,20,400,40);
    currentAdminJLabel.setFont(new Font("Arial",Font.BOLD,30));
    currentAdminJLabel.setForeground(new Color(245,242,242));
    currentAdminJLabel.setText("Hello "+getAdminName(username));
    this.add(currentAdminJLabel);

  

  JMenuBar menuBar=new JMenuBar();
  menuBar.setBackground(new Color(160,160,160));
  menuBar.setSize(1000,70);

  JMenu teacherProfileMenu=new JMenu("Teachers Profile");
  JMenuItem addTeacher=new JMenuItem("Add new Teacher");
  JMenuItem updateTeacher=new JMenuItem("Update Teacher");
  JMenuItem viewTeacher=new JMenuItem("View teacher details");
 // JMenuItem deleteTeacher=new JMenuItem("delete teacher details");

  



  teacherProfileMenu.add(addTeacher);
  teacherProfileMenu.add(updateTeacher);
  teacherProfileMenu.add(viewTeacher);
   // teacherProfileMenu.add(deleteTeacher);


  JMenu studentProfilMenu=new JMenu("Students Profile");
  JMenuItem addStudent=new JMenuItem("Add new Student");
  JMenuItem updateStudent=new JMenuItem("Update student details");
  JMenuItem viewStudentDetails=new JMenuItem("View Student details");
  //JMenuItem deleteStudentDetails=new JMenuItem("Delete student details");
  studentProfilMenu.add(addStudent);
  studentProfilMenu.add(updateStudent);
  studentProfilMenu.add(viewStudentDetails);
  //deleteStudentDetails.add(deleteStudentDetails);


  JMenu classDetailsMenu=new JMenu("Class details");
  JMenuItem addNewClass=new JMenuItem("Add new Class");
  JMenuItem updateClassDetails=new JMenuItem("Update class details");
  classDetailsMenu.add(addNewClass);
  classDetailsMenu.add(updateClassDetails);


//   JMenu subjectDetailsMenu=new JMenu("Subject details");
//   JMenuItem addNewSubject=new JMenuItem("Add new Subject");
//   JMenuItem updateSubjectDetails=new JMenuItem("Update subject details");
//   subjectDetailsMenu.add(addNewSubject);
//   subjectDetailsMenu.add(updateSubjectDetails);

  JMenu marksDetailsMenu=new JMenu("Marks details");
  JMenuItem addMarksSubject=new JMenuItem("Add marks subject");
  marksDetailsMenu.add(addMarksSubject);



//   JMenu feeDetailsMenu=new JMenu("Fee Details");
//   JMenuItem addFeeStructure=new JMenuItem("Add fee structure");
//   JMenuItem addFeeDetails=new JMenuItem("Add Fee Deatils");
//   feeDetailsMenu.add(addFeeDetails);
//   feeDetailsMenu.add(addFeeStructure);



  JMenu resultsMenu=new JMenu("Result");
  JMenuItem showResult=new JMenuItem("Show result");
  resultsMenu.add(showResult);


  JMenu logoutMenu=new JMenu("Logout");
  JMenuItem logout=new JMenuItem("Exit");
  logoutMenu.add(logout);

  menuBar.add(teacherProfileMenu);
  menuBar.add(studentProfilMenu);
  menuBar.add(classDetailsMenu);
 // menuBar.add(subjectDetailsMenu);
  menuBar.add(marksDetailsMenu);
 // menuBar.add(feeDetailsMenu);
  menuBar.add(resultsMenu);
  menuBar.add(logoutMenu);
    

  logout.addActionListener(this);
  addStudent.addActionListener(this);
  addNewClass.addActionListener(this);
  addMarksSubject.addActionListener(this);
  addTeacher.addActionListener(this);
  updateClassDetails.addActionListener(this);
  updateTeacher.addActionListener(this);
  viewTeacher.addActionListener(this);
  updateStudent.addActionListener(this);
  viewStudentDetails.addActionListener(this);
  updateClassDetails.addActionListener(this);
  //deleteTeacher.addActionListener(null);
  //deleteStudentDetails.addActionListener(null);


//   addFeeStructure.addActionListener(this);
//   addFeeDetails.addActionListener(this);
  showResult.addActionListener(this);

  adminPageFrame.setJMenuBar(menuBar);
  adminPageFrame.add(backgroundLabel);
  adminPageFrame.setVisible(true);
  

   }

// public static void main(String[] args) {
//     new AdminPage("admin1","Hello@123");
// }




private Icon getImageIcon(String username) {
        

    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getImageIcon'");
}





private String getAdminName(String username) {
    ResultSet result;
    String query;
    try{
     query="Select name from admin WHERE username='"+username+"'";
     result=LoginFrame.connectionObj.statement.executeQuery(query);

     if(result.next()){
      return result.getString("name");
    }
    }catch(Exception ex){
        ex.printStackTrace();
    }




    throw new UnsupportedOperationException("Unimplemented method 'getAdminName'");
}




@Override
public void actionPerformed(ActionEvent e) {
    
    String command=e.getActionCommand();

    if(command=="Add new Teacher"){
     new AddNewTeacherdetails();
    }else if(command=="Update Teacher"){
        new UpdateTeacherDetails();
    }else if(command=="View teacher details"){
          new ViewTeacherDetails();
    }else if(command=="Add new Student" ){
         new AddNewStudentdetails();
    }else if(command=="Update student details" ){
        new UpdateStudentDetails();
    }else if(command=="View Student details" ){
         new ViewStudentDetails();
    }   
    else if(command=="Add new Class" ){
       new AddNewclassdetails();
    }else if(command=="Update class details" ){
           new UpdateClassDetails();
   }
   // else if(command=="Add new Subject" ){
    //       new AddNewSubjectdetails();
    // }else if(command=="Update subject details" ){
        
    //}
    else if(command=="Add marks subject" ){
       new AddMarksDetails();
    // }else if(command=="Add fee structure" ){
    //     new AddFeeStructure();
    // }else if(command=="Add Fee Details" ){
    //        new AddStudentFeeDetails();
    }else if(command=="Show result" ){
        new Resultshow();
    }else if(command=="Exit"){
        adminPageFrame.setVisible(false);
        new LoginFrame();
    }





     // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
}


}
