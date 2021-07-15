import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Layout extends JFrame  {
	JPanel pn,pn1,pn2,pnl3,pnl4;
	JLabel lbl1,lbl2,lbl3;
	JButton bsave,bsearch,bcreate,bupdate,bdelete,blogout;
   public Layout()
	 {
		super("Layout");
		setSize(500,500);
		setVisible(true);
		
		pn1=new JPanel();
		pn1.setBackground(Color.RED);
		pn2=new JPanel();
		pn2.setBackground(Color.cyan);
		pnl3=new JPanel();
		pnl3.setBackground(Color.BLUE);
		pnl4=new JPanel();
		pnl4.setBackground(Color.YELLOW);
		lbl1=new JLabel("BORDER LAYOUT");
		lbl2=new JLabel("GRID LAYOUT");
		lbl3=new JLabel("FLOW LAYOUT");
		Font f1=new Font("Times new Roman",Font.BOLD+Font.ITALIC,24);
		lbl1.setFont(f1);
		lbl2.setFont(f1);
		lbl3.setFont(f1);
		add(pn1,BorderLayout.NORTH);
		pn1.add(lbl1);
		add(pn2,BorderLayout.SOUTH);
		FlowLayout f=new FlowLayout(FlowLayout.CENTER,50,50);
		setLayout(f);
		bsave=new JButton("SAVE");
		bsave.setForeground(Color.darkGray);
		blogout=new JButton("LOGOUT");
		blogout.setForeground(Color.darkGray);
		pn2.add(lbl3);
		pn2.add(bsave);
		pn2.add(blogout);
		add(pnl3,BorderLayout.EAST);
		GridLayout g=new GridLayout(2,2,50,50);
		setLayout(g);
		bcreate=new JButton("CREATE");
		bcreate.setForeground(Color.MAGENTA);
		bupdate=new JButton("UPDATE");
		bupdate.setForeground(Color.MAGENTA);
		bsearch=new JButton("SEARCH");
		bsearch.setForeground(Color.MAGENTA);
		bdelete=new JButton("DELETE");
		bdelete.setForeground(Color.MAGENTA);
		pnl3.add(lbl2);
		pnl3.add(bcreate);
	    pnl3.add(bupdate);
	    pnl3.add(bsearch);
	    pnl3.add(bdelete);
		add(pnl4,BorderLayout.WEST);
		
	 }

   public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Layout();
        }

		
	}


