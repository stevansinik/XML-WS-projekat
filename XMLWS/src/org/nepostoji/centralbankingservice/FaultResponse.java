
package org.nepostoji.centralbankingservice;

import javax.xml.ws.WebFault;

import org.example.odgovor.Ishod;


/**
 * This class was generated by Apache CXF 2.6.5
 * 2017-09-11T00:39:29.468+02:00
 * Generated source version: 2.6.5
 */

@WebFault(name = "odgovor", targetNamespace = "http://www.nepostoji.org/CentralBankingService/")
public class FaultResponse extends Exception {
    
    private org.example.odgovor.Odgovor odgovor;

    public FaultResponse() {
        super();
    }
    
    public FaultResponse(String message) {
        super(message);
        odgovor.setIshod(Ishod.NEUSPJESAN);
        odgovor.setPoruka(message);
    }
    
    public FaultResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public FaultResponse(String message, org.example.odgovor.Odgovor odgovor) {
        super(message);
        this.odgovor = odgovor;
    }

    public FaultResponse(String message, org.example.odgovor.Odgovor odgovor, Throwable cause) {
        super(message, cause);
        this.odgovor = odgovor;
    }

    public org.example.odgovor.Odgovor getFaultInfo() {
        return this.odgovor;
    }
}
