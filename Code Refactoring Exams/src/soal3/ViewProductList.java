package soal3;

/*
*
* Smell code			: Imperative abstraction. Sebuah class dibuat dengan tujuan untuk perintah/method.
* 						  
* potential cause(s)	: Procedural thinking. Developer menggunakan paradigma procedural dimana sebuah method harus
* 						  dibuat class khusus.
* solution(s)			: Pindahkan class ViewProductList sebagai method dalam class Product
*
*/
public class ViewProductList {
	public void view(ProductList productList){
		int totalData = productList.getProductList().size();
		System.out.println("ProductId - Name - Price");
		for(int i=0;i<totalData;i++){
			Product product = productList.getProduct(i);
			System.out.printf("%s - %s - %d\n",product.getProductID(),product.getName(),product.getPrice());
		}
	}
}
