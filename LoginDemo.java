import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import MyControls.*;
	interface LoginConstants
{
	public String COLLEGE_NAME="Vivekanad Education  Society's Polytechnic ";
	public String T_ID="Enter Teacher ID:";
	public String T_PASS="Enter Password:";
	public String BTN_SIGNIN="Sign in";
	public String BTN_REGISTER="Register";
	public String QUOTES="                         	 Educate and raise the masses, and thus alone a nation is possible..";
}


public class LoginDemo extends JFrame implements ActionListener,LoginConstants,FocusListener,MouseListener
{

	//Login  Module details
		JLabel clgName,id,pass,vesImage,logoImage,quote; 
		MyTextField teacherID;
		MyPasswordField password;
		MyButton btnSignIn, btnRegister;
		JPanel main,centre,top,bottom,login,tp_login;
		CardLayout cardLO;
		ImageIcon ves,logo; 	
		Font labels;
		FlowLayout bottom_layout;
	

	public LoginDemo()
	{
		getContentPane().setBackground(Color.BLACK);
		createGUILogin();
		createAndMakePanelsLogin();
		
		add(main,BorderLayout.NORTH);
		add(quote,BorderLayout.SOUTH);
		
		setVisible(true);
		btnRegister.requestFocus();
		setSize(900,430);
		setResizable(false);	
		setTitle("Teacher AIDE");

	}
	



void createGUILogin()
{	
	clgName=new JLabel(COLLEGE_NAME);
	id=new JLabel(T_ID);
	pass=new JLabel(T_PASS);
	quote=new JLabel("                             " + QUOTES + "...");
	teacherID=new MyTextField("",15,Color.WHITE);
	teacherID.setToolTipText("Enter Teacher Employee ID here");
	password=new MyPasswordField("",15,Color.WHITE);
	password.setToolTipText("Enter Password here");
	btnSignIn=new MyButton("   " + BTN_SIGNIN+ "   ",Color.WHITE);

	btnRegister=new MyButton("  "+ BTN_REGISTER + "    ",Color.WHITE);
	centre=new JPanel();
	top=new JPanel();
	bottom=new JPanel();
	login=new JPanel();
	main=new JPanel();
	tp_login=new JPanel();
	vesImage=new JLabel("");
	ves=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\ves48.png");	
	vesImage.setIcon(ves);
	logoImage=new JLabel("");
	logo=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\logo48.png");	
	logoImage.setIcon(logo);
	logoImage.setToolTipText("Teacher AIDE");
	labels=new Font("aSanSerif", 	Font.ITALIC,16);
	clgName.setFont(labels);
	quote.setFont(labels);
	cardLO=new CardLayout();
	bottom_layout=new FlowLayout();
	setColorLogin();
	
	btnRegister.addActionListener(this);
	btnSignIn.addActionListener(this);
	btnRegister.addMouseListener(this);
	btnSignIn.addMouseListener(this);
	
	teacherID.addFocusListener(this);
	password.addFocusListener(this);


}
void setColorLogin()
{
	btnSignIn.setBackground(Color.BLACK);
	btnSignIn.setForeground(Color.WHITE);
	btnRegister.setBackground(Color.BLACK);
	btnRegister.setForeground(Color.WHITE);
	clgName.setForeground(Color.WHITE);	
	//id.setOpaque(true);
	quote.setForeground(Color.WHITE);
	id.setForeground(Color.WHITE);
	pass.setForeground(Color.WHITE);
	centre.setBackground(Color.BLACK);
	top.setBackground(Color.BLACK);
	bottom.setBackground(Color.BLACK);
	
	teacherID.setBackground(Color.LIGHT_GRAY);
	password.setBackground(Color.LIGHT_GRAY);
	teacherID.setForeground(Color.BLACK);
	password.setForeground(Color.BLACK);

	tp_login.setBackground(Color.BLACK);
}

void createAndMakePanelsLogin()

{	
	Border etchedBorder = BorderFactory.createEtchedBorder(Color.WHITE,Color.BLUE);
	TitledBorder titledBorder = BorderFactory.createTitledBorder(etchedBorder, "Sign-in Details");
	titledBorder.setTitleColor(Color.WHITE);
	centre.setLayout(new GridLayout(4,4,10,10));
	
	centre.add(new Label(" "));
	centre.add(new Label(" "));
	centre.add(new Label(" "));
	centre.add(new Label(" "));
	

	centre.add(new Label(" "));
	centre.add(id);
	centre.add(teacherID);
	centre.add(new Label(" "));

	centre.add(new Label(" "));
	centre.add(pass);
	centre.add(password);
	centre.add(new Label(" "));

	centre.add(new Label(" "));
	centre.add(new Label(" "));
	centre.add(new Label(" "));
	centre.add(new Label(" "));




	top.setLayout(new FlowLayout());
	top.add(vesImage);
	top.add(clgName);
	top.add(logoImage);
	

	bottom.setLayout(bottom_layout);
	bottom_layout.setHgap(35);
	bottom.add(btnSignIn);
	bottom.add(btnRegister);

	login.setLayout(new BorderLayout());
	login.add(top,BorderLayout.NORTH);
	login.add(centre,BorderLayout.CENTER);
	login.add(bottom,BorderLayout.SOUTH);

	tp_login.setLayout(new FlowLayout());
	tp_login.add(login);
	centre.setBorder(titledBorder);
	
	main.setLayout(cardLO);
	main.add(tp_login);

}
public void actionPerformed(ActionEvent ie)
{
	if(ie.getSource()==btnRegister)
		new RegisterDemo();
	else if(ie.getSource()==btnSignIn)
	{
		if(teacherID.getText().equals("") || password.getText().equals("") )
		{
			JOptionPane.showMessageDialog(this, "All the fields are mandatory.", "Teacher AIDE", JOptionPane.INFORMATION_MESSAGE);
					
		}
	}
	setVisible(false);

}
public void focusGained(FocusEvent fe)
{
	if(fe.getSource() instanceof MyPasswordField)
	{
		MyPasswordField ptf=(MyPasswordField)fe.getSource();
		ptf.changeColor(Color.BLUE);
	}
	else if(fe.getSource() instanceof MyTextField)
	{
	MyTextField mtf=(MyTextField)fe.getSource();
	mtf.changeColor(Color.BLUE);
	}
	
}
public void focusLost(FocusEvent fe)
{
	if(fe.getSource() instanceof MyPasswordField)
	{
		MyPasswordField ptf=(MyPasswordField)fe.getSource();
		if(ptf.getText().length()==0)
		ptf.changeColor(Color.RED);
	else
		ptf.changeColor(Color.BLACK);

	}
	else if(fe.getSource() instanceof MyTextField)
	{
	MyTextField mtf=(MyTextField)fe.getSource();
		if(mtf.getText().length()==0)
		mtf.changeColor(Color.RED);
	else
		mtf.changeColor(Color.BLACK);
	}
}
public void mouseEntered(MouseEvent me)
	{
		MyButton mb=(MyButton)me.getSource();
		mb.changeColor(Color.BLUE);
	}
	public void mouseExited(MouseEvent me)
	{
		MyButton mb=(MyButton)me.getSource();
		mb.changeColor(Color.WHITE);
	}

	public void mouseReleased(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
public static void main(String ar[])
{
	new LoginDemo();	
}
}