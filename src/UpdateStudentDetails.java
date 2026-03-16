import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Image;
import java.awt.Toolkit;
public class UpdateStudentDetails extends JFrame implements ActionListener{


// public static void main(String[] args) {
//    new UpdateStudentDetails();
//    //new UpdateStudentDetails(String r);
// }


JButton submitButton1,backButton1,submitButton,backButton;
JTextField rollnotextfield ,nametextfield,passwordtextfield,fathernametextfield,
emailtextfield,classtextfield,agetextfield,bloodgrouptextfield,gendertextfield,
phonetextfield,sectiontextfield,usernametextfield,dobtextfield,cityTextField;

String receivedRollNumber;

        UpdateStudentDetails(){
         
            this.setLayout(null);
            this.setSize(1000, 600);
            this.setTitle("Update student details");
            this.setForeground(Color.GRAY);
            this.setResizable(false);

               
   JLabel backgroundLabel=new JLabel();
   backgroundLabel.setLayout(null);
   backgroundLabel.setBounds(0, 0, 1000, 600);
  
       Image icon = Toolkit.getDefaultToolkit().getImage(
       "C:\\Users\\dell\\OneDrive\\Desktop\\poorvi singh\\My student management system\\My student management system\\src\\addnewteacher.jpeg");
       icon=icon.getScaledInstance(1000, 600, Image.SCALE_SMOOTH);
       ImageIcon i = new ImageIcon(icon);
       backgroundLabel.setIcon(i);

            JLabel rollNoJLabel=new JLabel("Roll no: ");
            rollNoJLabel.setBounds(200, 150, 150, 30);
            rollNoJLabel.setFont(new Font("Arial",Font.BOLD,30));
              // rollNoJLabel.setForeground(new Color(245,242,242));
            this.add(rollNoJLabel);

            rollnotextfield = new JTextField();
            rollnotextfield.setBounds(420, 150, 150, 30);
            rollnotextfield.setFont(new Font("Arial",Font.PLAIN,20));
         
            rollnotextfield.setLayout(null);
            
            this.add(rollnotextfield);

           

            
            submitButton1 = new JButton();
            submitButton1.setText("Update student");
            submitButton1.setForeground(Color.WHITE);
            submitButton1.setBackground(Color.BLACK);
            submitButton1.setBounds(200, 250, 180, 40);
            submitButton1.setFont(new Font("Arial", Font.PLAIN, 20));
            submitButton1.setFocusable(false);
            this.add(submitButton1);

            
            backButton1 = new JButton();
            backButton1.setText("BACK");
            backButton1.setForeground(Color.GREEN);
            backButton1.setBackground(Color.BLACK);
            backButton1.setBounds(420, 250, 150, 40);
            backButton1.setFont(new Font("Arial", Font.PLAIN, 20));
            backButton1.setFocusable(false);
            this.add(backButton1);

            submitButton1.addActionListener(this);
            backButton1.addActionListener(this);
            this.add(backgroundLabel);

            this.setVisible(true);

        }










    UpdateStudentDetails(String rollNumber){
    receivedRollNumber=rollNumber;


    this.setLayout(null);
    this.setSize(1000, 600);
    this.setTitle("update student details");
    this.setForeground(Color.GRAY);
    this.setResizable(false);

 
   JLabel backgroundLabel=new JLabel();
   backgroundLabel.setLayout(null);
   backgroundLabel.setBounds(0, 0, 1000, 600);
  
       Image icon = Toolkit.getDefaultToolkit().getImage(
       "C:\\Users\\dell\\OneDrive\\Desktop\\poorvi singh\\My student management system\\My student management system\\src\\addnewteacher.jpeg");
       icon=icon.getScaledInstance(1000, 600, Image.SCALE_SMOOTH);
       ImageIcon i = new ImageIcon(icon);
       backgroundLabel.setIcon(i);
   

    JLabel nameLabel = new JLabel();
    nameLabel.setText("Name");
    nameLabel.setBounds(100, 50, 150, 30);
    nameLabel.setFont(new Font("Arial",Font.PLAIN,20));
    nameLabel.setLayout(null);
    this.add(nameLabel);

    
    JLabel passwordLabel = new JLabel();
    passwordLabel.setText("Password");
    passwordLabel.setBounds(100, 90, 150, 30);
    passwordLabel.setFont(new Font("Arial",Font.PLAIN,20));
    passwordLabel.setLayout(null);
    this.add(passwordLabel);


   JLabel fathernamelabel = new JLabel();
   fathernamelabel.setText("Father name");
   fathernamelabel.setBounds(100, 130, 150, 30);
   fathernamelabel.setFont(new Font("Arial",Font.PLAIN,20));
   fathernamelabel.setLayout(null);
   this.add(fathernamelabel);



   JLabel classlabel = new JLabel();
   classlabel.setText("Class name");
   classlabel.setBounds(100, 170, 150, 30);
   classlabel.setFont(new Font("Arial",Font.PLAIN,20));
   classlabel.setLayout(null);
   this.add(classlabel);


   JLabel genderlabel = new JLabel();
   genderlabel.setText("Gender");
   genderlabel.setBounds(100, 210, 150, 30);
   genderlabel.setFont(new Font("Arial",Font.PLAIN,20));
   //.setForeground(new Color(245,242,242));
   genderlabel.setLayout(null);
   this.add(genderlabel);


   JLabel citylabel = new JLabel();
   citylabel.setText("City");
   citylabel.setBounds(100, 250, 150, 30);
   citylabel.setFont(new Font("Arial",Font.PLAIN,20));
   citylabel.setLayout(null);
   this.add(citylabel);


    JLabel rollnolabel = new JLabel();
    rollnolabel.setText("Roll no");
    rollnolabel.setBounds(100, 290, 150, 30);
    rollnolabel.setFont(new Font("Arial",Font.PLAIN,20));
    rollnolabel.setLayout(null);
    this.add(rollnolabel);


   JLabel usernamelabel = new JLabel();
   usernamelabel.setText("Username");
   usernamelabel.setBounds(450, 50, 150, 30);
   usernamelabel.setFont(new Font("Arial",Font.PLAIN,20));
   this.add(usernamelabel);



   JLabel emaillabel = new JLabel();
   emaillabel.setText("Email id");
   emaillabel.setBounds(450, 90, 150, 30);
   emaillabel.setFont(new Font("Arial",Font.PLAIN,20));
   emaillabel.setLayout(null);
   this.add(emaillabel);



   JLabel phonelabel = new JLabel();
   phonelabel.setText("Phone no");
   phonelabel.setBounds(450, 130, 150, 30);
   phonelabel.setFont(new Font("Arial",Font.PLAIN,20));
   phonelabel.setLayout(null);
   this.add(phonelabel);



   JLabel sectionlabel = new JLabel();
   sectionlabel.setText("Section");
   sectionlabel.setBounds(450, 170, 150, 30);
   sectionlabel.setFont(new Font("Arial",Font.PLAIN,20));
   sectionlabel.setLayout(null);
   this.add(sectionlabel);



   JLabel bloodgrouplabel = new JLabel();
   bloodgrouplabel.setText("Blood group");
   bloodgrouplabel.setBounds(450, 210, 150, 30);
   bloodgrouplabel.setFont(new Font("Arial",Font.PLAIN,20));
   bloodgrouplabel.setLayout(null);
   this.add(bloodgrouplabel);



   JLabel agelabel = new JLabel();
   agelabel.setText("Age");
   agelabel.setBounds(450, 250, 150, 30);
   agelabel.setFont(new Font("Arial",Font.PLAIN,20));
   agelabel.setLayout(null);
   this.add(agelabel);



   JLabel doblabel = new JLabel();
   doblabel.setText("Date of Birth");
   doblabel.setBounds(450, 290, 150, 30);
   doblabel.setFont(new Font("Arial",Font.PLAIN,20));
   doblabel.setLayout(null);
   this.add(doblabel);



   nametextfield = new JTextField();
   nametextfield.setBounds(240, 50, 150, 30);
   nametextfield.setFont(new Font("Arial",Font.PLAIN,20));
   nametextfield.setLayout(null);
   this.add(nametextfield);


   passwordtextfield = new JTextField();
   passwordtextfield.setBounds(240, 90, 150, 30);
   passwordtextfield.setLayout(null);
   passwordtextfield.setFont(new Font("Arial",Font.PLAIN,20));
   this.add(passwordtextfield);


   fathernametextfield = new JTextField();
   fathernametextfield.setBounds(240, 130, 150, 30);
   fathernametextfield.setFont(new Font("Arial",Font.PLAIN,20));
   fathernametextfield.setLayout(null);
   this.add(fathernametextfield);

   classtextfield = new JTextField();
   classtextfield.setBounds(240, 170, 150, 30);
   classtextfield.setFont(new Font("Arial",Font.PLAIN,20));
   classtextfield.setLayout(null);
   this.add(classtextfield);

   gendertextfield = new JTextField();
   gendertextfield.setBounds(240, 210, 150, 30);
   gendertextfield.setFont(new Font("Arial",Font.PLAIN,20));
   gendertextfield.setLayout(null);
   this.add(gendertextfield);



   cityTextField = new JTextField();
   cityTextField.setBounds(240, 250, 150, 30);
   cityTextField.setFont(new Font("Arial",Font.PLAIN,20));
   cityTextField.setLayout(null);
   this.add(cityTextField);

   rollnotextfield = new JTextField();
   rollnotextfield.setBounds(240, 290, 150, 30);
   rollnotextfield.setFont(new Font("Arial",Font.PLAIN,20));
   rollnotextfield.setLayout(null);
   this.add(rollnotextfield);


   usernametextfield = new JTextField();
   usernametextfield.setBounds(600, 50, 150, 30);
   usernametextfield.setFont(new Font("Arial",Font.PLAIN,20));
   usernametextfield.setLayout(null);
   this.add(usernametextfield);

   emailtextfield = new JTextField();
   emailtextfield.setBounds(600, 90, 150, 30);
   emailtextfield.setFont(new Font("Arial",Font.PLAIN,20));
   emailtextfield.setLayout(null);
   this.add(emailtextfield);

   phonetextfield = new JTextField();
   phonetextfield.setBounds(600, 130, 150, 30);
   phonetextfield.setFont(new Font("Arial",Font.PLAIN,20));
   phonetextfield.setLayout(null);
   this.add(phonetextfield);

   sectiontextfield = new JTextField();
   sectiontextfield.setBounds(600, 170, 150, 30);
   sectiontextfield.setFont(new Font("Arial",Font.PLAIN,20));
   sectiontextfield.setLayout(null);
   this.add(sectiontextfield);

   bloodgrouptextfield = new JTextField();
   bloodgrouptextfield.setBounds(600, 210, 150, 30);
   bloodgrouptextfield.setFont(new Font("Arial",Font.PLAIN,20));
   bloodgrouptextfield.setLayout(null);
   this.add(bloodgrouptextfield);


   agetextfield = new JTextField();
   agetextfield.setBounds(600, 250, 150, 30);
   agetextfield.setFont(new Font("Arial",Font.PLAIN,20));
   agetextfield.setLayout(null);
   this.add(agetextfield);



   dobtextfield = new JTextField();
   dobtextfield.setBounds(600, 290, 150, 30);
   dobtextfield.setFont(new Font("Arial",Font.PLAIN,20));
   dobtextfield.setLayout(null);
   this.add(dobtextfield);


   submitButton=new JButton();
   submitButton.setText("Submit");
   submitButton.setForeground(Color.WHITE);
   submitButton.setBackground(Color.BLACK);
   submitButton.setBounds(240,330,150,40);
   submitButton.setFont(new Font("Arial",Font.PLAIN,20));
   submitButton.setFocusable(false);
   this.add(submitButton);


    backButton=new JButton();
    backButton.setText("BACK");
    backButton.setForeground(Color.GREEN);
    backButton.setBackground(Color.BLACK);
    backButton.setBounds(600, 330, 150, 40);
    backButton.setFont(new Font("Arial",Font.PLAIN,20));
    backButton.setFocusable(false);

    submitButton.addActionListener(this);
    backButton.addActionListener(this);
    this.add(backButton);


    this.getStudentDetails(rollNumber);
    this.add(backgroundLabel);
    this.setVisible(true);



  
   // JLabel backgroundLabel=new JLabel();
   // backgroundLabel.setLayout(null);
   // backgroundLabel.setBounds(0, 0, 1000, 700);
   //     Image icon = Toolkit.getDefaultToolkit().getImage(
   //     "C:\\Users\\dell\\OneDrive\\Desktop\\poorvi singh\\My student management system\\My student management system\\src\\updatestudent.jpeg");
   //     icon=icon.getScaledInstance(1000, 700, Image.SCALE_SMOOTH);
   //     ImageIcon i = new ImageIcon(icon);
   
   // backgroundLabel.setIcon(i);
   // this.add(backgroundLabel);


   }


     
   
    private  void getStudentDetails(String rollNumber) {

         String query ="select * from student_details where rollno='"+rollNumber+"'";
    try{
    ResultSet result=LoginFrame.connectionObj.statement.executeQuery(query);

    if(result.next()){
        nametextfield.setText(result.getString("name"));
        passwordtextfield.setText(result.getString("password"));
        fathernametextfield.setText(result.getString("father_name"));
        emailtextfield.setText(result.getString("email"));
        classtextfield.setText(result.getString("class"));
        cityTextField.setText(result.getString("city"));
        agetextfield.setText(result.getString("age"));
        bloodgrouptextfield.setText(result.getString("blood_group"));
        gendertextfield.setText(result.getString("gender"));
        phonetextfield.setText(result.getString("phone"));
        sectiontextfield.setText(result.getString("section"));
        usernametextfield.setText(result.getString("user_name"));
        dobtextfield.setText(result.getString("date_of_birth"));
        rollnotextfield.setText(result.getString("rollno"));
        System.out.println("result fetched");
        

    }else{
       JOptionPane.showMessageDialog(null,"No student found with this roll no");
    }
    }catch(Exception e){
        e.printStackTrace();
    }
       
    }




    @Override
    public void actionPerformed(ActionEvent e) {

     if(e.getSource().equals(submitButton1)){

        String qString="select rollno from student_details where rollno='"+rollnotextfield.getText()+"'";

          try{
          ResultSet rs=LoginFrame.connectionObj.statement.executeQuery(qString);

             if(rs.next()){
             new UpdateStudentDetails(rollnotextfield.getText());
             System.out.println("hello");
             this.setVisible(false);
             }else
           JOptionPane.showMessageDialog(null, "Please enter a valid roll number!!");

          }catch(Exception ex){
            ex.printStackTrace();
          }
 
     }else if(e.getSource().equals(backButton1)){
        this.setVisible(false);
        System.out.println("Back button1 pressed");
     }else if(e.getSource().equals(submitButton)){


          String qString= "update student_details  set user_name='"+usernametextfield.getText()+"',name='"+nametextfield.getText()+"',password='"+passwordtextfield.getText()+"',father_name='"+fathernametextfield.getText()+
                     "',class='"+classtextfield.getText()+"',gender='"+gendertextfield.getText()+"',city='"+cityTextField.getText()+"',rollno='"+rollnotextfield.getText()+"',email='"+emailtextfield.getText()+
                     "',phone='"+phonetextfield.getText()+"',blood_group='"+bloodgrouptextfield.getText()+"',section='"+sectiontextfield.getText()+"',age='"+agetextfield.getText()+
                     "',date_of_birth='"+dobtextfield.getText()+"' where rollno='"+receivedRollNumber+"'";

         try{
            System.out.println(qString);
         //LoginFrame.connectionObj.statement.executeUpdate(qString);
       int i=LoginFrame.connectionObj.statement.executeUpdate(qString);
      //  System.out.println("Hello abes"+resultSet.getString("name"));
         if(i>=1){
            System.out.println("student details updated");
           JOptionPane.showMessageDialog(null,"Student details updated");
           this.setVisible(false);
         }else{
            JOptionPane.showMessageDialog(null,"Something went wrong");
         }
         
         }catch(Exception ex){
            ex.printStackTrace();
         }

     }else if(e.getSource().equals(backButton)){
        this.setVisible(false);
     }


    }






}