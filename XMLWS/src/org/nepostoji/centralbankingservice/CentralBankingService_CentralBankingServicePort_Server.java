
package org.nepostoji.centralbankingservice;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2017-09-11T00:39:29.522+02:00
 * Generated source version: 2.6.5
 * 
 */
 
public class CentralBankingService_CentralBankingServicePort_Server{

    protected CentralBankingService_CentralBankingServicePort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new CentralBankingServiceImpl();
        String address = "http://localhost:8080/CentralBankingServicePort";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new CentralBankingService_CentralBankingServicePort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
