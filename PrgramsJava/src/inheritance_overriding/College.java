package inheritance_overriding;

public class College extends University_PHD{
	public void grantedScience() {
		System.out.println("College---granted Science");
	}
	
	private void pendingCommerce() {
		System.out.println("College---pendingCommerce");
		}
	
	public final void finalArts() {
		System.out.println("College---finalArts");
		}
	
	public static void appliedMix() {
		System.out.println("College---appliedMix");
		}
	
	@Override
	public void overrided_method() {
		System.out.println("College---overrided_method");
	}
}
