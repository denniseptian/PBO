package com.modul2.question2;

public class jenisTumbuhan {
	public void macamTumbuhan(){
		Tumbuhan tumbuhan = new Tumbuhan("Mawar", true, "Merah", "Serabut");
		System.out.println("Nama bunga : "+tumbuhan.getNamaTumbuhan());
		System.out.println("Berbunga : "+tumbuhan.isBerbunga());
		System.out.println("Warna : "+tumbuhan.getBerwarna());
		System.out.println("Akan : "+tumbuhan.getAkar());
		
		Tumbuhan tumbuhan2 = new Tumbuhan("Bambu", "Serabut", "Keras");
		System.out.println("Nama bunga : "+tumbuhan2.getNamaTumbuhan());
		System.out.println("Berbunga : "+tumbuhan2.getAkar());
		System.out.println("Tipe batang : "+tumbuhan2.getTipeBatang());
	}
}
