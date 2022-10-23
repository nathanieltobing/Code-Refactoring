package soa2.solution;

import soal2.Employee;

public class CleaningService extends Employee{
	private int jamLembur;

	public int getBonus(){
			return 0;
	}

	// tidak punya KPI
	public float getKPI(){
		return 0.0f;
	}

	public int getGaji(){
		return gaji + getUpahLembur();
	}

	public void setJamLembur(int jamLembur){
		this.jamLembur = jamLembur;
	}

	public int getJamLembur(){
		return jamLembur;
	}

	public int getUpahLembur(){
		return jamLembur * gaji / 100;
	}

	public void medicalBenefitInfo(){
		System.out.println("tidak ada medical benefit");
	}
}

