import java.util.ArrayList;
import java.util.Collections;

public class Player {
    private String name;
    ArrayList<Integer> numbers = new ArrayList<>();

    public Player(String name) {
        this.name = name;
        ArrayList<Integer> pocket = new ArrayList<>();
        for (int i=1; i<=90; i++) {
            pocket.add(i);
        }
        Collections.shuffle(pocket);
        for (int i=0; i<=15; i++) {
            this.numbers.add(pocket.remove(i));
        }
    }

    public boolean checkWin(ArrayList<Integer> extractedNumbers) {
        for (Integer i: this.numbers) {
            // i = 19
            // extractedNumbers = 73, 39
            // vado a verificare che 73, 39 contengono i=19
            if (!extractedNumbers.contains(i)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String result  = this.name + ":";
        for (Integer i: this.numbers) {
            result += " " + i;
        }
        return result;
    }

}