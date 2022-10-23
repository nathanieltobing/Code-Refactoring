package soal3;

import java.util.Vector;
/*
*
* Smell code			: 
* potential cause(s)	:
* solution(s)			:
*
*/
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
}

