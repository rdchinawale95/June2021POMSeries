package inheritance_overriding;

public class IIT_Mumbai extends College{
	public void IIT_Canteen() {
		System.out.println("IIT_Mumbai--- IIM_Canteen");
	}
	
	private void IIT_library() {
		System.out.println("IIT_Mumbai---IIT_library");
		}
	
	public final void IIT_Accreditions() {
		System.out.println("IIT_Mumbai---IIT_Accreditions");
		}
	
	public static void IIT_Hostel() {
		System.out.println("IIT_Mumbai---IIT_Hostel");
		}
	
	@Override
	public void overrided_method() {
		System.out.println("IIT_Mumbai---overrided_method");
	}
}
