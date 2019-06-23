
    
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LoginFrame extends JFrame implements ActionListener
{
   Container c;
     JLabel cal=new JLabel("              FRIENDSHIP CALCULATOR");
   JLabel userlabel=new JLabel("ENTER YOUR NAME");
   JLabel passlabel=new JLabel("ENTER NAME OF YOUR  friend");
   JTextField usertf=new JTextField();
    JTextField passtf=new JTextField();
	JButton login=new JButton("RESULT");
	JLabel percentage=new JLabel("PERCENTAGES");
	JTextField pertf=new JTextField();
	 JLabel label=new JLabel("");
	LoginFrame()
	 {
	    c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.PINK);
		cal.setBounds(200,20,350,30);
		userlabel.setBounds(100,70,400,40);
		passlabel.setBounds(100,120,400,40);
		usertf.setBounds(450,70,150,40);
		passtf.setBounds(450,120,150,40);
		login.setBounds(200,250,200,50);
        percentage.setBounds(200,300,250,50);
        // pertf.setEnabled(false);
        pertf.setForeground(Color.BLACK);
        pertf.setFont(new Font("Algerian",Font.BOLD,20));
		pertf.setBounds(200,350,200,40);
        label.setBounds(40,400,700,40);
        label.setFont(new Font("Pacifico",Font.BOLD,20));
        label.setForeground(Color.RED);
		Font f=new Font("Arial",Font.BOLD,20);
		cal.setFont(f);
		userlabel.setFont(f);
		passlabel.setFont(f);
		usertf.setFont(f);
		passtf.setFont(f);
		login.setFont(f);
		percentage.setFont(f);
		pertf.setFont(f);
		c.add(cal);
		c.add(userlabel);
		c.add(passlabel);
		c.add(passtf);
		c.add(usertf);
		c.add(login);
		c.add(percentage);
		c.add(pertf);
		c.add(label);
		login.addActionListener(this);
	 }
	 public void actionPerformed(ActionEvent event)
	 {
		 if(event.getSource()==login)
		 {
			 String username=usertf.getText();
			 String passname=passtf.getText();
			 int sum1=0,sum2=0;
			 for(int i=0;i<username.length();i++){
				 char ch=username.charAt(i);
				 int ascii=(int)ch;
				 sum1=sum1+ascii;
			 }
			  for(int i=0;i<passname.length();i++){
				 char ch=passname.charAt(i);
				 int ascii=(int)ch;
				 sum2=sum2+ascii;
			 }
             int total=sum1+sum2;
             System.out.println(total);
             int friendship=total%100;
            // int love =80;
			 pertf.setText(Integer.toString(friendship)+"%");
			 if(friendship>75)
			 {
				 label.setText("you guys are best friends");
			 }
			 else
			 {
				 label.setText("YOU GUYS are only friends");
			 }
				 
		
	 }
}
}
class FriendshipCalculator
{
	public static void main(String[]args)
	{
	    LoginFrame f=new LoginFrame();
		f.setTitle("FRIENDSHIP CALCULATOR");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,50,770,500);
	}
}