/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.verkkokauppa;

/**
 *
 * @author joonasmammela
 */
public interface IO {

    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
    
    Tuote haeTuote(int id);

    void otaVarastosta(Tuote t);

    void palautaVarastoon(Tuote t);

    int saldo(int id);
    
    int uusi();
    
}
