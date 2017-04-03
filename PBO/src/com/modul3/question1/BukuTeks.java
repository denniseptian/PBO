package com.modul3.question1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class BukuTeks extends Buku implements Bisa_Dikopi, BisaDiPinjam {

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");

	private String penerbit;
	private int tanggal;
	private int bulan;
	private int tahun;
	private int jumlahDendaYangHarusDiBayar;
	private int lamaPeminjaman;

	public BukuTeks(String Penerbit, String Judul, String namaPengarang) {
		setPenerbit(Penerbit);
		setJudul(Judul);
		setPengarang(namaPengarang);
	}

	public String getPenerbit() {
		return penerbit;
	}

	public void setPenerbit(String penerbit) {
		this.penerbit = penerbit;
	}

	public int getTanggal() {
		return tanggal;
	}

	public void setTanggal(int tanggal) {
		this.tanggal = tanggal;
	}

	public int getBulan() {
		return bulan;
	}

	public void setBulan(int bulan) {
		this.bulan = bulan;
	}

	public int getTahun() {
		return tahun;
	}

	public void setTahun(int tahun) {
		this.tahun = tahun;
	}

	@Override
	public int hitungBiayaKopi(int jumlahHalaman) {
		// TODO Auto-generated method stub
		return jumlahHalaman * 750;
	}

	@Override
	public void meminjam(int tanggal, int bulan, int tahun) {
		// TODO Auto-generated method stub
		setTanggal(tanggal);
		setBulan(bulan);
		setTahun(tahun);
	}

	@Override
	public int hitungDenda() {
		
		if (cekLamaPinjam() > 7) {
			setJumlahDendaYangHarusDiBayar((cekLamaPinjam() - 7) * 5000);
			System.out.println("Tanggal Meminjam : " + getTanggal()+"/"+getBulan()+"/"+getTahun());
			try{
				System.out.println("Tanggal Mengembalikan : " + dateformat3.format(dateformat3.parse(getDate())));
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Lama waktu peminjaman : " + getLamaPeminjaman() + " Hari");
		}

		return getJumlahDendaYangHarusDiBayar();
	}

	@Override
	public String showKode() {
		// TODO Auto-generated method stub
		return getPenerbit() + " " + firsText(getJudul()) + " " + lastText(getPengarang());
	}

	public String firsText(String text) {
		String word = null;
		for (int i = 0; i < text.length(); i++) {
			word = text.substring(0, text.indexOf(' '));
		}

		return word;
	}

	public String lastText(String text) {

		return text.substring(text.lastIndexOf(" ") + 1);
	}

	public int[] getDateNow() {
		LocalDateTime now = LocalDateTime.now();
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();

		int[] dates = { day, year, month };

		return dates;
	}

	public String getDate() {
		LocalDate localDate = LocalDate.now();

		return dtf.format(localDate);
	}

	public int getCountDayBetween(Date d1, Date d2) {
		return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
	}

	public Date getDatePinjamBuku() {
		return null;
	}
	public int getJumlahDendaYangHarusDiBayar() {
		return jumlahDendaYangHarusDiBayar;
	}

	public void setJumlahDendaYangHarusDiBayar(int jumlahDendaYangHarusDiBayar) {
		this.jumlahDendaYangHarusDiBayar = jumlahDendaYangHarusDiBayar;
	}

	public int getLamaPeminjaman() {
		return lamaPeminjaman;
	}

	public void setLamaPeminjaman(int lamaPeminjaman) {
		this.lamaPeminjaman = lamaPeminjaman;
	}
	public int cekLamaPinjam(){
		Date date1 = null;
		Date date2 = null;

		try {
			date1 = dateformat3.parse(getTanggal() + "/" + getBulan() + "/" + getTahun());
			date2 = dateformat3.parse(getDate());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		setLamaPeminjaman(getCountDayBetween(date1, date2));
		
		return getLamaPeminjaman();
	}
}
