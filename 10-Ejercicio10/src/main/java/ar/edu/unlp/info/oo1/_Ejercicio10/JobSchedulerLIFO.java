package ar.edu.unlp.info.oo1._Ejercicio10;

public class JobSchedulerLIFO extends JobScheduler {
	public JobDescription next() {
		JobDescription nextJob = null;
		if (this.jobs != null) {
			nextJob = jobs.get(jobs.size() - 1);
			this.unschedule(nextJob);
			return nextJob;
		}
		return null;
	}
}
