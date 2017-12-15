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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Log [logCount=" + logCount + ", worker=" + worker + "]";
	}
	
	
	
	

}//end log

