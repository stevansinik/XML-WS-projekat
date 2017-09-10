package test;

import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.example.faktura.Faktura;
import org.example.faktura.Stavka;
import org.example.faktura.Zaglavlje;
import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) throws DatatypeConfigurationException, SAXException {
		// TODO Auto-generated method stub
		Date danas = new Date();
		GregorianCalendar c = new GregorianCalendar();
		//c.setTime(danas);
		c.set(2017, 1, 1);
		XMLGregorianCalendar danasXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		
		Faktura f = new Faktura();
		Zaglavlje z = new Zaglavlje();
		z.setIdPoruke("1");
		z.setNazivDobavljaca("Dob 1");
		z.setAdresaDobavljaca("Neka Adresa 1");
		z.setPibDobavljaca("112233");
		z.setNazivKupca("Kup 1");
		z.setAdresaKupca("Neka adresa 2");
		z.setPibKupca("332211");
		z.setBrojRacuna(111);
		z.setDatumRacuna(danasXml);
		z.setVrednostRoba(new BigDecimal("20.00"));
		z.setVrednostUsluga(new BigDecimal(0));
		z.setUkupnoRobaIUsluga(new BigDecimal("20.00"));
		z.setUkupanRabat(new BigDecimal("0.00"));
		z.setUkupanPorez(new BigDecimal("0.00"));
		z.setOznakaValute("RSD");
		z.setIznosZaUplatu(new BigDecimal("20.00"));
		z.setUplataNaRacun("123456789987654321");
		z.setDatumValute(danasXml);
		f.setZaglavlje(z);
		List<Stavka> stavke = f.getStavke();
		Stavka st = new Stavka();
		st.setRedniBroj(1);
		st.setNazivRobeIliUsluge("Neka roba");
		st.setKolicina(new BigDecimal(2));
		st.setJedinicnaCena(new BigDecimal("10.00"));
		st.setJedinicaMjere("kg");
		st.setProcenatRabata(new BigDecimal("0.00"));
		st.setIznosRabata(new BigDecimal("0.00"));
		st.setUmanjenoZaRabat(new BigDecimal("0.00"));
		st.setUkupanPorez(new BigDecimal("0.00"));
		st.setVrednost(new BigDecimal("20.00"));
		stavke.add(st);
		st = new Stavka();
		st.setRedniBroj(1);
		st.setNazivRobeIliUsluge("Neka roba");
		st.setKolicina(new BigDecimal(2));
		st.setJedinicnaCena(new BigDecimal("10.00"));
		st.setJedinicaMjere("kg");
		st.setProcenatRabata(new BigDecimal("0.00"));
		st.setIznosRabata(new BigDecimal("0.00"));
		st.setUmanjenoZaRabat(new BigDecimal("0.00"));
		st.setUkupanPorez(new BigDecimal("0.00"));
		st.setVrednost(new BigDecimal("20.00"));
		stavke.add(st);
		st = new Stavka();
		st.setRedniBroj(1);
		st.setNazivRobeIliUsluge("Neka roba");
		st.setKolicina(new BigDecimal(2));
		st.setJedinicnaCena(new BigDecimal("10.00"));
		st.setJedinicaMjere("kg");
		st.setProcenatRabata(new BigDecimal("0.00"));
		st.setIznosRabata(new BigDecimal("0.00"));
		st.setUmanjenoZaRabat(new BigDecimal("0.00"));
		st.setUkupanPorez(new BigDecimal("0.00"));
		st.setVrednost(new BigDecimal("20.00"));
		stavke.add(st);
		
		
		try {
			JAXBContext context = JAXBContext.newInstance("org.example.faktura");
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			Schema schema = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema(new File("schema/Faktura.xsd"));// = new Schema();
			marshaller.setSchema(schema);
			File out = new File("gen/out.xml");
			marshaller.marshal(f, out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
