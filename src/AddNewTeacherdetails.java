
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

public class AddNewTeacherdetails extends JFrame implements ActionListener {

  JTextField nameTextField, passwordTextField, fatherNameTextField, qualifcationTextField, teachingexpTextField,
      favSubTextField,
      genderTextField, bloodGroupTextField, ageTextField, userNameTextField, dobTextField, phonTextField,
      emailTextField, cityTextField;

  JButton submitbutton;
  JButton backButton;

  // public static void main(String[] args) {
  // new AddNewTeacherdetails();
  // }

  AddNewTeacherdetails() {

 
    this.setLayout(null);
    this.setSize(1000, 600);
    this.setTitle("Add New Teacher Details");
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


    JLabel namelabel = new JLabel();
    namelabel.setText("Name");
    namelabel.setBounds(100, 50, 150, 30);
    namelabel.setFont(new Font("Arial", Font.PLAIN, 20));
    namelabel.setLayout(null);
    this.add(namelabel);

    JLabel passwordlabel = new JLabel();
    passwordlabel.setText("Password");
    passwordlabel.setBounds(100, 90, 150, 30);
    passwordlabel.setFont(new Font("Arial", Font.PLAIN, 20));
    passwordlabel.setLayout(null);
    this.add(passwordlabel);

    JLabel fathernamelabel = new JLabel();
    fathernamelabel.setText("Father name");
    fathernamelabel.setBounds(100, 130, 150, 30);
    fathernamelabel.setFont(new Font("Arial", Font.PLAIN, 20));
    fathernamelabel.setLayout(null);
    this.add(fathernamelabel);

    JLabel qualificationlabel = new JLabel();
    qualificationlabel.setText("Qualification ");
    qualificationlabel.setBounds(100, 170, 150, 30);
    qualificationlabel.setFont(new Font("Arial", Font.PLAIN, 20));
    qualificationlabel.setLayout(null);
    this.add(qualificationlabel);

    JLabel genderlabel = new JLabel();
    genderlabel.setText("Gender");
    genderlabel.setBounds(100, 210, 150, 30);
    genderlabel.setFont(new Font("Arial", Font.PLAIN, 20));
    genderlabel.setLayout(null);
    this.add(genderlabel);

    JLabel teachingexplabel = new JLabel();
    teachingexplabel.setText("Teaching Exp");
    teachingexplabel.setBounds(100, 250, 150, 30);
    teachingexplabel.setFont(new Font("Arial", Font.PLAIN, 20));
    teachingexplabel.setLayout(null);
    this.add(teachingexplabel);

    
    JLabel favsubjectlabel = new JLabel();
    favsubjectlabel.setText("Fav Subject");
    favsubjectlabel.setBounds(100, 290, 150, 30);
    favsubjectlabel.setFont(new Font("Arial", Font.PLAIN, 20));
    favsubjectlabel.setLayout(null);
    this.add(favsubjectlabel);


    JLabel tusernamelabel = new JLabel();
    tusernamelabel.setText("Username");
    tusernamelabel.setBounds(500, 50, 150, 30);
    tusernamelabel.setFont(new Font("Arial", Font.PLAIN, 20));
    tusernamelabel.setLayout(null);
    this.add(tusernamelabel);


    JLabel emaillabel = new JLabel();
    emaillabel.setText("Email id");
    emaillabel.setBounds(500, 90, 150, 30);
    emaillabel.setFont(new Font("Arial", Font.PLAIN, 20));
    emaillabel.setLayout(null);
    this.add(emaillabel);


    JLabel phonelabel = new JLabel();
    phonelabel.setText("Phone no");
    phonelabel.setBounds(500, 130, 150, 30);
    phonelabel.setFont(new Font("Arial", Font.PLAIN, 20));
    phonelabel.setLayout(null);
    this.add(phonelabel);


    JLabel citylabel = new JLabel();
    citylabel.setText("City");
    citylabel.setBounds(500, 170, 150, 30);
    citylabel.setFont(new Font("Arial", Font.PLAIN, 20));
    citylabel.setLayout(null);
    this.add(citylabel);

    JLabel bloodgrouplabel = new JLabel();
    bloodgrouplabel.setText("Blood group");
    bloodgrouplabel.setBounds(500, 210, 150, 30);
    bloodgrouplabel.setFont(new Font("Arial", Font.PLAIN, 20));
    bloodgrouplabel.setLayout(null);
    this.add(bloodgrouplabel);

    JLabel agelabel = new JLabel();
    agelabel.setText("Age");
    agelabel.setBounds(500, 250, 150, 30);
    agelabel.setFont(new Font("Arial", Font.PLAIN, 20));
    agelabel.setLayout(null);
    this.add(agelabel);

    JLabel doblabel = new JLabel();
    doblabel.setText("Date of Birth");
    doblabel.setBounds(500, 290, 150, 30);
    doblabel.setFont(new Font("Arial", Font.PLAIN, 20));
    doblabel.setLayout(null);
    this.add(doblabel);

    nameTextField = new JTextField();
    nameTextField.setBounds(250, 50, 150, 30);
    nameTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    nameTextField.setLayout(null);
    this.add(nameTextField);

    passwordTextField = new JTextField();
    passwordTextField.setBounds(250, 90, 150, 30);
    passwordTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    passwordTextField.setLayout(null);
    this.add(passwordTextField);

    fatherNameTextField = new JTextField();
    fatherNameTextField.setBounds(250, 130, 150, 30);
    fatherNameTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    fatherNameTextField.setLayout(null);
    this.add(fatherNameTextField);

    qualifcationTextField = new JTextField();
    qualifcationTextField.setBounds(250, 170, 150, 30);
    qualifcationTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    qualifcationTextField.setLayout(null);

    this.add(qualifcationTextField);

    genderTextField = new JTextField();
    genderTextField.setBounds(250, 210, 150, 30);
    genderTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    genderTextField.setLayout(null);
    genderTextField.setToolTipText("Enter Male or female");

    this.add(genderTextField);

    teachingexpTextField = new JTextField();
    teachingexpTextField.setBounds(250, 250, 150, 30);
    teachingexpTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    teachingexpTextField.setLayout(null);
    this.add(teachingexpTextField);

    favSubTextField = new JTextField();
    favSubTextField.setBounds(250, 290, 150, 30);
    favSubTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    favSubTextField.setLayout(null);
    this.add(favSubTextField);

    userNameTextField = new JTextField();
    userNameTextField.setBounds(650, 50, 150, 30);
    userNameTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    userNameTextField.setLayout(null);
    this.add(userNameTextField);

    emailTextField = new JTextField();
    emailTextField.setBounds(650, 90, 150, 30);
    emailTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    emailTextField.setLayout(null);
    this.add(emailTextField);

    phonTextField = new JTextField();
    phonTextField.setBounds(650, 130, 150, 30);
    phonTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    phonTextField.setLayout(null);
    this.add(phonTextField);

    cityTextField = new JTextField();
    cityTextField.setBounds(650, 170, 150, 30);
    cityTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    cityTextField.setLayout(null);
    this.add(cityTextField);

    bloodGroupTextField = new JTextField();
    bloodGroupTextField.setBounds(650, 210, 150, 30);
    bloodGroupTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    bloodGroupTextField.setLayout(null);
    this.add(bloodGroupTextField);

    ageTextField = new JTextField();
    ageTextField.setBounds(650, 250, 150, 30);
    ageTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    ageTextField.setLayout(null);
    this.add(ageTextField);

    dobTextField = new JTextField();
    dobTextField.setBounds(650, 290, 150, 30);
    dobTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    dobTextField.setLayout(null);
    this.add(dobTextField);

    submitbutton = new JButton();
    submitbutton.setText("Submit");
    submitbutton.setForeground(Color.WHITE);
    submitbutton.setBackground(Color.BLACK);
    submitbutton.setBounds(250, 330, 150, 40);
    submitbutton.setFont(new Font("Arial", Font.PLAIN, 20));
    submitbutton.setFocusable(false);
    this.add(submitbutton);

    backButton = new JButton();
    backButton.setText("BACK");
    backButton.setForeground(Color.GREEN);
    backButton.setBackground(Color.BLACK);
    backButton.setBounds(650, 330, 150, 40);
    backButton.setFont(new Font("Arial", Font.PLAIN, 20));
    backButton.setFocusable(false);

    submitbutton.addActionListener(this);
    backButton.addActionListener(this);
    this.add(backButton);
    this.add(backgroundLabel);
    this.setVisible(true);

  }

  @Override
  public void actionPerformed(ActionEvent e) {


    if (e.getSource().equals(submitbutton)) {
      if(nameTextField.getText().length()>=1 && userNameTextField.getText().length()>=1 && passwordTextField.getText().length()>=1 && genderTextField.getText().length()>=1)
      insertNewTeacher();
       else
        JOptionPane.showMessageDialog(null, "Please enter the required fields");
    } else if (e.getSource().equals(backButton)) {
      this.setVisible(false);
    }

    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");

  }

  private void insertNewTeacher() {

    
    String qString = "insert into teacher_details (user_name,name,password,father_name,qualification,gender,teaching_exp,fav_subject,email,phone,city,blood_group,age,date_of_birth) values('"
        + userNameTextField.getText() + "','" + nameTextField.getText() + "','" + passwordTextField.getText() + "','"
        + fatherNameTextField.getText() + "','" + qualifcationTextField.getText() + "','" +
        genderTextField.getText() + "','" + teachingexpTextField.getText() + "','" + favSubTextField.getText() + "','"
        + emailTextField.getText() + "','" + phonTextField.getText() + "','" +
        cityTextField.getText() + "','" + bloodGroupTextField.getText() + "','" + ageTextField.getText() + "','"
        + dobTextField.getText() + "')";
    System.out.println(qString);
    

    try {
      int i = LoginFrame.connectionObj.statement.executeUpdate(qString);
      if (i >= 1) {
        JOptionPane.showMessageDialog(null, "New Teacher added");
        System.out.println("query executed new teacher");
        this.setVisible(false);
      } else {
        JOptionPane.showMessageDialog(null, "Something went wrong");
      }

    } catch (Exception ex) {
      ex.printStackTrace();
    }

  }

}
