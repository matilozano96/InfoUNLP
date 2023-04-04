package ar.edu.unlp.info.oo1.ejercicio10_jobScheduler;

public class LifoScheduler extends JobScheduler{

	public LifoScheduler ( ) { 
		super();
		this.setStrategy("LIFO");
	}
	
	 public JobDescription next() {
		JobDescription nextJob = this.getJobs().get(this.getJobs().size()-1);
    	this.unschedule(nextJob);
    	return nextJob;
	 }

}
