package inheritance_overriding;

public class University_PHD extends AICTE {
	public void grantedColleges() {
		System.out.println("Univeristy_PHD---granted colleges");
	}
	
	private void pendingColleges() {
		System.out.println("Univeristy_PHD---pendingColleges");
		}
	
	public final void finalColleges() {
		System.out.println("Univeristy_PHD---finalColleges");
		}
	
	public static void appliedColleges() {
		System.out.println("Univeristy_PHD---appliedColleges");
		}
	@Override
	public void overrided_method() {
		System.out.println("University_PHD---overrided_method");
	}
}
