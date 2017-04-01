package com.modul2.question1;

public class Orang {
	private String nama;
	private String jabatan;
	private String NIP;
	private int NIM;
	private String Status;
	
	public Orang(){
		nama = "Dennis";
		jabatan = "-";
		NIM = 160;
		Status = "Aktif";
	}
	public Orang(String name, String Jabatan, String nIP, String status){
		nama = name;
		jabatan = Jabatan;
		NIP = nIP;
		Status = status;
	}
	public Orang(String name, int nIM, String status){
		nama = name;
		NIM = nIM;
		Status = status;
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getJabatan() {
		return jabatan;
	}
	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
	public String getNIP() {
		return NIP;
	}
	public void setNIP(String nIP) {
		NIP = nIP;
	}
	public int getNIM() {
		return NIM;
	}
	public void setNIM(int nIM) {
		NIM = nIM;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
}
