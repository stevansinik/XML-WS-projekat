package factory;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.example.mt103.MT103;
import org.example.mt9xx.MT9XX;
import org.example.nalogzaplacanje.NalogZaPlacanje;
import org.example.presjek.Smer;
import org.nepostoji.centralbankingservice.CentralBankingService;
import org.nepostoji.centralbankingservice.CentralBankingService_Service;
import org.nepostoji.paymentservice.PaymentService;
import org.nepostoji.paymentservice.PaymentService_Service;

public class Constructors {
	public static NalogZaPlacanje kreirajNalog(
			String duznik, String primalac, String svrhaPlacanja, XMLGregorianCalendar datumNaloga,
			XMLGregorianCalendar datumValute, String racunDuznika, int modelZaduzenja, String pozivNaBrojZaduzenja,  
			String racunPrimaoca, int modelOdobrenja, String pozivNaBrojOdobrenja, BigDecimal iznos, boolean hitno,
			String oznakaValute) {
		NalogZaPlacanje nalog = new NalogZaPlacanje();
		nalog.setIdNaloga(KeyFactory.nextKey().toString());
		nalog.setDuznik(duznik);
		nalog.setPrimalac(primalac);
		nalog.setSvrhaPlacanja(svrhaPlacanja);
		nalog.setDatumNaloga(datumNaloga);
        nalog.setDatumValute(datumValute);
		nalog.setRacunDuznika(racunDuznika);
		nalog.setModelZaduzenja(modelZaduzenja);
		nalog.setPozivNaBrojZaduzenja(pozivNaBrojZaduzenja);
		nalog.setRacunPrimaoca(racunPrimaoca);
		nalog.setModelOdobrenja(modelOdobrenja);
		nalog.setPozivNaBrojOdobrenja(pozivNaBrojOdobrenja);
		nalog.setIznos(iznos);
		nalog.setHitno(hitno);
        nalog.setOznakaValute(oznakaValute);
        return nalog;
	}
	
	public static MT103 kreirajMT103(
			String duznik, String primalac, XMLGregorianCalendar datumNaloga,
			XMLGregorianCalendar datumValute, String svrhaPlacanja, BigDecimal iznos,
			String racunDuznika, int modelZaduzenja, String pozivNaBrojZaduzenja,
			String racunPrimaoca, int modelOdobrenja, String pozivNaBrojOdobrenja,
			String swiftBankeDuznika, String  obracunskiRacunBankeDuznika, 
			String swiftBankePrimaoca, String obracunskiRacunBankePrimaoca,
			String sifraValute) {
		MT103 mt103 = new MT103();
    	mt103.setIdPoruke(KeyFactory.nextKey().toString());
    	mt103.setDuznik(duznik);
    	mt103.setPrimalac(primalac);
    	mt103.setDatumNaloga(datumNaloga);
    	mt103.setDatumValute(datumValute);
    	mt103.setSvrhaPlacanja(svrhaPlacanja);
    	mt103.setIznos(iznos);
    	mt103.setRacunDuznika(racunDuznika);
    	mt103.setModelZaduzenja(modelZaduzenja);
    	mt103.setPozivNaBrojZaduzenja(pozivNaBrojZaduzenja);
    	mt103.setRacunPrimaoca(racunPrimaoca);
    	mt103.setModelOdobrenja(modelOdobrenja);
    	mt103.setPozivNaBrojOdobrenja(pozivNaBrojOdobrenja);
    	mt103.setSwiftBankeDuznika(swiftBankeDuznika);
    	mt103.setObracunskiRacunBankeDuznika(obracunskiRacunBankeDuznika);
    	mt103.setSwiftBankePrimaoca(swiftBankePrimaoca);
    	mt103.setObracunskiRacunBankePrimaoca(obracunskiRacunBankePrimaoca);
    	mt103.setSifraValute(sifraValute);
    	return mt103;
	}
	
	public static org.example.presjek.Stavka kreirajStavkuPresjeka(
			String duznik, String primalac, XMLGregorianCalendar datumNaloga, XMLGregorianCalendar datumValute,
			String racunDuznika, String racunPrimaoca, String svrhaPlacanja, BigDecimal iznos,
			int modelZaduzenja, String pozivNaBrojZaduzenja, int modelOdobrenja, String pozivNaBrojOdobrenja,
			Smer smer) {
		org.example.presjek.Stavka stavka = new org.example.presjek.Stavka();
		stavka.setDuznik(duznik);
		stavka.setPrimalac(primalac);
		stavka.setDatumNaloga(datumNaloga);
		stavka.setDatumValute(datumValute);
		stavka.setRacunDuznika(racunDuznika);
		stavka.setRacunPrimaoca(racunPrimaoca);
		stavka.setSvrhaPlacanja(svrhaPlacanja);
		stavka.setIznos(iznos);
		stavka.setModelZaduzenja(modelZaduzenja);
		stavka.setPozivNaBrojZaduzenja(pozivNaBrojZaduzenja);
		stavka.setModelOdobrenja(modelOdobrenja);
		stavka.setPozivNaBrojOdobrenja(pozivNaBrojOdobrenja);
		stavka.setSmer(smer);
		return stavka;
	}
	
	public static org.example.mt102.Zaglavlje kreirajZaglavljeKliringa(
			String swiftBankeDuznika, String obracunskiRacunBankeDuznika,
			String swiftBankePrimaoca, String obracunskiRacunBankePrimaoca,
			XMLGregorianCalendar datum , XMLGregorianCalendar datumValute,
			String sifraValute, BigDecimal ukupanIznos) {
		org.example.mt102.Zaglavlje zaglavlje= new org.example.mt102.Zaglavlje();
		zaglavlje.setIdPoruke(KeyFactory.nextKey().toString());
		zaglavlje.setSwiftBankeDuznika(swiftBankeDuznika);
		zaglavlje.setObracunskiRacunBankeDuznika(obracunskiRacunBankeDuznika);
		zaglavlje.setSwiftBankePrimaoca(swiftBankePrimaoca);
		zaglavlje.setObracunskiRacunBankePrimaoca(obracunskiRacunBankePrimaoca);
		zaglavlje.setDatum(datum);
		zaglavlje.setDatumValute(datumValute);
		zaglavlje.setSifraValute(sifraValute);
		zaglavlje.setUkupanIznos(ukupanIznos);
		return zaglavlje;
	}
	
	public static org.example.mt102.Stavka kreirajStavkuKliringa(
			String duznik, String primalac, XMLGregorianCalendar datumNaloga,
			String svrhaPlacanja, BigDecimal iznos, String racunDuznika,
			int modelZaduzenja, String pozivNaBrojZaduzenja, String racunPrimaoca,
			int modelOdobrenja, String pozivNaBrojOdobrenja, String sifraValute) {
		org.example.mt102.Stavka stavka = new org.example.mt102.Stavka();
		stavka.setIdNaloga(KeyFactory.nextKey().toString());
		stavka.setDuznik(duznik);
		stavka.setPrimalac(primalac);
		stavka.setDatumNaloga(datumNaloga);
		stavka.setSvrhaPlacanja(svrhaPlacanja);
		stavka.setIznos(iznos);
		stavka.setRacunDuznika(racunDuznika);
		stavka.setModelZaduzenja(modelZaduzenja);
		stavka.setPozivNaBrojZaduzenja(pozivNaBrojZaduzenja);
		stavka.setRacunPrimaoca(racunPrimaoca);
		stavka.setModelOdobrenja(modelOdobrenja);
		stavka.setPozivNaBrojOdobrenja(pozivNaBrojOdobrenja);
		stavka.setSifraValute(sifraValute);
		return stavka;
	}
	
	public static MT9XX kreirajMT9XX(
			String swiftKodBanke, String obracunskiRacun, String idPorukeNaloga,
			BigDecimal iznos, XMLGregorianCalendar datumValute, String sifraValute) {
		MT9XX mt9XX = new MT9XX();
		mt9XX.setIdPoruke(KeyFactory.nextKey().toString());
		mt9XX.setSwiftKodBanke(swiftKodBanke);
		mt9XX.setObracunskiRacun(obracunskiRacun);
		mt9XX.setIdPorukeNaloga(idPorukeNaloga);
		mt9XX.setIznos(iznos);
		mt9XX.setDatumValute(datumValute);
        mt9XX.setSifraValute(sifraValute);
        return mt9XX;
	}
	
	public static CentralBankingService dobaviServisCentralneBanke() {
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
	
	public static PaymentService dobaviServisZaBanke() {
		URL wsdl;

	    QName serviceName = new QName("http://www.nepostoji.org/PaymentService/", "PaymentService");
	    QName portName = new QName("http://www.nepostoji.org/PaymentService/", "PaymentPort");
	    
        URL url = null;
        try {
            url = new URL("file:/D:/Users/Stevan/Literatura_I_Materijal/Aktuelno/XML_i_WS/Projekat/XML-WS-projekat/XMLWS/WEB-INF/wsdl/PaymentService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PaymentService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/Users/Stevan/Literatura_I_Materijal/Aktuelno/XML_i_WS/Projekat/XML-WS-projekat/XMLWS/WEB-INF/wsdl/PaymentService.wsdl");
        }
        wsdl = url;
        Service service = Service.create(wsdl, serviceName);
        PaymentService servisZaBanke = service.getPort(portName, PaymentService.class);
        return servisZaBanke;
    
	}
}
