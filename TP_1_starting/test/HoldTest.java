import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HoldTest {
    @Test
    public void addHoldTest() {
        Patron patron = new Patron("John", "100");
        Controller.Patrons.add(patron);
        Worker w = new Worker("Jude","12345");
        Controller.Worker = w;
        Copy p = new Copy("100", "Harry Potter", "10001212", "");
        Controller.AddCopy(p);
        Controller.AddHold("100", p.getBarcode(), patron.getId());
    }


    @Test
    public void clearHoldTest() {
        Patron patron = new Patron("John", "100");
        Controller.Patrons.add(patron);
        Worker w = new Worker("Jude","12345");
        Controller.Worker = w;
        Copy p = new Copy("100", "Harry Potter", "10001212", "");
        Controller.AddCopy(p);
        Controller.AddHold("100", p.getBarcode(), patron.getId());
        Controller.ClearHold(p.getBarcode(), patron.getId());
    }

}
