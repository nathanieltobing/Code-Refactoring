package soa2.solution;

/*
*
* Smell code			: Unfactored Hierarchy.Terdapat duplikat kode pada method medicalBenefitInfo manager dan supervisor.
* 						 
* potential cause(s)	: Developer melakukan copy paste isi method dari 1 subclass ke subclass lain karena ingin cepat
* 						  selesai
* solution(s)			: Pull-up method ke superclass. Kita pindahkan method tersebut ke superclass Employee.
*
*/

//solusi Unfactored Hieararchy
public class Manager extends Employee{
	public int getBonus(){
		if(kpi > 3.8)
			return 3 * gaji;
		else if(kpi > 3.3)
			return 2 * gaji;
		else if(kpi > 2.8)
			return 1 * gaji;
		else
			return 0;
	}

}

