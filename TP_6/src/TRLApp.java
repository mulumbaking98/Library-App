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

	
    public static  void main(String[] args) throws FileNotFoundException {
    	
    	new TRLApp();
    	
    	
    }//end main
    
    public TRLApp() throws FileNotFoundException{
    	
    	 Controller.AddBooksAndPatrons();
         boolean flag = true;
         do{
         StdOut.println("Worker log in - Enter username and password of the worker (separated by a space): ");
         Scanner scanner = new Scanner(System.in);
         String scannedLine = scanner.nextLine();
         String[] splittedScannedLine = scannedLine.split(" ");
         
         
         if(Controller.LogInWorker(splittedScannedLine[0], splittedScannedLine[1])){
             Scanner userInput = new Scanner(System.in);
//             boolean run = true;
             while (true){
                   menu();
                 int choice = userInput.nextInt();
                 Controller.writeLogData(splittedScannedLine[1], choice);

                  Switch(choice);

             }//end while
             
         }//end if
         
         
         }while(flag);
  
    }
    
    
    
    
    static void menu(){
    	
            subMenu();
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
    
    private static void subMenu(){
        StdOut.println("\n\n" +lineD());
        StdOut.println("\t\tWELCOME TO TEXTBOOK_RENTAL_LIBRARY SYSTEM");
        StdOut.println(lineD());
    }
    
    static String lineD() {

		return "===================================================================\n";
	}

	static void Switch(int choice){
    	String line = "";
        String[] splittedLine;
        boolean flag = true;
     
        
//        boolean run = true;
        
		switch (choice){
        case 1:
        	

        	do{
        	StdOut.println("\nChecking in Book................................................");
        	StdOut.println("Enter barcode of the copy and the patron id (separated by a space): \n");
            line = sc.nextLine();
            splittedLine = line.split(" ");
            Controller.CheckIn(splittedLine[0], splittedLine[1]);
            
            StdOut.println("\nDo you want to check in more? (N to Exit: y continue)    ");
            String l = sc.nextLine();
            if(l.equalsIgnoreCase("N")){flag = false;}
            if(l.equalsIgnoreCase("y")){flag = true;}
            
        	}while(flag);
            break;

        case 2:
        	
        	int count = 0;
        	do{
        	StdOut.println("\nChecking out Book................................................");
        	StdOut.println("Enter barcode of the copy and the patron id (separated by a space): \n");
            line = sc.nextLine();
            splittedLine = line.split(" ");
            Controller.CheckOut(splittedLine[0], splittedLine[1]);
            count += 1;
            
            StdOut.println("\nDo you want to check out more? (N to Exit: y continue)    ");
            String l = sc.nextLine();
            if(l.equalsIgnoreCase("N")){flag = false;}
            if(l.equalsIgnoreCase("y")){flag = true;}
            if(count > 4){flag = false;}
        	}while(flag);
        	
            break;

        case 3:
        	StdOut.println("\nPrinting Over due notices................................................");
        	StdOut.println("Enter Fine, barcode, patron id (separated by a space): \n");
            line = sc.nextLine();
            splittedLine = line.split(" ");
            Controller.AddHold(splittedLine[0], splittedLine[1], splittedLine[2]);
            break;

        case 4:
        	StdOut.println("\nRemoving book hold...............................................");
        	StdOut.println("Enter barcode of the copy and the patron id (separated by a space): \n");
            line = sc.nextLine();
            splittedLine = line.split(" ");
            Controller.ClearHold(splittedLine[0], splittedLine[1]);
            break;

        case 5:
        	StdOut.println("\nPrinting book hold................................................");
        	StdOut.println("Printing over due notice........");
            Controller.PrintOverdue();
            StdOut.println(lineB());
            break;

        case 6:
        	StdOut.println("Printing copies information..................");
            Controller.PrintCopies();
            StdOut.println(lineB());
            break;

        case 7:
        	StdOut.println("Printing patrons information....................");
            Controller.PrintPatrons();
            StdOut.println(lineB());
            break;
        case 8:
        	StdOut.println("\nPrinting Log information...............");
        	Controller.printLog();
            StdOut.println(lineB());
            break;

        case 0:
//            run = false;
        	System.exit(0);
            break;

        default:
        	StdOut.println("\nInvalid choice");
    }
    }//end switch
    
    static String lineB(){
    	return "\n";
    }
    
    
    
    
    
}//end class