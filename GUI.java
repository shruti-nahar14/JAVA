////////////////////////////////////////////////////////
//Function Name:GUI
//Input:--
//Output:Display Window by using GUI
//Description:Display First Windows by using GUI
//Date: 14/06/2021
//Author:Shruti Nahar
//////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

class MarvellousListener implements WindowListener
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}
class FirstWindow
{
	public Frame fobj;
	public FirstWindow()
	{
		fobj = new Frame("Marvellous Infosystems");
		Button bobj1 = new Button("Login");
		Button bobj2 = new Button("Cancle");
		Label lobj = new Label("Marvellous Login Portal");
		Label username = new Label("Username");
		Label password = new Label("Password");
		TextField ut = new TextField("Enter your username");
		TextField pt = new TextField("Enter your passowrd");
		lobj.setBounds(70,30,300,30);
		username.setBounds(20,80,80,30);
		ut.setBounds(110,80,150,30);
		password.setBounds(20,120,80,30);
		pt.setBounds(110,120,150,30);
		bobj1.setBounds(70,170,80,30);// x y w h
		bobj2.setBounds(160,170,80,30);
		fobj.add(bobj1);
		fobj.add(bobj2);
		fobj.add(lobj);
		fobj.add(username);
		fobj.add(password);
		fobj.add(ut);
		fobj.add(pt);
		fobj.setSize(300,250);
		fobj.setLayout(null);
		fobj.setVisible(true);
		fobj.addWindowListener(new MarvellousListener());
	}
}
class GUI
{
	public static void main(String arg[])
	{
		FirstWindow obj = new FirstWindow();
	}
}