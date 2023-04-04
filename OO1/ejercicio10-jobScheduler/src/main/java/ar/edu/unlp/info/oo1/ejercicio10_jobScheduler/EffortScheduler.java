package ar.edu.unlp.info.oo1.ejercicio10_jobScheduler;

public class EffortScheduler extends JobScheduler {

	
	public EffortScheduler ( ) { 
		super();
		this.setStrategy("MostEffort");
	}
	
	 public JobDescription next() {
		JobDescription nextJob = this.getJobs().stream()
				.max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
     			.orElse(null);
		this.unschedule(nextJob);
		return nextJob;
	 }
}
