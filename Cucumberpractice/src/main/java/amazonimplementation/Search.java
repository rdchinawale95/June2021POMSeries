package amazonimplementation;

public class Search {

	public String displayProduct(Product product) {
		if (product.getproductList().contains(product.getProductname())) {
			return product.getProductname();
		}
		return null;
	}
	
	
}
