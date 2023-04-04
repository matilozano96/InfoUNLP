package ar.edu.unlp.info.oo1.ejercicio10_jobScheduler;

public class FifoScheduler extends JobScheduler{
	
	public FifoScheduler ( ) { 
		super();
		this.setStrategy("FIFO");
	}
	
	 public JobDescription next() {
		JobDescription nextJob = this.getJobs().get(0);
    	this.unschedule(nextJob);
    	return nextJob;
	 }

}
