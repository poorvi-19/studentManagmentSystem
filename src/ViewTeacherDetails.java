

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

 public class ViewTeacherDetails extends JFrame implements ActionListener{

 JTextField nameTextField,passwordTextField,fatherNameTextField,qualifcationTextField,teachingexpTextField,favSubTextField,
 genderTextField,bloodGroupTextField,ageTextField,userNameTextField,dobTextField,phonTextField,emailTextField,cityTextField;
 JTextField userNameTextField1;

  JButton submitButton1,backButton1;
  JButton backButton;
  String recievedUserName;
  // public static void main(String[] args) {
  // new AddNewTeacherdetails();
  // }




ViewTeacherDetails() {

      this.setLayout(null);
      this.setSize(1000, 600);
      this.setTitle("View Teacher");
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

      JLabel userNameLabel = new JLabel("Enter username: ");
      userNameLabel.setBounds(150, 100, 250, 30);
      userNameLabel.setFont(new Font("Arial", Font.BOLD, 30));
      this.add(userNameLabel);

      userNameTextField1 = new JTextField();
      userNameTextField1.setBounds(500, 100, 150, 30);
      userNameTextField1.setFont(new Font("Arial", Font.PLAIN, 20));
      userNameTextField1.setLayout(null);

      this.add(userNameTextField1);

      submitButton1 = new JButton();
      submitButton1.setText("View Teacher");
      submitButton1.setForeground(Color.WHITE);
      submitButton1.setBackground(Color.BLACK);
      submitButton1.setBounds(150, 200, 170, 40);
      submitButton1.setFont(new Font("Arial", Font.PLAIN, 20));
      submitButton1.setFocusable(false);
      this.add(submitButton1);

      backButton1 = new JButton();
      backButton1.setText("BACK");
      backButton1.setForeground(Color.GREEN);
      backButton1.setBackground(Color.BLACK);
      backButton1.setBounds(500, 200, 150, 40);
      backButton1.setFont(new Font("Arial", Font.PLAIN, 20));
      backButton1.setFocusable(false);
      this.add(backButton1);

      submitButton1.addActionListener(this);
      backButton1.addActionListener(this);
        this.add(backgroundLabel);
      this.setVisible(true);

   }






  ViewTeacherDetails(String username) {

        recievedUserName=username;
      
      

        JLabel backgroundLabel=new JLabel();
        backgroundLabel.setLayout(null);
        backgroundLabel.setBounds(0, 0, 1000, 600);
  
       Image icon = Toolkit.getDefaultToolkit().getImage(
       "C:\\Users\\dell\\OneDrive\\Desktop\\poorvi singh\\My student management system\\My student management system\\src\\addnewteacher.jpeg");
       icon=icon.getScaledInstance(1050, 600, Image.SCALE_SMOOTH);
       ImageIcon i = new ImageIcon(icon);
    
       backgroundLabel.setIcon(i);



    this.setLayout(null);
    this.setSize(1000, 600);
    this.setTitle("View Teacher");
    this.setForeground(Color.GRAY);
    

    JLabel namelabel = new JLabel();
    namelabel.setText("Name");
    namelabel.setBounds(100, 50, 150, 30);
    namelabel.setFont(new Font("Arial",Font.PLAIN,20));
    namelabel.setLayout(null);
    this.add(namelabel);

    JLabel passwordlabel = new JLabel();
    passwordlabel.setText("Password");
    passwordlabel.setBounds(100, 90, 150, 30);
    passwordlabel.setFont(new Font("Arial",Font.PLAIN,20));
    passwordlabel.setLayout(null);
    this.add(passwordlabel);

    JLabel fathernamelabel = new JLabel();
    fathernamelabel.setText("Father name");
    fathernamelabel.setBounds(100, 130, 150, 30);
    fathernamelabel.setFont(new Font("Arial",Font.PLAIN,20));
    fathernamelabel.setLayout(null);
    this.add(fathernamelabel);

    JLabel qualificationlabel = new JLabel();
    qualificationlabel.setText("Qualification ");
    qualificationlabel.setBounds(100, 170, 150, 30);
    qualificationlabel.setFont(new Font("Arial",Font.PLAIN,20));
    qualificationlabel.setLayout(null);
    this.add(qualificationlabel);

    JLabel genderlabel = new JLabel();
    genderlabel.setText("Gender");
    genderlabel.setBounds(100, 210, 150, 30);
    genderlabel.setFont(new Font("Arial",Font.PLAIN,20));
    genderlabel.setLayout(null);
    this.add(genderlabel);

    JLabel teachingexplabel = new JLabel();
    teachingexplabel.setText("Teaching Exp");
    teachingexplabel.setBounds(100, 250, 150, 30);
    teachingexplabel.setFont(new Font("Arial",Font.PLAIN,20));
    teachingexplabel.setLayout(null);
    this.add(teachingexplabel);

    JLabel favsubjectlabel = new JLabel();
    favsubjectlabel.setText("Fav Subject");
    favsubjectlabel.setBounds(100, 290, 150, 30);
    favsubjectlabel.setFont(new Font("Arial",Font.PLAIN,20));
    favsubjectlabel.setLayout(null);
    this.add(favsubjectlabel);

    JLabel tusernamelabel = new JLabel();
    tusernamelabel.setText("Username");
    tusernamelabel.setBounds(500, 50, 150, 30);
    tusernamelabel.setFont(new Font("Arial",Font.PLAIN,20));
    tusernamelabel.setLayout(null);
    this.add(tusernamelabel);

    JLabel emaillabel = new JLabel();
    emaillabel.setText("Email id");
    emaillabel.setBounds(500, 90, 150, 30);
    emaillabel.setFont(new Font("Arial",Font.PLAIN,20));
    emaillabel.setLayout(null);
    this.add(emaillabel);

    JLabel phonelabel = new JLabel();
    phonelabel.setText("Phone no");
    phonelabel.setBounds(500, 130, 150, 30);
    phonelabel.setFont(new Font("Arial",Font.PLAIN,20));
    phonelabel.setLayout(null);
    this.add(phonelabel);

    JLabel citylabel = new JLabel();
    citylabel.setText("City");
    citylabel.setBounds(500, 170, 150, 30);
    citylabel.setFont(new Font("Arial",Font.PLAIN,20));
    citylabel.setLayout(null);
    this.add(citylabel);

    JLabel bloodgrouplabel = new JLabel();
    bloodgrouplabel.setText("Blood group");
    bloodgrouplabel.setBounds(500, 210, 150, 30);
    bloodgrouplabel.setFont(new Font("Arial",Font.PLAIN,20));
    bloodgrouplabel.setLayout(null);
    this.add(bloodgrouplabel);

    JLabel agelabel = new JLabel();
    agelabel.setText("Age");
    agelabel.setBounds(500, 250, 150, 30);
     agelabel.setFont(new Font("Arial",Font.PLAIN,20));
    agelabel.setLayout(null);
    this.add(agelabel);

    JLabel doblabel = new JLabel();
    doblabel.setText("Date of Birth");
    doblabel.setBounds(500, 290, 150, 30);
    doblabel.setFont(new Font("Arial",Font.PLAIN,20));
    doblabel.setLayout(null);
    this.add(doblabel);

     nameTextField = new JTextField();
    nameTextField.setBounds(250, 50, 150, 30);
    nameTextField.setFont(new Font("Arial",Font.PLAIN,20));
    nameTextField.setLayout(null);
    this.add(nameTextField);

     passwordTextField = new JTextField();
    passwordTextField.setBounds(250, 90, 150, 30);
    passwordTextField.setFont(new Font("Arial",Font.PLAIN,20));
    passwordTextField.setLayout(null);
    this.add(passwordTextField);

    fatherNameTextField=new JTextField();
    fatherNameTextField.setBounds(250, 130, 150, 30);
    fatherNameTextField.setFont(new Font("Arial",Font.PLAIN,20));
     fatherNameTextField.setLayout(null);
    this.add(fatherNameTextField);

     qualifcationTextField = new JTextField();
    qualifcationTextField.setBounds(250, 170, 150, 30);
    qualifcationTextField.setFont(new Font("Arial",Font.PLAIN,20));
     qualifcationTextField.setLayout(null);
    
    this.add(qualifcationTextField);

     genderTextField = new JTextField();
    genderTextField.setBounds(250, 210, 150, 30);
    genderTextField.setFont(new Font("Arial",Font.PLAIN,20));
     genderTextField.setLayout(null);
    this.add(genderTextField);



    teachingexpTextField = new JTextField();
    teachingexpTextField.setBounds(250, 250, 150, 30);
    teachingexpTextField.setFont(new Font("Arial",Font.PLAIN,20));
     teachingexpTextField.setLayout(null);
    this.add(teachingexpTextField);

     favSubTextField = new JTextField();
    favSubTextField.setBounds(250, 290, 150, 30);
     favSubTextField.setFont(new Font("Arial",Font.PLAIN,20));
       favSubTextField.setLayout(null);
    this.add(favSubTextField);

     userNameTextField = new JTextField();
    userNameTextField.setBounds(650, 50, 150, 30);
    userNameTextField.setFont(new Font("Arial",Font.PLAIN,20));
    userNameTextField.setLayout(null);
    this.add(userNameTextField);

     emailTextField = new JTextField();
    emailTextField.setBounds(650, 90, 150, 30);
     emailTextField.setFont(new Font("Arial",Font.PLAIN,20));
     emailTextField.setLayout(null);
    this.add(emailTextField);

     phonTextField = new JTextField();
    phonTextField.setBounds(650, 130, 150, 30);
     phonTextField.setFont(new Font("Arial",Font.PLAIN,20));
    phonTextField.setLayout(null);
    this.add(phonTextField);

     cityTextField = new JTextField();
    cityTextField.setBounds(650, 170, 150, 30);
    cityTextField.setFont(new Font("Arial",Font.PLAIN,20));
     cityTextField.setLayout(null);
    this.add(cityTextField);

     bloodGroupTextField = new JTextField();
    bloodGroupTextField.setBounds(650, 210, 150, 30);
    bloodGroupTextField.setFont(new Font("Arial",Font.PLAIN,20));
    bloodGroupTextField.setLayout(null);
    this.add(bloodGroupTextField);

    ageTextField = new JTextField();
    ageTextField.setBounds(650, 250, 150, 30);
    ageTextField.setFont(new Font("Arial",Font.PLAIN,20));
    ageTextField.setLayout(null);
    this.add(ageTextField);

     dobTextField = new JTextField();
    dobTextField.setBounds(650, 290, 150, 30);
     dobTextField.setFont(new Font("Arial",Font.PLAIN,20));
     dobTextField.setLayout(null);
    this.add(dobTextField);



    setAllEditabelFalse();


    backButton=new JButton();
    backButton.setText("BACK");
    backButton.setForeground(Color.GREEN);
    backButton.setBackground(Color.BLACK);
    backButton.setBounds(650, 330, 150, 40);
    backButton.setFont(new Font("Arial",Font.PLAIN,20));
    backButton.setFocusable(false);
   
   
    backButton.addActionListener(this);
    this.add(backButton);
    
     viewTeacherDetails(recievedUserName);
     this.add(backgroundLabel);

  }

  @Override
  public void actionPerformed(ActionEvent e){
       
      
       if(e.getSource().equals(backButton))
         this.setVisible(false);
       else if(e.getSource().equals(backButton1))
        this.setVisible(false);
        else if(e.getSource().equals(submitButton1))
          new ViewTeacherDetails(userNameTextField1.getText());
    




    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
      
  }



  private void  viewTeacherDetails(String usernametext){
   
           String queryString="select * from teacher_details where user_name='"+usernametext+"'";
          try{
           ResultSet resultSet=LoginFrame.connectionObj.statement.executeQuery(queryString);
           
           if(resultSet.next()){
            nameTextField.setText(resultSet.getString("name"));
            passwordTextField.setText(resultSet.getString("password"));
            fatherNameTextField.setText(resultSet.getString("father_name"));
            emailTextField.setText(resultSet.getString("email"));
            teachingexpTextField.setText(resultSet.getString("teaching_exp"));
            cityTextField.setText(resultSet.getString("city"));
            ageTextField.setText(resultSet.getString("age"));
            bloodGroupTextField.setText(resultSet.getString("blood_group"));
            genderTextField.setText(resultSet.getString("gender"));
            phonTextField.setText(resultSet.getString("phone"));
            favSubTextField.setText(resultSet.getString("fav_subject"));
            userNameTextField.setText(resultSet.getString("user_name"));
            dobTextField.setText(resultSet.getString("date_of_birth"));
            qualifcationTextField.setText(resultSet.getString("qualification"));
           
           //this is done so that is no result is fetched then the second window should not open
            this.setVisible(true);
           
            System.out.println("result fetched");



            }else{
              JOptionPane.showMessageDialog(null, "Invalid username");
              //this.setVisible(false);
            }

           }catch(Exception ex){
            ex.printStackTrace();
           }

  }
  
   private void setAllEditabelFalse() {

      dobTextField.setEditable(false);
      nameTextField.setEditable(false);
      passwordTextField.setEditable(false);
      ageTextField.setEditable(false);
      bloodGroupTextField.setEditable(false);
      phonTextField.setEditable(false);
      fatherNameTextField.setEditable(false);
      userNameTextField.setEditable(false);
      emailTextField.setEditable(false);
      ageTextField.setEditable(false);
      genderTextField.setEditable(false);
      cityTextField.setEditable(false);
      favSubTextField.setEditable(false);
      teachingexpTextField.setEditable(false);
      qualifcationTextField.setEditable(false);

   }

}




