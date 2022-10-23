package soal4.solution;

//solusi  Unexploited Encapsulation
public class JNE extends ShippingCompany{

	@Override
	public int calculateEstimationDays(double distance) {
		this.setEstimation((int)distance / 20); ;
		return this.getEstimation() + 1;
	}

	@Override
	public int calculateShippingPrice(int totalWeight) {
		// TODO Auto-generated method stub
		return 0;
	}
	//Saya tidak mengisi method calculateShippingPrice, karena di soal if statementnya kosong
	

	

	

}
