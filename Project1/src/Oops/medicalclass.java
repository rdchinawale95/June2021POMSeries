package Oops;
//Interface
public class medicalclass implements Student{

	
	public void displayName() {
		
		System.out.println("HI we r frm med");
	}


	public void getStudenNumber() {
		
		System.out.println("HI we r 140");
	}

	
	public void getStandard() {
		System.out.println("HI we r frm mbbs");
		
	}

	
	private void getuniversity() {
		System.out.println("University name is london university");
	}

	public static void main(String[] args) {
		Enggclass eng = new Enggclass();
		medicalclass med = new medicalclass();
		
		eng.displayName();
		eng.getStandard();
		eng.getStudenNumber();
		eng.getuniversity();
		
		System.out.println("********************************");
		
		med.displayName();
		med.getStandard();
		med.getStudenNumber();
		med.getuniversity();
		
	}
	/*
	 HI we r frm enngg
HI we r frm computer enngg
HI we r 120
University name is :University of New York
********************************
HI we r frm med
HI we r frm mbbs
HI we r 140
University name is london university
*/


	@Override
	public void getInterfacename() {
		// TODO Auto-generated method stub
		
	}
}
