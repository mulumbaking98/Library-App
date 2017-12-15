import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * @author maya5348
 *
 */
public class TRLApp {
    public static  void main(String[] args) throws FileNotFoundException {
        Controller.AddBooksAndPatrons();
        System.out.println("Worker log in - Enter username and password of the worker separated by a space");
        Scanner scanner = new Scanner(System.in);
        String scannedLine = scanner.nextLine();
        String[] splittedScannedLine = scannedLine.split(" ");
        if(Controller.LogInWorker(splittedScannedLine[0], splittedScannedLine[1])){
            Scanner userInput = new Scanner(System.in);
            boolean run = true;
            while (true){
                System.out.println("Choose an option from below");
                System.out.println();
                System.out.println("1 - Check in book");
                System.out.println("2 - Check out book");
                System.out.println("3 - Add overdue hold on book");
                System.out.println("4 - Remove hold on a book");
                System.out.println("5 - Print holds on book");
                System.out.println("6 - Show copies");
                System.out.println("7 - Show patrons");
                System.out.println("8 - Exit");
                int choice = userInput.nextInt();
                Scanner sc = new Scanner(System.in);
                String line = "";
                String[] splittedLine;
                switch (choice){
                    case 1:
                        System.out.println("Enter barcode of the copy and the patron id separated by a space");
                        line = sc.nextLine();
                        splittedLine = line.split(" ");
                        Controller.CheckIn(splittedLine[0], splittedLine[1]);
                        break;

                    case 2:
                        System.out.println("Enter barcode of the copy and the patron id (separated by a space):");
                        line = sc.nextLine();
                        splittedLine = line.split(" ");
                        Controller.CheckOut(splittedLine[0], splittedLine[1]);
                        break;

                    case 3:

                        System.out.println("Enter Fine, barcode, patron id separated by a space");
                        line = sc.nextLine();
                        splittedLine = line.split(" ");
                        Controller.AddHold(splittedLine[0], splittedLine[1], splittedLine[2]);
                        break;

                    case 4:
                        System.out.println("Enter barcode of the copy and the patron id separated by a space");
                        line = sc.nextLine();
                        splittedLine = line.split(" ");
                        Controller.ClearHold(splittedLine[0], splittedLine[1]);
                        break;

                    case 5:
                        Controller.PrintOverdue();
                        break;

                    case 6:
                        Controller.PrintCopies();
                        break;

                    case 7:
                        Controller.PrintPatrons();
                        break;

                    case 8:
                        run = false;
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            }
        }



    }
}