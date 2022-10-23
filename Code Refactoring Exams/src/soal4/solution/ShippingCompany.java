package soal4.solution;

//solusi  Unexploited Encapsulation
public abstract class ShippingCompany {
	
	private int estimation=0;
	private int shippingPrice=0;
	
	public int getEstimation() {
		return estimation;
	}
	public int getShippingPrice() {
		return shippingPrice;
	}
	
	
	public void setEstimation(int estimation) {
		this.estimation = estimation;
	}
	public void setShippingPrice(int shippingPrice) {
		this.shippingPrice = shippingPrice;
	}
	public abstract int calculateEstimationDays(double distance);
	public abstract int calculateShippingPrice(int totalWeight);
	
	
	
	
	
	
	
	
	
}
