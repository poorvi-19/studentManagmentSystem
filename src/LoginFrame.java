
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


public class LoginFrame extends JFrame implements ActionListener{

   
  JFrame loginFrame,mainFrame;
  JLabel mainLabel, accountLabel,userNameLabel,passwordLabel;
  Choice choice;
  JTextField textfieldAdmin,textfieldUser ;
  JPasswordField textfieldPassword;
  JButton loginButton, backButton;
  
  static JdbcConnectionClass connectionObj;


 public LoginFrame(){

  loginFrame=new JFrame();
  loginFrame.setTitle("School Management System");
  loginFrame.setSize(1000,600);
  loginFrame.setLayout(null);
  loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  loginFrame.setResizable(false);

       
   JLabel backgroundLabel=new JLabel();
   backgroundLabel.setLayout(null);
   backgroundLabel.setBounds(0, 0, 1000, 600);
  
       Image icon = Toolkit.getDefaultToolkit().getImage(
       "C:\\Users\\dell\\OneDrive\\Desktop\\poorvi singh\\My student management system\\My student management system\\src\\homePageImage.jpg");
       icon=icon.getScaledInstance(1050, 600, Image.SCALE_SMOOTH);
       ImageIcon i = new ImageIcon(icon);
   
   backgroundLabel.setIcon(i);

   

  mainLabel=new JLabel();
  mainLabel.setBounds(250, 100, 600, 100);
  mainLabel.setText("Login college account");
  mainLabel.setFont(new Font("Arial",Font.BOLD,40));
  mainLabel.setLayout(null);
  loginFrame.add(mainLabel);

  accountLabel=new JLabel();
  accountLabel.setBounds(250, 200, 150, 100);
  accountLabel.setText("Account : ");
  accountLabel.setFont(new Font("Arial",Font.BOLD,30));
  accountLabel.setLayout(null);
  accountLabel.setForeground(new Color(245,135,66));
  loginFrame.add(accountLabel);

  userNameLabel=new JLabel();
  userNameLabel.setBounds(250, 270, 200, 100);
  userNameLabel.setText("User Name :");
  userNameLabel.setFont(new Font("Arial",Font.BOLD,30));
  userNameLabel.setLayout(null);
  userNameLabel.setForeground(new Color(245,135,66));
  loginFrame.add(userNameLabel);

  passwordLabel=new JLabel();
  passwordLabel.setBounds(250, 340, 200, 100);
  passwordLabel.setText("Password :");
  passwordLabel.setFont(new Font("Arial",Font.BOLD,30));
  passwordLabel.setLayout(null);
  passwordLabel.setForeground(new Color(245,135,66));
  loginFrame.add(passwordLabel);
  
  choice=new Choice();
  choice.add("Admin");
  choice.add("Teacher");
  choice.add("Student");
  choice.setFont(new Font("Arial",Font.PLAIN,20));
  choice.setBounds(480, 240, 150, 30);
  loginFrame.add(choice);

   textfieldUser= new JTextField();
   textfieldUser.setBounds(480,310,150,30);
   textfieldUser.setFont(new Font("Arial",Font.PLAIN,20));
   loginFrame.add(textfieldUser);

  
   textfieldPassword= new JPasswordField();
   textfieldPassword.setBounds(480,380,150,30);
   textfieldPassword.setFont(new Font("Arial",Font.PLAIN,20));
   loginFrame.add(textfieldPassword);

   loginButton=new JButton();
   loginButton.setText("LOGIN");
   loginButton.setForeground(Color.WHITE);
   loginButton.setBackground(Color.BLACK);
   loginButton.setBounds(250, 450, 150, 40);
   loginButton.setFont(new Font("Arial",Font.PLAIN,20));
   loginButton.setFocusable(false);
   loginFrame.add(loginButton);
   
   
   backButton=new JButton();
   backButton.setText("BACK");
   backButton.setForeground(Color.GREEN);
   backButton.setBackground(Color.BLACK);
   backButton.setBounds(480, 450, 150, 40);
   backButton.setFont(new Font("Arial",Font.PLAIN,20));
   backButton.setFocusable(false);

   loginButton.addActionListener(this);
   backButton.addActionListener(this);
   loginFrame.add(backButton);
   loginFrame.add(backgroundLabel);
   loginFrame.setVisible(true);
  

}


 public static void main(String[] args) {
     new LoginFrame();
 }



 
@Override
public void actionPerformed(ActionEvent e) {
              
           if(e.getSource()==loginButton){
             try{
                connectionObj=new JdbcConnectionClass();
                ResultSet result;
                String query;
                String username=textfieldUser.getText();
                String password=textfieldPassword.getText();
                String account=choice.getSelectedItem();
                

                if (account=="Admin") {
                 query="select * from admin where username='"+username+"'and password='"+password+"'";
                 
                 
                }else if(account=="Teacher"){
                  query="select * from teacher_details where user_name='"+username+"'and password='"+password+"'";
                  

                }else{
                   query="select * from student_details where user_name='"+username+"'and password='"+password+"'";
                   
                }
              
               result=connectionObj.statement.executeQuery(query);
              
                if(result.next()){

                  if(account=="Admin"){
                  new AdminPage(username,password).setVisible(true);

                }

                else if(account=="Teacher"){
                  new TeacherPage(username).setVisible(true);
                }
                else if(account=="Student"){
                  new StudentPage(username,password).setVisible(true);
                }
                 loginFrame.setVisible(false);
                 // System.out.println("Welcome to the admin page");

                }
                 else{
                  if (username.length()==0||password.length()==0) {
                   JOptionPane.showMessageDialog(null,"You have not entered username or password");
                }else {
                  JOptionPane.showMessageDialog(null,"You have entered wrong username or password");
                }
                }
                              
                //System.out.println("Welcome to login");

             }catch(Exception ex){
                   ex.printStackTrace();
             }
           }
              if(e.getSource()==backButton){
              loginFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
              //System.out.println("Hello");
              loginFrame.setVisible(false);


               }

  //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
}

}
