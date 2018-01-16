package ws.client;

import ws.BanqueService;
import ws.BanqueService_Service;

public class ClientWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BanqueService stub = new BanqueService_Service().getBanqueServicePort();
		double montant = 2.1 ;
		System.out.println( " stub.conversionEuroDH("+ montant +") = "+ stub.conversionEuroDH(montant) + " "  );
		System.out.println( " stub.test() = "+ stub.test() + " "  );
	}

}
