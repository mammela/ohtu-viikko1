package ohtuesimerkki;

public class Main {
    public static void main(String[] args) {
        Statistics stats = new Statistics(new ReaderIO("http://nhlstatistics.herokuapp.com/players.txt"));
        //Statistics stats = new Statistics(new ReaderIOTest());
          
        System.out.println("Philadelphia Flyers");
        for (Player player : stats.team("PHI") ) {
            System.out.println( player );
        }
        
        System.out.println("");
        
        System.out.println("Top scorers");
        //for (Player player : stats.topScorers(5) ) {
        //   System.out.println( player );
        //}        
    }
}
