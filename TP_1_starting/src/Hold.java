
/**
 * @author maya5348
 *
 */
public class Hold {
    String Fine;
    Copy Copy;
    Patron Patron;

    public Hold(String fine, Copy copy, Patron patron) {
        Fine = fine;
        Copy = copy;
        Patron = patron;
    }

    public String getFine() {
        return Fine;
    }

    public void setFine(String fine) {
        Fine = fine;
    }

    public Copy getCopy() {
        return Copy;
    }

    public void setCopy(Copy copy) {
        Copy = copy;
    }

    public Patron getPatron() {
        return Patron;
    }

    public void setPatron(Patron patron) {
        Patron = patron;
    }
    
}//end hold
