import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author maya5348
 *
 */
public class Log {
	private int logCount;
	private Worker worker;
	/**
	 * @return the logCount
	 */
	public int getLogCount() {
		return logCount;
	}
	/**
	 * @param logCount the logCount to set
	 */
	public void setLogCount(int logCount) {
		this.logCount = logCount;
	}
	/**
	 * @return the worker
	 */
	public Worker getWorker() {
		return worker;
	}
	/**
	 * @param worker the worker to set
	 */
	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	

	@Override
	public String toString() {
		return "Log: " + " Worker_Name: " + worker.getName() + "Worker_ID: " + worker.getId() + "Time: ";
	}


	  // The name of the file to open.
  String fileName = "temp.txt";

  // This will reference one line at a time
  String line = null;
  
   public void readFile(){
      try {
      // FileReader reads text files in the default encoding.
      FileReader fileReader = 
          new FileReader(fileName);

      // Always wrap FileReader in BufferedReader.
      BufferedReader bufferedReader = 
          new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null) {
          System.out.println(line);
           }   
 
          // Always close files.
           bufferedReader.close();         
         }
        catch(FileNotFoundException ex) {
            System.out.println(
                   "Unable to open file '" + 
                   fileName + "'");                
       }
         catch(IOException ex) {
            System.out.println(
              "Error reading file '" 
                  + fileName + "'");                  

            }
  
      }//end readFile

   // The name of the file to open.
  //String fileName = "temp.txt";

    public void writeFile(String date){
        try {
            // Assume default encoding.
          FileWriter fileWriter =
                new FileWriter(fileName);

        // Always wrap FileWriter in BufferedWriter.
          BufferedWriter bufferedWriter =
                  new BufferedWriter(fileWriter);
 
          // Note that write() does not automatically
         // append a newline character.
         bufferedWriter.write(worker.getName() +": ");
         bufferedWriter.write(worker.getId() +": ");
         bufferedWriter.write(GetDateDifference.getDate() +": ");
         bufferedWriter.write(GetDateDifference.getSeconds(date) +": ");
         bufferedWriter.newLine();
         bufferedWriter.write("We are writing");
         bufferedWriter.write(" the text to the file.");

          // Always close files.
           bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                   + fileName + "'");

         }
       }//end writeFile

	
	
	
	

}//end log

