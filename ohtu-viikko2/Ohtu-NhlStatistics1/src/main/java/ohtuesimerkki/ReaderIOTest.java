/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author joonasmammela
 */
public class ReaderIOTest {
    
    private String string;
    //private ArrayList<Player> players = new ArrayList<Player>();

    void ReaderIO(String string) {
        return;
        }

         
    public List<Player> getPlayers() {
        
        ArrayList<Player> players = new ArrayList<Player>();
 
            players.add(new Player("Semenko", "PHI", 4, 12));
            players.add(new Player("Lemieux", "PHI", 45, 54));
            players.add(new Player("Kurri",   "PHI", 37, 53));
            players.add(new Player("Yzerman", "PHI", 42, 56));
            players.add(new Player("Gretzky", "PHI", 35, 89));
 
            
        return players;
    }
    
    
    
}
