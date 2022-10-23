package soal3.solution;

import java.util.Vector;

public class ProductList {
	private Vector<Product> productList = new Vector<>();
	int maxProduct = 100;
	
	public void addProduct(Product product) throws Exception{
		if (productList.size() > maxProduct){
			throw new Exception("Product list has exceeded the limit");
		}
		productList.add(product);
	}
	
	public Vector<Product> getProductList(){
		return productList;
	}
	
	public Product getProduct(int idx){
		return productList.get(idx);
	}
	//solusi imperative abstraction dan incomplete abstraction
	public void viewProductList() {
		int totalData = productList.size();
		System.out.println("ProductId - Name - Price - Stock");
		for(int i=0;i<totalData;i++){
			Product product = productList.get(i);
			System.out.printf("%s - %s - %d - %d\n",product.getProductID(),product.getName(),product.getPrice(),
					product.getStock());
		}
	}
}
