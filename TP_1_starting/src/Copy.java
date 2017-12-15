/**
 * @author maya5348
 *
 */
public class Copy extends TextBook{
    String Barcode;
    String Status;
    String DueDate;

    public Copy(String id, String title, String barcode, String status) {
        super(id, title);
        Barcode = barcode;
        Status = status;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String barcode) {
        Barcode = barcode;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getDueDate() {
        return DueDate;
    }

    public void setDueDate(String dueDate) {
        DueDate = dueDate;
    }
}