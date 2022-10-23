package soal4.solution;

//solusi  Unexploited Encapsulation
public class TIKI extends ShippingCompany{
	
	@Override
	public int calculateEstimationDays(double distance) {
		this.setEstimation((int)(distance+5) / 30); ;
		return this.getEstimation() + 1;
	}

	@Override
	public int calculateShippingPrice(int totalWeight) {
		// TODO Auto-generated method stub
		return 0;
	}
	//Saya tidak mengisi method calculateShippingPrice, karena di soal if statementnya kosong

	
}
