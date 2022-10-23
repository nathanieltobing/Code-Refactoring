package soal4.solution;

/*
*
* Smell code			: Unexploited Encapsulation. Pada method getEstimationDays dan getShippingPrice, terdapat
* 						 if else statement untuk mengvalidasi tipe object.
* potential cause(s)	: Developer tidak memahami konsep OOP dan polymorphism sehingga menggunakan 
* 						  if else statement untuk mengvalidasi tipe object.
* 						 
* solution(s)			: Replace type code with subclasses. Kita ganti if else statement dengan membuat subclass
* 						 untuk masing-masing shipping company seperti JNE,TIKI,JNT dan membuat parent class ShippingCompany.
*
*/
public class Shipping {
	private ShippingCompany name;
	private double distance;

	public Shipping(Order order, ShippingCompany name){
		this.name = name;
		distance = calculateDistance(order.getLatOrigin(),order.getLatDestination(),order.getLonOrigin(),order.getLonDestination());
	}

	public double calculateDistance(double lat1,
            double lat2, double lon1,
                         double lon2){
		// The math module contains a function
		// named toRadians which converts from
		// degrees to radians.
		lon1 = Math.toRadians(lon1);
		lon2 = Math.toRadians(lon2);
		lat1 = Math.toRadians(lat1);
		lat2 = Math.toRadians(lat2);

		// Haversine formula
		double dlon = lon2 - lon1;
		double dlat = lat2 - lat1;
		double a = Math.pow(Math.sin(dlat / 2), 2)
		        + Math.cos(lat1) * Math.cos(lat2)
		        * Math.pow(Math.sin(dlon / 2),2);

		double c = 2 * Math.asin(Math.sqrt(a));

		// Radius of earth in kilometers. Use 3956
		// for miles
		double r = 6371;

		// calculate the result
		return(c * r);
	}
	
	//solusi  Unexploited Encapsulation
	public int getEstimationDays(){
		return name.calculateEstimationDays(distance);
	}
	//solusi untuk Cyclically-dependent Modularization dan Unexploited Encapsulation
	public int getShippingPrice(int totalWeight){
		return name.calculateShippingPrice(totalWeight);
	}
	//Saya tidak mengisi method calculateShippingPrice, karena di soal if statementnya kosong
	
}

