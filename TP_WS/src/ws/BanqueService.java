package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName="BanqueService")
public class BanqueService {

	@WebMethod(operationName="conversionEuroDH")
	public double conversion(@WebParam(name="montant") double mt) {
		return mt*11;
	}
	
	@WebMethod
	public String test() {
		return "test";
	}
 
}
