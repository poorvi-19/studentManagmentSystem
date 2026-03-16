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

public class ViewStudentDetails extends JFrame implements ActionListener {

   JButton submitButton1, backButton1, submitButton, backButton;
   JTextField rollnotextfield, nametextfield, passwordtextfield, fathernametextfield,
         emailtextfield, classtextfield, agetextfield, bloodgrouptextfield, gendertextfield,
         phonetextfield, sectiontextfield, usernametextfield, dobtextfield, cityTextField;
   String receivedRollNumber;
   JTextField classJTextField;

   ViewStudentDetails() {

      this.setLayout(null);
      this.setSize(1000, 600);
      this.setTitle("View student details");
      this.setForeground(Color.GRAY);
      this.setResizable(false);

       JLabel backgroundLabel=new JLabel();
   backgroundLabel.setLayout(null);
   backgroundLabel.setBounds(0, 0, 1000, 600);
   backgroundLabel.setForeground(new Color(245,242,242));
  
       Image icon = Toolkit.getDefaultToolkit().getImage(
       "C:\\Users\\dell\\OneDrive\\Desktop\\poorvi singh\\My student management system\\My student management system\\src\\addnewteacher.jpeg");
 
       icon=icon.getScaledInstance(1000, 600, Image.SCALE_SMOOTH);
       ImageIcon i = new ImageIcon(icon);
       backgroundLabel.setIcon(i);


      JLabel classJLabel = new JLabel("Class name: ");
      classJLabel.setBounds(200, 100, 200, 30);
      classJLabel.setFont(new Font("Arial", Font.BOLD, 30));
      this.add(classJLabel);

      JLabel rollNoJLabel = new JLabel("Roll no: ");
      rollNoJLabel.setBounds(200, 200, 200, 30);
      rollNoJLabel.setFont(new Font("Arial", Font.BOLD, 30));
      this.add(rollNoJLabel);

       classJTextField = new JTextField();
      classJTextField.setBounds(430, 100, 150, 30);
      classJTextField.setFont(new Font("Arial", Font.PLAIN, 20));
      classJTextField.setLayout(null);
      this.add(classJTextField);

      rollnotextfield = new JTextField();
      rollnotextfield.setBounds(430, 200, 150, 30);
      rollnotextfield.setFont(new Font("Arial", Font.PLAIN, 20));
      rollnotextfield.setLayout(null);

      this.add(rollnotextfield);

      submitButton1 = new JButton();
      submitButton1.setText("View student");
      submitButton1.setForeground(Color.WHITE);
      submitButton1.setBackground(Color.BLACK);
      submitButton1.setBounds(200, 330, 170, 40);
      submitButton1.setFont(new Font("Arial", Font.PLAIN, 20));
      submitButton1.setFocusable(false);
      this.add(submitButton1);

      backButton1 = new JButton();
      backButton1.setText("BACK");
      backButton1.setForeground(Color.GREEN);
      backButton1.setBackground(Color.BLACK);
      backButton1.setBounds(430, 330, 150, 40);
      backButton1.setFont(new Font("Arial", Font.PLAIN, 20));
      backButton1.setFocusable(false);
      this.add(backButton1);

      submitButton1.addActionListener(this);
      backButton1.addActionListener(this);
        this.add(backgroundLabel);
      this.setVisible(true);

   }

   ViewStudentDetails(String rollNumber,String classString) {
      receivedRollNumber = rollNumber;
      
      this.setLayout(null);
      this.setSize(1000, 600);
      this.setTitle("View student details");
      this.setForeground(Color.GRAY);
      this.setResizable(false);

            JLabel backgroundLabel=new JLabel();
   backgroundLabel.setLayout(null);
   backgroundLabel.setBounds(0, 0, 1000, 600);
   backgroundLabel.setForeground(new Color(245,242,242));
  
       Image icon = Toolkit.getDefaultToolkit().getImage(
       "C:\\Users\\dell\\OneDrive\\Desktop\\poorvi singh\\My student management system\\My student management system\\src\\addnewteacher.jpeg");
 
       icon=icon.getScaledInstance(1000, 600, Image.SCALE_SMOOTH);
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

      JLabel classlabel = new JLabel();
      classlabel.setText("Class name");
      classlabel.setBounds(100, 170, 150, 30);
      classlabel.setFont(new Font("Arial", Font.PLAIN, 20));
      classlabel.setLayout(null);
      this.add(classlabel);

      JLabel genderlabel = new JLabel();
      genderlabel.setText("Gender");
      genderlabel.setBounds(100, 210, 150, 30);
      genderlabel.setFont(new Font("Arial", Font.PLAIN, 20));
      genderlabel.setLayout(null);
      this.add(genderlabel);

      JLabel citylabel = new JLabel();
      citylabel.setText("City");
      citylabel.setBounds(100, 250, 150, 30);
      citylabel.setFont(new Font("Arial", Font.PLAIN, 20));
      citylabel.setLayout(null);
      this.add(citylabel);

      JLabel rollnolabel = new JLabel();
      rollnolabel.setText("Roll no");
      rollnolabel.setBounds(100, 290, 150, 30);
      rollnolabel.setFont(new Font("Arial", Font.PLAIN, 20));
      rollnolabel.setLayout(null);
      this.add(rollnolabel);

      JLabel usernamelabel = new JLabel();
      usernamelabel.setText("Username");
      usernamelabel.setBounds(500, 50, 150, 30);
      usernamelabel.setFont(new Font("Arial", Font.PLAIN, 20));
      this.add(usernamelabel);

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

      JLabel sectionlabel = new JLabel();
      sectionlabel.setText("Section");
      sectionlabel.setBounds(500, 170, 150, 30);
      sectionlabel.setFont(new Font("Arial", Font.PLAIN, 20));
      sectionlabel.setLayout(null);
      this.add(sectionlabel);

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

      nametextfield = new JTextField();
      nametextfield.setBounds(240, 50, 150, 30);
      nametextfield.setFont(new Font("Arial", Font.PLAIN, 20));
      nametextfield.setLayout(null);
      this.add(nametextfield);

      passwordtextfield = new JTextField();
      // JTextField passwordtextfield = new JTextField("Password",100);//for adding
      // hint to the textfield
      passwordtextfield.setBounds(240, 90, 150, 30);
      passwordtextfield.setLayout(null);
      passwordtextfield.setFont(new Font("Arial", Font.PLAIN, 20));
      this.add(passwordtextfield);

      fathernametextfield = new JTextField();
      fathernametextfield.setBounds(240, 130, 150, 30);
      fathernametextfield.setFont(new Font("Arial", Font.PLAIN, 20));
      fathernametextfield.setLayout(null);
      this.add(fathernametextfield);

      classtextfield = new JTextField();
      classtextfield.setBounds(240, 170, 150, 30);
      classtextfield.setFont(new Font("Arial", Font.PLAIN, 20));
      classtextfield.setLayout(null);
      this.add(classtextfield);

      gendertextfield = new JTextField();
      gendertextfield.setBounds(240, 210, 150, 30);
      gendertextfield.setFont(new Font("Arial", Font.PLAIN, 20));
      gendertextfield.setLayout(null);
      this.add(gendertextfield);

      cityTextField = new JTextField();
      cityTextField.setBounds(240, 250, 150, 30);
      cityTextField.setFont(new Font("Arial", Font.PLAIN, 20));
      cityTextField.setLayout(null);
      this.add(cityTextField);

      rollnotextfield = new JTextField();
      rollnotextfield.setBounds(240, 290, 150, 30);
      rollnotextfield.setFont(new Font("Arial", Font.PLAIN, 20));
      rollnotextfield.setLayout(null);
      this.add(rollnotextfield);

      usernametextfield = new JTextField();
      usernametextfield.setBounds(640, 50, 150, 30);
      usernametextfield.setFont(new Font("Arial", Font.PLAIN, 20));
      usernametextfield.setLayout(null);
      this.add(usernametextfield);

      emailtextfield = new JTextField();
      emailtextfield.setBounds(640, 90, 150, 30);
      emailtextfield.setFont(new Font("Arial", Font.PLAIN, 20));
      emailtextfield.setLayout(null);
      this.add(emailtextfield);

      phonetextfield = new JTextField();
      phonetextfield.setBounds(640, 130, 150, 30);
      phonetextfield.setFont(new Font("Arial", Font.PLAIN, 20));
      phonetextfield.setLayout(null);
      this.add(phonetextfield);

      sectiontextfield = new JTextField();
      sectiontextfield.setBounds(640, 170, 150, 30);
      sectiontextfield.setFont(new Font("Arial", Font.PLAIN, 20));
      sectiontextfield.setLayout(null);
      this.add(sectiontextfield);

      bloodgrouptextfield = new JTextField();
      bloodgrouptextfield.setBounds(640, 210, 150, 30);
      bloodgrouptextfield.setFont(new Font("Arial", Font.PLAIN, 20));
      bloodgrouptextfield.setLayout(null);
      this.add(bloodgrouptextfield);

      agetextfield = new JTextField();
      agetextfield.setBounds(640, 250, 150, 30);
      agetextfield.setFont(new Font("Arial", Font.PLAIN, 20));
      agetextfield.setLayout(null);
      this.add(agetextfield);

      dobtextfield = new JTextField();
      dobtextfield.setBounds(640, 290, 150, 30);
      dobtextfield.setFont(new Font("Arial", Font.PLAIN, 20));
      dobtextfield.setLayout(null);
      this.add(dobtextfield);

      setAllEditabelFalse();

      backButton = new JButton();
      backButton.setText("BACK");
      backButton.setForeground(Color.GREEN);
      backButton.setBackground(Color.BLACK);
      backButton.setBounds(640, 330, 150, 40);
      backButton.setFont(new Font("Arial", Font.PLAIN, 20));
      backButton.setFocusable(false);

      // submitButton.addActionListener(this);
      backButton.addActionListener(this);
      this.add(backButton);

      getStudentDetails(receivedRollNumber,classString);
      this.add(backgroundLabel);
      
   }

   private void setAllEditabelFalse() {
      dobtextfield.setEditable(false);
      nametextfield.setEditable(false);
      passwordtextfield.setEditable(false);
      sectiontextfield.setEditable(false);
      bloodgrouptextfield.setEditable(false);
      phonetextfield.setEditable(false);
      fathernametextfield.setEditable(false);
      usernametextfield.setEditable(false);
      emailtextfield.setEditable(false);
      agetextfield.setEditable(false);

      gendertextfield.setEditable(false);
      cityTextField.setEditable(false);
      classtextfield.setEditable(false);
      rollnotextfield.setEditable(false);

   }

   private void getStudentDetails(String rollNumber, String claString) {

      String query = "select * from student_details where rollno='" + rollNumber + "' and class='"+claString+"'";
      try {
         ResultSet result = LoginFrame.connectionObj.statement.executeQuery(query);

         if (result.next()) {
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
            this.setVisible(true);
         } else {
            JOptionPane.showMessageDialog(null, "No student found with this roll no");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   @Override
   public void actionPerformed(ActionEvent e) {

      if (e.getSource().equals(submitButton1)) {
         if (rollnotextfield.getText().length() >= 1 && classJTextField.getText().length()>=1)
            new ViewStudentDetails(rollnotextfield.getText(),classJTextField.getText());
         else
            JOptionPane.showMessageDialog(null, "Please enter roll no");
         this.setVisible(false);
      } else if (e.getSource().equals(backButton1)) {
         this.setVisible(false);
         System.out.println("Back button1 pressed");

      } else if (e.getSource().equals(backButton)) {
         this.setVisible(false);
      }

      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
   }

}
