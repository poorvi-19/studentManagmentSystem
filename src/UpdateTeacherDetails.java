import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UpdateTeacherDetails extends JFrame implements ActionListener {

//    public static void main(String[] args) {
//    new UpdateTeacherDetails();
// }

   JLabel userNameUpdateLabel, nameUpdateLabel, emailUpdateLabel, fatherNameUpdateLabel, phoneUpdateLabel,
         qualificationUpdateLabel,
         cityUpdateLabel, bloodGroupUpdateLabel, genderUpdateLabel, ageUpdateLabel, experienceLabel, favSubLabel,
         dobUpdateLabel;
   JTextField userNameUpdateTextField, nameUpdateTextField, emailUpdateTextField, fatherNameUpdateTextField,
         phoneUpdateTextField, qualificationUpdateTextField,
         cityUpdateTextField, bloodGroupUpdateTextField, genderUpdateTextField, ageUpdateTextField, experienceTextField,
         favSubTextField, dobUpdateTextField;
   JTextField userNameTextField1;
   JButton updateTeacherButton;
   JButton backbutton, submitButton1, backButton1;
   String recievedUserName;

   // public static void main(String args[]){
   // new UpdateTeacherDetails();
   // }

   UpdateTeacherDetails() {

      this.setLayout(null);
      this.setSize(1000, 600);
      this.setTitle("Update Teacher");
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
      userNameLabel.setBounds(200, 200, 250, 30);
      userNameLabel.setFont(new Font("Arial", Font.BOLD, 30));
      this.add(userNameLabel);

      userNameTextField1 = new JTextField();
      userNameTextField1.setBounds(480, 200, 200, 30);
      userNameTextField1.setFont(new Font("Arial", Font.PLAIN, 20));
      userNameTextField1.setLayout(null);

      this.add(userNameTextField1);

      submitButton1 = new JButton();
      submitButton1.setText("Update Teacher");
      submitButton1.setForeground(Color.WHITE);
      submitButton1.setBackground(Color.BLACK);
      submitButton1.setBounds(200, 330, 240, 40);
      submitButton1.setFont(new Font("Arial", Font.PLAIN, 20));
      submitButton1.setFocusable(false);
      this.add(submitButton1);

      backButton1 = new JButton();
      backButton1.setText("BACK");
      backButton1.setForeground(Color.GREEN);
      backButton1.setBackground(Color.BLACK);
      backButton1.setBounds(480, 330, 200, 40);
      backButton1.setFont(new Font("Arial", Font.PLAIN, 20));
      backButton1.setFocusable(false);
      this.add(backButton1);

      submitButton1.addActionListener(this);
      backButton1.addActionListener(this);
      this.add(backgroundLabel);
      this.setVisible(true);

   }

   UpdateTeacherDetails(String username) {

      recievedUserName = username;

      this.setLayout(null);
      this.setSize(1000, 700);
      this.setTitle("Update Teacher Details");
      this.setForeground(Color.GRAY);


   JLabel backgroundLabel=new JLabel();
   backgroundLabel.setLayout(null);
   backgroundLabel.setBounds(0, 0, 1000, 700);
  
       Image icon = Toolkit.getDefaultToolkit().getImage(
       "C:\\Users\\dell\\OneDrive\\Desktop\\poorvi singh\\My student management system\\My student management system\\src\\addnewteacher.jpeg");
       icon=icon.getScaledInstance(1000, 700, Image.SCALE_SMOOTH);
       ImageIcon i = new ImageIcon(icon);
   
   backgroundLabel.setIcon(i);

      userNameUpdateLabel = new JLabel();
      userNameUpdateLabel.setText("Username");
      userNameUpdateLabel.setBounds(100, 40, 150, 30);
      userNameUpdateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
      userNameUpdateLabel.setLayout(null);
      this.add(userNameUpdateLabel);

      nameUpdateLabel = new JLabel();
      nameUpdateLabel.setText("Name");
      nameUpdateLabel.setBounds(100, 80, 150, 30);
      nameUpdateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
      nameUpdateLabel.setLayout(null);
      this.add(nameUpdateLabel);

      emailUpdateLabel = new JLabel();
      emailUpdateLabel.setText("Email id");
      emailUpdateLabel.setBounds(100, 120, 150, 30);
      emailUpdateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
      emailUpdateLabel.setLayout(null);
      this.add(emailUpdateLabel);

      fatherNameUpdateLabel = new JLabel();
      fatherNameUpdateLabel.setText("Father name");
      fatherNameUpdateLabel.setBounds(100, 160, 150, 30);
      fatherNameUpdateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
      fatherNameUpdateLabel.setLayout(null);
      this.add(fatherNameUpdateLabel);

      phoneUpdateLabel = new JLabel();
      phoneUpdateLabel.setText("Phone no");
      phoneUpdateLabel.setBounds(100, 200, 150, 30);
      phoneUpdateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
      phoneUpdateLabel.setLayout(null);
      this.add(phoneUpdateLabel);

      qualificationUpdateLabel = new JLabel();
      qualificationUpdateLabel.setText("Qualification");
      qualificationUpdateLabel.setBounds(100, 240, 150, 30);
      qualificationUpdateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
      qualificationUpdateLabel.setLayout(null);
      this.add(qualificationUpdateLabel);

      cityUpdateLabel = new JLabel();
      cityUpdateLabel.setText("City");
      cityUpdateLabel.setBounds(100, 280, 150, 30);
      cityUpdateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
      cityUpdateLabel.setLayout(null);
      this.add(cityUpdateLabel);

      genderUpdateLabel = new JLabel();
      genderUpdateLabel.setText("Gender");
      genderUpdateLabel.setBounds(100, 320, 150, 30);
      genderUpdateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
      genderUpdateLabel.setLayout(null);
      genderUpdateLabel.setLayout(null);
      this.add(genderUpdateLabel);

      bloodGroupUpdateLabel = new JLabel();
      bloodGroupUpdateLabel.setText("Blood group");
      bloodGroupUpdateLabel.setBounds(100, 360, 150, 30);
      bloodGroupUpdateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
      bloodGroupUpdateLabel.setLayout(null);
      this.add(bloodGroupUpdateLabel);

      ageUpdateLabel = new JLabel();
      ageUpdateLabel.setText("Age");
      ageUpdateLabel.setBounds(100, 400, 150, 30);
      ageUpdateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
      ageUpdateLabel.setLayout(null);
      this.add(ageUpdateLabel);

      dobUpdateLabel = new JLabel();
      dobUpdateLabel.setText("Date of birth");
      dobUpdateLabel.setBounds(100, 440, 150, 20);
      dobUpdateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
      dobUpdateLabel.setLayout(null);
      this.add(dobUpdateLabel);

      experienceLabel = new JLabel();
      experienceLabel.setText("Experience");
      experienceLabel.setBounds(100, 480, 150, 30);
      experienceLabel.setFont(new Font("Arial", Font.PLAIN, 20));
      experienceLabel.setLayout(null);
      this.add(experienceLabel);

      favSubLabel = new JLabel();
      favSubLabel.setText("Fav Subject");
      favSubLabel.setBounds(100, 520, 150, 30);
      favSubLabel.setFont(new Font("Arial", Font.PLAIN, 20));
      favSubLabel.setLayout(null);
      this.add(favSubLabel);

      userNameUpdateTextField = new JTextField();
      userNameUpdateTextField.setBounds(400, 40, 150, 30);
      userNameUpdateTextField.setFont(new Font("Arial", Font.PLAIN, 20));
      userNameUpdateTextField.setLayout(null);
      userNameUpdateTextField.setEditable(false);
      this.add(userNameUpdateTextField);

      nameUpdateTextField = new JTextField();
      nameUpdateTextField.setBounds(400, 80, 150, 30);
      nameUpdateTextField.setFont(new Font("Arial", Font.PLAIN, 20));
      nameUpdateTextField.setLayout(null);
      this.add(nameUpdateTextField);

      emailUpdateTextField = new JTextField();
      emailUpdateTextField.setBounds(400, 120, 150, 30);
      emailUpdateTextField.setFont(new Font("Arial", Font.PLAIN, 20));
      emailUpdateTextField.setLayout(null);
      this.add(emailUpdateTextField);

      fatherNameUpdateTextField = new JTextField();
      fatherNameUpdateTextField.setBounds(400, 160, 150, 30);
      fatherNameUpdateTextField.setFont(new Font("Arial", Font.PLAIN, 20));
      fatherNameUpdateTextField.setLayout(null);
      this.add(fatherNameUpdateTextField);

      phoneUpdateTextField = new JTextField();
      phoneUpdateTextField.setBounds(400, 200, 150, 30);
      phoneUpdateTextField.setFont(new Font("Arial", Font.PLAIN, 20));
      phoneUpdateTextField.setLayout(null);
      this.add(phoneUpdateTextField);

      qualificationUpdateTextField = new JTextField();
      qualificationUpdateTextField.setBounds(400, 240, 150, 30);
      qualificationUpdateTextField.setFont(new Font("Arial", Font.PLAIN, 20));
      qualificationUpdateTextField.setLayout(null);
      this.add(qualificationUpdateTextField);


      cityUpdateTextField = new JTextField();
      cityUpdateTextField.setBounds(400, 280, 150, 30);
      cityUpdateTextField.setFont(new Font("Arial", Font.PLAIN, 20));
      cityUpdateTextField.setLayout(null);
      this.add(cityUpdateTextField);


      genderUpdateTextField = new JTextField();
      genderUpdateTextField.setBounds(400, 320, 150, 30);
      genderUpdateTextField.setFont(new Font("Arial", Font.PLAIN, 20));
      genderUpdateTextField.setLayout(null);
      this.add(genderUpdateTextField);

      bloodGroupUpdateTextField = new JTextField();
      bloodGroupUpdateTextField.setBounds(400, 360, 150, 30);
      bloodGroupUpdateTextField.setFont(new Font("Arial", Font.PLAIN, 20));
      bloodGroupUpdateTextField.setLayout(null);
      this.add(bloodGroupUpdateTextField);

      ageUpdateTextField = new JTextField();
      ageUpdateTextField.setBounds(400, 400, 150, 30);
      ageUpdateTextField.setFont(new Font("Arial", Font.PLAIN, 20));
      ageUpdateTextField.setLayout(null);
      this.add(ageUpdateTextField);

      dobUpdateTextField = new JTextField();
      dobUpdateTextField.setBounds(400, 440, 150, 30);
      dobUpdateTextField.setFont(new Font("Arial", Font.PLAIN, 20));
      dobUpdateTextField.setLayout(null);
      this.add(dobUpdateTextField);

      experienceTextField = new JTextField();
      experienceTextField.setBounds(400, 480, 150, 30);
      experienceTextField.setFont(new Font("Arial", Font.PLAIN, 20));
      experienceTextField.setLayout(null);
      this.add(experienceTextField);

      favSubTextField = new JTextField();
      favSubTextField.setBounds(400, 520, 150, 30);
      favSubTextField.setFont(new Font("Arial", Font.PLAIN, 20));
      favSubTextField.setLayout(null);
      this.add(favSubTextField);

      updateTeacherButton = new JButton();
      updateTeacherButton.setText("Update Teacher");
      updateTeacherButton.setForeground(Color.WHITE);
      updateTeacherButton.setBackground(Color.BLACK);
      updateTeacherButton.setBounds(90, 570, 200, 40);
      updateTeacherButton.setFont(new Font("Arial", Font.PLAIN, 20));
      updateTeacherButton.setFocusable(false);
      this.add(updateTeacherButton);

      backbutton = new JButton();
      backbutton.setText("BACK");
      backbutton.setForeground(Color.GREEN);
      backbutton.setBackground(Color.BLACK);
      backbutton.setBounds(400, 570, 150, 40);
      backbutton.setFont(new Font("Arial", Font.PLAIN, 20));
      backbutton.setFocusable(false);

      updateTeacherButton.addActionListener(this);
      backbutton.addActionListener(this);
      this.add(updateTeacherButton);
      this.add(backbutton);
       this.add(backgroundLabel);
      // this.setVisible(true);
      this.getTeacher(recievedUserName);
     







      
   // JLabel backgroundLabel=new JLabel();
   // backgroundLabel.setLayout(null);
   // backgroundLabel.setBounds(0, 0, 1000, 700);
  
   //     Image icon = Toolkit.getDefaultToolkit().getImage(
   //     "C:\\Users\\dell\\OneDrive\\Desktop\\poorvi singh\\My student management system\\My student management system\\src\\teacherupdate.jpeg");
   //     icon=icon.getScaledInstance(1000, 700, Image.SCALE_SMOOTH);
   //     ImageIcon i = new ImageIcon(icon);
   
   // backgroundLabel.setIcon(i);
  

   // this.add(backgroundLabel);

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub

      if (e.getSource().equals(backButton1)) {
         this.setVisible(false);
      } else if (e.getSource().equals(submitButton1)) {
         new UpdateTeacherDetails(userNameTextField1.getText());
      } else if (e.getSource().equals(backbutton)) {
         this.setVisible(false);
      } else if (e.getSource().equals(updateTeacherButton)) {
         String queString = "insert into teacher_details (user_name,name,father_name,qualification,gender,teaching_exp,fav_subject,email,phone,city,blood_group,age,date_of_birth) values('"
               + userNameUpdateTextField.getText() + "','" + nameUpdateTextField.getText() + "','"
               + fatherNameUpdateTextField.getText() + "','" + qualificationUpdateTextField.getText() + "','"
               + genderUpdateTextField.getText() +
               "','" + experienceTextField.getText() + "','" + favSubTextField.getText() + "','"
               + emailUpdateTextField.getText() + "','" + phoneUpdateTextField.getText() + "','"
               + cityUpdateTextField.getText() +
               "','" + bloodGroupUpdateTextField.getText() + "','" + ageUpdateTextField.getText() + "','"
               + dobUpdateTextField.getText() + "')";

         try {
            int i = LoginFrame.connectionObj.statement.executeUpdate(queString);
            if (i >= 1) {
               JOptionPane.showMessageDialog(null, "Teacher details updated");
               this.setVisible(false);
            } else {
               JOptionPane.showMessageDialog(null, "Something went wrong");
            }
         } catch (Exception exc) {
            exc.printStackTrace();
         }

      }

      throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
   }

   private void getTeacher(String user) {
      if (user.length() == 0) {
         JOptionPane.showMessageDialog(null, "Please enter username");
         return;
      }

      String query = "select * from teacher_details where user_name='" + user + "'";
      try {
         ResultSet result = LoginFrame.connectionObj.statement.executeQuery(query);

         if (result.next()) {
            nameUpdateTextField.setText(result.getString("name"));
            emailUpdateTextField.setText(result.getString("email"));
            fatherNameUpdateTextField.setText(result.getString("father_name"));
            emailUpdateTextField.setText(result.getString("email"));
            experienceTextField.setText(result.getString("teaching_exp"));
            cityUpdateTextField.setText(result.getString("city"));
            ageUpdateTextField.setText(result.getString("age"));
            bloodGroupUpdateTextField.setText(result.getString("blood_group"));
            genderUpdateTextField.setText(result.getString("gender"));
            phoneUpdateTextField.setText(result.getString("phone"));
            favSubTextField.setText(result.getString("fav_subject"));
            userNameUpdateTextField.setText(result.getString("user_name"));
            dobUpdateTextField.setText(result.getString("date_of_birth"));
            qualificationUpdateTextField.setText(result.getString("qualification"));

            this.setVisible(true);

         } else {
            JOptionPane.showMessageDialog(null, "No teacher with this username");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

}
