package ar.edu.unlp.info.oo1._Ejercicio10;

import java.util.List;

public class HighestPriority implements Strategy {
	public JobDescription next(List<JobDescription> jobs) {
		JobDescription nextJob = null;
		nextJob = jobs.stream().max((j1, j2) -> Double.compare(j1.getPriority(), j2.getPriority())).orElse(null);
		return nextJob;
	}
}
