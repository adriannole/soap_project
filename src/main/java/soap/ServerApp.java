package soap;

import javax.xml.ws.Endpoint;

public class ServerApp {
    public static void main(String[] args) {
        String url = "http://localhost:8080/hello";
        Endpoint.publish(url, new HelloServiceImpl());
        System.out.println("Servicio SOAP publicado en: " + url + "?wsdl");
    }
}
