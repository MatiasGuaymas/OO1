package ar.edu.unlp.info.oo1._Ejercicio10;

public class JobSchedulerFIFO extends JobScheduler {
	public JobDescription next() {
		JobDescription nextJob = null;
		if (this.jobs != null) {
			nextJob = this.jobs.get(0);
			this.unschedule(nextJob);
			return nextJob;
		}
		return null;
	}
}
