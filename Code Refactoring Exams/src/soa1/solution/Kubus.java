package soa1.solution;


/*
 *
 * Smell code			: Multipath Hierarchy. Class Kubus mengambil jalan pintas inheritance ke base class BangunDatar
 * 						  dan juga inheritance BangunRuang yang merupakan subclass dari BangunDatar itu sendiri. Smell code
 * 				     	  ini menciptakan inheritance redudancy.
 * potential cause(s)	: Developer tidak memahami konsep oop dan inheritance sehingga melakukan inheritance pada baseclass
 * 						  dan juga subclass dari baseclass itu sendiri.
 * solution(s)			: Hapus inheritance Kubus ke base class BangunDatar dan hanya gunakan inheritance BangunRuang.
 *
 */
/*
*
* Smell code			: Deficient encapsulation. Attribute pada class mempunya modifier public sehingga bisa di akses
* 						  oleh class apa saja.
* potential cause(s)	: Developer tidak memahami konsep encapsulasi dan tidak mengerti tentang bahayanya kebocoran
* 						  encapsulasi.
* solution(s)			: Ubah modifier attribute menjadi private. Lalu buat method getter untuk class lain pakai jika
* 					      ingin mengakses attribute tersebut.
*
*/

//solusi multipath hierarchy
public class Kubus extends BangunRuang{
	//solusi deficient encapsulation
	private int rusuk;

	public Kubus(int rusuk) {
		super();
		this.rusuk = rusuk;
	}
	public int getRusuk() {
		return rusuk;
	}

	@Override
	public float computeArea() {
		// TODO Auto-generated method stub
		return 6*this.rusuk*this.rusuk;
	}

	@Override
	public float computeAround() {
		// TODO Auto-generated method stub
		return 12*this.rusuk;
	}

	@Override
	public float computeVolume() {
		// TODO Auto-generated method stub
		return this.rusuk*this.rusuk*this.rusuk;
	};

	
}


