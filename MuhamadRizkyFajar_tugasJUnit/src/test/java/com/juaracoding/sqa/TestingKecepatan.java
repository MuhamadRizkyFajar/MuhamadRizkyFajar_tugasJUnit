package com.juaracoding.sqa;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.juaracoding.sqa.function.Function;

public class TestingKecepatan {
	
	Function function;
	
	@Before
	public void setUp() throws Exception {
		function = new Function();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testKecepatanRataRata() {
		for (String isi : readFile("skenario_test.csv")) {
			String [] data = isi.split(";");
			String jarak = data[0];
			String waktu = data[1];
			String hasil = data[2];
			
			assertEquals(Double.parseDouble(hasil), function.KecepatanRataRata(Double.parseDouble(jarak), Double.parseDouble(waktu)),0);
		}
	}
	
	@Test
	public final void testKecepatanRataRataSelainAngka() {
		assertEquals("wafs", function.KecepatanRataRata("wfwaf", "wfafawfg"));
	}
	
	@Test
	public final void testKecepatanRataRataNegatifInputan() {
		assertEquals(6, function.KecepatanRataRata(-12, -2),0);
	}
	
	@Test
	public final void testKecepatanRataRataTidakAdaAngka() {
		assertEquals(0, function.KecepatanRataRata(0,1),0);
	}
	
	public List<String> readFile (String namefile){
		List<String> penampung = new ArrayList<String>();
		
		try {
			
			String resourcename = namefile;
			
			ClassLoader classloader = getClass().getClassLoader();
			File myfile = new File(classloader.getResource(resourcename).getFile());
			String absolutepath = myfile.getAbsolutePath();
			
			Scanner reader = new Scanner(myfile);
			
			while (reader.hasNextLine()) {
				penampung.add(reader.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return penampung;
	}

}
