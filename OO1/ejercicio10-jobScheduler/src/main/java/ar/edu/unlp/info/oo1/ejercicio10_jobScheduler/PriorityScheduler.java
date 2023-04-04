package ar.edu.unlp.info.oo1.ejercicio10_jobScheduler;

public class PriorityScheduler extends JobScheduler {
	
	public PriorityScheduler ( ) { 
		super();
		this.setStrategy("HighestPriority");
	}

	 public JobDescription next() {
		JobDescription nextJob = this.getJobs().stream()
				.max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
				.orElse(null);
        this.unschedule(nextJob);
        return nextJob;
	 }

}
