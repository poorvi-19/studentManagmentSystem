
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

public class Resultshow extends JFrame implements ActionListener{

  JTextField rollNoTextField, classTextField;
   JButton backButton,showButton;

    Resultshow(){
    this.setLayout(null);
    this.setSize(1000,700);
    this.setTitle("Show Result  ");
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
   

    JLabel classlabel=new JLabel();
    classlabel.setText("Class:");
    classlabel.setBounds(250, 80, 150, 30);
    classlabel.setFont(new Font("Arial",Font.PLAIN,20));
    classlabel.setLayout(null);
    this.add(classlabel);

    // JLabel sectionlabel = new JLabel();
    // sectionlabel.setText("Section");
    // sectionlabel.setBounds(250, 140, 150, 30);
    // sectionlabel.setFont(new Font("Arial",Font.PLAIN,20));
    // sectionlabel.setLayout(null);
    // this.add(sectionlabel);

    JLabel rollNolLabel = new JLabel();
    rollNolLabel.setText("Roll no:");
    rollNolLabel.setBounds(250, 160, 150, 30);
    rollNolLabel.setFont(new Font("Arial",Font.PLAIN,20));
    rollNolLabel.setLayout(null);
    this.add(rollNolLabel);


     classTextField = new JTextField();
    classTextField.setBounds(450, 80, 150, 25);
    classTextField.setFont(new Font("Arial",Font.PLAIN,20));
    classTextField.setLayout(null);
    this.add(classTextField);

   
    rollNoTextField = new JTextField();
    rollNoTextField.setBounds(450,160,150,25);
    rollNoTextField.setFont(new Font("Arial",Font.PLAIN,20));
    rollNoTextField.setLayout(null);
    this.add(rollNoTextField);


     showButton=new JButton();
    showButton.setText("Show");
    showButton.setForeground(Color.WHITE);
    showButton.setBackground(Color.BLACK);
    showButton.setBounds(250,280,150,35);
    showButton.setFont(new Font("Arial",Font.PLAIN,20));
    showButton.setFocusable(false);
    this.add(showButton);


      backButton=new JButton();
     backButton.setText("Back");
    backButton.setForeground(Color.GREEN);
    backButton.setBackground(Color.BLACK);
    backButton.setBounds(450, 280, 150, 35);
    backButton.setFont(new Font("Arial",Font.PLAIN,20));
    backButton.setFocusable(false);
      this.add(backButton);
    
    showButton.addActionListener(this);
    backButton.addActionListener(this);

   this.add(backgroundLabel);
   this.setVisible(true);
}  




    @Override
    public void actionPerformed(ActionEvent e) {
         

     
      if (e.getSource().equals(showButton)) {

      if( rollNoTextField.getText().length()>=1 && classTextField.getText().length()>=1){
       String qString="select * from student_details where rollno='"+rollNoTextField.getText()+"' and class='"+classTextField.getText()+"'";
       try{
        ResultSet rs=LoginFrame.connectionObj.statement.executeQuery(qString);
        if(rs.next()){
        new ShowResultInAdminLogin(rs.getString("name"),rs.getInt("math"),rs.getInt("hindi"),rs.getInt("english"),rs.getInt("evs"),rs.getInt("gk"));
        }else{
         JOptionPane.showMessageDialog(null,"wrong Roll no or class" );
        }
       }catch(Exception exception){
        exception.printStackTrace();
       }
      }
       else
        JOptionPane.showMessageDialog(null, "Please enter the required fields");

    } else if (e.getSource().equals(backButton)) {
      this.setVisible(false);
    } else
            JOptionPane.showMessageDialog(null,"wrong username or class" );
           }
          
      
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
   


