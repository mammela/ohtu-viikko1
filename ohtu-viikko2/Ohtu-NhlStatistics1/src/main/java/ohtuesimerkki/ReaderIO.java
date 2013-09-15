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
public class ReaderIO implements Reader {
    
    private Scanner scanner;
    //private ArrayList<Player> players = new ArrayList<Player>();

    ReaderIO(String pageUrl) {
        try {
            URL url = new URL(pageUrl);
            scanner = new Scanner(url.openStream());
        } catch (Exception e) {
            e.printStackTrace();
        } }

         
    public List<Player> getPlayers() {
        
        ArrayList<Player> players = new ArrayList<Player>();

        
        while (scanner.hasNextLine()) {
            String[] parts =  scanner.nextLine().split(";");            
            
            if (parts.length > 3) {
                players.add(new Player(parts[0].trim(), parts[1], extractInt(parts[3]), extractInt(parts[4])));
            }
        }
/*
        ArrayList<Player> players = new ArrayList<Player>();
 
            players.add(new Player("Semenko", "PHI", 4, 12));
            players.add(new Player("Lemieux", "PHI", 45, 54));
            players.add(new Player("Kurri",   "PHI", 37, 53));
            players.add(new Player("Yzerman", "PHI", 42, 56));
            players.add(new Player("Gretzky", "PHI", 35, 89));
 
            */
        return players;
    }
    
    private int extractInt(String str) {
        return Integer.parseInt(str.trim());
    }
    
}
