package model;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.example.mt103.MT103;
import org.example.nalogzaplacanje.NalogZaPlacanje;
import org.example.presjek.Presjek;
import org.example.presjek.Smer;
import org.example.presjek.Stavka;
import org.example.presjek.Zaglavlje;
import org.nepostoji.centralbankingservice.CentralBankingService;
import org.nepostoji.centralbankingservice.CentralBankingService_Service;
import org.nepostoji.centralbankingservice.FaultResponse;
import org.nepostoji.centralbankingservice.Rtgs;
import org.nepostoji.centralbankingservice.Zaduzenje;

import factory.KeyFactory;

public class Racun {
	private String broj;
	private Banka banka;
	private BigDecimal stanje;
	private Presjek presjek;
	private Rezervacije rezervacije;
	
	public String getBroj() {
		return broj;
	}
	public void setBroj(String broj) {
		this.broj = broj;
	}
	public BigDecimal getStanje() {
		return stanje.subtract(rezervacije.getUkupanIznos());
	}
	public void setStanje(BigDecimal stanje) {
		this.stanje = stanje;
	}
	public Rezervacije getRezervacije() {
		return rezervacije;
	}
	public void setRezervacije(Rezervacije rezervacije) {
		this.rezervacije = rezervacije;
	}
	
	public boolean daLiJeHitan(NalogZaPlacanje nalog) {
		return ( (nalog.isHitno()) || (nalog.getIznos().compareTo(new BigDecimal("250000.00"))>0) );
	}
	
	public void izvrsiNalog(NalogZaPlacanje nalog, Racun drugiRacun) throws Exception {
		if(drugiRacun.equals(this)) {
			throw new Exception("Nije dozvoljena transakcija sa racuna na samog sebe");
		}
		if( (nalog.getRacunDuznika().equals(broj)) || (nalog.getRacunPrimaoca().equals(drugiRacun.broj)) ) {
			uplatiNaRacun(nalog, drugiRacun);
		} else if(nalog.getRacunDuznika().equals(drugiRacun.broj) || (nalog.getRacunPrimaoca().equals(broj)) ) {
			uplatiSaRacuna(nalog, drugiRacun);
		} else {
			throw new Exception("Neispravni podaci o racunu duznika ili racunu primaoca");
		}
	}
	
	public void uplatiNaRacun(NalogZaPlacanje nalog, Racun racunPrimaoca) throws Exception {
		BigDecimal stanje = presjek.getZaglavlje().getNovoStanje();
		if(getStanje().compareTo(nalog.getIznos()) < 0) {
			throw new Exception("Nedovoljno sredstava na racunu");
		}
		if(banka.getSwiftKod().equals(racunPrimaoca.banka.getSwiftKod())) {
			// ako su oba racuna u istoj banci
			promijeniStanje(nalog, Smer.T);
			racunPrimaoca.promijeniStanje(nalog, Smer.K);
		} else {
			// rtgs ili clearing
			if(daLiJeHitan(nalog)) {
				izvrsiRtgs(nalog, racunPrimaoca.banka);
			} else {
				//dodaj rezervaciju za kasniji clearing
				rezervacije.rezervisi(nalog);
				banka.getRedZaClearing().add(nalog);
			}
		}
	}
	
	public void uplatiSaRacuna(NalogZaPlacanje nalog, Racun racunDuznika) throws Exception {
		racunDuznika.uplatiNaRacun(nalog, this);
	}
	
	public CentralBankingService dobaviServisCentralneBanke() {
		URL wsdl;

	    QName serviceName = new QName("http://www.nepostoji.org/CentralBankingService/", "CentralBankingService");
	    QName portName = new QName("http://www.nepostoji.org/CentralBankingService/", "CentralBankingServicePort");
	    
        URL url = null;
        try {
            url = new URL("file:/D:/Users/Stevan/Literatura_I_Materijal/Aktuelno/XML_i_WS/Projekat/XML-WS-projekat/XMLWS/WEB-INF/wsdl/CentralBankingService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CentralBankingService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/Users/Stevan/Literatura_I_Materijal/Aktuelno/XML_i_WS/Projekat/XML-WS-projekat/XMLWS/WEB-INF/wsdl/CentralBankingService.wsdl");
        }
        wsdl = url;
        Service service = Service.create(wsdl, serviceName);
        CentralBankingService servisCentralneBanke = service.getPort(portName, CentralBankingService.class);
        return servisCentralneBanke;
	}
	
	public void izvrsiRtgs(NalogZaPlacanje nalog, Banka bankaPrimaoca) throws Exception {
        if( daLiJeHitan(nalog) ) {
        	MT103 mt103 = new MT103();
        	mt103.setIdPoruke(KeyFactory.nextKey().toString());
        	mt103.setDuznik(nalog.getDuznik());
        	mt103.setPrimalac(nalog.getPrimalac());
        	mt103.setDatumNaloga(nalog.getDatumNaloga());
        	mt103.setDatumValute(nalog.getDatumValute());
        	mt103.setSvrhaPlacanja(nalog.getSvrhaPlacanja());
        	mt103.setIznos(nalog.getIznos());
        	mt103.setRacunDuznika(nalog.getRacunDuznika());
        	mt103.setModelZaduzenja(nalog.getModelZaduzenja());
        	mt103.setPozivNaBrojZaduzenja(nalog.getPozivNaBrojZaduzenja());
        	mt103.setRacunPrimaoca(nalog.getRacunPrimaoca());
        	mt103.setModelOdobrenja(nalog.getModelOdobrenja());
        	mt103.setPozivNaBrojOdobrenja(nalog.getPozivNaBrojOdobrenja());
        	mt103.setSwiftBankeDuznika(banka.getSwiftKod());
        	mt103.setObracunskiRacunBankeDuznika(banka.getBrojObracunskogRacuna());
        	mt103.setSwiftBankePrimaoca(bankaPrimaoca.getSwiftKod());
        	mt103.setObracunskiRacunBankePrimaoca(bankaPrimaoca.getBrojObracunskogRacuna());
        	mt103.setSifraValute(nalog.getOznakaValute());
        	Rtgs rtgs = new Rtgs();
        	rtgs.setMt103(mt103);
        	
        	CentralBankingService servisCentralneBanke = dobaviServisCentralneBanke();
        	try {
        		rezervacije.rezervisi(nalog);
        		servisCentralneBanke.rtgs(rtgs);
        	} catch(FaultResponse fr) {
        		
        	} finally {
        		rezervacije.ukloniRezervaciju(nalog.getIdNaloga());
        	}
        } else {
        	throw new Exception("Nisu ispunjeni uslovi hitnosti da bi se pozvao RTGS");
        }

	}
	
	protected void promijeniStanje(NalogZaPlacanje nalog, Smer smer) {
		Stavka novaTransakcija = new Stavka();
		novaTransakcija.setDuznik(nalog.getDuznik());
		novaTransakcija.setPrimalac(nalog.getPrimalac());
		novaTransakcija.setDatumNaloga(nalog.getDatumNaloga());
		novaTransakcija.setDatumValute(nalog.getDatumValute());
		novaTransakcija.setRacunDuznika(nalog.getRacunDuznika());
		novaTransakcija.setRacunPrimaoca(nalog.getRacunPrimaoca());
		novaTransakcija.setSvrhaPlacanja(nalog.getSvrhaPlacanja());
		novaTransakcija.setIznos(nalog.getIznos());
		novaTransakcija.setModelZaduzenja(nalog.getModelZaduzenja());
		novaTransakcija.setPozivNaBrojZaduzenja(nalog.getPozivNaBrojZaduzenja());
		novaTransakcija.setModelOdobrenja(nalog.getModelOdobrenja());
		novaTransakcija.setPozivNaBrojOdobrenja(nalog.getPozivNaBrojOdobrenja());
		novaTransakcija.setSmer(smer);
		presjek.getStavke().getStavka().add(novaTransakcija);
		
		Zaglavlje zagljavlje = presjek.getZaglavlje();
		
		int promNaTeret = 0;
		int promUKorist = 0;
		BigDecimal ukupnoNaTeret = BigDecimal.ZERO;
		BigDecimal ukupnoUKorist = BigDecimal.ZERO;
		List<Stavka> stavke = presjek.getStavke().getStavka();
		for(Stavka stavka : stavke) {
			if(stavka.getSmer().equals(Smer.K)) {
				promUKorist++;
				ukupnoUKorist = ukupnoUKorist.add(stavka.getIznos());
			}
			if(stavka.getSmer().equals(Smer.T)) {
				promNaTeret++;
				ukupnoNaTeret = ukupnoNaTeret.add(stavka.getIznos());
			}
		}
		BigDecimal novoStanje = ukupnoUKorist.subtract(ukupnoNaTeret);
		zagljavlje.setBrojPromjenaNaTeret(promNaTeret);
		zagljavlje.setBrojPromjenaUKorist(promUKorist);
		zagljavlje.setUkupnoNaTeret(ukupnoNaTeret);
		zagljavlje.setUkupnoUKorist(ukupnoUKorist);
		zagljavlje.setNovoStanje(novoStanje);
	}
}
