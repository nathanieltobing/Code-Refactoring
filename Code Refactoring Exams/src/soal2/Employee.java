package soal2;


/*
 *
 * Smell code			: Leaky Encapsulation. Terdapat constructor dan juga getter setter. Dengan ada 2 method yang 
 * 						  bisa mengset attribut, terdapat sebuah leak karena seharusnya hanya 1 method yang bisa melakukan
 * 						  set attribut.
 * potential cause(s)	: Developer tidak mengerti konsep encapsulation dan membuat dua method yang bisa melakukan set 
 * 						  attribut tanpa memperhatikan kebocoran yang mungkin terjadi.
 * solution(s)			: Hapuskan constructor dalam class Employee agar hanya satu method yang bisa set attribut.
 *
 */

public abstract class Employee {
	protected String nip;
	protected String nama;
	protected String alamat;
	protected String email;
	protected int gaji;
	protected float kpi;

	public Employee(){}
	public Employee(String nip, String nama, String alamat, String email,int gaji) {
		super();
		this.nip = nip;
		this.nama = nama;
		this.alamat = alamat;
		this.email = email;
		this.gaji = gaji;
	}
	public String getNip() {
		return nip;
	}
	public String getNama() {
		return nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public String getEmail() {
		return email;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGaji(int gaji){
		this.gaji = gaji;
	}
	public int getGaji(){
		return gaji;
	}
	public void setKPI(float kpi){
		if (kpi > 4)kpi = 4;
		else if(kpi < 0) kpi=0;
		this.kpi = kpi;
	}
	public float getKPI(){
		return kpi;
	}

	public abstract int getBonus();
	public abstract void medicalBenefitInfo();
}

