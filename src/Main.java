public class Main {
    public static void main(String args[]) {
        Bingo b = new Bingo();
        Player p = b.addPlayer("Carlo");
        System.out.println(p);
        b.addPlayer("Giovanni");
        b.addPlayer("Giacomo");
        b.addPlayer("Aldo");
        b.addPlayer("Mario");
        while(b.checkWin() == false) {
            b.extract();
        }
        System.out.println(b);
    }
}