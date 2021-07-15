package calculatorswing;
import java.awt.*;
import java.awt.event.*;
public class calculator implements ActionListener{
	
	TextField tn1,tn2,tans;
	Label ln1,ln2,lans;
	Button btnadd,btnsub,btnmul,btndiv,btnreset,btnexist;
	Frame frm;
	Panel pnl;
	public void cal()
	{
		frm=new Frame("calculator....");
		frm.setSize(400,400);
		frm.setVisible(true);
		pnl=new Panel();
		frm.add(pnl);
		GridLayout gl=new GridLayout(6,3);
		pnl.setLayout(gl);
		ln1=new Label("NUM1 :");
		ln2=new Label("NUM2 :");
		lans=new Label("ANS =");
		tn1=new TextField(10);
		tn1.setBackground(Color.pink);
		tn2=new TextField(10);
		tn2.setBackground(Color.pink);
		tans=new TextField(10);
		tans.setBackground(Color.pink);
		btnadd=new Button("+");
		btnadd.setBackground(Color.CYAN);
		btnadd.setForeground(Color.BLACK);
		btnsub=new Button("-");
		btnsub.setBackground(Color.CYAN);
		btnsub.setForeground(Color.BLACK);
		btnmul=new Button("*");
		btnmul.setBackground(Color.CYAN);
		btnmul.setForeground(Color.BLACK);
		btndiv=new Button("/");
		btndiv.setBackground(Color.CYAN);
		btndiv.setForeground(Color.BLACK);
		btnreset=new Button("C");
		btnreset.setBackground(Color.CYAN);
		btnreset.setForeground(Color.BLACK);
		btnexist=new Button("Exist");
		btnexist.setForeground(Color.BLACK);
		btnexist.setBackground(Color.CYAN);
		pnl.add(ln1);
		pnl.add(tn1);
		pnl.add(ln2);
		pnl.add(tn2);
		pnl.add(lans);
		pnl.add(tans);
		pnl.add(btnadd);
		pnl.add(btnsub);
		pnl.add(btnmul);
		pnl.add(btndiv);
		pnl.add(btnreset);
		pnl.add(btnexist);
		
		btnadd.addActionListener(this);
		btnsub.addActionListener(this);
		btnmul.addActionListener(this);
		btndiv.addActionListener(this);
		btnreset.addActionListener(this);
		btnexist.addActionListener(this);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(e.getSource()==btnadd)
		{
			String s1=tn1.getText();
			String s2=tn2.getText();
			int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			int add=n1+n2;
			tans.setText(Integer.toString(add));
		}
		else if(e.getSource()==btnsub)
		{
			String s3=tn1.getText();
			String s4=tn2.getText();
			int n3=Integer.parseInt(s3);
			int n4=Integer.parseInt(s4);
			int sub=n3-n4;
			tans.setText(Integer.toString(sub));
		}
		else if(e.getSource()==btnmul)
		{
			String s1=tn1.getText();
			String s2=tn2.getText();
			int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			int mul=n1*n2;
			tans.setText(Integer.toString(mul));
		}
		else if(e.getSource()==btndiv)
		{
			String s1=tn1.getText();
			String s2=tn2.getText();
			int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			int div=n1/n2;
			tans.setText(Integer.toString(div));
		}
		else if(e.getSource()==btnreset)
		{
			tn1.setText(" ");
			tn2.setText(" ");
			tans.setText(" ");
		}
		else if(e.getSource()==btnexist)
		{
			System.exit(0);
		}
	
	
}
}