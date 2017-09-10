package model;

import java.util.Vector;

import org.example.nalogzaplacanje.NalogZaPlacanje;

public class Banka {
	private String swiftKod;
	private String brojObracunskogRacuna;
	private Vector<NalogZaPlacanje> redZaClearing;
	public String getSwiftKod() {
		return swiftKod;
	}
	public void setSwiftKod(String swiftKod) {
		this.swiftKod = swiftKod;
	}
	public String getBrojObracunskogRacuna() {
		return brojObracunskogRacuna;
	}
	public void setBrojObracunskogRacuna(String brojObracunskogRacuna) {
		this.brojObracunskogRacuna = brojObracunskogRacuna;
	}
	public Vector<NalogZaPlacanje> getRedZaClearing() {
		return redZaClearing;
	}
	
}
