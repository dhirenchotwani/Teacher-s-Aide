import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import MyControls.*;


public class DevDemo extends JFrame implements RegisterConstants,MouseListener,ActionListener
{
	ImageIcon rudy,ves,logo,vivek_logo,yash,mohit,jayesh,ram,home_image,sign_image,rgr_image,abt_image; 	
	Font labels,devs;
	JLabel clg_name,quotes,vesImage,logoImage,vivek_Image,yImage,mImage,jImage,rImage,dev,ruImage,cre;
	JPanel clg_panel,image_panel,center_handler,clg_handler;
	MyButton btn_back,btn_in,btn_reg,btn_dev;

	public DevDemo()
	{
		getContentPane().setBackground(Color.BLACK);
		createGUIDev();
		createAndMakePanelsDev();

		add(clg_handler,BorderLayout.NORTH);
		add(image_panel,BorderLayout.CENTER);
		add(new JLabel("    "),BorderLayout.EAST );
		add(new JLabel("                             "),BorderLayout.WEST );
		add(quotes,BorderLayout.SOUTH);

		setVisible(true);
		setSize(900,530);//set size as 780 and 430 for login and register at the end	
		//requestFocus();
		setResizable(false);
		setTitle("Teacher AIDE");
	}

	void createGUIDev()
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
		yImage=new JLabel("");
		yash=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\yash128.png");	
		yImage.setIcon(yash);
		jImage=new JLabel("");
		jayesh=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\jayesh128.png");	
		jImage.setIcon(jayesh);
		mImage=new JLabel("");
		mohit=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\mohit1128.png");
		mImage.setIcon(mohit);
		rImage=new JLabel("");
		ram=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\logo48.png");
		rImage.setIcon(ram);
		ruImage=new JLabel("");
		rudy=new ImageIcon("C:\\Users\\Dhiren\\Desktop\\Ram Project\\rudy1128.png");
		ruImage.setIcon(rudy);

		
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

		labels=new Font("SanSerif", 	Font.ITALIC,16);
		devs=new Font("SanSerif", 	Font.BOLD,20);
		dev=new JLabel("                          {  Developers Side  } ");
		cre=new JLabel(" In Association with: " );
		Font tp=new Font("SanSerif", 	Font.ITALIC,16);
		clg_name=new JLabel(COLLEGE_NAME);
		clg_name.setFont(labels);
		quotes=new JLabel("        " + QUOTES);
		quotes.setFont(labels);
		dev.setFont(devs);
		cre.setFont(tp);

		clg_panel=new JPanel();
		clg_handler=new JPanel();
		image_panel=new JPanel();
		center_handler=new JPanel();


		btn_back.addMouseListener(this);
		btn_in.addMouseListener(this);
		//btn_dev.addMouseListener(this);
		btn_reg.addMouseListener(this);
		btn_back.addActionListener(this);
		btn_in.addActionListener(this);
		//btn_dev.addActionListener(this);
		btn_reg.addActionListener(this);
		setColorDev();
	}

	void createAndMakePanelsDev()
	{
		btn_back.setBounds(0,110,50,40);
		add(btn_back);

		btn_in.setBounds(0,185,50,40);
		add(btn_in);

		btn_reg.setBounds(0,260,50,40);
		add(btn_reg);

		btn_dev.setBounds(0,340,50,40);
		add(btn_dev);

		clg_panel.setLayout(new FlowLayout());
		clg_panel.add(vesImage);
		clg_panel.add(clg_name);
		clg_panel.add(vivek_Image);

		clg_handler.setLayout(new BorderLayout());
		clg_handler.add(clg_panel,BorderLayout.NORTH);
		clg_handler.add(new JLabel("                                                                           "),BorderLayout.WEST );
		clg_handler.add(dev,BorderLayout.CENTER);

		Border etchedBorder = BorderFactory.createEtchedBorder(Color.WHITE,Color.BLUE);
		image_panel.setLayout(new GridLayout(3,5,20,20));
		image_panel.setBackground(Color.BLACK);
		

		image_panel.add(yImage);
		image_panel.add(new JLabel(" Yash"));
		image_panel.add(new JLabel(" "));
		image_panel.add(jImage);
		image_panel.add(new JLabel(" jayesh"));
		
		image_panel.add(mImage);
		image_panel.add(new JLabel(" Mohitt"));
		image_panel.add(new JLabel(""));
		image_panel.add(rImage);
		image_panel.add(new JLabel(" Ram"));
		image_panel.add(new JLabel(""));
		image_panel.add(cre);
		image_panel.add(ruImage);
		image_panel.add(new JLabel(""));
		image_panel.add(new JLabel(" "));
		image_panel.setBorder(etchedBorder);

		center_handler.setLayout(new BorderLayout());
		center_handler.setBackground(Color.BLACK);
		//center_handler.add(image_panel,BorderLayout.CENTER);
		

	}

	void setColorDev()
	{
			clg_panel.setBackground(Color.BLACK);
			clg_handler.setBackground(Color.BLACK);
			image_panel.setBackground(Color.BLACK);
			
			clg_name.setForeground(Color.WHITE);
			dev.setForeground(Color.WHITE);
			cre.setForeground(Color.WHITE);
			
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
			if(ae.getSource()==btn_back)
			new MainDemo();
		setVisible(false);

		}
		
		
		public void mouseReleased(MouseEvent me){}
		public void mousePressed(MouseEvent me){}
		public void mouseClicked(MouseEvent me){}
	public static void main(String ar[])
	{
			new DevDemo();
	}
}