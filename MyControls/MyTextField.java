package MyControls;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;






public class MyTextField extends JTextField 
{	public MyTextField(String text,int col,Color c)
	{

		super(text,col);
		changeColor(c);
	}
	public void changeColor(Color c)
	{
		setBorder(BorderFactory.createLineBorder(c));
	}
}
class MyPasswordField extends JPasswordField
{	 MyPasswordField(String text,int col,Color c)
	{

		super(text,col);
		changeColor(c);
	}
	public void changeColor(Color c)
	{
		setBorder(BorderFactory.createLineBorder(c));
	}
}


class MyButton extends JButton
{
	MyButton(String text,Color c)
	{
		super(text);
		changeColor(c);
	}
	public void changeColor(Color c)
	{
		setBorder(BorderFactory.createLineBorder(c));
	}
} 