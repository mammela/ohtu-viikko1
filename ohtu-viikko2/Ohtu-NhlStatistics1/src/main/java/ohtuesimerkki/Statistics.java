package ohtuesimerkki;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Statistics {

    private List<Player> players;
  //private ReaderIO reader;
    private ReaderIOTest reader;

    public Statistics(ReaderIOTest reader) {
  //public Statistics(ReaderIO reader) {
        //PlayerReader reader = new PlayerReader("http://nhlstatistics.herokuapp.com/players.txt");
        //ReaderIO reader = new ReaderIO("http://nhlstatistics.herokuapp.com/players.txt");
        this.reader = reader;
        players = reader.getPlayers();       
    }

    public Player search(String name) {
        for (Player player : players) {
            if (player.getName().contains(name)) {
                return player;
            }
        }

        return null;
    }

    public List<Player> team(String teamName) {
        ArrayList<Player> playersOfTeam = new ArrayList<Player>();
        
        for (Player player : players) {
            if ( player.getTeam().equals(teamName)) {
                playersOfTeam.add(player);
            }
        }
        
        return playersOfTeam;
    }

    public List<Player> topScorers(int howMany) {
        Collections.sort(players);
        ArrayList<Player> topScorers = new ArrayList<Player>();
        Iterator<Player> playerIterator = players.iterator();
        
        while (howMany>=0) {
            topScorers.add( playerIterator.next() );            
            howMany--;
        }
        
        return topScorers;
    }

}