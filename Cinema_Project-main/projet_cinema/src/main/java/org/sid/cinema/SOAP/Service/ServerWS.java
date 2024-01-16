package org.sid.cinema.SOAP.Service;

import jakarta.xml.ws.Endpoint;
import org.sid.cinema.SOAP.webService.FilmService;

public class ServerWS {
    public static void main(String[] args) {
        String url ="http://localhost:8083/";
        Endpoint.publish(url,new FilmService());
        System.out.println(url+ " deployer");
    }
}
