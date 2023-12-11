import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void testFindZero() {
        MovieManager manager = new MovieManager();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindOne() {
        MovieManager manager = new MovieManager();
        manager.add("Bloodshot");

        String[] actual = manager.findAll();
        String[] expected = {"Bloodshot"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindThree() {
        MovieManager manager = new MovieManager();
        manager.add("Bloodshot");
        manager.add("Forward");
        manager.add("Hotel Belgrade");


        String[] actual = manager.findAll();
        String[] expected = {"Bloodshot", "Forward", "Hotel Belgrade"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastFive() {
        MovieManager manager = new MovieManager();
        manager.add("Bloodshot");
        manager.add("Forward");
        manager.add("Hotel Belgrade");
        manager.add("Gentlemen");
        manager.add("The invisible man");


        String[] actual = manager.findLast();

        String[] expected = {"The invisible man", "Gentlemen", "Hotel Belgrade", "Forward", "Bloodshot"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastSix() {
        MovieManager manager = new MovieManager();
        manager.add("Bloodshot");
        manager.add("Forward");
        manager.add("Hotel Belgrade");
        manager.add("Gentlemen");
        manager.add("The invisible man");
        manager.add("Trolls");


        String[] actual = manager.findLast();

        String[] expected = {"Trolls", "The invisible man", "Gentlemen", "Hotel Belgrade", "Forward"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastTwo() {
        MovieManager manager = new MovieManager();
        manager.add("Bloodshot");
        manager.add("Forward");


        String[] actual = manager.findLast();

        String[] expected = {"Forward", "Bloodshot"};
        Assertions.assertArrayEquals(expected, actual);
    }
}
