package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 *
 * @author angel
 */
@WebService(serviceName = "WSOperations")
public class WSOperations {

    @WebMethod(operationName = "Login")
    public boolean Login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasena") String contrasena) {
        return (usuario.equals("angel") && contrasena.equals("angel123"));
    }

    @WebMethod(operationName = "suma")
    public int suma(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a + b;
    }

    @WebMethod(operationName = "resta")
    public int resta(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a - b;
    }

    @WebMethod(operationName = "multiplicacion")
    public int multiplicacion(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a * b;
    }

    @WebMethod(operationName = "division")
    public double division(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        //TODO write your implementation code here:
        return a / b;
    }

    // Conertir de Kelvin a celcius
    @WebMethod(operationName = "KelvinToCelsiusConverter")
    public int KelvinToCelsiusConverter(@WebParam(name = "kelvin") int kelvin) {
        return kelvin - 273;
    }

    // Determina la energia potencial gravitatoria de objeto de 80kg que cae desde una altura de 10m.
    @WebMethod(operationName = "EnergiaPotencial")
    public double EnergiaPotencial(@WebParam(name = "masa") int masa, @WebParam(name = "altura") int altura) {
        double gravedad = 9.81;
        double energiapotencial = masa * gravedad * altura;
        return energiapotencial;
    }

    // Calcular la distancia recorrida por un carro que va una velocidad de 100km durante 2h.
    @WebMethod(operationName = "DistanciaCarro")
    public int DistanciaCarro(@WebParam(name = "velocidad") int velocidad, @WebParam(name = "tiempo") int tiempo) {
        int distancia = velocidad * tiempo;
        return distancia;
    }
}
