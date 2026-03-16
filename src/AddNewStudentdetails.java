import javax.swing.ImageIcon;
// import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class AddNewStudentdetails extends JFrame implements ActionListener {

  // public static void main(String[] args) {
  //   new AddNewStudentdetails();
  // }

  JLabel nameLabel, passwordLabel, fatherNameLabel, classLabel, genderLabel, cityLabel, rollNOLabel, userNameLabel,
      emailLabel, phoneLabel,
      sectionLabel, bloodGroupLabel, ageLabel, dobLabel;
  JTextField nameTextField, passwordTextField, fatherNameTextField, classTextField, genderTextField, cityTextField,
      rollNoTextField, userNameTextField, emailTextField, phoneTextField,
      sectionTextField, bloodGroupTextField, ageTextField, dobTextField;

  JButton submitButton, backButton;
  Choice classchoice,genderChoice;

  AddNewStudentdetails() {
    this.setLayout(null);
    this.setSize(1000, 600);
    this.setTitle("Add new student details");
    this.setForeground(Color.GRAY);
    this.setResizable(false);

       
   JLabel backgroundLabel=new JLabel();
   backgroundLabel.setLayout(null);
   backgroundLabel.setBounds(0, 0, 1000, 600);
   //backgroundLabel.setForeground(new Color(245,242,242));
  
       Image icon = Toolkit.getDefaultToolkit().getImage(
       "C:\\Users\\dell\\OneDrive\\Desktop\\poorvi singh\\My student management system\\My student management system\\src\\addnewteacher.jpeg");
 
       icon=icon.getScaledInstance(1000, 600, Image.SCALE_SMOOTH);
       ImageIcon i = new ImageIcon(icon);
       backgroundLabel.setIcon(i);

    nameLabel = new JLabel();
    nameLabel.setText("Name *");
    nameLabel.setBounds(100, 50, 150, 30);
    nameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
    //nameLabel.setForeground(new Color(245,242,242));
    nameLabel.setLayout(null);
    this.add(nameLabel);

    passwordLabel = new JLabel();
    passwordLabel.setText("Password");
    passwordLabel.setBounds(100, 90, 150, 30);
    passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20));
    //passwordLabel.setForeground(new Color(245,242,242));
    passwordLabel.setLayout(null);
    this.add(passwordLabel);

    fatherNameLabel = new JLabel();
    fatherNameLabel.setText("Father name");
    fatherNameLabel.setBounds(100, 130, 150, 30);
    fatherNameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
    //fatherNameLabel.setForeground(new Color(245,242,242));
    fatherNameLabel.setLayout(null);
    this.add(fatherNameLabel);

    classLabel = new JLabel();
    classLabel.setText("Class name");
    classLabel.setBounds(100, 170, 110, 30);
    classLabel.setFont(new Font("Arial", Font.PLAIN, 20));
    //classLabel.setForeground(new Color(245,242,242));
    classLabel.setLayout(null);
    this.add(classLabel);

    genderLabel = new JLabel();
    genderLabel.setText("Gender *");
    genderLabel.setBounds(100, 210, 130, 30);
    genderLabel.setFont(new Font("Arial", Font.PLAIN, 20));
   // genderLabel.setForeground(new Color(245,242,242));
    genderLabel.setLayout(null);
    this.add(genderLabel);

    cityLabel = new JLabel();
    cityLabel.setText("City");
    cityLabel.setBounds(100, 250, 150, 30);
    cityLabel.setFont(new Font("Arial", Font.PLAIN, 20));
   // cityLabel.setForeground(new Color(245,242,242));
    cityLabel.setLayout(null);
    this.add(cityLabel);

    rollNOLabel = new JLabel();
    rollNOLabel.setText("Roll no *");
    rollNOLabel.setBounds(100, 290, 150, 30);
    rollNOLabel.setFont(new Font("Arial", Font.PLAIN, 20));
    //rollNOLabel.setForeground(new Color(245,242,242));
    rollNOLabel.setLayout(null);
    this.add(rollNOLabel);

    userNameLabel = new JLabel();
    userNameLabel.setText("Username *");
    userNameLabel.setBounds(500, 50, 150, 30);
    userNameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
    //userNameLabel.setForeground(new Color(245,242,242));
    this.add(userNameLabel);

    emailLabel = new JLabel();
    emailLabel.setText("Email id");
    emailLabel.setBounds(500, 90, 150, 30);
    emailLabel.setFont(new Font("Arial", Font.PLAIN, 20));
    //emailLabel.setForeground(new Color(245,242,242));
    emailLabel.setLayout(null);
    this.add(emailLabel);

    phoneLabel = new JLabel();
    phoneLabel.setText("Phone no");
    phoneLabel.setBounds(500, 130, 150, 30);
    phoneLabel.setFont(new Font("Arial", Font.PLAIN, 20));
    //phoneLabel.setForeground(new Color(245,242,242));
    phoneLabel.setLayout(null);
    this.add(phoneLabel);

    sectionLabel = new JLabel();
    sectionLabel.setText("Section");
    sectionLabel.setBounds(500, 170, 150, 30);
    sectionLabel.setFont(new Font("Arial", Font.PLAIN, 20));
    //sectionLabel.setForeground(new Color(245,242,242));
    sectionLabel.setLayout(null);
    this.add(sectionLabel);

    bloodGroupLabel = new JLabel();
    bloodGroupLabel.setText("Blood group");
    bloodGroupLabel.setBounds(500, 210, 150, 30);
    bloodGroupLabel.setFont(new Font("Arial", Font.PLAIN, 20));
    //bloodGroupLabel.setForeground(new Color(245,242,242));
    bloodGroupLabel.setLayout(null);
    this.add(bloodGroupLabel);

    ageLabel = new JLabel();
    ageLabel.setText("Age");
    ageLabel.setBounds(500, 250, 150, 30);
    ageLabel.setFont(new Font("Arial", Font.PLAIN, 20));
    //ageLabel.setForeground(new Color(245,242,242));
    ageLabel.setLayout(null);
    this.add(ageLabel);

    dobLabel = new JLabel();
    dobLabel.setText("Date of Birth");
    dobLabel.setBounds(500, 290, 150, 30);
    dobLabel.setFont(new Font("Arial", Font.PLAIN, 20));
    //dobLabel.setForeground(new Color(245,242,242));
    dobLabel.setLayout(null);
    this.add(dobLabel);

    nameTextField = new JTextField();
    nameTextField.setBounds(240, 50, 150, 30);
    nameTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    nameTextField.setLayout(null);
    this.add(nameTextField);

    passwordTextField = new JTextField();
    // JTextField passwordtextfield = new JTextField("Password",100);//for adding
    // hint to the textfield
    passwordTextField.setBounds(240, 90, 150, 30);
    passwordTextField.setLayout(null);
    passwordTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    this.add(passwordTextField);

    fatherNameTextField = new JTextField();
    fatherNameTextField.setBounds(240, 130, 150, 30);
    fatherNameTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    fatherNameTextField.setLayout(null);
    this.add(fatherNameTextField);

    // classTextField = new JTextField();
    // classTextField.setBounds(240, 170, 150, 30);
    // classTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    // classTextField.setLayout(null);
    // this.add(classTextField);


    classchoice=new Choice();
    classchoice.setBounds(240, 170, 150, 30);
    classchoice.setFont(new Font("Arial", Font.PLAIN, 20));
    classchoice.add("Select");
    classchoiceadd();
    this.add(classchoice);
    

    // genderTextField = new JTextField();
    // genderTextField.setBounds(240, 210, 150, 30);
    // genderTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    // genderTextField.setLayout(null);
    // this.add(genderTextField);

    genderChoice=new Choice();
    genderChoice.setBounds(240, 210, 150, 30);
    genderChoice.setFont(new Font("Arial", Font.PLAIN, 20));
    genderChoice.add("Select");
    genderChoice.add("Male");
    genderChoice.add("female");
    this.add(genderChoice);

    




    cityTextField = new JTextField();
    cityTextField.setBounds(240, 250, 150, 30);
    cityTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    cityTextField.setLayout(null);
    this.add(cityTextField);

    rollNoTextField = new JTextField();
    rollNoTextField.setBounds(240, 290, 150, 30);
    rollNoTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    rollNoTextField.setLayout(null);
    rollNoTextField.setEditable(false);
    this.add(rollNoTextField);

    userNameTextField = new JTextField();
    userNameTextField.setBounds(640, 50, 150, 30);
    userNameTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    userNameTextField.setLayout(null);
    this.add(userNameTextField);

    emailTextField = new JTextField();
    emailTextField.setBounds(640, 90, 150, 30);
    emailTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    emailTextField.setLayout(null);
    this.add(emailTextField);

    phoneTextField = new JTextField();
    phoneTextField.setBounds(640, 130, 150, 30);
    phoneTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    phoneTextField.setLayout(null);
    
    this.add(phoneTextField);

    sectionTextField = new JTextField();
    sectionTextField.setBounds(640, 170, 150, 30);
    sectionTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    sectionTextField.setLayout(null);
    this.add(sectionTextField);

    bloodGroupTextField = new JTextField();
    bloodGroupTextField.setBounds(640, 210, 150, 30);
    bloodGroupTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    bloodGroupTextField.setLayout(null);
    this.add(bloodGroupTextField);

    ageTextField = new JTextField();
    ageTextField.setBounds(640, 250, 150, 30);
    ageTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    ageTextField.setLayout(null);
    this.add(ageTextField);

    dobTextField = new JTextField();
    dobTextField.setBounds(640, 290, 150, 30);
    dobTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    dobTextField.setLayout(null);
    this.add(dobTextField);

    submitButton = new JButton();
    submitButton.setText("Submit");
    submitButton.setForeground(Color.WHITE);
    submitButton.setBackground(Color.BLACK);
    submitButton.setBounds(240, 330, 150, 40);
    submitButton.setFont(new Font("Arial", Font.PLAIN, 20));
    submitButton.setFocusable(false);
    this.add(submitButton);
    
    backButton = new JButton();
    backButton.setText("BACK");
    backButton.setForeground(Color.GREEN);
    backButton.setBackground(Color.BLACK);
    backButton.setBounds(640, 330, 150, 40);
    backButton.setFont(new Font("Arial", Font.PLAIN, 20));
    backButton.setFocusable(false);
    this.add(backButton);
    
    
    submitButton.addActionListener(this);
    backButton.addActionListener(this);
    this.add(backgroundLabel);
    this.setVisible(true);

  }

  private void classchoiceadd() {
            String qString="select class_name from class_details";     
   

            try{
           ResultSet rs=LoginFrame.connectionObj.statement.executeQuery(qString);
           while(rs.next()){
            classchoice.add(rs.getString("class_name"));
           }

            }catch(Exception e){
              e.printStackTrace();
            }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
       
  
    if(e.getSource().equals(backButton)) {
      this.setVisible(false);
    } else if (e.getSource().equals(submitButton)) {
      if(userNameTextField.getText().length()>=1 && nameTextField.getText().length()>=1 && genderChoice.getSelectedItem().length()>=1){
            finalAddNewStudent();
            
      }else
       JOptionPane.showMessageDialog(null, "Please enter required fields");
    }

  }
  

  
  private void finalAddNewStudent(){

   String queryForRollNo="Select enrolled_student from class_details where class_name='"+classchoice.getSelectedItem()+"'"; 
   
    try {
      ResultSet rs=LoginFrame.connectionObj.statement.executeQuery(queryForRollNo);
      rs.next();
      int newRollno=rs.getInt("enrolled_student")+1;
      
   String queString= "insert into student_details  values('"+userNameTextField.getText()+"','"+nameTextField.getText()+"','"+
   passwordTextField.getText()+"','"+fatherNameTextField.getText()+"','"+classchoice.getSelectedItem()+"','"+genderChoice.getSelectedItem()+"','"+
   cityTextField.getText()+"','"+newRollno+"','"+emailTextField.getText()+"','"+phoneTextField.getText()+"','"+bloodGroupTextField.getText()+"','"+
   sectionTextField.getText()+"','"+ageTextField.getText()+"','"+dobTextField.getText()+"',0,0,0,0,0)";
   
   int result=LoginFrame.connectionObj.statement.executeUpdate(queString);
    System.out.println(queString);
   if(result>=1){
      updateClass(classchoice.getSelectedItem());
      JOptionPane.showMessageDialog(null,"Student inserted successfully");
    
      this.setVisible(false);
   } else{
    JOptionPane.showMessageDialog(null,"something went wrong");
   } 


    }catch(Exception exception){
      exception.printStackTrace();
    }
  }



  void updateClass(String classnameString){
    String q="UPDATE class_details SET enrolled_student=enrolled_student+1 WHERE class_name='"+classnameString+"'";
    try{
      LoginFrame.connectionObj.statement.executeUpdate(q);
    }catch(Exception e) {
      e.printStackTrace();
    }
   }

  }