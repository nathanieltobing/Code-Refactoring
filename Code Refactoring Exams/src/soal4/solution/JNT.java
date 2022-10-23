package soal4.solution;

//solusi  Unexploited Encapsulation
public class JNT extends ShippingCompany{

	@Override
	public int calculateEstimationDays(double distance) {
		this.setEstimation((int)(distance-5) / 25); ;
		if(this.getEstimation() < 0) {
			this.setEstimation(0);
		}
		return this.getEstimation() + 1;
	}

	@Override
	public int calculateShippingPrice(int totalWeight) {
		// TODO Auto-generated method stub
		return 0;
	}
	//Saya tidak mengisi method calculateShippingPrice, karena di soal if statementnya kosong
	
	

}
