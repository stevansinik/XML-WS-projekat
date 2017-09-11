package model;

import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

import org.example.mt102.MT102;

public class Data {
	public static ConcurrentHashMap<String, Banka> banke = new ConcurrentHashMap<>();
	public static ConcurrentHashMap<String, Racun> racuni = new ConcurrentHashMap<>();
	public static Vector<MT102> redZaKliring = new Vector<>();
}
