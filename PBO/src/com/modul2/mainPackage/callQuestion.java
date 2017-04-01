package com.modul2.mainPackage;

import java.util.Scanner;

import com.modul2.question1.OverloadingConstructor;
import com.modul2.question2.jenisTumbuhan;
import com.modul2.question3.Enkapsulasi;
import com.modul2.question5.TestOverloading;

public class callQuestion {
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		OverloadingConstructor overloadingConstructor = new OverloadingConstructor();
		Enkapsulasi enkapsulasi = new Enkapsulasi();
		TestOverloading testOverloading = new TestOverloading();
		jenisTumbuhan jenisTumbuhanB = new jenisTumbuhan();
		
		
		System.out.println("Masuk pada pilihan yang anda inginkan.");
		System.out.println("1. Overloading constructor\n2. Tumbuhan\n3. Enkapsulasi\n4. #Ganok\n5. Test Overloading");
		System.out.println("-->");
		int chose = scan.nextInt();
		scan.close();
		
		switch (chose) {
		case 1:
			overloadingConstructor.Overload();
			break;
		case 2:
			jenisTumbuhanB.macamTumbuhan();
			break;
		case 3:
			enkapsulasi.encapsulasi();
			break;
		case 5:
			testOverloading.testStart();
			break;

		default:
			break;
		}
	}
}
