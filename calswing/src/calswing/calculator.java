package calswing;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class calculator extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,btn,bexist,bequal,bdiv,bdot,breset;
	JFrame frm;
	JPanel pnl,pn2;
	JTextField l;
	static double a,b,ans;
	static int operator;
	public calculator()
	{
		super("calculator");
		setSize(400,500);
		setVisible(true);
		Font f=new Font("Times New Roman",Font.BOLD,24);
		pnl=new JPanel();
		pn2=new JPanel();
		add(pn2,BorderLayout.NORTH);
		FlowLayout f1=new FlowLayout();
		pn2.setLayout(f1);
		 l=new JTextField();
		 l.setBackground(Color.YELLOW);
		 l.setForeground(Color.RED);
		 l.setFont(f);
		l.setPreferredSize( new Dimension( 200, 50 ) );
		  pn2.add(l);
		add(pnl,BorderLayout.SOUTH);
		   GridLayout g=new GridLayout(6,4,20,20);
		   pnl.setLayout(g);
		  breset=new JButton("C");
		  breset.setFont(f);
		  b13=new JButton("0");
		  b13.setFont(f);
		  bequal=new JButton("=");
		  bequal.setFont(f);
		  bdiv=new JButton("/");
		  bdiv.setFont(f);
	      b1=new JButton("7");
	      b1.setFont(f);
	      b2=new JButton("8");
	      b2.setFont(f);
	      b3=new JButton("9");
	      b3.setFont(f);
	      b4=new JButton("x");
	      b4.setFont(f);
	      b5=new JButton("4");
	      b5.setFont(f);
	      b6=new JButton("5");
	      b6.setFont(f);
	      b7=new JButton("6");
	      b7.setFont(f);
	      b8=new JButton("+");
	      b8.setFont(f);
	      b9=new JButton("1");
	      b9.setFont(f);
	      b10=new JButton("2");
	      b10.setFont(f);
	      b11=new JButton("3");
	      b11.setFont(f);
	      b12=new JButton("-");
	      b12.setFont(f);
	      bdot=new JButton(".");
	      bdot.setFont(f);
          bexist=new JButton("Exist");
          bexist.setFont(f);
	      pnl.add(breset);
	      pnl.add(b13);
	      pnl.add(bequal);
	      pnl.add(bdiv);
	      pnl.add(b1);
		  pnl.add(b2);
		  pnl.add(b3);
		  pnl.add(b4);
		  pnl.add(b5);
		  pnl.add(b6);
		  pnl.add(b7);
		  pnl.add(b8);
		  pnl.add(b9);
		  pnl.add(b10);
		  pnl.add(b11);
		  pnl.add(b12);
		  pnl.add(bdot);
		  pnl.add(bexist);
		  
		  
		  b1.addActionListener(this);
		  b2.addActionListener(this);
		  b3.addActionListener(this);
		  b4.addActionListener(this);
		  b5.addActionListener(this);
		  b6.addActionListener(this);
		  b7.addActionListener(this);
		  b8.addActionListener(this);
		  b9.addActionListener(this);
		  b10.addActionListener(this);
		  b11.addActionListener(this);
		  b12.addActionListener(this);
		  b13.addActionListener(this);
		  bexist.addActionListener(this);
		  bdiv.addActionListener(this);
		  b4.addActionListener(this);
		  bequal.addActionListener(this);
		  b8.addActionListener(this);
		  b12.addActionListener(this);
		  bdot.addActionListener(this);
		  breset.addActionListener(this);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if(e.getSource()==b1)
	{
		l.setText(l.getText().concat("7"));
	}
	if(e.getSource()==b2)
	{
		l.setText(l.getText().concat("8"));
	}
	if(e.getSource()==b3)
	{
		l.setText(l.getText().concat("9"));
	}
	if(e.getSource()==b5)
	{
		l.setText(l.getText().concat("4"));
	}
	if(e.getSource()==b6)
	{
		l.setText(l.getText().concat("5"));
	}
	if(e.getSource()==b7)
	{
		l.setText(l.getText().concat("6"));
	}
	if(e.getSource()==b9)
	{
		l.setText(l.getText().concat("1"));
	}
	if(e.getSource()==b10)
	{
		l.setText(l.getText().concat("2"));
	}
	if(e.getSource()==b11)
	{
		l.setText(l.getText().concat("3"));
	}
	if(e.getSource()==bdot)
	{
		l.setText(l.getText().concat("."));
	}
	if(e.getSource()==b4)
	{
		a=Double.parseDouble(l.getText());
	    operator=1;
		l.setText("");
	}
	if(e.getSource()==b8)
	{
		a=Double.parseDouble(l.getText());
	    operator=2;
		l.setText("");
	}
	if(e.getSource()==b12)
	{
		a=Double.parseDouble(l.getText());
	    operator=3;
		l.setText("");
	}
    if(e.getSource()==bdiv)
    {
    	a=Double.parseDouble(l.getText());
	    operator=4;
		l.setText("");
    }
    if(e.getSource()==bequal)
    {
    	b=Double.parseDouble(l.getText());
		l.setText("");
    	switch(operator)
    	{
    	case 1:
    		ans=a*b;
    		break;
    	case 2:
    		ans=a+b;
    		break;
    	case 3:
    		ans=a-b;
    		break;
    	case 4:
    		ans=a/b;
    		break;
    	}
    	l.setText(""+ans);
    }
    if(e.getSource()==breset)
    {
    	l.setText("");
    }
    else if(e.getSource()==bexist)
	{
		System.exit(0);
	}
	}
}
