import java.util.ArrayList;
import java.util.Collections;

public class Bingo {
    ArrayList<Integer> pocket = new ArrayList<Integer>();
    ArrayList<Integer> extractedNumber = new ArrayList<Integer>();
    ArrayList<Player> players = new ArrayList<Player>();

    public Bingo() {
        for (int i=1; i<=90; i++) {
            pocket.add(i);
        }
        Collections.shuffle(this.pocket);
    }

    public boolean checkWin() {
        for (Player p: this.players) {
            if (p.checkWin(this.extractedNumber)) {
                System.out.println(p);
                return true;
            }
        }
        return false;
    }

    public Player addPlayer(String name) {
        Player p = new Player(name);
        players.add(p);
        return p;
    }

    public Integer extract() {
        Integer i = this.pocket.remove(this.pocket.size()-1);
        this.extractedNumber.add(i);
        return i;
    }

    public String toString() {
        String result = "Pocket: ";
        for(Integer i : this.pocket) {
            result += " " + i;
        }
        result += "\n extracted numbers:";
        for(Integer i : this.extractedNumber) {
            result += " " + i;
        }
        return result;
    }

}