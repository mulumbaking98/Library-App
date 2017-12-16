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
	
	 static Scanner sc = new Scanner(System.in);
//     static String scannedLine = sc.nextLine();
//     static String[] splittedScannedLine = scannedLine.split(" ");
	
    public static  void main(String[] args) throws FileNotFoundException {
        Controller.AddBooksAndPatrons();
        StdOut.println("Worker log in - Enter username and password of the worker (separated by a space): ");
        Scanner scanner = new Scanner(System.in);
        String scannedLine = scanner.nextLine();
        String[] splittedScannedLine = scannedLine.split(" ");
        if(Controller.LogInWorker(splittedScannedLine[0], splittedScannedLine[1])){
            Scanner userInput = new Scanner(System.in);
//            boolean run = true;
            while (true){
                  menu();
                int choice = userInput.nextInt();
                Controller.writeLogData(splittedScannedLine[1], choice);
//                Scanner sc = new Scanner(System.in);
//                String line = "";
//                String[] splittedLine;
                 Switch(choice);

            }//end while
            
        }//end if



    }//end main
    
    private static void menu(){

          	StdOut.println("Choose an option from below");
          	StdOut.println();
          	StdOut.println("1 - Check in book");
          	StdOut.println("2 - Check out book");
          	StdOut.println("3 - Add overdue hold on book");
          	StdOut.println("4 - Remove hold on a book");
          	StdOut.println("5 - Print holds on book");
          	StdOut.println("6 - Show copies");
          	StdOut.println("7 - Show patrons");
          	StdOut.println("8 - Print Log");
          	StdOut.println("0 - Exit");

    }//end menu
    
    private static void Switch(int choice){
    	String line = "";
        String[] splittedLine;
        
//        boolean run = true;
        
		switch (choice){
        case 1:
        	StdOut.println("Enter barcode of the copy and the patron id (separated by a space): \n");
            line = sc.nextLine();
            splittedLine = line.split(" ");
            Controller.CheckIn(splittedLine[0], splittedLine[1]);
            break;

        case 2:
        	StdOut.println("Enter barcode of the copy and the patron id (separated by a space): \n");
            line = sc.nextLine();
            splittedLine = line.split(" ");
            Controller.CheckOut(splittedLine[0], splittedLine[1]);
            break;

        case 3:

        	StdOut.println("Enter Fine, barcode, patron id (separated by a space): \n");
            line = sc.nextLine();
            splittedLine = line.split(" ");
            Controller.AddHold(splittedLine[0], splittedLine[1], splittedLine[2]);
            break;

        case 4:
        	StdOut.println("Enter barcode of the copy and the patron id (separated by a space): \n");
            line = sc.nextLine();
            splittedLine = line.split(" ");
            Controller.ClearHold(splittedLine[0], splittedLine[1]);
            break;

        case 5:
        	StdOut.println("Printing over due notice........");
            Controller.PrintOverdue();
            StdOut.println("\n");
            break;

        case 6:
        	StdOut.println("Printing copies information..................");
            Controller.PrintCopies();
            StdOut.println("\n");
            break;

        case 7:
        	StdOut.println("Printing patrons information....................");
            Controller.PrintPatrons();
            StdOut.println("\n");
            break;
        case 8:
        	StdOut.println("\nPrinting Log information...............");
            Controller.printLog();
            StdOut.println("\n");
            break;

        case 0:
//            run = false;
        	System.exit(0);
            break;

        default:
        	StdOut.println("\nInvalid choice");
    }
    }//end switch
    
    
    
    
    
    
    
}//end class