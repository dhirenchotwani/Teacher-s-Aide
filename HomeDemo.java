import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import MyControls.*;


public class HomeDemo extends JFrame implements RegisterConstants,MouseListener,ActionListener
{
	ImageIcon ves,logo,vivek_logo,home_image,sign_image,rgr_image,abt_image; 	
	Font labels;
	Font tit;
	JLabel clg_name,quotes,title,vesImage,logoImage,vivek_Image,aide;
	JPanel above,description_panel,clg_panel,home_handler,home_flow;
	MyButton btn_back,btn_in,btn_reg,btn_dev;

	public HomeDemo()
	{
		getContentPane().setBackground(Color.BLACK);
		createGUIHome();
		createAndMakePanelsHome();

		add(above,BorderLayout.NORTH);
		add(description_panel,BorderLayout.CENTER);
		add(new JLabel("    "),BorderLayout.EAST );
		add(new JLabel("                             "),BorderLayout.WEST );
		add(quotes,BorderLayout.SOUTH);

		setVisible(true);
		setSize(900,430);//set size as 780 and 430 for login and register at the end	
		//requestFocus();
		setResizable(false);
		setTitle("Teacher AIDE");
	}

	void createGUIHome()
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

		btn_back=new MyButton("",Color.BLACK);
		btn_back.setToolTipText("Home");
		home_image=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\black128.png");
		btn_back.setIcon(home_image);

		btn_in=new MyButton("",Color.BLACK);
		btn_in.setToolTipText("Sign-in here");
		sign_image=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\rgr32.png");
		btn_in.setIcon(sign_image);
		
		btn_reg=new MyButton("",Color.BLACK);
		btn_reg.setToolTipText("Register here");
		rgr_image=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\sign32.png");
		btn_reg.setIcon(rgr_image);

		btn_dev=new MyButton("",Color.BLACK);
		btn_dev.setToolTipText("About Devs");
		abt_image=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\abt32.png");
		btn_dev.setIcon(abt_image);

		aide=new JLabel("");
		title=new JLabel("What is Teacher's AIDE ?");
		title.setFont(tit);
		clg_name=new JLabel(COLLEGE_NAME);
		clg_name.setFont(labels);
		quotes=new JLabel("        " + QUOTES);
		quotes.setFont(labels);

		above=new JPanel();
		description_panel=new JPanel();
		clg_panel=new JPanel();

		btn_back.addMouseListener(this);
		btn_in.addMouseListener(this);
		btn_dev.addMouseListener(this);
		btn_reg.addMouseListener(this);
		btn_back.addActionListener(this);
		btn_in.addActionListener(this);
		btn_dev.addActionListener(this);
		btn_reg.addActionListener(this);
		setColorHome();

	}

	void createAndMakePanelsHome()
	{
		clg_panel.setLayout(new FlowLayout());
		clg_panel.add(vesImage);
		clg_panel.add(clg_name);
		clg_panel.add(vivek_Image);

		above.setLayout(new BorderLayout());
		above.add(clg_panel,BorderLayout.NORTH);
		
		above.add(new JLabel("                                                                           "),BorderLayout.WEST );
		above.add(title,BorderLayout.CENTER);

		Border etchedBorder = BorderFactory.createEtchedBorder(Color.WHITE,Color.BLUE);
		description_panel.add(aide);
		description_panel.setBorder(etchedBorder);

		btn_back.setBounds(0,110,50,40);
		add(btn_back);

		btn_in.setBounds(0,185,50,40);
		add(btn_in);

		btn_reg.setBounds(0,260,50,40);
		add(btn_reg);

		btn_dev.setBounds(0,340,50,40);
		add(btn_dev);

		
	}

	void setColorHome()
		{
			clg_panel.setBackground(Color.BLACK);
			above.setBackground(Color.BLACK);
			description_panel.setBackground(Color.BLACK);
			
			clg_name.setForeground(Color.WHITE);
			title.setForeground(Color.WHITE);
			
			btn_reg.setBackground(Color.RED);
			btn_dev.setBackground(Color.DARK_GRAY);
			btn_back.setBackground(Color.BLUE);
			btn_in.setBackground(new Color(34,139,34));

			quotes.setForeground(Color.WHITE);
		}
		public void mouseEntered(MouseEvent me){
			MyButton bg=(MyButton)me.getSource();
			
			if(bg==btn_back)
			bg.setBounds(0,110,120,40);
			if(bg==btn_in)
			bg.setBounds(0,185,120,40);
			if(bg==btn_reg)
			bg.setBounds(0,260,120,40);
			if(bg==btn_dev)
			bg.setBounds(0,340,120,40);
			bg.changeColor(Color.WHITE);
		}
		public void mouseExited(MouseEvent me){
			MyButton bg=(MyButton)me.getSource();
			
			if(bg==btn_back)
			bg.setBounds(0,110,50,40);
			if(bg==btn_in)
			bg.setBounds(0,185,50,40);
			if(bg==btn_reg)
			bg.setBounds(0,260,50,40);
			if(bg==btn_dev)
			bg.setBounds(0,340,50,40);
			bg.changeColor(Color.BLACK);
		}
		
		public void actionPerformed(ActionEvent ae){

			if(ae.getSource()==btn_in)
				new LoginDemo();
			if(ae.getSource()==btn_reg)
			new RegisterDemo();

			if(ae.getSource()==btn_dev)
				new DevDemo();
			if(ae.getSource()==btn_back)
			new MainDemo();
		setVisible(false);

		}
		
		
		public void mouseReleased(MouseEvent me){}
		public void mousePressed(MouseEvent me){}
		public void mouseClicked(MouseEvent me){}
	public static void main(String ar[])
	{
			new HomeDemo();
	}
}

