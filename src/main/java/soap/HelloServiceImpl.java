package soap;

import javax.jws.WebService;

@WebService(endpointInterface = "soap.HelloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "¡Hola, " + name + "! Bienvenido al servicio SOAP.";
    }
}
