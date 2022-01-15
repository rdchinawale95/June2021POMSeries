package interface1;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HSBCBank hb= new HSBCBank();
		hb.US1();
		hb.US2();
		hb.US3();
		hb.HSBC1();
		hb.HSBC2();
		hb.Brazil1();
		hb.Brazil2();
		
		
		USBank usb=new HSBCBank();
		usb.US1();
		usb.US2();
		usb.US3();
	
	
	}

}
