import java.util.ArrayList;
import java.util.Iterator;


/**
 * @author maya5348
 *
 */
public class Manager {
    public static ArrayList<Hold> Holds= new ArrayList<>();

    public static void AddHold (String fine, Copy copy, Patron patron){
        Hold hold = new Hold(fine, copy, patron);
        Holds.add(hold);
    }

    public static void PrintHold(){
        if(Holds.size() == 0){
            System.out.println("No Holds present in the system yet");
        }
        for(Hold h : Holds){
            System.out.println("Patron - " + h.getPatron().getName() + " Fine - " + h.getFine() + " Book - " + h.getCopy().getTitle());
        }
    }

    public static void ClearHold(Copy c, Patron p){
        Iterator<Hold> it = Holds.iterator();
        while (it.hasNext()) {
            Hold h = it.next();
            if(h.getCopy().getBarcode().equals(c.getBarcode()) && h.getPatron().getId().equals(p.getId())){
                it.remove();
            }
        }

    }
}//end class manager
