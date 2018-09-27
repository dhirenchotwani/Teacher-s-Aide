import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import MyControls.*;

interface RegisterConstants
{
	public String COLLEGE_NAME="Vivekanad Education  Society's Polytechnic ";
	public String T_ID="Enter Teacher ID:";
	public String T_PASS="Enter Password:";
	public String T_REPASS="Re-enter your Password:";
	public String T_NAME="Enter Name:";
	public String T_SURNAME="Enter Surname:";
	public String T_EMAIL="Enter Email id:";
	public String T_CRC="Enter Course:";
	public String T_CT="Class Teacher :";
	public String T_DIV="Select Division:";
	public String BTN_SUBMIT="Submit";
	public String QUOTES="                                         	 Educate and raise the masses, and thus alone a nation is possible..";
	public String BORDER_TITLE="Personal Details";
}


public class RegisterDemo extends JFrame implements ActionListener,RegisterConstants,FocusListener,MouseListener
{
	//Register Details
	ImageIcon ves,logo,upload; 	
	Font labels;
	JLabel id,name,surname,email,pass,re_enter_pass,course,class_teacher,div,clg_name,quote,vesImage,logoImage;	
	MyTextField teacher_id,t_name,t_surname,t_email;
	MyPasswordField password,re_password;
	MyButton btn_Submit,btn_upload,btn_back;
	Choice divs,crcs;
	JRadioButton yes,no;
	ButtonGroup bg;
	JPanel north,middle,east,handler,west,main_register;
	public RegisterDemo()
	{
		getContentPane().setBackground(Color.BLACK);
		createGUIRegister();
		createAndMakePanelsRegister();
		
		add(main_register,BorderLayout.CENTER);
		
		setVisible(true);
		btn_upload.requestFocus();
		setSize(900,430);//set size as 780 and 430 for login and register at the end	
		
		setResizable(false);	
		setTitle("Teacher AIDE");
	}
	void createGUIRegister()
	{
	vesImage=new JLabel("");
	ves=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\ves48.png");	
	vesImage.setIcon(ves);
	logoImage=new JLabel("");
	logo=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\logo48.png");	
	logoImage.setIcon(logo);
	logoImage.setToolTipText("Teacher AIDE");
	labels=new Font("SanSerif", 	Font.ITALIC,16);
	clg_name=new JLabel(COLLEGE_NAME);
	clg_name.setFont(labels);
	id=new JLabel(T_ID);
	name=new JLabel(T_NAME);
	surname=new JLabel(T_SURNAME);
	email=new JLabel(T_EMAIL);
	pass=new JLabel(T_PASS);
	re_enter_pass=new JLabel(T_REPASS);
	course=new JLabel(T_CRC);
	class_teacher=new JLabel(T_CT);
	div=new JLabel(T_DIV);
	quote=new JLabel("               " + QUOTES);
	quote.setFont(labels);
	btn_Submit=new MyButton(BTN_SUBMIT,Color.WHITE);
	btn_upload=new MyButton("",Color.WHITE);
	btn_back=new MyButton(" Back to Login",Color.WHITE);
	upload=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\upload.png_48x48.png");
	btn_upload.setIcon(upload);
	btn_upload.setToolTipText("Upload Photo here");
	teacher_id=new MyTextField("",15,Color.BLACK);
	teacher_id.setToolTipText("Enter teacher id here");
	t_name=new MyTextField("",15,Color.BLACK);
	t_name.setToolTipText("Enter teacher name here");
	t_surname=new MyTextField("",15,Color.BLACK);
	t_surname.setToolTipText("Enter teacher surname here");
	t_email=new MyTextField("",15,Color.BLACK);
	t_email.setToolTipText("Enter teacher email-id here");
	password=new MyPasswordField("",15,Color.BLACK);
	password.setToolTipText("Enter teacher password here");
	re_password=new MyPasswordField("",15,Color.BLACK);
	re_password.setToolTipText("Re-enter password here");
	bg=new ButtonGroup();
	yes=new JRadioButton("Yes");
	no=new JRadioButton("No");
	bg.add(yes);
	bg.add(no);
	divs=new Choice();
	for(int i=1;i<22;i++)
		divs.add("P" + i);

	crcs=new Choice();
	crcs.add("CM");
	crcs.add("CO");
	crcs.add("IS");
	crcs.add("EJ");
	crcs.add("ET");
	crcs.add("EQ");
	crcs.add("IF");
	north =new JPanel();
	handler=new JPanel();
	middle=new JPanel();
	east=new JPanel();
	west=new JPanel();
	main_register=new JPanel();
	btn_Submit.addActionListener(this);
	btn_Submit.addMouseListener(this);
	btn_upload.addMouseListener(this);
	btn_back.addActionListener(this);
	yes.addActionListener(this);
	no.addActionListener(this);
	teacher_id.addFocusListener(this);
	t_name.addFocusListener(this);
	t_surname.addFocusListener(this);
	t_email.addFocusListener(this);
	password.addFocusListener(this);
	re_password.addFocusListener(this);
	

	setColorRegister();

	}
	void createAndMakePanelsRegister()
	{
		Border etchedBorder = BorderFactory.createEtchedBorder(Color.WHITE,Color.BLUE);
		TitledBorder titledBorder = BorderFactory.createTitledBorder(etchedBorder, BORDER_TITLE);
		titledBorder.setTitleColor(Color.WHITE);
		middle.setBorder(titledBorder);
		middle.setLayout(new GridLayout(10,4,10,5));
		middle.add(new Label(" "));
		middle.add(id);
		middle.add(teacher_id);
		middle.add(new Label(" "));

		middle.add(new Label(" "));
		middle.add(name);
		middle.add(t_name);
		middle.add(new Label(" "));

		middle.add(new Label(" "));
		middle.add(surname);
		middle.add(t_surname);
		middle.add(new Label(" "));	

		middle.add(new Label(" "));
		middle.add(email);
		middle.add(t_email);
		middle.add(new Label(" "));

		middle.add(new Label(" "));
		middle.add(pass);
		middle.add(password);
		middle.add(new Label(" "));

		middle.add(new Label(" "));
		middle.add(re_enter_pass);
		middle.add(re_password);
		middle.add(new Label(" "));

		middle.add(new Label(" "));
		middle.add(course);
		middle.add(crcs);
		middle.add(new Label(" "));

		middle.add(new Label(" "));
		middle.add(class_teacher);
		middle.add(yes);
		middle.add(no);

		middle.add(new Label(" "));
		middle.add(div);
		middle.add(divs);
		middle.add(new Label(" "));
		div.setVisible(false);
		divs.setVisible(false);

		middle.add(new Label(" "));
		middle.add(new Label(" "));
		middle.add(new Label(" "));
		middle.add(btn_Submit);
		
		north.setLayout(new FlowLayout());
		north.add(vesImage);
		north.add(clg_name);
		north.add(logoImage);

		east.setLayout(new FlowLayout());
		east.add(btn_upload);
		
		west.setLayout(new FlowLayout());
		west.add(btn_back);
		
		handler.setLayout(new BorderLayout());
		handler.add(middle,BorderLayout.CENTER);
		handler.add(north,BorderLayout.NORTH);
		handler.add(quote,BorderLayout.SOUTH);
		handler.add(east,BorderLayout.EAST);
		handler.add(west,BorderLayout.WEST);

		main_register.add(handler);


	}	
	void setColorRegister()
	{
		btn_Submit.setBackground(Color.BLACK);
		btn_Submit.setForeground(Color.WHITE);	

		handler.setBackground(Color.BLACK);
		middle.setBackground(Color.BLACK);
		id.setForeground(Color.WHITE);
		name.setForeground(Color.WHITE);
		surname.setForeground(Color.WHITE);
		email.setForeground(Color.WHITE);
		pass.setForeground(Color.WHITE);
		re_enter_pass.setForeground(Color.WHITE);
		course.setForeground(Color.WHITE);
		class_teacher.setForeground(Color.WHITE);
		div.setForeground(Color.WHITE);
		yes.setBackground(Color.BLACK);
		no.setBackground(Color.BLACK);
		yes.setForeground(Color.WHITE);
		no.setForeground(Color.WHITE);

		north.setBackground(Color.BLACK);
		clg_name.setForeground(Color.WHITE);
		quote.setForeground(Color.WHITE);

		teacher_id.setBackground(Color.LIGHT_GRAY);
		t_name.setBackground(Color.LIGHT_GRAY);
		t_surname.setBackground(Color.LIGHT_GRAY);
		t_email.setBackground(Color.LIGHT_GRAY);
		password.setBackground(Color.LIGHT_GRAY);
		re_password.setBackground(Color.LIGHT_GRAY);
		crcs.setBackground(Color.LIGHT_GRAY);
		divs.setBackground(Color.LIGHT_GRAY);
		
		east.setBackground(Color.BLACK);
		btn_upload.setBackground(Color.BLACK);

		west.setBackground(Color.BLACK);
		btn_back.setBackground(Color.BLACK);
		btn_back.setForeground(Color.WHITE);

		main_register.setBackground(Color.BLACK);	

	}
	public void actionPerformed(ActionEvent ae)
	{

		if(ae.getSource()==yes)
		{
			
			div.setVisible(true);
			divs.setVisible(true);
		}
		else if(ae.getSource()==no)
		{
			div.setVisible(false);
			divs.setVisible(false);
		}
		
		else if(ae.getSource()==btn_Submit)
		{
			
			JOptionPane.showMessageDialog(this, "Teacher Information Added", "Teacher AIDE", JOptionPane.INFORMATION_MESSAGE);
			setVisible(false);

		}
		else if(ae.getSource()==btn_back)
		{
			new LoginDemo();                          //CHANGE CODE HERE LOGINDEMO TO CARDLAYOUT.PREVIOUS
			setVisible(false);
		}
			
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
		new RegisterDemo();
	}
}
	