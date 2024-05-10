package org.example.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;
@WebService(name = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "conversion")
    public double conversion(double montant) {
        return montant * 1.1;
    }
    @WebMethod(operationName = "getCompte")
    Compte getCompte(String code) {
        return new Compte(code, 9000);
    }
    @WebMethod(operationName = "listComptes")
     List<Compte> listComptes() {
        return List.of(new Compte("C1", 9000), new Compte("C2", 8000));
    }
}
