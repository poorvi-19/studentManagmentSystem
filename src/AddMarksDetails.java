import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;





public class AddMarksDetails extends JFrame implements ActionListener{
   
//  public static void main(String[] args) {
// new AddMarksDetails();   
// }

  JTextField classNameTextField,studentUserNameTextField;
  JButton backButton,updateButton;

AddMarksDetails(){
   
       
    this.setLayout(null);
    this.setSize(1000,700);
    this.setTitle("Add Marks Details");
    this.setForeground(Color.GRAY);
    this.setResizable(false);
   

      JLabel backgroundLabel=new JLabel();
        backgroundLabel.setLayout(null);
        backgroundLabel.setBounds(0, 0, 1000, 700);
  
       Image icon = Toolkit.getDefaultToolkit().getImage(
       "C:\\Users\\dell\\OneDrive\\Desktop\\poorvi singh\\My student management system\\My student management system\\src\\addnewteacher.jpeg");
       icon=icon.getScaledInstance(1000, 700, Image.SCALE_SMOOTH);
       ImageIcon i = new ImageIcon(icon);
       backgroundLabel.setIcon(i);



    JLabel classnamelabel=new JLabel();
    classnamelabel.setText("Class Name");
    classnamelabel.setBounds(150, 50, 150, 20);
    classnamelabel.setFont(new Font("Arial",Font.PLAIN,20));
    classnamelabel.setLayout(null);
    this.add(classnamelabel);

    JLabel studentusernamelabel = new JLabel();
    studentusernamelabel.setText("Student Username");
    studentusernamelabel.setBounds(150, 100, 180, 20);
    studentusernamelabel.setFont(new Font("Arial",Font.PLAIN,20));
    studentusernamelabel.setLayout(null);
    this.add(studentusernamelabel);



     classNameTextField = new JTextField();
    classNameTextField.setBounds(350, 50, 200, 30);
    classNameTextField.setFont(new Font("Arial", Font.PLAIN, 20));
    classNameTextField.setLayout(null);
    this.add(classNameTextField);

   

   studentUserNameTextField= new JTextField();
   studentUserNameTextField.setBounds(350,100,200,30);
   studentUserNameTextField.setFont(new Font("Arial",Font.PLAIN,20));
   studentUserNameTextField.setLayout(null);
   this.add(studentUserNameTextField);



    JButton addmarksbutton=new JButton();
    addmarksbutton.setText("Add Marks");
    addmarksbutton.setForeground(Color.WHITE);
    addmarksbutton.setBackground(Color.BLACK);
    addmarksbutton.setBounds(100,150,180,35);
    addmarksbutton.setFont(new Font("Arial",Font.PLAIN,20));
    addmarksbutton.setFocusable(false);
    this.add(addmarksbutton);



    backButton=new JButton();
    backButton.setText("Back");
    backButton.setForeground(Color.GREEN);
    backButton.setForeground(Color.GREEN);
    backButton.setBackground(Color.BLACK);
    backButton.setBounds(350, 150,200, 35);
    backButton.setFont(new Font("Arial",Font.PLAIN,20));
    backButton.setFocusable(false);
    
    
    this.add(backButton);
    addmarksbutton.addActionListener(this);
    backButton.addActionListener(this);
  
  

    JButton SubmitButton=new JButton();
    SubmitButton.setText("Add Class");
   
   this.add(backgroundLabel);
   this.setVisible(true);

}


  JTextField hinField,enField,evsField,gkField,mathField;
   String recclassName;
    String recStudentUserName;

 public AddMarksDetails(String className, String studentUsername){
  
  recclassName=className;
   recStudentUserName=studentUsername;

  
  JFrame studentPageFrame;
  JLabel resultLabel, hindi,english,math,evs,generalKnowledge;

    resultLabel=new JLabel();
    hindi=new JLabel();
    english=new JLabel();
    evs=new JLabel();
    generalKnowledge=new JLabel();
    math=new JLabel();

    
  studentPageFrame=this;
  studentPageFrame.setTitle("School  Student Management System");
  studentPageFrame.setSize(1000,600);
  studentPageFrame.setLayout(null);
  studentPageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

   
    

    resultLabel.setBounds(140,135,450,40);
    resultLabel.setText("Update "+getStudent(studentUsername)+"'s result:");
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
    this.add(hinField);

    enField=new JTextField();
    enField.setBounds(400, 250, 150, 30);
    enField.setFont(new Font("Arial",Font.BOLD,30)); 
    
    this.add(enField);
    
    mathField=new JTextField();
    mathField.setBounds(400, 300, 150, 30);
    mathField.setFont(new Font("Arial",Font.BOLD,30));
    this.add(mathField);

    evsField=new JTextField();
    evsField.setBounds(400, 350, 150, 30);
    evsField.setFont(new Font("Arial",Font.BOLD,30));
    this.add(evsField);

    gkField=new JTextField();
    gkField.setBounds(400, 400, 150, 30);
    gkField.setFont(new Font("Arial",Font.BOLD,30));
    this.add(gkField);
      
    backButton=new JButton();
    backButton.setText("BACK");
    backButton.setForeground(Color.BLACK);
    backButton.setBackground(Color.WHITE);
    backButton.setBounds(400, 450, 150, 40);
    backButton.setFont(new Font("Arial",Font.PLAIN,20));
    backButton.setFocusable(false);
    this.add(backButton);
   

    updateButton=new JButton();
    updateButton.setText("Update Marks");
    updateButton.setForeground(Color.BLACK);
    updateButton.setBackground(Color.WHITE);
    updateButton.setBounds(150, 450, 180, 40);
    updateButton.setFont(new Font("Arial",Font.PLAIN,20));
    updateButton.setFocusable(false);
    this.add(updateButton);

    backButton.addActionListener(this);
     updateButton.addActionListener(this);
    getResult(studentUsername);
    studentPageFrame.add(backgroundLabel);
    this.setVisible(true);
    
   }


private String getStudent(String username) {
    ResultSet result;
    String query;
    try{
     query="Select name from student_details WHERE user_name='"+username+"'";
     result=LoginFrame.connectionObj.statement.executeQuery(query);

     if(result.next()){
      
      return result.getString("name");
      
    }
    }catch(Exception ex){
        ex.printStackTrace();
    }


    throw new UnsupportedOperationException("Unimplemented method 'getStudent'");
}



private void getResult(String username) {
    ResultSet result;
    String query;
    try{
     query="Select  * from student_details WHERE user_name='"+username+"'";
     result=LoginFrame.connectionObj.statement.executeQuery(query);

     if(result.next()){
      System.out.println("result generated");
      
      int Total=result.getInt("Math")+result.getInt("EVS")+result.getInt("English")+result.getInt("GK")+result.getInt("Hindi");
      
      
          JLabel totalLabelField=new JLabel();
          mathField.setText(result.getString("Math"));
          evsField.setText(result.getString("EVS"));
          enField.setText(result.getString("English"));
          gkField.setText(result.getString("GK"));
          hinField.setText(result.getString("Hindi"));

     }

    }catch(Exception ex){
        ex.printStackTrace();
    }


   // throw new UnsupportedOperationException("Unimplemented method 'getResult'");
}




@Override
public void actionPerformed(ActionEvent e) {

     if(e.getActionCommand()==("Add Marks")){
       new AddMarksDetails(classNameTextField.getText(),studentUserNameTextField.getText());
     }
       else if(e.getActionCommand()==("Back")){
        this.setVisible(false);
        
     }else if (e.getActionCommand()=="Update Marks"){
             
          String qString= "update student_details  set hindi='"+hinField.getText()+
          "',english='"+enField.getText()+"',math='"+mathField.getText()+"', evs='"+
          evsField.getText()+"',gk='"+gkField.getText()+"' where user_name='"+recStudentUserName+"'" ;
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
     }
}


 }