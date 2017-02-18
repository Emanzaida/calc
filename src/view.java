
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
public class view extends JFrame{
	 public JTextField fn  = new JTextField(10);
	 public JTextField sn = new JTextField(10);
	 public JButton addb = new JButton("add");
     public JTextField result = new JTextField(10);
     public JButton sub = new JButton("sub");
     public JButton mulb = new JButton("mult");
     public JButton divb = new JButton("div");
     public JLabel l1,l2,l3;
     public JPanel p1,p2,p3;
     view(){
    	    
    	    l1=new JLabel("First number");
    	    l2=new JLabel("second number");
    	    l3=new JLabel("the result");
    	    p1 = new JPanel();
    	    p2 = new JPanel();
    	    p3 = new JPanel();
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	    this.setSize(600, 150);
    	    p1.add(l1);
    	    p1.add(fn);
    	    p1.add(l2);
    	    p1.add(sn);
    	    p2.add(addb);
    	    p2.add(sub);
    	    p2.add(mulb);
    	    p2.add(divb);
    	    p3.add(l3);
    	    p3.add(result);
    	    add(p1,BorderLayout.NORTH);
    	    add(p2,BorderLayout.CENTER);
    	    add(p3,BorderLayout.SOUTH);
     }
     public int getFirstNumber(){
    return Integer.parseInt(fn.getText());
    	 
    	     }
    	
    	     public int getSecondNumber(){
    	     return Integer.parseInt(sn.getText());
    	 
    	     }
    	 
  
    	  
    	
    	     public void setCalcSolution(int solution){
    	         result.setText(Integer.toString(solution));
    	  }
    	     void addCalculateListener(ActionListener listenForCalcButton){
    	     addb.addActionListener(listenForCalcButton);
    	    	     }
    	     void subCalculateListener(ActionListener listenerforsub ){
    	    	 sub.addActionListener(listenerforsub);
    	     }
    	     void mulCalculateListener(ActionListener listenerformul ){
    	    	 mulb.addActionListener(listenerformul);
    	     }
    	     void divCalculateListener(ActionListener listenerfordiv ){
    	    	 divb.addActionListener(listenerfordiv);
    	     }

}
