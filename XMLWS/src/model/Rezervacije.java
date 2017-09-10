package model;

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;

import org.example.nalogzaplacanje.NalogZaPlacanje;

public class Rezervacije {
	
	private Racun racun;
	private ConcurrentHashMap <String, NalogZaPlacanje> rezervisaniNalozi = new ConcurrentHashMap<>();
	private BigDecimal ukupanIznos = BigDecimal.ZERO;
	
	public void rezervisi(NalogZaPlacanje nalog) throws Exception {
		if(nalog.getRacunDuznika().equals(racun.getBroj())) {
			if( racun.getStanje().compareTo(nalog.getIznos()) >= 0 ) {
				dodajRezervaciju(nalog);
			} else {
				throw new Exception("Nedovoljno novca na racunu za trazenu rezervaciju");
			}
		} else {
			throw new Exception("Ne rezervisu se transakcije u korist");
		}
	}
	
	public NalogZaPlacanje ukloniRezervaciju(String kljuc) throws Exception {
		NalogZaPlacanje rezervisaniNalog = rezervisaniNalozi.get(kljuc);
		if(rezervisaniNalog!=null) {
			rezervisaniNalozi.remove(kljuc);
			ukupanIznos = ukupanIznos.subtract(rezervisaniNalog.getIznos());
			return rezervisaniNalog;
		} else {
			throw new Exception("Dati nalog nije rezervisan");
		}
	}
	
	private void dodajRezervaciju(NalogZaPlacanje nalog) throws Exception {
		if(!rezervisaniNalozi.containsKey(nalog.getIdNaloga())) {
			rezervisaniNalozi.put(nalog.getIdNaloga(), nalog);
			ukupanIznos = ukupanIznos.add(nalog.getIznos());
		} else {
			throw new Exception("Ne moze se isti nalog rezervisati vise puta");
		}
	}

	public BigDecimal getUkupanIznos() {
		return ukupanIznos;
	}
	
}
