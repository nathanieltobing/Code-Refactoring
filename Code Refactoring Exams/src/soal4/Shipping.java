package soal4;
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
	private String name;
	private double distance;

	public Shipping(Order order, String name){
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

	public int getEstimationDays(){
		int estimation=0;

		if (name.equals("JNE")){
			estimation = (int)distance / 20;
		}
		else if(name.equals("JNT")){
			estimation = (int)(distance-5) / 25;
			if(estimation < 0) estimation=0;
		}
		else if(name.equals("tiki")){
			estimation = (int)(distance+5) / 30;
		}
		return estimation+1;
	}
	public int getShippingPrice(Order order){
		int totalWeight = 0,totalPrice=0;
		for(int i=0;i<order.getItems().size();i++){
			totalWeight += order.getItem(i).getWeight();
		}


		if (name.equals("JNE")){

		}
		else if(name.equals("JNT")){

		}
		else if(name.equals("tiki")){

		}
		return totalPrice;
	}
}
