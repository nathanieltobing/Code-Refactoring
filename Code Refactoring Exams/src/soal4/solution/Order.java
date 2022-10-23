package soal4.solution;



import java.util.Vector;
/*
*
* Smell code			: Cyclically-dependent Modularization. Pada getTotalPrice dan getShippingPrice, method getTotalPrice
* 						 memanggil method dari class lain yaitu getShippingPrice, lalu method getShippingPrice memanggil
* 						 attribut dari Order lagi yaitu Item. Jadi dependecy nya bolak-balik.
* potential cause(s)	: Developer tidak paham konsep oop dan membuat 2 method dari 2 class yang berbeda yang saling
* 						  berdependensi sehingga membuat hubungan cyclic.
* solution(s)			: Breaking cyclic by removing a depedency. Kita hapuskan dependensi pada class Order 
* 						  dari method getShippingPrice dengan cara memindahkan kode pada getShippingPrice 
* 						  yang menggunakan Order ke method getTotalPrice
*  					      						  
*/
public abstract class Order {
	private String orderID;
	private Shipping shipping;
	private Vector<Item>items = new Vector<>();
	private double lonOrigin,latOrigin;
	private double lonDestination,latDestination;

	public void addItem(Item item){
		items.add(item);
	}

	public Vector<Item> getItems(){
		return items;
	}
	public Item getItem(int idx){
		return items.get(idx);
	}
	
	//solusi cyclically-dependent modularization
	public int getTotalPrice(){
		int totalPrice=0,totalWeight=0;

		for(int i=0;i<items.size();i++){
			totalPrice = totalPrice + (items.get(i).getPrice() * items.get(i).getQty());
			totalWeight += items.get(i).getWeight();
		}

		return totalPrice + shipping.getShippingPrice(totalWeight);
	}

	public double getLonOrigin() {
		return lonOrigin;
	}

	public void setLonOrigin(double lonOrigin) {
		this.lonOrigin = lonOrigin;
	}

	public double getLatOrigin() {
		return latOrigin;
	}

	public void setLatOrigin(double latOrigin) {
		this.latOrigin = latOrigin;
	}

	public double getLonDestination() {
		return lonDestination;
	}

	public void setLonDestination(double lonDestination) {
		this.lonDestination = lonDestination;
	}

	public double getLatDestination() {
		return latDestination;
	}

	public void setLatDestination(double latDestination) {
		this.latDestination = latDestination;
	}

	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
}

