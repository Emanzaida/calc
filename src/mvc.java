
public class mvc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 view theView = new view();
         model2 theModel = new model2 ();
		 controller1 theController = new controller1(theView,theModel);
		 theView.setVisible(true);

	}

}
