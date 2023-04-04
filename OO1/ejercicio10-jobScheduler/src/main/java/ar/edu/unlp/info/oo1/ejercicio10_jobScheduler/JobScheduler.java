package ar.edu.unlp.info.oo1.ejercicio10_jobScheduler;


import java.util.ArrayList;
import java.util.List;

public abstract class JobScheduler {
    private List<JobDescription> jobs;
    private String strategy;
     
    public JobScheduler () {
    	this.jobs = new ArrayList<>();
    }
    
    public void schedule(JobDescription job) {
    	this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
    	if (job != null) {
    	   this.jobs.remove(job);
    	}
    }
    
    public String getStrategy() {
    	return this.strategy; 
    }
    
    protected void setStrategy (String strategy) {
    	this.strategy = strategy;
    }
    
    public List<JobDescription> getJobs(){
    	return jobs;
    }
    
    public abstract JobDescription next();
    
}

