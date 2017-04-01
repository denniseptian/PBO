package com.modul3.question1;

public abstract class Buku {
	private String judul;
	private String pengarang;
	private int jumlahHalaman;
	public String getJudul() {
		return judul;
	}
	public void setJudul(String judul) {
		this.judul = judul;
	}
	public String getPengarang() {
		return pengarang;
	}
	public void setPengarang(String pengarang) {
		this.pengarang = pengarang;
	}
	public int getJumlahHalaman() {
		return jumlahHalaman;
	}
	public void setJumlahHalaman(int jumlahHalaman) {
		this.jumlahHalaman = jumlahHalaman;
	}
	public abstract String showKode();
}
