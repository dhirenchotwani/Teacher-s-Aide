import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import MyControls.*;


public class MainDemo extends JFrame implements RegisterConstants,MouseListener,ActionListener
{
	
	ImageIcon ves,logo,vivek_logo,home_image,sign_image,rgr_image,abt_image; 	
	Font labels;
	Font tit;
	JPanel up,mid,down,main_handler,main_flow;
	JLabel clg_name,quotes,title,vesImage,logoImage,vivek_Image;
	MyButton btn_home,btn_sign,btn_rgr,btn_abt;

	public MainDemo()
	{
		getContentPane().setBackground(Color.BLACK);
		createGUIMain();
		createAndMakePanelsMain();

		add(up,BorderLayout.NORTH);
		add(mid,BorderLayout.CENTER);
		add(quotes,BorderLayout.SOUTH);

		setVisible(true);
		setSize(900,430);//set size as 780 and 430 for login and register at the end	
		requestFocus();
		setResizable(false);
		setTitle("Teacher AIDE");
	}

	void createGUIMain()
	{
		vesImage=new JLabel("");
		ves=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\ves48.png");	
		vesImage.setIcon(ves);
		logoImage=new JLabel("");
		logo=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\logo48.png");	
		logoImage.setIcon(logo);
		logoImage.setToolTipText("Teacher AIDE");
		vivek_Image=new JLabel("");
		vivek_logo=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\ves_logo48.png");
		vivek_Image.setIcon(vivek_logo);
		labels=new Font("SanSerif", 	Font.ITALIC,16);
		tit=new Font("SanSerif", 	Font.ITALIC,40);
		up=new JPanel();
		mid=new JPanel();
		down=new JPanel();
		main_handler=new JPanel();
		main_flow=new JPanel();
		btn_home=new MyButton("",Color.BLACK);
		btn_home.setToolTipText("Home");
		home_image=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\home32.png");
		btn_home.setIcon(home_image);

		btn_sign=new MyButton("",Color.BLACK);
		btn_sign.setToolTipText("Sign-in here");
		sign_image=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\rgr32.png");
		btn_sign.setIcon(sign_image);
		
		btn_rgr=new MyButton("",Color.BLACK);
		btn_rgr.setToolTipText("Register here");
		rgr_image=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\sign32.png");
		btn_rgr.setIcon(rgr_image);

		btn_abt=new MyButton("",Color.BLACK);
		btn_abt.setToolTipText("About Devs");
		abt_image=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\abt32.png");
		btn_abt.setIcon(abt_image);

		title=new JLabel("Teacher's AIDE...");
		title.setFont(tit);
		clg_name=new JLabel(COLLEGE_NAME);
		clg_name.setFont(labels);
		quotes=new JLabel("        " + QUOTES);
		quotes.setFont(labels);

		btn_home.addMouseListener(this);
		btn_sign.addMouseListener(this);
		btn_abt.addMouseListener(this);
		btn_rgr.addMouseListener(this);
		btn_home.addActionListener(this);
		btn_sign.addActionListener(this);
		btn_abt.addActionListener(this);
		btn_rgr.addActionListener(this);
		setColorMain();

	}

	void createAndMakePanelsMain()
	{
		up.setLayout(new FlowLayout());
		up.add(vesImage);
		up.add(clg_name);
		up.add(vivek_Image);
		

		mid.setLayout(new FlowLayout());
		mid.add(logoImage);
		mid.add(title);
		

		btn_home.setBounds(260,150,70,50);
		add(btn_home);

		btn_sign.setBounds(360,150,70,50);
		add(btn_sign);
		
		btn_rgr.setBounds(460,150,70,50);
		add(btn_rgr);

		btn_abt.setBounds(560,150,70,50);
		add(btn_abt);

	}
	void setColorMain()
		{
			up.setBackground(Color.BLACK);
			mid.setBackground(Color.BLACK);
			
			clg_name.setForeground(Color.WHITE);
			title.setForeground(Color.WHITE);
			
			btn_home.setForeground(Color.WHITE);
			btn_sign.setForeground(Color.WHITE);
			btn_abt.setForeground(Color.WHITE);
			btn_rgr.setForeground(Color.WHITE);
			btn_rgr.setBackground(Color.RED);
			btn_abt.setBackground(Color.DARK_GRAY);
			btn_home.setBackground(Color.BLUE);
			btn_sign.setBackground(new Color(34,139,34));

			quotes.setForeground(Color.WHITE);
		}
	public void mouseEntered(MouseEvent me){
			MyButton bg=(MyButton)me.getSource();
			
			if(bg==btn_home)
			bg.setBounds(240,130,90,70);
			if(bg==btn_sign)
			bg.setBounds(340,130,90,70);
			if(bg==btn_rgr)
			bg.setBounds(440,130,90,70);
			if(bg==btn_abt)
			bg.setBounds(540,130,90,70);
			bg.changeColor(Color.WHITE);
		}
		public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==btn_sign)
				new LoginDemo();
			if(ae.getSource()==btn_rgr)
			new RegisterDemo();

			if(ae.getSource()==btn_abt)
				new DevDemo();
			if(ae.getSource()==btn_home)
			new HomeDemo();

			setVisible(false);
		}
		public void mouseExited(MouseEvent me){
			MyButton bg=(MyButton)me.getSource();
			if(bg==btn_home)
			bg.setBounds(260,150,70,50);
			if(bg==btn_sign)
			bg.setBounds(360,150,70,50);
			if(bg==btn_rgr)
			bg.setBounds(460,150,70,50);
			if(bg==btn_abt)
			bg.setBounds(560,150,70,50);
			bg.changeColor(Color.BLACK);
		}
		public void mouseReleased(MouseEvent me){}
		public void mousePressed(MouseEvent me){}
		public void mouseClicked(MouseEvent me){}
	public static void main(String ar[])
	{
			new MainDemo();
	}
}