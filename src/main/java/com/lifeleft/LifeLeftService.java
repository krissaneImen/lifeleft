package com.lifeleft;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.Year;

@WebService(serviceName = "LifeLeft")
public class LifeLeftService {
    int esperanceDeVie;
    String  USD= " USD";
    String EUR = "EUR";
    String  JPY=" JPY";

    @WebMethod
    public String anneesRestantesAVivre(String nomPays, int esperanceVieHommes, int esperanceVieFemmes, int anneeNaissance, String sexe) {
        if(sexe.equals(homme)) {
            esperanceDeVie = esperanceVieHommes;
        } else {
            esperanceDeVie = esperanceVieFemmes;
        }

        int age = Year.now().getValue() - anneeNaissance;

        return "Vous avez " + age + " ans et il vous reste environ " + (esperanceDeVie - age) + " années à vivre selon l'espérance de vie en " + nomPays + ".";
    }
}