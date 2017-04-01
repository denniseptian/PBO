package com.modul3.question1;

public class BukuTA extends Buku implements Bisa_Dikopi {

	private String nIM;
	private String abstrak;

	public BukuTA(String Nim, String Abstrak) {
		setNIM(Nim);
		setAbstrak(Abstrak);
	}

	public String getNIM() {
		return nIM;
	}

	public void setNIM(String NIM) {
		nIM = NIM;
	}

	public String getAbstrak() {
		return abstrak;
	}

	public void setAbstrak(String abstrak) {
		this.abstrak = abstrak;
	}

	@Override
	public int hitungBiayaKopi(int jumlahHalaman) {
		// TODO Auto-generated method stub
		return jumlahHalaman*2000;
	}

	@Override
	public String showKode() {
		// TODO Auto-generated method stub
		return getNIM() + " " + firsText(getAbstrak());
	}

	public String firsText(String text) {
		String w = null;
		for (int i = 0; i < text.length(); i++) {
			w = text.substring(0, text.indexOf(' '));
		}
		return w;
	}
}
