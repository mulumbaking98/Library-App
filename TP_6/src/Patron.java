import java.util.ArrayList;
/**
 * @author maya5348
 *
 */
public class Patron {
    String Name;
    String Id;
    ArrayList<Copy> BurrowedBooks;

    public Patron(String name, String id) {
        Name = name;
        Id = id;
        BurrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public ArrayList<Copy> getBurrowedBooks() {
        return BurrowedBooks;
    }

    public void setBurrowedBooks(ArrayList<Copy> burrowedBooks) {
        BurrowedBooks = burrowedBooks;
    }

    public void CheckOutBook(Copy c){
        c.Status = "OUT";
        if(BurrowedBooks.size() < 4){
            BurrowedBooks.add(c);
        }else{
            System.out.println("You have already checked out 4 books. Can't checkout more");
        }
    }

    public void CheckInBook(Copy c){
        int i = 0;
        for(Copy copy : BurrowedBooks){
            if(c.Id == copy.Id){
                BurrowedBooks.remove(i);
                c.Status = "IN";
            }
            i++;
        }
    }
}