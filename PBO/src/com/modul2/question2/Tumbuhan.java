package com.modul2.question2;

public class Tumbuhan {
	private String namaTumbuhan;
	private boolean berbunga;
	private String berwarna;
	private String akar;
	private String tipeBatang;

	public Tumbuhan(String namaTumbuhann, boolean bunga, String warna, String akarTumbuhan) {
		namaTumbuhan = namaTumbuhann;
		berbunga = bunga;
		berwarna = warna;
		akar = akarTumbuhan;
	}

	public Tumbuhan(String namaTumbuhann, String akarTumbuhan, String tipeatangTumbuhan) {
		namaTumbuhan = namaTumbuhann;
		akar = akarTumbuhan;
		tipeBatang = tipeatangTumbuhan;
	}
	
	public String getTipeBatang() {
		return tipeBatang;
	}

	public void setTipeBatang(String tipeBatang) {
		this.tipeBatang = tipeBatang;
	}

	public String getNamaTumbuhan() {
		return namaTumbuhan;
	}

	public void setNamaTumbuhan(String namaTumbuhan) {
		this.namaTumbuhan = namaTumbuhan;
	}

	public boolean isBerbunga() {
		return berbunga;
	}

	public void setBerbunga(boolean berbunga) {
		this.berbunga = berbunga;
	}

	public String getBerwarna() {
		return berwarna;
	}

	public void setBerwarna(String berwarna) {
		this.berwarna = berwarna;
	}

	public String getAkar() {
		return akar;
	}

	public void setAkar(String akar) {
		this.akar = akar;
	}

	
}
