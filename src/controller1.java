
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.*;
public class controller1 {
	  private view theView;
	  private model2 theModel;

	 public controller1(view theView, model2 theModel) {
		     this.theView = theView;
		     this.theModel = theModel;
	         this.theView.addCalculateListener(new CalculateListener());
	         this.theView.subCalculateListener(new CalculateListener());
	         this.theView.mulCalculateListener(new CalculateListener());
	         this.theView.divCalculateListener(new CalculateListener());
		     }
	
		     class CalculateListener implements ActionListener{
	
		         public void actionPerformed(ActionEvent e) {
	
		             int firstNumber, secondNumber = 0;
		
		             try{
	            firstNumber = theView.getFirstNumber();
		        secondNumber = theView.getSecondNumber();
		        if(e.getSource()== theView.addb)
		        {
		         theModel.addTwoNumbers(firstNumber, secondNumber);
		         theView.setCalcSolution(theModel.getCalculationValue());
		        }
		        if(e.getSource()== theView.sub)
		        {
		         theModel.subTwoNumbers(firstNumber, secondNumber);
		         theView.setCalcSolution(theModel.getCalculationValue());
		        }
		        if(e.getSource()== theView.mulb)
		        {
		         theModel.mulTwoNumbers(firstNumber, secondNumber);
		         theView.setCalcSolution(theModel.getCalculationValue());
		        }
		        if(e.getSource()== theView.divb)
		        {
		         theModel.divTwoNumbers(firstNumber, secondNumber);
		         theView.setCalcSolution(theModel.getCalculationValue());
		        }
		             }
		
		             catch(NumberFormatException ex){
		
		               System.out.println(ex);
		              System.out.print("You Need to Enter 2 Integers");
		 
		             }
		             catch(ArithmeticException exx){
		            	 System.out.println(exx);
		            	 
		             }
		
		         }
		
		     }


}
