
/**
 * @author maya5348
 *
 */
public class Event {
	
	public static String printEvents(int choice){
		String ch = "";
		switch(choice){
		
		case 1:
			return ch = "Check in book";
		case 2:
			return ch = "Check out book";
		case 3:
			return ch = "Add overdue hold on book";
		case 4:
			return ch = "Remove hold on a book";
		case 5:
			return ch = "Print holds on book";
		case 6:
			return ch = "Show copies";
		case 7:
			return ch = "Show patrons";
		case 8:
			return ch = "print Log Session";
		case 0:
			return ch = "End Session";
		default:
			break;
					
		}
		
		return ch;
		
	}



}//end event