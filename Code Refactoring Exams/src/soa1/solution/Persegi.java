package soa1.solution;

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

public class Persegi implements BangunDatar {
	//solusi deficient encapsulation
	private int sisi;

	public Persegi(int sisi) {
		super();
		this.sisi = sisi;
	}
	
	public int getSisi() {
		return sisi;
	}
	@Override
	public float computeArea() {
		// TODO Auto-generated method stub
		return this.sisi*this.sisi;
	}

	@Override
	public float computeAround() {
		// TODO Auto-generated method stub
		return 4*this.sisi;
	}

}


