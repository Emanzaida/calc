import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.Test;
import javax.*;
public class model2Test {

	@Test(expected=ArithmeticException.class)
	public void test() {
		
			model2 m=new model2();
			m.divTwoNumbers(1, 0);
			int result=m.getCalculationValue();
	         assertEquals(2,result);
	        
		
		
         
	}
	
	@Test
	public void testgetfn(){
		view v=new view();
		
		v.fn.setText(Integer.toString(23));
		int x=Integer.parseInt(v.fn.getText());
		 assertEquals(23,x);
	}
	@Test
	public void testgetsn(){
		view v=new view();
		
		v.sn.setText(Integer.toString(23));
		int x=Integer.parseInt(v.sn.getText());
		 assertEquals(23,x);
	}
}
