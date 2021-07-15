
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginGUI extends JFrame implements ActionListener {
	JButton blogin;
	JLabel lunm,lpass;
	JPasswordField tpass;
	JTextField tunm;
	JPanel pnl;
   public LoginGUI()
   {
	   super("HomePage");
		setSize(400,400);
		setVisible(true);
		Font f=new Font("Times New Roman",Font.BOLD,24);
		pnl=new JPanel();
		add(pnl);
		pnl.setBackground(Color.yellow);
	
		lunm=new JLabel("User Name");
		lunm.setFont(f);
		lpass=new JLabel("Password");
		lpass.setFont(f);
		tpass=new JPasswordField(30);
		tpass.setBackground(Color.cyan);
		tpass.setForeground(Color.BLACK);
		tunm=new JTextField(30);
		tunm.setBackground(Color.cyan);
		tunm.setForeground(Color.BLACK);
		
		
		blogin=new JButton("Login");
		
		pnl.add(lunm);
		pnl.add(tunm);
		pnl.add(lpass);
		pnl.add(tpass);
		pnl.add(blogin);
		
	   
   }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==blogin)
		{
			 Layout l=new Layout();
			this.dispose();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new LoginGUI();
         }

}
