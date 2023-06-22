import org.example.Game;
import org.example.NotRegisteredException;
import org.example.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGame {
    @Test
    public void registerTestTwo() {
        Player player1 = new Player(228, "Sanya", 1);
        Player player2 = new Player(777, "Petr Mihalich", 555);
        Player player3 = new Player(654, "Lusya", 555);
        Player player4 = new Player(777, "Ivanich228", 359);
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Sanya", "Kolya"));
    }

    @Test
    public void registerTestOne() {
        Player player1 = new Player(228, "Sanya", 1);
        Player player2 = new Player(777, "Petr Mihalich", 555);
        Player player3 = new Player(654, "Lusya", 555);
        Player player4 = new Player(777, "Ivanich228", 359);
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Petuh000", "Sanya"));
    }

    @Test
    public void TestWinPlayerAll() {
        Player player1 = new Player(228, "Sanya", 1);
        Player player2 = new Player(777, "Petr Mihalich", 555);
        Player player3 = new Player(654, "Lusya", 555);
        Player player4 = new Player(777, "Ivanich228", 359);
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        int actual = game.round("Lusya", "Petr Mihalich");
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestWinPlayerOne() {
        Player player1 = new Player(228, "Sanya", 1);
        Player player2 = new Player(777, "Petr Mihalich", 555);
        Player player3 = new Player(654, "Lusya", 555);
        Player player4 = new Player(777, "Ivanich228", 359);
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        int actual = game.round("Petr Mihalich", "Ivanich228");
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestWinPlayerTwo() {
        Player player1 = new Player(228, "Sanya", 1);
        Player player2 = new Player(777, "Petr Mihalich", 555);
        Player player3 = new Player(654, "Lusya", 555);
        Player player4 = new Player(777, "Ivanich228", 359);
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        int actual = game.round("Sanya", "Ivanich228");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }


}
