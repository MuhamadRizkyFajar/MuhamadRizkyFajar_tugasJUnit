package com.juaracoding.sqa.ui;

import java.util.Scanner;

import com.juaracoding.sqa.function.Function;

public class InputUi {
	
	Function function;
	double jarak;
	double waktu;
	
	public InputUi() {
		
		if (function==null) {
			function = new Function();
		}
		
	}
	
	public void showKecepatanRataRata() {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan jarak yang ditempuh (Km): ");
		double jarak = input.nextDouble();
		System.out.print("Masukan waktu yang ditempuh selama perjalanan (hours): ");
		double waktu = input.nextDouble();
		System.out.println("Kecepatan Rata-ratanya adalah "+function.KecepatanRataRata(jarak, waktu)+" Km/h");
	}
	
	

}
