
public class oops4 {

    public static void main(String args[]) {

        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();
        r.moves();

        Bishop b = new Bishop();
        b.moves();
    }
}

// Interface
interface ChessPlayer {
    void moves();
}

// Queen class
class Queen implements ChessPlayer {

    public void moves() {
        System.out.println(
                "Queen moves in any direction: up, down, right, left, and diagonally.");
    }
}

// Rook class
class Rook implements ChessPlayer {

    public void moves() {
        System.out.println(
                "Rook moves in straight lines: up, down, right, and left.");
    }
}

// Bishop class
class Bishop implements ChessPlayer {

    public void moves() {
        System.out.println(
                "Bishop moves diagonally.");
    }
}